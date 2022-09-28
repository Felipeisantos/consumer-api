package br.com.workdb.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
 
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import br.com.workdb.service.GetCountryCityWeb;

@RestController
@RequestMapping("/api/updatebanco")
public class ContineteController {

	@Autowired
	private GetCountryCityWeb getCountryCityWeb;
	
	@RequestMapping(path = "/populabanco",method = RequestMethod.GET)
	public String FillDb() {
		
		getCountryCityWeb.FillDB();
		
		
		
		return "OK";
	}
	
}
