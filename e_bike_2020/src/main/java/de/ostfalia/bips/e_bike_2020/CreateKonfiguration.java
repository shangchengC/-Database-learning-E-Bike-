package de.ostfalia.bips.e_bike_2020;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.ResultSet;

import org.camunda.bpm.engine.delegate.DelegateExecution;
import org.camunda.bpm.engine.delegate.JavaDelegate;

public class CreateKonfiguration implements JavaDelegate {

	public void execute(DelegateExecution execution) throws Exception {
		Connection c = DatabaseConnection.getConnection();
		CallableStatement max = c.prepareCall("SELECT MAX(idKonfiguration) FROM konfiguration");
		ResultSet r = max.executeQuery();
		int id_konfiguration = !r.next() ? 0 : r.getInt(1) + 1;
		r.close();
		execution.setVariable("KONFIGURATION_ID", id_konfiguration);
		String sql = "INSERT INTO konfiguration (idKonfiguration, idKunde, Zeitstempel, `FreitextWunsch`) " + "VALUES (?, ?,  NOW(), ?)";
		CallableStatement s = c.prepareCall(sql);
		s.setInt(1, id_konfiguration); 
		s.setInt(2, (Integer) execution.getVariable("CUSTOMER_ID")); 
		s.setString(3, execution.getVariable("Sonderwuensche").toString());
		s.executeUpdate();
		s.close();
		
		
		 	int[] vId= {(Integer) execution.getVariable("VARIANTE_ID1"),(Integer) execution.getVariable("VARIANTE_ID2"),(Integer) execution.getVariable("VARIANTE_ID25"),(Integer) execution.getVariable("VARIANTE_ID40")};
		 	int[] kId= {1 , 2 , 25 ,40} ;
		 	for (int i =0 ;i<4;i++) {
				CallableStatement max2 = c.prepareCall("SELECT MAX(idKonfiguration) FROM konfigurationselement");
				String sql2 = "INSERT INTO konfigurationselement (idKonfiguration, idProdukt , idKomponente , idVariante) " + " VALUES (  ? , ? , ? , ? )";
				CallableStatement s2 = c.prepareCall(sql2);
				s2.setInt(1, id_konfiguration);
				s2.setInt(2, (Integer) execution.getVariable("PRODUKT_ID") );
				s2.setInt(3, kId[i]);	
				s2.setInt(4, vId[i]);
//				s2.setString(5, execution.getVariable("WUNSCH_ZUSATZMONTAGEDAUER").toString());
//				s2.setString(6, execution.getVariable("WUNSCH_ZUSATZMATERIALKOSTEN").toString());
				
				s2.executeUpdate();
				s2.close();
		 	}
		
		
		
		
		c.close(); 
		
		
		
		
	}

}
