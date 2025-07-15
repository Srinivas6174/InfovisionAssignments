package com.assessment.mainClass;

import com.assessment.billing.Billing;
import com.assessment.callLogs.CallTask;
import com.assessment.plan.Factory;
import com.assessment.telecom.Customer;

public class MainClass {
	
	
	 public static void main(String[] args) throws InterruptedException {
	        Customer customer1 = new Customer("C1", "Srinivas");
	        Customer customer2 = new Customer("C2", "Mohan");

	        customer1.setPlan(Factory.getPlan("prepaid"));
	        customer2.setPlan(Factory.getPlan("postpaid"));

	        Thread t1 = new Thread(new CallTask("C1", "C2", 5)); // 5 seconds
	        Thread t2 = new Thread(new CallTask("C2", "C1", 3)); // 3 seconds

	        t1.start();
	        t2.start();

	        t1.join();
	        t2.join();

	        System.out.println("Srinivas Bill: " + Billing.getInstance().generateBill(customer1));
	        System.out.println("Mohan Bill: " + Billing.getInstance().generateBill(customer2));
	    }


}
