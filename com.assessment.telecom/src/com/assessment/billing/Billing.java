package com.assessment.billing;

import java.util.List;

import com.assessment.callLogs.CallManagement;
import com.assessment.callLogs.Logs;
import com.assessment.telecom.Customer;

public class Billing {
	
	 private static Billing instance;

	    private Billing() {}

	    public static Billing getInstance() {
	        if (instance == null) {
	            instance = new Billing();
	        }
	        return instance;
	    }

	    public double generateBill(Customer customer) {
	        List<Logs> logs = CallManagement.getInstance().getLogsByCustomer(customer.getId());
	        double total = 0;
	        for (Logs log : logs) {
	            total += log.getDurationInMinutes() * customer.getPlan().getRatePerMinute();
	        }
	        return total;
	    }

}
