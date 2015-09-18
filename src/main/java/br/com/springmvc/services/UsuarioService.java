package br.com.springmvc.services;

import java.util.Arrays;

import org.apache.commons.mail.EmailException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import br.com.springmvc.modelo.Permissao;
import br.com.springmvc.modelo.Usuario;
import br.com.springmvc.repository.PermissaoRepository;
import br.com.springmvc.repository.UsuarioRepository;
import br.com.springmvc.util.EmailUtil;

@Service
public class UsuarioService {
	
	@Autowired
	UsuarioRepository usuarioRepository;
	
	@Autowired
	PermissaoRepository permissaoRepository;
	
	public void cadastra(Usuario usuario) {
		// Se este usuário não está cadastrado...
		if (usuarioRepository.findByEmail(usuario.getEmail()) == null) {
			// Cadastra o usuário.
			String senhaMd5 = new BCryptPasswordEncoder().encode(usuario.getSenha());
			usuario.setSenha(senhaMd5);
			usuario.setPermissoes(Arrays.asList(Permissao.CADASTRADO));
			Double chaveAtivacaoCadastro = Math.random();
			usuario.setChaveAtivacaoCadastro(chaveAtivacaoCadastro.toString());
			
			// Envia email de ativação.
			try {
				String assunto = "Site: Ativação de Cadastro";
				String mensagem = "Por favor, acesse este link para ativar seu cadastro: "
						+ "http://localhost:8080/springmvc2/usuario/cadastro/ativacao?email="
						+ usuario.getEmail() + "&chave=" + chaveAtivacaoCadastro;
				EmailUtil.enviar(assunto, mensagem, usuario.getEmail());
				usuarioRepository.save(usuario);
			} catch (EmailException e) {
				e.printStackTrace();
			}
		}
	}
	
	public void ativacao(String email, String chave) {
		Usuario usuario = usuarioRepository.findByEmail(email);
		// Se este usuário está cadastrado e não está ativo...
		if (usuario != null && !usuario.isAtivo()) {
			// Se as chaves de cadastro e de email conferem...
			if (usuario.getChaveAtivacaoCadastro().equals(chave)) {
				// Ativa o usuário.
				usuario.setAtivo(true);
				usuarioRepository.save(usuario);
			}
		}
	}
}