package br.com.springmvc.util;

import org.springframework.security.authentication.AnonymousAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;

/**
 * Classe utilitário de autenticação.
 * @author franklinoliveira
 *
 */
public class AutenticacaoUtil {
	
	private static final AutenticacaoUtil INSTANCE = new AutenticacaoUtil();
	private static Authentication authentication = SecurityContextHolder.getContext().getAuthentication();
	
	private AutenticacaoUtil() {}
	
	public static AutenticacaoUtil getInstance() {
		return INSTANCE;
	}
	
	public static boolean isAuthenticated(){
		return authentication != null
				&& !(authentication instanceof AnonymousAuthenticationToken)
				&& authentication.isAuthenticated();
	}

}
