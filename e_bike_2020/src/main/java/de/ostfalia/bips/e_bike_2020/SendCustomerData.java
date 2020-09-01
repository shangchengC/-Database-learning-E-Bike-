package de.ostfalia.bips.e_bike_2020;

import java.util.HashMap;

import org.camunda.bpm.engine.RuntimeService;
import org.camunda.bpm.engine.delegate.DelegateExecution;
import org.camunda.bpm.engine.delegate.JavaDelegate;

public class SendCustomerData implements JavaDelegate {

	public void execute(DelegateExecution e) throws Exception {
		HashMap<String, Object> d = new HashMap<String, Object>();
		d.put("CUSTOMER_ID", e.getVariable("CUSTOMER_ID"));
		d.put("CUSTOMER_NAME", e.getVariable("CUSTOMER_NAME"));
		d.put("CUSTOMER_ADDRESS", e.getVariable("CUSTOMER_ADDRESS"));
		d.put("CUSTOMER_MAIL", e.getVariable("CUSTOMER_MAIL"));
		String key = (String) e.getVariable("DEMO_BUSINESS_KEY");
		RuntimeService r = e.getProcessEngineServices().getRuntimeService();
		r.correlateMessage("Sende Kundendaten", key, d); }

}
