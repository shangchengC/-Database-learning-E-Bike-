package de.ostfalia.bips.e_bike_2020;

import org.camunda.bpm.application.ProcessApplication;
import org.camunda.bpm.application.impl.ServletProcessApplication;


@ProcessApplication("insight")
public class InsightApplication extends ServletProcessApplication {
	
	public InsightApplication() throws Exception {
		Class.forName("com.mysql.jdbc.Driver").newInstance(); }

}
