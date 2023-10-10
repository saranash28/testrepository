package org.bike;

public class Ktm implements Bike {

	public void cost(){
		System.out.println("Cost of KTM Bike is 1000000");
	}
public void speed(){
		System.out.println("Speed is 300km/h");
	}
	public static void main(String[] args) {
		Ktm m=new Ktm();
		m.cost();
		m.speed();
	}

}

