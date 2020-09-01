package de.ostfalia.bips.e_bike_2020;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.ResultSet;

import org.camunda.bpm.engine.delegate.DelegateExecution;
import org.camunda.bpm.engine.delegate.JavaDelegate;

public class CreateCustomer implements JavaDelegate { 
	
	 
	public void execute(DelegateExecution e) throws Exception {
		Connection c = DatabaseConnection.getConnection();
		CallableStatement max = c.prepareCall("SELECT MAX(idKunde) FROM kunde");
		ResultSet r = max.executeQuery();
		int id = !r.next() ? 0 : r.getInt(1) + 1;
		r.close();
		e.setVariable("CUSTOMER_ID", id);
		String sql = "INSERT INTO kunde (idKunde, Name, Adresse, `E-Mail`) " + "VALUES (?, ?, ?, ?)";
		CallableStatement s = c.prepareCall(sql);
		s.setInt(1, id); 
		s.setString(2, e.getVariable("CUSTOMER_NAME").toString()); 
		s.setString(3, e.getVariable("CUSTOMER_ADDRESS").toString());
		s.setString(4, e.getVariable("CUSTOMER_MAIL").toString());
		s.executeUpdate();
		s.close();
		c.close(); 
		
	} 
}