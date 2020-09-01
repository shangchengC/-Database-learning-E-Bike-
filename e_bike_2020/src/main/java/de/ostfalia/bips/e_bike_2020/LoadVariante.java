package de.ostfalia.bips.e_bike_2020;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.HashMap;
import java.util.Map;

import org.camunda.bpm.engine.delegate.DelegateExecution;
import org.camunda.bpm.engine.delegate.JavaDelegate;
import org.camunda.bpm.engine.variable.Variables;

public class LoadVariante implements JavaDelegate {

public void execute(DelegateExecution execution) throws Exception {
	
		Connection c = DatabaseConnection.getConnection();
		 
		String sql_k1="select * from produkt_variante left join variante on produkt_variante.idVariante = variante.idVariante and produkt_variante.idKomponente=variante.idKomponente  WHERE idProdukt =  " + ((Integer) execution.getVariable("PRODUKT_ID")).intValue() + " AND variante.idKomponente=1";
		PreparedStatement s1 = c.prepareStatement(sql_k1) ;
		ResultSet r1 = s1.executeQuery();
		Map<Integer, String> variantes_k1 = new HashMap<Integer, String>();
		 
		while(r1.next()) {
			variantes_k1.put(r1.getInt("idVariante"), r1.getString("name")); 
			
		}
		execution.setVariable("VARIANTE_KOMPONENTE1", Variables.objectValue(variantes_k1) .serializationDataFormat(Variables.SerializationDataFormats.JSON) .create());
		 
		r1.close();
		s1.close();
		
		PreparedStatement s2 = c.prepareStatement("select * from produkt_variante left join variante on produkt_variante.idVariante = variante.idVariante and produkt_variante.idKomponente=variante.idKomponente WHERE idProdukt = " + ((Integer) execution.getVariable("PRODUKT_ID")).intValue() + " AND variante.idKomponente=2 ");
		ResultSet r2 = s2.executeQuery();
		Map<Integer, String> variantes_k2 = new HashMap<Integer, String>();
		while(r2.next()) {
			variantes_k2.put(r2.getInt("idVariante"), r2.getString("name")); 
		}
		execution.setVariable("VARIANTE_KOMPONENTE2", Variables.objectValue(variantes_k2) .serializationDataFormat(Variables.SerializationDataFormats.JSON) .create());
		r2.close();
		s2.close();
		
		PreparedStatement s25 = c.prepareStatement("select * from produkt_variante left join variante on produkt_variante.idVariante = variante.idVariante and produkt_variante.idKomponente=variante.idKomponente WHERE idProdukt = " + ((Integer) execution.getVariable("PRODUKT_ID")).intValue() + " AND variante.idKomponente=25 " );
		ResultSet r25 = s25.executeQuery();
		Map<Integer, String> variantes_k25 = new HashMap<Integer, String>();
		while(r25.next()) {
			variantes_k25.put(r25.getInt("idVariante"), r25.getString("name")); 
		}
		execution.setVariable("VARIANTE_KOMPONENTE25", Variables.objectValue(variantes_k25) .serializationDataFormat(Variables.SerializationDataFormats.JSON) .create());
		r25.close();
		s25.close();
		
		PreparedStatement s40 = c.prepareStatement("select * from produkt_variante left join variante on produkt_variante.idVariante = variante.idVariante and produkt_variante.idKomponente=variante.idKomponente WHERE idProdukt = " + ((Integer) execution.getVariable("PRODUKT_ID")).intValue() + " AND variante.idKomponente=40 ");
		ResultSet r40 = s40.executeQuery();
		Map<Integer, String> variantes_k40 = new HashMap<Integer, String>();
		while(r40.next()) {
			variantes_k40.put(r40.getInt("idVariante"), r40.getString("name")); 
		}
		execution.setVariable("VARIANTE_KOMPONENTE40", Variables.objectValue(variantes_k40) .serializationDataFormat(Variables.SerializationDataFormats.JSON) .create());
		r40.close();
		s40.close();
		
		
		
		
		
		
		
		
		
		
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
