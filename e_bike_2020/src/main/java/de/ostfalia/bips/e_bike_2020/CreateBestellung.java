package de.ostfalia.bips.e_bike_2020;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import org.camunda.bpm.engine.delegate.DelegateExecution;
import org.camunda.bpm.engine.delegate.JavaDelegate;

public class CreateBestellung implements JavaDelegate {

	public void execute(DelegateExecution execution) throws Exception {
		Connection c = DatabaseConnection.getConnection();
		
		PreparedStatement max_konfig = c.prepareStatement("SELECT max(idKonfiguration) FROM konfiguration");
		ResultSet r_be = max_konfig.executeQuery();
		while(r_be.next()) {
			execution.setVariable("KONFIGURATION_ID", r_be.getInt(1));
		}
		r_be.close();
		
		
		CallableStatement max_bestellung = c.prepareCall("SELECT MAX(idBestellung) FROM bestellung");
		ResultSet r_bestellung = max_bestellung.executeQuery();
		int id_bestellung = !r_bestellung.next() ? 0 : r_bestellung.getInt(1) + 1;
		r_bestellung.close();
		execution.setVariable("BESTELLUNG_ID", id_bestellung);
		String sql_bestellung = "INSERT INTO bestellung (idBestellung, idKunde, idKonfiguration, Zeitstempel) " + "VALUES (?, ?, ?, NOW())";
		CallableStatement s_bestellung = c.prepareCall(sql_bestellung);
		s_bestellung.setInt(1, id_bestellung); 
		
		
		s_bestellung.setString(2, execution.getVariable("CUSTOMER_ID").toString()); 
		
		
		s_bestellung.setString(3, execution.getVariable("KONFIGURATION_ID").toString());
		
		
		s_bestellung.executeUpdate();
		s_bestellung.close();
		
		c.close(); 

	}

}
