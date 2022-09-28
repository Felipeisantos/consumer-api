package br.com.workdb.controller;

import java.util.ArrayList;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.workdb.dao.CountryDAO;
import br.com.workdb.model.Country;

@RestController
@RequestMapping("/api/country")
public class CountryController {

	@Autowired
	CountryDAO countryDAO;

	@GetMapping
	@CrossOrigin(origins = "*")
	public Iterable<Country> GetCountries() {

		Iterable<Country> countries = new ArrayList<>();

		countries = countryDAO.findAll();

		return countries;
	}

}
