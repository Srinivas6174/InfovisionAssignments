package com.assessment.telecom;

import com.assessment.plan.Plan;

public class Customer {
	
	 private String id;
	    private String name;
	    private Plan plan;

	    public Customer(String id, String name) {
	        this.id = id;
	        this.name = name;
	    }

	    public String getId() { return id; }
	    public String getName() { return name; }
	    public Plan getPlan() { return plan; }
	    public void setPlan(Plan plan) { this.plan = plan; }
	}


