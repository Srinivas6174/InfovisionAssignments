package com.training.telecomAssignment3;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class TelecomServiceClass  {
	

	    private Map<String, CustomerService> customers;

	    public TelecomServiceClass() {
	        customers = new HashMap<>();
	    }

	    
	    public void addCustomer(String customerId, String name) {
	        if (!customers.containsKey(customerId)) {
	            CustomerService newCustomer = new CustomerService(customerId, name);

	            newCustomer.subscribeVAS("Free Caller Tune (1 Month)");
	            newCustomer.addAdditionalBenefit("10GB Extra Data (valid for 1 month)");

	            customers.put(customerId, newCustomer);

	            System.out.println("New customer added with welcome benefits: Free Caller Tune + 10GB Extra Data for 1 month.");
	        } else {
	            System.out.println("Customer with ID " + customerId + " already exists.");
	        }
	    }

	    public void recordCall(String customerId, String number, int duration) {
	        CustomerService customer = customers.get(customerId);
	        if (customer != null) {
	            customer.addCall(number, duration);
	        }
	    }

	    public void subscribeVAS(String customerId, String service) {
	        CustomerService customer = customers.get(customerId);
	        if (customer != null) {
	            customer.subscribeVAS(service);
	        }
	    }

	    public void unsubscribeVAS(String customerId, String service) {
	        CustomerService customer = customers.get(customerId);
	        if (customer != null) {
	            customer.unsubscribeVAS(service);
	        }
	    }

	    public void fileComplaint(String customerId, String description) {
	        CustomerService customer = customers.get(customerId);
	        if (customer != null) {
	            customer.fileComplaint(description);
	        }
	    }

	    public void viewComplaints(String customerId) {
	        CustomerService customer = customers.get(customerId);
	        if (customer != null) {
	            List<ComplaintService> complaints = customer.getComplaintService();
	            for (ComplaintService c : complaints) {
	                System.out.println(c);
	            }
	        }
	    }

	    public void displayAllCustomers() {
	        for (CustomerService c : customers.values()) {
	            System.out.println(c);
	        }
	    }
	}

