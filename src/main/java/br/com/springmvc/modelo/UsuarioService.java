package br.com.springmvc.modelo;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import br.com.springmvc.repository.UsuarioRepository;

@Service
public class UsuarioService implements UserDetailsService {
	
	@Autowired
	UsuarioRepository usuarioRepository;
	
	public void oi() {}
	
	@Override
	public UserDetails loadUserByUsername(String nomeUsuario)
			throws UsernameNotFoundException {
		Usuario usuario = usuarioRepository.findByNomeUsuario(nomeUsuario);
		User user = null;
		// Se usuario existe...
		if (usuario != null) {
			// ... carrega suas informações do objeto org.springframework.security.core.userdetails.User;
			user = new User(usuario.getNomeUsuario(), 
							usuario.getSenha(),
							getAuthorities(getTiposPermissao(usuario.getPermissoes())));
		}
		return user;
	}
	
	private List<String> getTiposPermissao(List<Permissao> permissoes) {
		List<String> tiposPermissao = new ArrayList<String>();
		for (Permissao permissao : permissoes) {
			tiposPermissao.add(permissao.getTipo());
		}
		return tiposPermissao;
	}
	
	private Collection<? extends GrantedAuthority> getAuthorities(List<String> tiposPermissao) {
		List<GrantedAuthority> authorities = new ArrayList<GrantedAuthority>();
		for (String tipoPermissao : tiposPermissao) {
			authorities.add(new SimpleGrantedAuthority(tipoPermissao));
		}
		return authorities;
	}

}
