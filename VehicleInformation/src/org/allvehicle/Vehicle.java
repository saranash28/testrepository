package org.allvehicle;
import org.twowheeler.*;
import org.threewheeler.*;
import org.fourwheeler.*;

public class Vehicle {
	public void VelicleNecessery() {
		System.out.println("Vehicles Necessery in Two wheeler, three wheeler, Four Wheeler are ");
	}

	public static void main(String[] args) {
		Vehicle v=new Vehicle();
		v.VelicleNecessery();
		TwoWheeler c=new TwoWheeler();
	    System.out.println("In Two Wheeler ");
		c.bike();
		c.cycle();
		
		ThreeWheeler b=new ThreeWheeler();
	    System.out.println("In Three Wheeler ");
	    b.auto();
	    
	    FourWheeler n=new FourWheeler();
	    System.out.println("In Four Wheeler ");
	    n.car();
	    n.bus();
	    n.lorry();

	}

}
