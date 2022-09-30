package br.com.workdb.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import br.com.workdb.dao.CityDAO;
import br.com.workdb.model.CityName;
import br.com.workdb.model.GlobalVars;
import br.com.workdb.model.WeatherForecast;

@Service
public class WeatherForecastService {

	@Autowired
	private CityDAO cityDAO;

	public WeatherForecast WeatherForecastConsult(Integer id) {
		try {
			String requestLatLongFromCityName = "http://api.openweathermap.org/geo/1.0/direct?q="
					+ cityDAO.getCityById(id).getName() + GlobalVars.BuildAppIdTokenQuery();

			RestTemplate restTemplate = new RestTemplate();
			String resString = restTemplate.getForObject(requestLatLongFromCityName, String.class);

			// api do site openweathermap esta mandando um json de um modo que o objctMapper
			// nao conseguia convertar entao tive que remover o primeiro e ultimo caracter
			// da string [ ]
			resString = resString.substring(1, resString.length() - 1);

			ObjectMapper objectMapper = new ObjectMapper();

			CityName cityName = objectMapper.readValue(resString, CityName.class);

			String url = "https://api.openweathermap.org/data/2.5/weather?lat=" + cityName.getLat() + "&lon="
					+ cityName.getLon() + GlobalVars.BuildAppIdTokenQuery();
			String responseString = restTemplate.getForObject(url, String.class);

			WeatherForecast weater = objectMapper.readValue(responseString, WeatherForecast.class);

			return weater;
		} catch (JsonMappingException e) {
			e.printStackTrace();
		} catch (JsonProcessingException e) {
			e.printStackTrace();
		}
		return null;
	}

}
