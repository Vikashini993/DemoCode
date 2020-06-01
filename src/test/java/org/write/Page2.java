package org.write;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Page2 extends Base {

	public Page2() {
		PageFactory.initElements(driver, this);
		}
	@FindBy(id="location")
	private WebElement location;
	@FindBy(id="hotels")
	private WebElement hotel;
	@FindBy(id="room_type")
	private WebElement roomtype;
	@FindBy(id="room_nos")
	private WebElement Rooms;
	@FindBy(id="datepick_in")
	private WebElement CheckinDate;
	@FindBy(id="datepick_out")
	private WebElement CheckoutDate;
	@FindBy(id="adult_room")
	private WebElement AdultRoom;
	@FindBy(id="child_room")
	private WebElement ChildRoom;
	@FindBy(id="Submit")
	private WebElement Submit;
	public WebElement getLocation() {
		return location;
	}
	public WebElement getHotel() {
		return hotel;
	}
	public WebElement getRoomtype() {
		return roomtype;
	}
	public WebElement getRooms() {
		return Rooms;
	}
	public WebElement getCheckinDate() {
		return CheckinDate;
	}
	public WebElement getCheckoutDate() {
		return CheckoutDate;
	}
	public WebElement getAdultRoom() {
		return AdultRoom;
	}
	public WebElement getChildRoom() {
		return ChildRoom;
	}
	public WebElement getSubmit() {
		return Submit;
	}

}
