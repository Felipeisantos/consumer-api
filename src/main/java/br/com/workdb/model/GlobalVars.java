package br.com.workdb.model;

public class GlobalVars {
	static final String OPENWEATHERMAPAPPID = "736dcdde77f2ecd180d59261d23a2a57";

	public static String BuildAppIdTokenQuery() {
		return "&appid=" + OPENWEATHERMAPAPPID;
	}
}
