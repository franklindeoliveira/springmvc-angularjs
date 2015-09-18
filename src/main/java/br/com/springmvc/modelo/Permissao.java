package br.com.springmvc.modelo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * Classe representando um grupo de usuário do sistema.
 * 
 */
@Entity
@Table(name = "permissao")
public class Permissao {
	
	/**
	 * Referência para as permissões cadastradas no banco de dados.
	 */
	public static final Permissao ADMINISTRADOR = new Permissao(1, "ADMINSTRADOR");
	public static final Permissao CADASTRADO = new Permissao(2, "CADASTRADO");
	
	@Id
	@GeneratedValue
	private Integer id;
	
	@Column(nullable = false, unique = true)
	private String tipo;
	
	public Permissao(String tipo) {
		this.tipo = tipo;
	}

	public Permissao() {}
	
	private Permissao(Integer id, String tipo) {
		this.id = id;
		this.tipo = tipo;
	}
	
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
