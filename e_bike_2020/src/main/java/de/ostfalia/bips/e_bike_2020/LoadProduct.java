package de.ostfalia.bips.e_bike_2020;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.HashMap;
import java.util.Map;

import org.camunda.bpm.engine.delegate.DelegateExecution;
import org.camunda.bpm.engine.delegate.JavaDelegate;
import org.camunda.bpm.engine.variable.Variables;

public class LoadProduct implements JavaDelegate {
	
	public void execute(DelegateExecution execution) throws Exception {
		
		Connection c = DatabaseConnection.getConnection();
		PreparedStatement s = c.prepareStatement("SELECT * FROM produkt");
		ResultSet r = s.executeQuery();
		Map<Integer, String> produkts = new HashMap<Integer, String>();
		
		while(r.next()) {
			produkts.put(r.getInt("idProdukt"), r.getString("name")); 
		}
	
		produkts.put(9547,"TEST");
		execution.setVariable("AVAILABLE_PRODUCT", Variables.objectValue(produkts) .serializationDataFormat(Variables.SerializationDataFormats.JSON) .create());
		
		r.close();
		s.close();
		c.close();
		// Check business key
		
		if (execution.getProcessBusinessKey() == null) {
			final String key = BusinessKeyGenerator.getKey(21);
			execution.setProcessBusinessKey(key);
			execution.setVariable("DEMO_BUSINESS_KEY", key);
			} else {
			execution.setVariable("DEMO_BUSINESS_KEY", execution.getProcessBusinessKey()); }
		
	} 

}
