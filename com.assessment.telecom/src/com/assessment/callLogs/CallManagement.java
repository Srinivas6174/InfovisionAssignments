package com.assessment.callLogs;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class CallManagement {
	
	private static CallManagement instance;
    private Map<String, List<Logs>> callLogs = new HashMap<>();

    private CallManagement() {}

    public static synchronized CallManagement getInstance() {
        if (instance == null) {
            instance = new CallManagement();
        }
        return instance;
    }

    public void logCall(Logs callLog) {
        callLogs.computeIfAbsent(callLog.getCallerId(), k -> new ArrayList<>()).add(callLog);
    }

    public List<Logs> getLogsByCustomer(String customerId) {
        return callLogs.getOrDefault(customerId, Collections.emptyList());
    }
}




