package com.training.telecomAssignment3;

import java.util.ArrayList;
import java.util.Date;
import java.util.LinkedList;
import java.util.List;

public class CustomerService {
	
	private String customerId;
	private String name;
	
	private LinkedList<CallService> callHistory;
	private List <String> customerVASService;
	private List<ComplaintService> complaintService;
	private List<String> additionalBenefits;
	
	public CustomerService(String customerId,String name) {
		this.customerId=customerId;
		this.name=name;
		this.callHistory= new LinkedList<CallService>();
		this.customerVASService=new ArrayList<String>();
		this.complaintService=new ArrayList<ComplaintService>();
		this.additionalBenefits=new ArrayList<String>();		
		
	}

	public String getCustomerId() {
		return customerId;
	}

	public void setCustomerId(String customerId) {
		this.customerId = customerId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<CallService> getCallHistory() {
		return callHistory;
	}

	

	public List<String> getCustomerVASService() {
		return customerVASService;
	}



	public List<ComplaintService> getComplaintService() {
		return complaintService;
	}

	

	@Override
	public String toString() {
		return "CustomerService [customerId=" + customerId + ", name=" + name + ", callHistory=" + callHistory
				+ ", customerVASService=" + customerVASService + ", complaintService=" + complaintService + "]";
	}
	
	
	public void CallHistory(String number,String name, Date timeStamp) {
	    callHistory.addFirst(new CallService(number, timeStamp));
	}

	

	public void subscribeVAS(String service) {
		 if (!customerVASService.contains(service)) {
			 customerVASService.add(service);
	        }		
	}
	
	 public void unsubscribeVAS(String service) {
		 customerVASService.remove(service);
	    }
	 
	 public void fileComplaint(String description) {
	        complaintService.add(new ComplaintService(description));
	    }

	public void addAdditionalBenefit(String benefits) {
		additionalBenefits.add(benefits);
		
	}

	public void addCall(String number, int duration) {
	
		
		
	}
	
}
