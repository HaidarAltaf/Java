package com.qa.controller;

import java.util.List;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.qa.Ducks.entity.Duck;
import com.qa.service.DuckService;

@RestController
@RequestMapping("/duck")
public class DuckController {
	private DuckService service;

	private DuckController(DuckService service) {
		this.service = service;
	}

	// CREATE
	@PostMapping("/create")
	public ResponseEntity<Duck> createDuck(@RequestBody Duck duck) {
		return new ResponseEntity<Duck>(this.service.create(duck), HttpStatus.CREATED);
	}

	// READ ALL
	@GetMapping("/readAll")
	public ResponseEntity<List<Duck>> readAll() {
		// RETURN A LIST BECAUSE READALL IN SERVICE CLASS IS A LIST ASWELL
		return new ResponseEntity<List<Duck>>(this.service.readAll(), HttpStatus.OK);
	}

	// READ BY ID
	@GetMapping("/readById/{Id}")
	public ResponseEntity<Duck> readById(@PathVariable long id) {
		return new ResponseEntity<Duck>(this.service.readById(id), HttpStatus.OK);
	}

	// UPDATE
	@PutMapping("/update/{id}")
	public ResponseEntity<Duck> updateDuck(@PathVariable long id, @RequestBody Duck duck) {
		return new ResponseEntity<Duck>(this.service.update(id, duck), HttpStatus.ACCEPTED);
	}

	// DELETE
	@DeleteMapping("/delete/{id}")
	public ResponseEntity<Boolean> deleteDuck(@PathVariable long id) {
		// TERNARY OPERATOR = IF SERVICE.DELETE WORKS (DELETE HAPPENS), RETURN NO
		// CONTENT (NULL), ELSE RETURN NOT FOUND
		return (this.service.delete(id)) ? new ResponseEntity<Boolean>(HttpStatus.NO_CONTENT)
				: new ResponseEntity<Boolean>(HttpStatus.NOT_FOUND);
	}

	// SAME AS RETURN STATEMENT IN DELETE BUT IN IF ELSE FORMAT
//	if(this.service.delete(id) == true) {
//		new ResponseEntity<Boolean>(HttpStatus.NO_CONTENT)
//	} else {
//		new ResponseEntity<Boolean>(HttpStatus.NOT_FOUND)
//	}

}
