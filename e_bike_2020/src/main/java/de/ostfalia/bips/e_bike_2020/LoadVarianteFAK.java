package de.ostfalia.bips.e_bike_2020;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.HashMap;
import java.util.Map;

import org.camunda.bpm.engine.delegate.DelegateExecution;
import org.camunda.bpm.engine.delegate.JavaDelegate;
import org.camunda.bpm.engine.variable.Variables;

public class LoadVarianteFAK implements JavaDelegate {

	public void execute(DelegateExecution execution) throws Exception {
		Connection c = DatabaseConnection.getConnection();
		
		PreparedStatement s3 = c.prepareStatement("select * from produkt_variante left join variante on produkt_variante.idVariante = variante.idVariante and produkt_variante.idKomponente=variante.idKomponente WHERE idProdukt = " + ((Integer) execution.getVariable("PRODUKT_ID")).intValue() + " AND variante.idKomponente=3 "  );
		ResultSet r3 = s3.executeQuery();
		Map<Integer, String> variantes_k3 = new HashMap<Integer, String>();
		while(r3.next()) {
			variantes_k3.put(r3.getInt("idVariante"), r3.getString("name")); 
		}
		execution.setVariable("VARIANTE_KOMPONENTE3", Variables.objectValue(variantes_k3) .serializationDataFormat(Variables.SerializationDataFormats.JSON) .create());
		r3.close();
		s3.close();
		
		PreparedStatement s4 = c.prepareStatement("select * from produkt_variante left join variante on produkt_variante.idVariante = variante.idVariante and produkt_variante.idKomponente=variante.idKomponente WHERE idProdukt = " + ((Integer) execution.getVariable("PRODUKT_ID")).intValue() + " AND variante.idKomponente=4 "  );
		ResultSet r4 = s4.executeQuery();
		Map<Integer, String> variantes_k4 = new HashMap<Integer, String>();
		while(r4.next()) {
			variantes_k4.put(r4.getInt("idVariante"), r4.getString("name")); 
		}
		execution.setVariable("VARIANTE_KOMPONENTE4", Variables.objectValue(variantes_k4) .serializationDataFormat(Variables.SerializationDataFormats.JSON) .create());
		r4.close();
		s4.close();
		
		PreparedStatement s5 = c.prepareStatement("select * from produkt_variante left join variante on produkt_variante.idVariante = variante.idVariante and produkt_variante.idKomponente=variante.idKomponente WHERE idProdukt = " + ((Integer) execution.getVariable("PRODUKT_ID")).intValue() + " AND variante.idKomponente=5 "  );
		ResultSet r5 = s5.executeQuery();
		Map<Integer, String> variantes_k5 = new HashMap<Integer, String>();
		while(r5.next()) {
			variantes_k5.put(r5.getInt("idVariante"), r5.getString("name")); 
		}
		execution.setVariable("VARIANTE_KOMPONENTE5", Variables.objectValue(variantes_k5) .serializationDataFormat(Variables.SerializationDataFormats.JSON) .create());
		r5.close();
		s5.close();
		
		PreparedStatement s6 = c.prepareStatement("select * from produkt_variante left join variante on produkt_variante.idVariante = variante.idVariante and produkt_variante.idKomponente=variante.idKomponente WHERE idProdukt = " + ((Integer) execution.getVariable("PRODUKT_ID")).intValue() + " AND variante.idKomponente=6 "  );
		ResultSet r6 = s6.executeQuery();
		Map<Integer, String> variantes_k6 = new HashMap<Integer, String>();
		while(r6.next()) {
			variantes_k6.put(r6.getInt("idVariante"), r6.getString("name")); 
		}
		execution.setVariable("VARIANTE_KOMPONENTE6", Variables.objectValue(variantes_k6) .serializationDataFormat(Variables.SerializationDataFormats.JSON) .create());
		r6.close();
		s6.close();
		
		PreparedStatement s7 = c.prepareStatement("select * from produkt_variante left join variante on produkt_variante.idVariante = variante.idVariante and produkt_variante.idKomponente=variante.idKomponente WHERE idProdukt = " + ((Integer) execution.getVariable("PRODUKT_ID")).intValue() + " AND variante.idKomponente=7 "  );
		ResultSet r7 = s7.executeQuery();
		Map<Integer, String> variantes_k7 = new HashMap<Integer, String>();
		while(r7.next()) {
			variantes_k7.put(r7.getInt("idVariante"), r7.getString("name")); 
		}
		execution.setVariable("VARIANTE_KOMPONENTE8", Variables.objectValue(variantes_k7) .serializationDataFormat(Variables.SerializationDataFormats.JSON) .create());
		r7.close();
		s7.close();
		
		PreparedStatement s8 = c.prepareStatement("select * from produkt_variante left join variante on produkt_variante.idVariante = variante.idVariante and produkt_variante.idKomponente=variante.idKomponente WHERE idProdukt = " + ((Integer) execution.getVariable("PRODUKT_ID")).intValue() + " AND variante.idKomponente=8 "  );
		ResultSet r8 = s8.executeQuery();
		Map<Integer, String> variantes_k8 = new HashMap<Integer, String>();
		while(r8.next()) {
			variantes_k8.put(r8.getInt("idVariante"), r8.getString("name")); 
		}
		execution.setVariable("VARIANTE_KOMPONENTE8", Variables.objectValue(variantes_k8) .serializationDataFormat(Variables.SerializationDataFormats.JSON) .create());
		r8.close();
		s8.close();
		
		PreparedStatement s9 = c.prepareStatement("select * from produkt_variante left join variante on produkt_variante.idVariante = variante.idVariante and produkt_variante.idKomponente=variante.idKomponente WHERE idProdukt = " + ((Integer) execution.getVariable("PRODUKT_ID")).intValue() + " AND variante.idKomponente=9 "  );
		ResultSet r9 = s9.executeQuery();
		Map<Integer, String> variantes_k9 = new HashMap<Integer, String>();
		while(r9.next()) {
			variantes_k9.put(r9.getInt("idVariante"), r9.getString("name")); 
		}
		execution.setVariable("VARIANTE_KOMPONENTE9", Variables.objectValue(variantes_k9) .serializationDataFormat(Variables.SerializationDataFormats.JSON) .create());
		r9.close();
		s9.close();
		
		PreparedStatement s10 = c.prepareStatement("select * from produkt_variante left join variante on produkt_variante.idVariante = variante.idVariante and produkt_variante.idKomponente=variante.idKomponente WHERE idProdukt = " + ((Integer) execution.getVariable("PRODUKT_ID")).intValue() + " AND variante.idKomponente=10 "  );
		ResultSet r10 = s10.executeQuery();
		Map<Integer, String> variantes_k10 = new HashMap<Integer, String>();
		while(r10.next()) {
			variantes_k10.put(r10.getInt("idVariante"), r10.getString("name")); 
		}
		execution.setVariable("VARIANTE_KOMPONENTE10", Variables.objectValue(variantes_k10) .serializationDataFormat(Variables.SerializationDataFormats.JSON) .create());
		r10.close();
		s10.close();
		
		PreparedStatement s11 = c.prepareStatement("select * from produkt_variante left join variante on produkt_variante.idVariante = variante.idVariante and produkt_variante.idKomponente=variante.idKomponente WHERE idProdukt = " + ((Integer) execution.getVariable("PRODUKT_ID")).intValue() + " AND variante.idKomponente=11 "  );
		ResultSet r11 = s11.executeQuery();
		Map<Integer, String> variantes_k11 = new HashMap<Integer, String>();
		while(r11.next()) {
			variantes_k11.put(r11.getInt("idVariante"), r11.getString("name")); 
		}
		execution.setVariable("VARIANTE_KOMPONENTE11", Variables.objectValue(variantes_k11) .serializationDataFormat(Variables.SerializationDataFormats.JSON) .create());
		r11.close();
		s11.close();
		
		PreparedStatement s12 = c.prepareStatement("select * from produkt_variante left join variante on produkt_variante.idVariante = variante.idVariante and produkt_variante.idKomponente=variante.idKomponente WHERE idProdukt = " + ((Integer) execution.getVariable("PRODUKT_ID")).intValue() + " AND variante.idKomponente=12 "  );
		ResultSet r12 = s12.executeQuery();
		Map<Integer, String> variantes_k12 = new HashMap<Integer, String>();
		while(r12.next()) {
			variantes_k12.put(r12.getInt("idVariante"), r12.getString("name")); 
		}
		execution.setVariable("VARIANTE_KOMPONENTE12", Variables.objectValue(variantes_k12) .serializationDataFormat(Variables.SerializationDataFormats.JSON) .create());
		r12.close();
		s12.close();
		
		PreparedStatement s13 = c.prepareStatement("select * from produkt_variante left join variante on produkt_variante.idVariante = variante.idVariante and produkt_variante.idKomponente=variante.idKomponente WHERE idProdukt = " + ((Integer) execution.getVariable("PRODUKT_ID")).intValue() + " AND variante.idKomponente=13 "  );
		ResultSet r13 = s13.executeQuery();
		Map<Integer, String> variantes_k13 = new HashMap<Integer, String>();
		while(r13.next()) {
			variantes_k13.put(r13.getInt("idVariante"), r13.getString("name")); 
		}
		execution.setVariable("VARIANTE_KOMPONENTE13", Variables.objectValue(variantes_k13) .serializationDataFormat(Variables.SerializationDataFormats.JSON) .create());
		r13.close();
		s13.close();
		
		PreparedStatement s14 = c.prepareStatement("select * from produkt_variante left join variante on produkt_variante.idVariante = variante.idVariante and produkt_variante.idKomponente=variante.idKomponente WHERE idProdukt = " + ((Integer) execution.getVariable("PRODUKT_ID")).intValue() + " AND variante.idKomponente=14 "  );
		ResultSet r14 = s14.executeQuery();
		Map<Integer, String> variantes_k14 = new HashMap<Integer, String>();
		while(r14.next()) {
			variantes_k14.put(r14.getInt("idVariante"), r14.getString("name")); 
		}
		execution.setVariable("VARIANTE_KOMPONENTE14", Variables.objectValue(variantes_k14) .serializationDataFormat(Variables.SerializationDataFormats.JSON) .create());
		r14.close();
		s14.close();
		
		PreparedStatement s15 = c.prepareStatement("select * from produkt_variante left join variante on produkt_variante.idVariante = variante.idVariante and produkt_variante.idKomponente=variante.idKomponente WHERE idProdukt = " + ((Integer) execution.getVariable("PRODUKT_ID")).intValue() + " AND variante.idKomponente=15 "  );
		ResultSet r15 = s15.executeQuery();
		Map<Integer, String> variantes_k15 = new HashMap<Integer, String>();
		while(r15.next()) {
			variantes_k15.put(r15.getInt("idVariante"), r15.getString("name")); 
		}
		execution.setVariable("VARIANTE_KOMPONENTE15", Variables.objectValue(variantes_k15) .serializationDataFormat(Variables.SerializationDataFormats.JSON) .create());
		r15.close();
		s15.close();
		
		PreparedStatement s16 = c.prepareStatement("select * from produkt_variante left join variante on produkt_variante.idVariante = variante.idVariante and produkt_variante.idKomponente=variante.idKomponente WHERE idProdukt = " + ((Integer) execution.getVariable("PRODUKT_ID")).intValue() + " AND variante.idKomponente=16 "  );
		ResultSet r16 = s16.executeQuery();
		Map<Integer, String> variantes_k16 = new HashMap<Integer, String>();
		while(r16.next()) {
			variantes_k16.put(r16.getInt("idVariante"), r16.getString("name")); 
		}
		execution.setVariable("VARIANTE_KOMPONENTE16", Variables.objectValue(variantes_k16) .serializationDataFormat(Variables.SerializationDataFormats.JSON) .create());
		r16.close();
		s16.close();
		
		PreparedStatement s17 = c.prepareStatement("select * from produkt_variante left join variante on produkt_variante.idVariante = variante.idVariante and produkt_variante.idKomponente=variante.idKomponente WHERE idProdukt = " + ((Integer) execution.getVariable("PRODUKT_ID")).intValue() + " AND variante.idKomponente=17 "  );
		ResultSet r17 = s17.executeQuery();
		Map<Integer, String> variantes_k17 = new HashMap<Integer, String>();
		while(r17.next()) {
			variantes_k17.put(r17.getInt("idVariante"), r17.getString("name")); 
		}
		execution.setVariable("VARIANTE_KOMPONENTE17", Variables.objectValue(variantes_k17) .serializationDataFormat(Variables.SerializationDataFormats.JSON) .create());
		r17.close();
		s17.close();
		
		PreparedStatement s18 = c.prepareStatement("select * from produkt_variante left join variante on produkt_variante.idVariante = variante.idVariante and produkt_variante.idKomponente=variante.idKomponente WHERE idProdukt = " + ((Integer) execution.getVariable("PRODUKT_ID")).intValue() + " AND variante.idKomponente=18 "  );
		ResultSet r18 = s18.executeQuery();
		Map<Integer, String> variantes_k18 = new HashMap<Integer, String>();
		while(r18.next()) {
			variantes_k18.put(r18.getInt("idVariante"), r18.getString("name")); 
		}
		execution.setVariable("VARIANTE_KOMPONENTE18", Variables.objectValue(variantes_k18) .serializationDataFormat(Variables.SerializationDataFormats.JSON) .create());
		r18.close();
		s18.close();
		
		PreparedStatement s19 = c.prepareStatement("select * from produkt_variante left join variante on produkt_variante.idVariante = variante.idVariante and produkt_variante.idKomponente=variante.idKomponente WHERE idProdukt = " + ((Integer) execution.getVariable("PRODUKT_ID")).intValue() + " AND variante.idKomponente=19 "  );
		ResultSet r19 = s19.executeQuery();
		Map<Integer, String> variantes_k19 = new HashMap<Integer, String>();
		while(r19.next()) {
			variantes_k19.put(r19.getInt("idVariante"), r19.getString("name")); 
		}
		execution.setVariable("VARIANTE_KOMPONENTE19", Variables.objectValue(variantes_k19) .serializationDataFormat(Variables.SerializationDataFormats.JSON) .create());
		r19.close();
		s19.close();
		
		PreparedStatement s20 = c.prepareStatement("select * from produkt_variante left join variante on produkt_variante.idVariante = variante.idVariante and produkt_variante.idKomponente=variante.idKomponente WHERE idProdukt = " + ((Integer) execution.getVariable("PRODUKT_ID")).intValue() + " AND variante.idKomponente=20 "  );
		ResultSet r20 = s20.executeQuery();
		Map<Integer, String> variantes_k20 = new HashMap<Integer, String>();
		while(r20.next()) {
			variantes_k20.put(r20.getInt("idVariante"), r20.getString("name")); 
		}
		execution.setVariable("VARIANTE_KOMPONENTE20", Variables.objectValue(variantes_k20) .serializationDataFormat(Variables.SerializationDataFormats.JSON) .create());
		r20.close();
		s20.close();
		
		PreparedStatement s21 = c.prepareStatement("select * from produkt_variante left join variante on produkt_variante.idVariante = variante.idVariante and produkt_variante.idKomponente=variante.idKomponente WHERE idProdukt = " + ((Integer) execution.getVariable("PRODUKT_ID")).intValue() + " AND variante.idKomponente=21 "  );
		ResultSet r21 = s21.executeQuery();
		Map<Integer, String> variantes_k21 = new HashMap<Integer, String>();
		while(r21.next()) {
			variantes_k21.put(r21.getInt("idVariante"), r21.getString("name")); 
		}
		execution.setVariable("VARIANTE_KOMPONENTE21", Variables.objectValue(variantes_k21) .serializationDataFormat(Variables.SerializationDataFormats.JSON) .create());
		r21.close();
		s21.close();
		
		PreparedStatement s22 = c.prepareStatement("select * from produkt_variante left join variante on produkt_variante.idVariante = variante.idVariante and produkt_variante.idKomponente=variante.idKomponente WHERE idProdukt = " + ((Integer) execution.getVariable("PRODUKT_ID")).intValue() + " AND variante.idKomponente=22 "  );
		ResultSet r22 = s22.executeQuery();
		Map<Integer, String> variantes_k22 = new HashMap<Integer, String>();
		while(r22.next()) {
			variantes_k22.put(r22.getInt("idVariante"), r22.getString("name")); 
		}
		execution.setVariable("VARIANTE_KOMPONENTE22", Variables.objectValue(variantes_k22) .serializationDataFormat(Variables.SerializationDataFormats.JSON) .create());
		r22.close();
		s22.close();
		
		PreparedStatement s23 = c.prepareStatement("select * from produkt_variante left join variante on produkt_variante.idVariante = variante.idVariante and produkt_variante.idKomponente=variante.idKomponente WHERE idProdukt = " + ((Integer) execution.getVariable("PRODUKT_ID")).intValue() + " AND variante.idKomponente=23 "  );
		ResultSet r23 = s23.executeQuery();
		Map<Integer, String> variantes_k23 = new HashMap<Integer, String>();
		while(r23.next()) {
			variantes_k23.put(r23.getInt("idVariante"), r23.getString("name")); 
		}
		execution.setVariable("VARIANTE_KOMPONENTE23", Variables.objectValue(variantes_k23) .serializationDataFormat(Variables.SerializationDataFormats.JSON) .create());
		r23.close();
		s23.close();
		
		PreparedStatement s24 = c.prepareStatement("select * from produkt_variante left join variante on produkt_variante.idVariante = variante.idVariante and produkt_variante.idKomponente=variante.idKomponente WHERE idProdukt = " + ((Integer) execution.getVariable("PRODUKT_ID")).intValue() + " AND variante.idKomponente=24 "  );
		ResultSet r24 = s24.executeQuery();
		Map<Integer, String> variantes_k24 = new HashMap<Integer, String>();
		while(r24.next()) {
			variantes_k24.put(r24.getInt("idVariante"), r24.getString("name")); 
		}
		execution.setVariable("VARIANTE_KOMPONENTE24", Variables.objectValue(variantes_k24) .serializationDataFormat(Variables.SerializationDataFormats.JSON) .create());
		r24.close();
		s24.close();
		
		PreparedStatement s26 = c.prepareStatement("select * from produkt_variante left join variante on produkt_variante.idVariante = variante.idVariante and produkt_variante.idKomponente=variante.idKomponente WHERE idProdukt = " + ((Integer) execution.getVariable("PRODUKT_ID")).intValue() + " AND variante.idKomponente=26 "  );
		ResultSet r26 = s26.executeQuery();
		Map<Integer, String> variantes_k26 = new HashMap<Integer, String>();
		while(r26.next()) {
			variantes_k26.put(r26.getInt("idVariante"), r26.getString("name")); 
		}
		execution.setVariable("VARIANTE_KOMPONENTE26", Variables.objectValue(variantes_k26) .serializationDataFormat(Variables.SerializationDataFormats.JSON) .create());
		r26.close();
		s26.close();
		
		PreparedStatement s27 = c.prepareStatement("select * from produkt_variante left join variante on produkt_variante.idVariante = variante.idVariante and produkt_variante.idKomponente=variante.idKomponente WHERE idProdukt = " + ((Integer) execution.getVariable("PRODUKT_ID")).intValue() + " AND variante.idKomponente=27 "  );
		ResultSet r27 = s27.executeQuery();
		Map<Integer, String> variantes_k27 = new HashMap<Integer, String>();
		while(r27.next()) {
			variantes_k27.put(r27.getInt("idVariante"), r27.getString("name")); 
		}
		execution.setVariable("VARIANTE_KOMPONENTE27", Variables.objectValue(variantes_k27) .serializationDataFormat(Variables.SerializationDataFormats.JSON) .create());
		r27.close();
		s27.close();
		
		PreparedStatement s28 = c.prepareStatement("select * from produkt_variante left join variante on produkt_variante.idVariante = variante.idVariante and produkt_variante.idKomponente=variante.idKomponente WHERE idProdukt = " + ((Integer) execution.getVariable("PRODUKT_ID")).intValue() + " AND variante.idKomponente=28 "  );
		ResultSet r28 = s28.executeQuery();
		Map<Integer, String> variantes_k28 = new HashMap<Integer, String>();
		while(r28.next()) {
			variantes_k28.put(r28.getInt("idVariante"), r28.getString("name")); 
		}
		execution.setVariable("VARIANTE_KOMPONENTE28", Variables.objectValue(variantes_k28) .serializationDataFormat(Variables.SerializationDataFormats.JSON) .create());
		r28.close();
		s28.close();
		
		PreparedStatement s29 = c.prepareStatement("select * from produkt_variante left join variante on produkt_variante.idVariante = variante.idVariante and produkt_variante.idKomponente=variante.idKomponente WHERE idProdukt = " + ((Integer) execution.getVariable("PRODUKT_ID")).intValue() + " AND variante.idKomponente=29 "  );
		ResultSet r29 = s29.executeQuery();
		Map<Integer, String> variantes_k29 = new HashMap<Integer, String>();
		while(r29.next()) {
			variantes_k29.put(r29.getInt("idVariante"), r29.getString("name")); 
		}
		execution.setVariable("VARIANTE_KOMPONENTE29", Variables.objectValue(variantes_k29) .serializationDataFormat(Variables.SerializationDataFormats.JSON) .create());
		r29.close();
		s29.close();
		
		PreparedStatement s30 = c.prepareStatement("select * from produkt_variante left join variante on produkt_variante.idVariante = variante.idVariante and produkt_variante.idKomponente=variante.idKomponente WHERE idProdukt = " + ((Integer) execution.getVariable("PRODUKT_ID")).intValue() + " AND variante.idKomponente=30 "  );
		ResultSet r30 = s30.executeQuery();
		Map<Integer, String> variantes_k30 = new HashMap<Integer, String>();
		while(r30.next()) {
			variantes_k30.put(r30.getInt("idVariante"), r30.getString("name")); 
		}
		execution.setVariable("VARIANTE_KOMPONENTE30", Variables.objectValue(variantes_k30) .serializationDataFormat(Variables.SerializationDataFormats.JSON) .create());
		r30.close();
		s30.close();
		
		PreparedStatement s31 = c.prepareStatement("select * from produkt_variante left join variante on produkt_variante.idVariante = variante.idVariante and produkt_variante.idKomponente=variante.idKomponente WHERE idProdukt = " + ((Integer) execution.getVariable("PRODUKT_ID")).intValue() + " AND variante.idKomponente=31 "  );
		ResultSet r31 = s31.executeQuery();
		Map<Integer, String> variantes_k31 = new HashMap<Integer, String>();
		while(r31.next()) {
			variantes_k31.put(r31.getInt("idVariante"), r31.getString("name")); 
		}
		execution.setVariable("VARIANTE_KOMPONENTE31", Variables.objectValue(variantes_k31) .serializationDataFormat(Variables.SerializationDataFormats.JSON) .create());
		r31.close();
		s31.close();
		
		PreparedStatement s32 = c.prepareStatement("select * from produkt_variante left join variante on produkt_variante.idVariante = variante.idVariante and produkt_variante.idKomponente=variante.idKomponente WHERE idProdukt = " + ((Integer) execution.getVariable("PRODUKT_ID")).intValue() + " AND variante.idKomponente=32 "  );
		ResultSet r32 = s32.executeQuery();
		Map<Integer, String> variantes_k32 = new HashMap<Integer, String>();
		while(r32.next()) {
			variantes_k32.put(r32.getInt("idVariante"), r32.getString("name")); 
		}
		execution.setVariable("VARIANTE_KOMPONENTE32", Variables.objectValue(variantes_k32) .serializationDataFormat(Variables.SerializationDataFormats.JSON) .create());
		r32.close();
		s32.close();
		
		PreparedStatement s33 = c.prepareStatement("select * from produkt_variante left join variante on produkt_variante.idVariante = variante.idVariante and produkt_variante.idKomponente=variante.idKomponente WHERE idProdukt = " + ((Integer) execution.getVariable("PRODUKT_ID")).intValue() + " AND variante.idKomponente=33"  );
		ResultSet r33 = s33.executeQuery();
		Map<Integer, String> variantes_k33 = new HashMap<Integer, String>();
		while(r33.next()) {
			variantes_k33.put(r33.getInt("idVariante"), r33.getString("name")); 
		}
		execution.setVariable("VARIANTE_KOMPONENTE33", Variables.objectValue(variantes_k33) .serializationDataFormat(Variables.SerializationDataFormats.JSON) .create());
		r33.close();
		s33.close();
		
		PreparedStatement s34 = c.prepareStatement("select * from produkt_variante left join variante on produkt_variante.idVariante = variante.idVariante and produkt_variante.idKomponente=variante.idKomponente WHERE idProdukt = " + ((Integer) execution.getVariable("PRODUKT_ID")).intValue() + " AND variante.idKomponente=34 "  );
		ResultSet r34 = s34.executeQuery();
		Map<Integer, String> variantes_k34 = new HashMap<Integer, String>();
		while(r34.next()) {
			variantes_k34.put(r34.getInt("idVariante"), r34.getString("name")); 
		}
		execution.setVariable("VARIANTE_KOMPONENTE35", Variables.objectValue(variantes_k34) .serializationDataFormat(Variables.SerializationDataFormats.JSON) .create());
		r34.close();
		s34.close();
		
		PreparedStatement s35 = c.prepareStatement("select * from produkt_variante left join variante on produkt_variante.idVariante = variante.idVariante and produkt_variante.idKomponente=variante.idKomponente WHERE idProdukt = " + ((Integer) execution.getVariable("PRODUKT_ID")).intValue() + " AND variante.idKomponente=35 "  );
		ResultSet r35 = s35.executeQuery();
		Map<Integer, String> variantes_k35 = new HashMap<Integer, String>();
		while(r35.next()) {
			variantes_k35.put(r35.getInt("idVariante"), r35.getString("name")); 
		}
		execution.setVariable("VARIANTE_KOMPONENTE35", Variables.objectValue(variantes_k35) .serializationDataFormat(Variables.SerializationDataFormats.JSON) .create());
		r35.close();
		s35.close();
		
		PreparedStatement s36 = c.prepareStatement("select * from produkt_variante left join variante on produkt_variante.idVariante = variante.idVariante and produkt_variante.idKomponente=variante.idKomponente WHERE idProdukt = " + ((Integer) execution.getVariable("PRODUKT_ID")).intValue() + " AND variante.idKomponente=36 "  );
		ResultSet r36 = s36.executeQuery();
		Map<Integer, String> variantes_k36 = new HashMap<Integer, String>();
		while(r36.next()) {
			variantes_k36.put(r36.getInt("idVariante"), r36.getString("name")); 
		}
		execution.setVariable("VARIANTE_KOMPONENTE36", Variables.objectValue(variantes_k36) .serializationDataFormat(Variables.SerializationDataFormats.JSON) .create());
		r36.close();
		s36.close();
		
		PreparedStatement s37 = c.prepareStatement("select * from produkt_variante left join variante on produkt_variante.idVariante = variante.idVariante and produkt_variante.idKomponente=variante.idKomponente WHERE idProdukt = " + ((Integer) execution.getVariable("PRODUKT_ID")).intValue() + " AND variante.idKomponente=37 "  );
		ResultSet r37 = s37.executeQuery();
		Map<Integer, String> variantes_k37 = new HashMap<Integer, String>();
		while(r37.next()) {
			variantes_k37.put(r37.getInt("idVariante"), r37.getString("name")); 
		}
		execution.setVariable("VARIANTE_KOMPONENTE37", Variables.objectValue(variantes_k37) .serializationDataFormat(Variables.SerializationDataFormats.JSON) .create());
		r37.close();
		s37.close();
		
		PreparedStatement s38 = c.prepareStatement("select * from produkt_variante left join variante on produkt_variante.idVariante = variante.idVariante and produkt_variante.idKomponente=variante.idKomponente WHERE idProdukt = " + ((Integer) execution.getVariable("PRODUKT_ID")).intValue() + " AND variante.idKomponente=38 "  );
		ResultSet r38 = s38.executeQuery();
		Map<Integer, String> variantes_k38 = new HashMap<Integer, String>();
		while(r38.next()) {
			variantes_k38.put(r38.getInt("idVariante"), r38.getString("name")); 
		}
		execution.setVariable("VARIANTE_KOMPONENTE38", Variables.objectValue(variantes_k38) .serializationDataFormat(Variables.SerializationDataFormats.JSON) .create());
		r38.close();
		s38.close();
		
		PreparedStatement s39 = c.prepareStatement("select * from produkt_variante left join variante on produkt_variante.idVariante = variante.idVariante and produkt_variante.idKomponente=variante.idKomponente WHERE idProdukt = " + ((Integer) execution.getVariable("PRODUKT_ID")).intValue() + " AND variante.idKomponente=39 "  );
		ResultSet r39 = s39.executeQuery();
		Map<Integer, String> variantes_k39 = new HashMap<Integer, String>();
		while(r39.next()) {
			variantes_k39.put(r39.getInt("idVariante"), r39.getString("name")); 
		}
		execution.setVariable("VARIANTE_KOMPONENTE39", Variables.objectValue(variantes_k39) .serializationDataFormat(Variables.SerializationDataFormats.JSON) .create());
		r39.close();
		s39.close();
		
		PreparedStatement s41 = c.prepareStatement("select * from produkt_variante left join variante on produkt_variante.idVariante = variante.idVariante and produkt_variante.idKomponente=variante.idKomponente WHERE idProdukt = " + ((Integer) execution.getVariable("PRODUKT_ID")).intValue() + " AND variante.idKomponente=41 "  );
		ResultSet r41 = s41.executeQuery();
		Map<Integer, String> variantes_k41 = new HashMap<Integer, String>();
		while(r41.next()) {
			variantes_k41.put(r41.getInt("idVariante"), r41.getString("name")); 
		}
		execution.setVariable("VARIANTE_KOMPONENTE41", Variables.objectValue(variantes_k41) .serializationDataFormat(Variables.SerializationDataFormats.JSON) .create());
		r41.close();
		s41.close();
		
		PreparedStatement s42 = c.prepareStatement("select * from produkt_variante left join variante on produkt_variante.idVariante = variante.idVariante and produkt_variante.idKomponente=variante.idKomponente WHERE idProdukt = " + ((Integer) execution.getVariable("PRODUKT_ID")).intValue() + " AND variante.idKomponente=42 "  );
		ResultSet r42 = s42.executeQuery();
		Map<Integer, String> variantes_k42 = new HashMap<Integer, String>();
		while(r42.next()) {
			variantes_k42.put(r42.getInt("idVariante"), r42.getString("name")); 
		}
		execution.setVariable("VARIANTE_KOMPONENTE42", Variables.objectValue(variantes_k42) .serializationDataFormat(Variables.SerializationDataFormats.JSON) .create());
		r42.close();
		s42.close();
		
		PreparedStatement s43 = c.prepareStatement("select * from produkt_variante left join variante on produkt_variante.idVariante = variante.idVariante and produkt_variante.idKomponente=variante.idKomponente WHERE idProdukt = " + ((Integer) execution.getVariable("PRODUKT_ID")).intValue() + " AND variante.idKomponente=43 "  );
		ResultSet r43 = s43.executeQuery();
		Map<Integer, String> variantes_k43 = new HashMap<Integer, String>();
		while(r43.next()) {
			variantes_k43.put(r43.getInt("idVariante"), r43.getString("name")); 
		}
		execution.setVariable("VARIANTE_KOMPONENTE43", Variables.objectValue(variantes_k43) .serializationDataFormat(Variables.SerializationDataFormats.JSON) .create());
		r43.close();
		s43.close();
//		int[] id= new int[44];
//		for(int i =1 ; i<=43;i++) {
//			load(id[i], execution);
//			
//		}
	
		c.close();
			 // Check business key
		if (execution.getProcessBusinessKey() == null) {
			final String key = BusinessKeyGenerator.getKey(21);
			execution.setProcessBusinessKey(key);
			execution.setVariable("DEMO_BUSINESS_KEY", key);
			} else {
			execution.setVariable("DEMO_BUSINESS_KEY", execution.getProcessBusinessKey()); 
		}
	}
	
//	public void load(int idKomponente , DelegateExecution execution) throws Exception {
//		Connection c = DatabaseConnection.getConnection();
//		PreparedStatement sn = c.prepareStatement("select * from produkt_variante left join variante on produkt_variante.idVariante = variante.idVariante and produkt_variante.idKomponente=variante.idKomponente WHERE idProdukt = " + ((Integer) execution.getVariable("PRODUKT_ID")).intValue() + " AND variante.idKomponente= " + idKomponente);
//		ResultSet rn = sn.executeQuery();
//		Map<Integer, String> variantes_kn = new HashMap<Integer, String>();
//		while(rn.next()) {
//			variantes_kn.put(rn.getInt("idVariante"), rn.getString("name")); 
//		}
//		execution.setVariable("VARIANTE_KOMPONENTE"+idKomponente, Variables.objectValue(variantes_kn) .serializationDataFormat(Variables.SerializationDataFormats.JSON) .create());
//		rn.close();
//		sn.close();
//		 c.close();
//		
//	}

}
