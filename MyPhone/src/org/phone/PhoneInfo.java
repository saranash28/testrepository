package org.phone;

public class PhoneInfo {
	
	public void phoneName() {
		System.out.println("Phone Name is Redmi Note 10 pro");
	}
	public void phoneImeiNum() {
		System.out.println("Phone Imei no is hbs56866969469668");
	}
	public void phoneCamera() {
		System.out.println("Phone Camera is 108 mega pixel");
	}
	public void phoneStorage() {
		System.out.println("Phone Storge is 128gb");
	}
	public void osName() {
		System.out.println("Phone OS Name is Android 13");
	}

	public static void main(String[] args) {
		PhoneInfo pi=new PhoneInfo();
		pi.phoneName();
		pi.phoneImeiNum();
		pi.phoneCamera();
		pi.phoneStorage();
		pi.osName();

	}

}
