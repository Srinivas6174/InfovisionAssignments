package com.training.telecomAssignment3;

import java.util.Date;

public class MainClass {
	public static void main(String[] args) {
		
	
	
	TelecomServiceClass system =new TelecomServiceClass();
	
	   system.addCustomer("C001","Sri");
       system.addCustomer("C002", "Naveen");

       system.recordCall("C001", "9876543210", 120);
       system.subscribeVAS("C001", "Caller Tune");
       system.subscribeVAS("C001", "Missed Call Alert");
       system.unsubscribeVAS("C001", "Caller Tune");
       system.fileComplaint("C001", "Network issue in my area.");
       //system.addCallHistory("5550001111", new Date());
       system.recordCall("C002", "9123456780", 60);
       system.subscribeVAS("C002", "International Roaming");
       system.fileComplaint("C002", "Billing error.");

       System.out.println("\n--- All Customers Summary ---");
       system.displayAllCustomers();
}
}
