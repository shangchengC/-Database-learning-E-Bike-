package de.ostfalia.bips.e_bike_2020;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.HashMap;
import java.util.Map;

import org.camunda.bpm.engine.delegate.DelegateExecution;
import org.camunda.bpm.engine.delegate.JavaDelegate;
import org.camunda.bpm.engine.variable.Variables;

public class LoadBasisKomponente implements JavaDelegate {

	public void execute(DelegateExecution execution) throws Exception {
		
		Connection c = DatabaseConnection.getConnection();
		PreparedStatement s = c.prepareStatement("SELECT * FROM komponente WHERE idKomponente = 1 OR idKomponente =2 OR idKomponente =25 OR idKomponente = 40");
		ResultSet r = s.executeQuery();
		Map<Integer, String> komponentes = new HashMap<Integer, String>();
		
		while(r.next()) {
			komponentes.put(r.getInt("idKomponente"), r.getString("Name")); 
		}
		komponentes.put(-1, "test anlegen");
		
		execution.setVariable("AVAILABLE_KOMPONENTE", Variables.objectValue(komponentes) .serializationDataFormat(Variables.SerializationDataFormats.JSON) .create());
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
