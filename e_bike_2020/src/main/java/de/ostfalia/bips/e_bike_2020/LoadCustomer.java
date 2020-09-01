package de.ostfalia.bips.e_bike_2020;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.HashMap;
import java.util.Map;

import org.camunda.bpm.engine.delegate.DelegateExecution;
import org.camunda.bpm.engine.delegate.JavaDelegate;
import org.camunda.bpm.engine.variable.Variables;

public class LoadCustomer implements JavaDelegate { 
	
		public void execute(DelegateExecution execution) throws Exception {
			
			Connection c = DatabaseConnection.getConnection();
			PreparedStatement s = c.prepareStatement("SELECT * FROM kunde");
			ResultSet r = s.executeQuery();
			
			Map<Integer, String> customers = new HashMap<Integer, String>();
			
			while(r.next()) {
			customers.put(r.getInt("idKunde"), r.getString("name")); 
			}
			customers.put(-1, "Kunden anlegen");
			execution.setVariable("AVAILABLE_CUSTOMER", Variables.objectValue(customers) .serializationDataFormat(Variables.SerializationDataFormats.JSON) .create());
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