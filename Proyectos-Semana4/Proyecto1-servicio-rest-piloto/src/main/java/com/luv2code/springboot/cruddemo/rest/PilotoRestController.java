package com.luv2code.springboot.cruddemo.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.luv2code.springboot.cruddemo.entity.Piloto;
import com.luv2code.springboot.cruddemo.service.PilotoService;

@RestController
@RequestMapping("/rest")
public class PilotoRestController {

	private PilotoService pilotoService;
	
	@Autowired
	public PilotoRestController(PilotoService thePilotoService) {
		pilotoService = thePilotoService;
	}
	
	// expose "/employees" and return list of employees
	@GetMapping("/pilotos")
	public List<Piloto> findAll() {
		return pilotoService.findAll();
	}

	// add mapping for GET /pilotos/{pilotosId}
	
	@GetMapping("/pilotos/{pilotoId}")
	public Piloto getPiloto(@PathVariable int pilotoId) throws Exception {
		
		Piloto thePiloto = pilotoService.findById(pilotoId);
		
		if (thePiloto == null) {
			throw new Exception("Piloto id not found - " + pilotoId);
		}
		
		return thePiloto;
	}
	
	// add mapping for POST /pilotos - add new piloto
	
	@PostMapping("/pilotos")
	public Piloto addPiloto(@RequestBody Piloto thePiloto) {
		
		// also just in case they pass an id in JSON ... set id to 0
		// this is to force a save of new item ... instead of update
		
		thePiloto.setId(0);
		
		pilotoService.save(thePiloto);
		
		return thePiloto;
	}
	
	// add mapping for PUT /pilotos - update existing piloto
	
	@PutMapping("/pilotos")
	public Piloto updatePiloto(@RequestBody Piloto thePiloto) {
		
		pilotoService.save(thePiloto);
		
		return thePiloto;
	}
	
	// add mapping for DELETE /employees/{employeeId} - delete employee
	
	@DeleteMapping("/pilotos/{pilotoId}")
	public String deletePiloto(@PathVariable int pilotoId) {
		
		Piloto tempPiloto = pilotoService.findById(pilotoId);
		
		// throw exception if null
		
		if (tempPiloto == null) {
			throw new RuntimeException("Piloto id not found - " + pilotoId);
		}
		
		pilotoService.deleteById(pilotoId);
		
		return "Deleted piloto id - " + pilotoId;
	}
	
}










