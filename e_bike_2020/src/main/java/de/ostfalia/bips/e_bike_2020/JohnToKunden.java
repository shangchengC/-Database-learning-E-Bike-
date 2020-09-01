package de.ostfalia.bips.e_bike_2020;

import java.util.HashMap;

import org.camunda.bpm.engine.RuntimeService;
import org.camunda.bpm.engine.delegate.DelegateExecution;
import org.camunda.bpm.engine.delegate.JavaDelegate;

public class JohnToKunden implements JavaDelegate {

	public void execute(DelegateExecution execution) throws Exception {
		HashMap<String, Object> d = new HashMap<String, Object>();
		d.put("ZUSAMMENKOSTEN", execution.getVariable("ZUSAMMENKOSTEN"));
		d.put("WUNSCH_ZUSATZMONTAGEDAUER", execution.getVariable("WUNSCH_ZUSATZMONTAGEDAUER"));
		
		String key =   (String) execution.getVariable("DEMO_BUSINESS_KEY");
		RuntimeService r = execution.getProcessEngineServices().getRuntimeService();
		
		 
		r.correlateMessage("GetOrder", key, d);
	}
	

}
