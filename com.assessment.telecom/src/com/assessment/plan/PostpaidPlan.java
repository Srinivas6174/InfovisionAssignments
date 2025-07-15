package com.assessment.plan;

public class PostpaidPlan extends Plan{

	 public PostpaidPlan() {
	        this.ratePerMinute = 0.8;
	    }
	    public String getType() { return "Postpaid"; }
}
