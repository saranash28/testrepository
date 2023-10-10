package org.phone;

public class InternalStorage extends ExternalStorage {
	public void processorName(){
		System.out.println("Processor Name is Octa-core Max 2.3GHz");
		}
	public void ramSize(){
		System.out.println("Ram Size is 8.0 GB");
		}

	public static void main(String[] args) {
		InternalStorage i = new InternalStorage();
		i.processorName();
		i.ramSize();
		i.size();
		

	}

}
