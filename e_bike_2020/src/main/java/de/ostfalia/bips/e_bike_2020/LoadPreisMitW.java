package de.ostfalia.bips.e_bike_2020;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.HashMap;
import java.util.Map;

import org.camunda.bpm.engine.delegate.DelegateExecution;
import org.camunda.bpm.engine.delegate.JavaDelegate;

public class LoadPreisMitW implements JavaDelegate {

	public void execute(DelegateExecution execution) throws Exception {
		Connection c = DatabaseConnection.getConnection();
		
		CallableStatement ke_max_id = c.prepareCall("SELECT * FROM konfigurationselement where idKonfiguration = (select max(idKonfiguration )from konfiguration)  " );
		String sql_zusatz= "UPDATE konfigurationselement SET  Zusatzmontagedauer_sec = " + (Double) execution.getVariable("ZUSATZMONTAGEDAUER") + "  , Zusatzmaterialkosten  = " +  (Double) execution.getVariable("ZUSATZMATERIALKOSTEN") + " where idKonfiguration = (select max(idKonfiguration )from konfiguration)";
		CallableStatement s_zusatz = c.prepareCall(sql_zusatz);
 
		s_zusatz.executeUpdate();
		s_zusatz.close();
		
		double preis = 0;
		PreparedStatement s1 = c.prepareStatement("select * from konfigurationselement left join variante on konfigurationselement.idVariante = variante.idVariante and konfigurationselement.idKomponente=variante.idKomponente  ");
		
		ResultSet r1 = s1.executeQuery();
		Map<Integer, Double> zPreis = new HashMap<Integer, Double>();
		while(r1.next()) {
			zPreis.put(r1.getInt("konfigurationselement.idKomponente"),  r1.getDouble("Einzelpreis") ); 
		}
		
		preis=zPreis.get(1)+zPreis.get(2)+zPreis.get(25)+zPreis.get(40);
	
		
		double extra = (Double) execution.getVariable("ZUSATZMATERIALKOSTEN");
		 
		 execution.setVariable("ZUSAMMENKOSTEN", preis*5+extra);
		 execution.setVariable("plus", extra);
		 execution.setVariable("Angebotspreis", (preis*5+extra)*1.5);
		 
		r1.close();
		s1.close();
		
		
		
		c.close();
		
		
	}

	
}
