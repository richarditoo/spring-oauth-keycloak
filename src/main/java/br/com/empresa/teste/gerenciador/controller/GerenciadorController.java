package br.com.empresa.teste.gerenciador.controller;

import java.io.IOException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

import br.com.empresa.teste.gerenciador.model.Pessoa;
import br.com.empresa.teste.gerenciador.service.GerenciadorService;

@RestController
@RequestMapping("/gerenciador")
public class GerenciadorController extends ResponseEntityExceptionHandler {
	
	@Autowired
	private GerenciadorService gerenciadorService;
	
	@PostMapping("/salvar")
	public ResponseEntity<Pessoa> salvaPessoa(String nome, String identificador) throws IOException {
		return new ResponseEntity<>(gerenciadorService.salvarPessoa(nome, identificador), HttpStatus.OK);
	}
	
}