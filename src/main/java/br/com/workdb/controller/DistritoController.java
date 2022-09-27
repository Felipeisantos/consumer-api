package br.com.workdb.controller;

import org.springframework.web.bind.annotation.RequestMapping;
 
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
@RequestMapping("/api/distrito")
public class DistritoController {


	@RequestMapping(path = "/populabanco",method = RequestMethod.GET)
	public String FillDb() {
		String url = "https://servicodados.ibge.gov.br/api/v1/localidades/distritos?view=nome";
		RestTemplate restTemplate = new RestTemplate();
		
		
		return "OK";
	}
	
}
