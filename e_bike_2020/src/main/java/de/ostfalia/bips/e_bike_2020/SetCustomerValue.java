package de.ostfalia.bips.e_bike_2020;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import org.camunda.bpm.engine.delegate.DelegateExecution;
import org.camunda.bpm.engine.delegate.JavaDelegate;

public class SetCustomerValue implements JavaDelegate {
	
	public void execute(DelegateExecution e) throws Exception {
		
		Connection connection = DatabaseConnection.getConnection();
		String sql = "SELECT * FROM kunde WHERE idKunde = ?";
		
		PreparedStatement statement = connection.prepareStatement(sql);
		
		statement.setInt(1, (Integer)(e.getVariable("CUSTOMER_ID")));
		ResultSet r = statement.executeQuery();
	while(r.next()) {
		e.setVariable("CUSTOMER_NAME", r.getString("name"));
		e.setVariable("CUSTOMER_ADDRESS", r.getString("Adresse"));
		e.setVariable("CUSTOMER_MAIL", r.getString("E-Mail")); 
	}
		r.close();
		statement.close();
		connection.close(); 
	} 
}
