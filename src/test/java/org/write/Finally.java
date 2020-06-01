package org.write;

import org.testng.annotations.Test;

public class Finally extends Base {

	@Test(dataProviderClass=Datapro.class,dataProvider="Vikashini")
	private void test(String l1, String l2, String l3, String l4, String l5, String l6 ,String l7,String s1,String s2,String s3,String s4,String s5,String s6,String s7,String s8,String s9,String s10,String s11) 
 {
		launch("http://adactinhotelapp.com/");
		driver.manage().window().maximize();
		
		//1st page
			Page1 p=new Page1();
			fill(p.getUser(), l1);
			fill(p.getPass(), l2);
			klik(p.getLogin());
			
		//2nd page
			Page2 p2=new Page2();
			dropdown(p2.getLocation(), s1);
			dropdown(p2.getHotel(), s2);
			dropdown(p2.getRoomtype(), s3);
			dropdown(p2.getRooms(), s4);
			fill(p2.getCheckinDate(), s5);
			fill(p2.getCheckoutDate(), s6);
			dropdown(p2.getAdultRoom(), s7);
			dropdown(p2.getChildRoom(), s8);
			klik(p2.getSubmit());
			
		//3rd page
			Page3 tp=new Page3();
			klik(tp.getRadiobutton());
			klik(tp.getContinue());
			
		//4th page
			Page4 p4=new Page4();
			fill(p4.getFirstName(), l3);
			fill(p4.getLastName(), l4);
			fill(p4.getAddress(), l5);
			fill(p4.getCCNo(), l6);
			dropdown(p4.getCCType(), s9);
			dropdown(p4.getExpMonth(),s10);
			dropdown(p4.getExpYear(), s11);
			fill(p4.getCvv(), l7);
			klik(p4.getBookNow());
			
		
			
	}


	
}
