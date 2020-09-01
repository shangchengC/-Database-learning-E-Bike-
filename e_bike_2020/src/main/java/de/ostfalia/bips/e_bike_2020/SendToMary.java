package de.ostfalia.bips.e_bike_2020;

import java.util.HashMap;

import org.camunda.bpm.engine.RuntimeService;
import org.camunda.bpm.engine.delegate.DelegateExecution;
import org.camunda.bpm.engine.delegate.JavaDelegate;

public class SendToMary implements JavaDelegate {

	public void execute(DelegateExecution execution) throws Exception {
		
		HashMap<String, Object> d = new HashMap<String, Object>();
		d.put("ZUSAMMENKOSTEN", execution.getVariable("ZUSAMMENKOSTEN"));
		 d.put("KONFIGURATION_ID",execution.getVariable("KONFIGURATION_ID"));
		 d.put("CUSTOMER_ID",execution.getVariable("CUSTOMER_ID"));
		 d.put("Angebotspreis",execution.getVariable("Angebotspreis"));
		d.put("DEMO_BUSINESS_KEY", execution.getVariable("DEMO_BUSINESS_KEY"));
	 
	 
	 
		RuntimeService r = execution.getProcessEngineServices().getRuntimeService();
		r.startProcessInstanceByMessage("SendeToMary",  d);
		}
}
