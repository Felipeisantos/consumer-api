package br.com.workdb.controller;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.workdb.dao.CityDAO;
import br.com.workdb.model.City;

@RestController
@RequestMapping("/api/city")
public class CityController {

	@Autowired
	CityDAO cityDAO;

	@GetMapping("/{id}")
	@CrossOrigin(origins = "*")
	public Iterable<City> GetCountries(@PathVariable Integer id ) {

		Iterable<City> cities = new ArrayList<>();

		cities = cityDAO.getCitiesById(id);

		return cities;
	}
	
}
