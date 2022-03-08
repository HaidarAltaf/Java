package com.qa.demo.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.qa.demo.service.SharkService;


@RestController
@RequestMapping("/shark")
public class SharkController {
	private SharkService service;

	private SharkController(SharkService service) {
		this.service = service;
	}
	
	
}
