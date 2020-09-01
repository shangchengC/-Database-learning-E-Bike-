package de.ostfalia.bips.e_bike_2020;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.HashMap;
import java.util.Map;

import org.camunda.bpm.engine.delegate.DelegateExecution;
import org.camunda.bpm.engine.delegate.JavaDelegate;
import org.camunda.bpm.engine.variable.Variables;

public class LoadKonfiguration implements JavaDelegate{
	public void execute(DelegateExecution execution) throws Exception {
		
		Connection connection = DatabaseConnection.getConnection();
		String sql = "SELECT * FROM konfiguration where idKonfiguration = (select max(idKonfiguration )from konfiguration)";
		
		PreparedStatement statement = connection.prepareStatement(sql);
		
		 
		ResultSet r = statement.executeQuery();
	while(r.next()) {
		execution.setVariable("KONFIGURATION_ID", r.getString("idKonfiguration"));
		execution.setVariable("CUSTOMER_ID", r.getString("idKunde"));
		execution.setVariable("Sonderwuensche", r.getString("FreitextWunsch")); 
	}
		r.close();
		statement.close();
		connection.close(); 
		
	} 
}
