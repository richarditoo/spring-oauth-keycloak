package br.com.empresa.teste.gerenciador.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.empresa.teste.gerenciador.model.Pessoa;

public interface PessoaRepository extends JpaRepository<Pessoa, Long> {
	
}
