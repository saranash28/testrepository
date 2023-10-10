package org.bank;

public class AxisBank extends BankInfo{
		public void deposit() {
			System.out.println("For deposit 15%");
		}
		
			public static void main(String args[]) {
				BankInfo b = new BankInfo();
				b.saving();
				b.fixed();
				b.deposit();
				AxisBank m=new AxisBank();
				m.deposit();
				
				
			}
	

}
