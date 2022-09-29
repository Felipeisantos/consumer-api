package br.com.workdb.service;

import java.util.ArrayList;
import java.util.List;

import org.json.JSONArray;
import org.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import br.com.workdb.dao.CityDAO;
import br.com.workdb.dao.CountryDAO;
import br.com.workdb.model.City;
import br.com.workdb.model.Country;

@Service
public class UpdateDbService {

	@Autowired
	private CityDAO cityDAO;
	@Autowired
	private CountryDAO coutryDAO;

	public void FillDB() {
		try {
			cityDAO.deleteAll();
			coutryDAO.deleteAll();
			String url = "https://countriesnow.space/api/v0.1/countries/";
			RestTemplate restTemplate = new RestTemplate();
			String resString = restTemplate.getForObject(url, String.class);
			JSONObject jsonObject = new JSONObject(resString);

			JSONArray jsonData = jsonObject.getJSONArray("data");

			for (int i = 0; i < jsonData.length(); i++) {
				JSONObject jsonCountry = jsonData.getJSONObject(i);
				Country country = new Country(jsonCountry.getString("country"));
				coutryDAO.save(country);

				List<City> cities = new ArrayList<>();
				JSONArray jsonCities = jsonCountry.getJSONArray("cities");

				for (int j = 0; j < jsonCities.length(); j++)
					cities.add(new City(jsonCities.getString(j), country.getId()));
				cityDAO.saveAll(cities);
			}
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}

	}
}
