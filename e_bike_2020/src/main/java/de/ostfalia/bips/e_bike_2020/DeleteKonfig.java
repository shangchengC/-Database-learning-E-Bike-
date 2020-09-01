package de.ostfalia.bips.e_bike_2020;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.HashMap;
import java.util.Map;

import org.camunda.bpm.engine.delegate.DelegateExecution;
import org.camunda.bpm.engine.delegate.JavaDelegate;
import org.camunda.bpm.engine.variable.Variables;

public class DeleteKonfig implements JavaDelegate {

	public void execute(DelegateExecution execution) throws Exception {
		Connection c = DatabaseConnection.getConnection();
		
		PreparedStatement max_konfig = c.prepareStatement("SELECT max(idKonfiguration) FROM konfiguration");
		ResultSet r_be = max_konfig.executeQuery();
		while(r_be.next()) {
			execution.setVariable("KONFIGURATION_ID", r_be.getInt(1));
		}
		r_be.close();
		
		PreparedStatement s_key=c.prepareStatement("SET foreign_key_checks = 0");
		String sql_de=" DELETE konfiguration , konfigurationselement   from konfiguration LEFT JOIN konfigurationselement ON konfiguration.idKonfiguration = konfigurationselement.idKonfiguration  WHERE konfiguration.idKonfiguration = "  ;
		PreparedStatement s_de = c.prepareStatement(sql_de + (Integer)(execution.getVariable("KONFIGURATION_ID")));
		s_key.executeUpdate();
		s_key.close();
		
		s_de.executeUpdate();
		s_de.close();
		

		
		c.close();

	}

}
