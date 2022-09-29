package br.com.workdb.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.RestController;
import br.com.workdb.service.UpdateDbService;

@RestController
@RequestMapping("/api/updatebanco")
public class UpdateDbController {

	@Autowired
	private UpdateDbService updateDbService;

	@GetMapping
	public String FillDb() {
		updateDbService.FillDB();
		return "OK";
	}

}
