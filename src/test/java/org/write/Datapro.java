package org.write;

import org.testng.annotations.DataProvider;

public class Datapro {
	@DataProvider(name="Vikashini")
	public Object[][] dataProvider(){
		return new Object[][] {
			{"kalidass","12345@","Mani","Vikashini","Rspuram,Trichy,Tamilnadu,India","1325904657621498","980","Paris","Hotel Creek","Standard","1 - One","20/05/2020","21/05/2020", "1 - One","0 - None","VISA","May","2022"}
		};
		
	}
}
