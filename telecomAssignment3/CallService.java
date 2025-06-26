package com.training.telecomAssignment3;

import java.util.Date;

public class CallService {

	private String callNumber;
	private Date timeStamp;
	
	public CallService(String callNumber,Date timeStamp) {
		this.callNumber=callNumber;
		this.timeStamp=timeStamp;
	}

	@Override
	public String toString() {
		return "CallService [callNumber=" + callNumber + ", timeStamp=" + timeStamp + "]";
	}
	
	
}
