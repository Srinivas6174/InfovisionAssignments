package com.assessment.callLogs;

import java.time.Duration;
import java.time.LocalDateTime;

public class Logs {
	

    private String callerId;
    private String receiverId;
    private LocalDateTime start;
    private LocalDateTime end;

    public Logs(String callerId, String receiverId, LocalDateTime start, LocalDateTime end) {
        this.callerId = callerId;
        this.receiverId = receiverId;
        this.start = start;
        this.end = end;
    }

    public long getDurationInMinutes() {
        return Duration.between(start, end).toMinutes();
    }

    public String toString() {
        return String.format("Call from %s to %s | Duration: %d mins", callerId, receiverId, getDurationInMinutes());
    }

    public String getCallerId() { return callerId; }
}


