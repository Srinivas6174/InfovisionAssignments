package com.assessment.plan;

public class Factory {
	
	 public static Plan getPlan(String type) {
	        return switch (type.toLowerCase()) {
	            case "prepaid" -> new PrepaidPlan();
	            case "postpaid" -> new PostpaidPlan();
	            default -> throw new IllegalArgumentException("Unknown plan type");
	        };
	    }

}
