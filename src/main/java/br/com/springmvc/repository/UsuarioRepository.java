package br.com.springmvc.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.springmvc.modelo.Usuario;

public interface UsuarioRepository extends JpaRepository<Usuario, Integer> {
	public Usuario findByEmail(String email);
}
