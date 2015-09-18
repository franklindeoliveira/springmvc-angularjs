package br.com.springmvc.modelo;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

import org.hibernate.validator.constraints.NotBlank;

/**
 * Classe representando um usuário do sistema.
 */
@Entity
@Table(name = "usuario")
public class Usuario {

	@Id
	@GeneratedValue
	private Integer id;
	
	@NotBlank(message = "{mensagem.erro.senha.vazio}")
	private String senha;
	
	@NotBlank(message = "{mensagem.erro.nome.vazio}")
	private String nome;
	
	@NotBlank(message = "{mensagem.erro.email.vazio}")
	@Column(unique = true)
	private String email;
	
	@ManyToMany(fetch = FetchType.EAGER)
	@JoinTable(inverseJoinColumns = @JoinColumn(name = "permissao_id"))
	private List<Permissao> permissoes;
	
	@Column(name = "is_ativo")
	private boolean isAtivo;
	
	@Column(name = "chave_ativacao_cadastro")
	private String chaveAtivacaoCadastro;
	
	public Integer getId() {
		return id;
	}
	public String getSenha() {
		return senha;
	}
	public void setSenha(String senha) {
		this.senha = senha;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public List<Permissao> getPermissoes() {
		return permissoes;
	}
	public void setPermissoes(List<Permissao> permissoes) {
		this.permissoes = permissoes;
	}
	public boolean isAtivo() {
		return isAtivo;
	}
	public void setAtivo(boolean isAtivo) {
		this.isAtivo = isAtivo;
	}
	public String getChaveAtivacaoCadastro() {
		return chaveAtivacaoCadastro;
	}
	public void setChaveAtivacaoCadastro(String chaveAtivacaoCadastro) {
		this.chaveAtivacaoCadastro = chaveAtivacaoCadastro;
	}
}
