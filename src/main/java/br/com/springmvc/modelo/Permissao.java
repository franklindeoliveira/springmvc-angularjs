package br.com.springmvc.modelo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * Classe representando um grupo de usuário do sistema.
 */
@Entity
@Table(name = "permissao")
public class Permissao {
	@Id
	private Integer id;
	@Column(nullable = false)
	private String tipo;
	
	public String getTipo() {
		return tipo;
	}
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	public Integer getId() {
		return id;
	}
	
}
