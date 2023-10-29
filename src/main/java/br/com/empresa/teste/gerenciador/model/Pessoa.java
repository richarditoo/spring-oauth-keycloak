package br.com.empresa.teste.gerenciador.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "pessoas")
public class Pessoa {
	
	@Id
	@Column(name = "id_pessoas")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long codPessoa;
	
	@Column(name = "nome")
	private String nomePessoa;
	
	@Column(name = "identificador")
	private Long identificador;
	
	@Column(name = "tipo_identificador")
	private String tipoIdentificador;
	
		
	public Pessoa(String nomePessoa, Long identificador, String tipoIdentificador) {
		super();
		this.nomePessoa = nomePessoa;
		this.identificador = identificador;
		this.tipoIdentificador = tipoIdentificador;
	}

	public Pessoa() { }

	public String getNomePessoa() {
		return nomePessoa;
	}

	public void setNomePessoa(String nomePessoa) {
		this.nomePessoa = nomePessoa;
	}

	public Long getIdentificador() {
		return identificador;
	}

	public void setIdentificador(Long identificador) {
		this.identificador = identificador;
	}

	public String getTipoIdentificador() {
		return tipoIdentificador;
	}

	public void setTipoIdentificador(String tipoIdentificador) {
		this.tipoIdentificador = tipoIdentificador;
	}
		
}
