package de.ostfalia.bips.e_bike_2020;

import java.util.HashMap;

import org.camunda.bpm.engine.RuntimeService;
import org.camunda.bpm.engine.delegate.DelegateExecution;
import org.camunda.bpm.engine.delegate.JavaDelegate;

public class SendToJohn implements JavaDelegate {

	public void execute(DelegateExecution e) throws Exception {
		
	HashMap<String, Object> d = new HashMap<String, Object>();
	d.put("VARIANTE_ID1", e.getVariable("VARIANTE_ID1"));
	d.put("VARIANTE_ID2", e.getVariable("VARIANTE_ID2"));
	d.put("VARIANTE_ID25", e.getVariable("VARIANTE_ID25"));
	d.put("VARIANTE_ID40", e.getVariable("VARIANTE_ID40"));
	 d.put("KONFIGURATION_ID",e.getVariable("KONFIGURATION_ID"));
	 d.put("CUSTOMER_ID",e.getVariable("CUSTOMER_ID"));
	
	
	d.put("WUNSCH_ZUSATZMONTAGEDAUER", e.getVariable("WUNSCH_ZUSATZMONTAGEDAUER"));
	d.put("WUNSCH_ZUSATZMATERIALKOSTEN", e.getVariable("WUNSCH_ZUSATZMATERIALKOSTEN"));
	
	d.put("DEMO_BUSINESS_KEY", e.getVariable("DEMO_BUSINESS_KEY"));
 
	 
 
	RuntimeService r = e.getProcessEngineServices().getRuntimeService();
	r.startProcessInstanceByMessage("SendeToJohn",  d);
	}
}
