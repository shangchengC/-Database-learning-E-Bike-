package de.ostfalia.bips.e_bike_2020;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.HashMap;
import java.util.Map;

import org.camunda.bpm.engine.delegate.DelegateExecution;
import org.camunda.bpm.engine.delegate.JavaDelegate;
import org.camunda.bpm.engine.variable.Variables;

public class LoadPreisOhneW implements JavaDelegate {

	public void execute(DelegateExecution execution) throws Exception {
		
	 
		Connection c = DatabaseConnection.getConnection();
		double preis = 0;
		PreparedStatement s1 = c.prepareStatement("select * from konfigurationselement left join variante on konfigurationselement.idVariante = variante.idVariante and konfigurationselement.idKomponente=variante.idKomponente  ");
		
		ResultSet r1 = s1.executeQuery();
		Map<Integer, Double> zPreis = new HashMap<Integer, Double>();
		while(r1.next()) {
			zPreis.put(r1.getInt("konfigurationselement.idKomponente"),  r1.getDouble("Einzelpreis") ); 
		}
		
		preis=zPreis.get(1)+zPreis.get(2)+zPreis.get(25)+zPreis.get(40);
	
		
		
		 
		 execution.setVariable("ZUSAMMENKOSTEN", preis*5);
		 execution.setVariable("Angebotspreis", (preis*5)*1.5);
		 
		r1.close();
		s1.close();
		
		
		
		c.close();
		
	 

	}
	
	 
}
