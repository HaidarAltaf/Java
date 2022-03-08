package com.qa.demo.controller;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.qa.demo.entity.Shark;
import com.qa.demo.service.SharkService;

@RestController
@RequestMapping("/shark")
public class SharkController {
	private SharkService service;

	private SharkController(SharkService service) {
		this.service = service;
	}

	@GetMapping("/readAll")
	public ResponseEntity<List<Shark>> readAll() {
		return new ResponseEntity<List<Shark>>(this.service.readAll(), HttpStatus.OK);
	}
	
	@DeleteMapping("/delete/{id}")
	public ResponseEntity<Boolean> deleteShark(@PathVariable long id) {
		if (this.service.delete(id) == true) {
			new ResponseEntity<Boolean>(HttpStatus.NO_CONTENT);
		} else {
			new ResponseEntity<Boolean>(HttpStatus.NOT_FOUND);
		}
		return null;
	}
}
