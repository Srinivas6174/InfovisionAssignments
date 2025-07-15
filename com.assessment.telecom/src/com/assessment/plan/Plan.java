package com.assessment.plan;

public abstract class Plan {
    protected double ratePerMinute;
    public abstract String getType();
    public double getRatePerMinute() {
        return ratePerMinute;
    }
}
