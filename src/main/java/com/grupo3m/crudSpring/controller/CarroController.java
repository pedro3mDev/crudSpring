package com.grupo3m.crudSpring.controller;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.grupo3m.crudSpring.entity.Carro;
import com.grupo3m.crudSpring.repository.CarroRepository;

import lombok.AllArgsConstructor;

@RestController
@AllArgsConstructor
public class CarroController {

	CarroRepository repository;
	
	@GetMapping("/carro")
	public List<Carro> getAllCarros(){
		return repository.findAll();
	}
	
	@GetMapping("/carro/{id}")
	public Carro getCarroById(@PathVariable Long id){
		return repository.getById(id);
	}
	
	@PostMapping("/carro")
	public Carro SaveCarro(@RequestBody Carro carro){
		return repository.save(carro);
	}
	
	@DeleteMapping("/carro/{id}")
	public void deleteCarro(@PathVariable Long id){
		repository.deleteById(id);
	}
}
