package br.com.workdb.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
 
import org.springframework.web.bind.annotation.RestController;
import br.com.workdb.service.GetCountryCityWeb;

@RestController
@RequestMapping("/api/updatebanco")
public class UpdateDbController {

	@Autowired
	private GetCountryCityWeb getCountryCityWeb;
	
	@GetMapping
	public String FillDb() {
		getCountryCityWeb.FillDB();	
		return "OK";
	}
	
}
