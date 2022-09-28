package br.com.workdb.dto;

import java.io.Serializable;
import java.util.List;

import br.com.workdb.model.City;
import br.com.workdb.model.Country;

public class ItensReturnConsult implements Serializable {

	private static final long serialVersionUID = 1L;

	private Country country;
	
	private List<City> cityList;

	public Country getCountry() {
		return country;
	}

	public void setCountry(Country country) {
		this.country = country;
	}

	public List<City> getCitys() {
		return cityList;
	}

	public void setCitys(List<City> citys) {
		this.cityList = citys;
	}
	
	public void AddCity(City city) {
		this.cityList.add(city);
	}
	
}
