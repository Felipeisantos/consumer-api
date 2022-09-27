package br.com.workdb.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/status")
public class StatusController {

	@RequestMapping(method = RequestMethod.GET)
	public List<String> checkapi() {
		List<String> list = new ArrayList<>();
		
		list.add("Felipe");
		list.add("Carlos");
				
		return list;
	}
}
