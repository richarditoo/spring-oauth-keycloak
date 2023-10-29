package br.com.empresa.teste.gerenciador.service;

import java.io.IOException;
import java.util.Collections;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;

import br.com.empresa.teste.gerenciador.model.Pessoa;
import br.com.empresa.teste.gerenciador.repository.PessoaRepository;
import br.com.empresa.teste.gerenciador.utils.Utils;

@Service
public class GerenciadorService {
	
	@Autowired
	private PessoaRepository pessoaRepository;
	
	public Pessoa salvarPessoa(String nome, String identificador) throws IOException {
		
		try {
			return pessoaRepository.save(Utils.trataDados(nome, identificador));
		} catch (Exception e) {
			e.printStackTrace();
		}
		return new Pessoa();
	}

	public List<Pessoa> buscarPessoas() {
		try {
			return pessoaRepository.findAll();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return Collections.emptyList();
	}
}
