package br.com.workdb.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import java.io.Serializable;
import java.util.ArrayList;
@JsonIgnoreProperties(ignoreUnknown = true)
public class WeatherForecast implements Serializable {
	public String cod;
	public int message;
	public int cnt;
	public ArrayList<InfoList> list;
	public CityJson city;

	public WeatherForecast() {
	}

	public WeatherForecast(String cod, int message, int cnt, ArrayList<InfoList> infoList, CityJson cityJson) {
		this.cod = cod;
		this.message = message;
		this.cnt = cnt;
		this.list = infoList;
		this.city = cityJson;
	}

	public String getCod() {
		return cod;
	}

	public void setCod(String cod) {
		this.cod = cod;
	}

	public int getMessage() {
		return message;
	}

	public void setMessage(int message) {
		this.message = message;
	}

	public int getCnt() {
		return cnt;
	}

	public void setCnt(int cnt) {
		this.cnt = cnt;
	}

	public ArrayList<InfoList> getList() {
		return list;
	}

	public void setList(ArrayList<InfoList> list) {
		this.list = list;
	}

	public CityJson getCity() {
		return city;
	}

	public void setCity(CityJson city) {
		this.city = city;
	}
}
