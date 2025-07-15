package com.assessment.callLogs;

import java.time.LocalDateTime;

public class CallTask implements Runnable {
	
	
	 private final String callerId;
	    private final String receiverId;
	    private final int duration;

	    public CallTask(String callerId, String receiverId, int duration) {
	        this.callerId = callerId;
	        this.receiverId = receiverId;
	        this.duration = duration;
	    }

	    public void run() {
	        LocalDateTime start = LocalDateTime.now();
	        try {
	            Thread.sleep(duration * 1000L);
	        } catch (InterruptedException e) {
	            Thread.currentThread().interrupt();
	        }
	        LocalDateTime end = LocalDateTime.now();
	        Logs log = new Logs(callerId, receiverId, start, end);
	        CallManagement.getInstance().logCall(log);
	        System.out.println("Logged: " + log);
	    }
	
	

}
