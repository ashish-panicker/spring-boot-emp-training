package com.example.tracks.service.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.tracks.service.model.Module;
import com.example.tracks.service.repo.ModuleRepo;

@RestController
public class ModuleController {
	
	@Autowired
	private ModuleRepo repo;
	
	@PostMapping("/modules")
	public Module create(@RequestBody Module m) {
		return repo.create(m);
	}
	
	@GetMapping("/modules")
	public List<Module> create() {
		return repo.findAll();
	}

}
