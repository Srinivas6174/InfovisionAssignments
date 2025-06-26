package com.training.telecomAssignment3;

import java.util.Date;

public class ComplaintService {
	
	 private static int complaintCounter = 1000;
	    private int complaintId;
	    private String description;
	    private Date timestamp;

	    public ComplaintService(String description) {
	        this.complaintId = complaintCounter++;
	        this.description = description;
	        this.timestamp = new Date();
	    }

	  
	
	
	

	public static int getComplaintCounter() {
		return complaintCounter;
	}

	public int getComplaintId() {
		return complaintId;
	}

	public String getDescription() {
		return description;
	}

	public Date getTimeStamp() {
		return timestamp;
	}


	@Override
	public String toString() {
		return "ComplaintService [complaintId=" + complaintId + ", description=" + description + ", timeStamp="
				+ timestamp + "]";
	}

	
}
