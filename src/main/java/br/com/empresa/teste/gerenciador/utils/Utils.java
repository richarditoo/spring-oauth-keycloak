package br.com.empresa.teste.gerenciador.utils;

import br.com.empresa.teste.gerenciador.model.Pessoa;

public class Utils {

	
	public static Pessoa trataDados(String nome, String identificador) {
		
		if (nome == null || nome.isBlank()  || identificador == null || identificador.isBlank()) {
			return null;
		}

		
		Pessoa pessoa = new Pessoa();
		
		if (identificador.matches("[0-9]*")) {
			
						
			pessoa.setNomePessoa(nome);
			
			switch (identificador.length()) {
				case 11:
					pessoa.setIdentificador(Long.valueOf(identificador));
					pessoa.setTipoIdentificador("CPF");
					break;
					
				case 14:
					pessoa.setIdentificador(Long.valueOf(identificador));
					pessoa.setTipoIdentificador("CNPJ");
					break;
	
				default:
					break;
			}
						
		} else {
			return null;
		}
		
				
		return pessoa;
	}

}
