package br.com.springmvc.util;

import org.apache.commons.mail.DefaultAuthenticator;
import org.apache.commons.mail.Email;
import org.apache.commons.mail.EmailException;
import org.apache.commons.mail.SimpleEmail;

/**
 * Classe utilitária para envio de email.
 * 
 */
public class EmailUtil {
	
	private static final EmailUtil INSTANCE = new EmailUtil();
	
	private static final String hostname = "smtp.googlemail.com";
	private static final int port = 465;
	private static final String username = "<username para envio do email>";
	private static final String password = "<password para envio do email>";
	private static final Boolean ssl = true;
	private static final String from = "<<email do remetente>>";
	
	private EmailUtil() {}
	
	public static EmailUtil getInstance() {
		return INSTANCE;
	}
	
	public static String enviar(String assunto, String mensagem, String para) throws EmailException {
		Email email = new SimpleEmail();
		email.setHostName(hostname);
		email.setSmtpPort(port);
		email.setAuthenticator(new DefaultAuthenticator(username, password));
		email.setSSLOnConnect(ssl);
		email.setFrom(from);
		email.setSubject(assunto);
		email.setMsg(mensagem);
		email.addTo(para);
		email.send();
		return "home";
	}

}
