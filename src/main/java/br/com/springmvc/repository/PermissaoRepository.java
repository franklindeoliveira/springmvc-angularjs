package br.com.springmvc.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.springmvc.modelo.Permissao;

public interface PermissaoRepository extends JpaRepository<Permissao, Integer> {
	public Permissao findById(Integer id);
}
