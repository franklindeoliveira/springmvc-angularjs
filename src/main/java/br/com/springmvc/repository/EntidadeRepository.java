package br.com.springmvc.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.springmvc.modelo.Entidade;

public interface EntidadeRepository extends JpaRepository<Entidade, Integer> {
	public List<Entidade> findByAtributo(String atributo);
}
