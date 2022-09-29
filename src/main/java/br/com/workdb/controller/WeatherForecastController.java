package br.com.workdb.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.workdb.model.WeatherForecast;
import br.com.workdb.service.WeatherForecastService;

@RestController
@RequestMapping("/api/weatherforecast")
public class WeatherForecastController {

	@Autowired
	private WeatherForecastService weatherForecastService;

	@GetMapping("/{id}")
	@CrossOrigin(origins = "*")
	public WeatherForecast WeatherForecastConsult(@PathVariable Integer id) {

		return weatherForecastService.WeatherForecastConsult(id);
	}
}
