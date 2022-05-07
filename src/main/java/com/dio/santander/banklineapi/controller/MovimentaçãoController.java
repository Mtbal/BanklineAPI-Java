package com.dio.santander.banklineapi.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.dio.santander.banklineapi.dto.NovaMovimentação;
import com.dio.santander.banklineapi.model.Movimentação;
import com.dio.santander.banklineapi.repository.MovimentaçãoRepository;
import com.dio.santander.banklineapi.service.MovimentaçãoService;

@RestController
@RequestMapping("/movimentações")
public class MovimentaçãoController {	
	@Autowired
	private MovimentaçãoRepository repository;
	
	@Autowired
	private MovimentaçãoService service;
	
	@GetMapping
	public List<Movimentação> findAll(){
		return repository.findAll();
	}
	@PostMapping
	public void save(@RequestBody NovaMovimentação movimentação) {
		service.save(movimentação);
	}

}
