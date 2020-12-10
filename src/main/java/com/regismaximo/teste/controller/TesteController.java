package com.regismaximo.teste.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.regismaximo.teste.dto.CnpjResponse;
import com.regismaximo.teste.model.CNPJ;
import com.regismaximo.teste.model.Media;

@RestController
@RequestMapping("/api")
@CrossOrigin(value = "*")
public class TesteController {

	@Autowired
	CnpjResponse cnpjResponse;
	
	// retorna cnpj com os dados em mock
	@GetMapping("/cnpj/{cnpj}")
	public ResponseEntity<CNPJ> getCnpj(@PathVariable String cnpj) {
		
		return new ResponseEntity<CNPJ>(cnpjResponse.cnpjBuild(cnpj), HttpStatus.OK);
	}
	
	@PostMapping("/media")
	public ResponseEntity<Media> postMedia(@RequestBody Media media) {
		media.setResult(((media.getA() + media.getB()) / 2));
		
		return new ResponseEntity<Media>(media, HttpStatus.OK);
	}
}
