package br.com.springmvc.filtros;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Filter responsável por tratar todos os redirecionamentos de URL da aplicação.
 * TODO: Criar uma classe generica de filtros.
 */
@WebFilter("/*")
public class RedirecionaFilter implements Filter {

	/**
	 * Método executado quando o filtro é carregado pelo container.
	 */
	@Override
	public void init(FilterConfig filterConfig) throws ServletException {}

	/**
	 * Processa as requisições segundo a configuração da anotação <code>WebFilter</code>.
	 */
	@Override
	public void doFilter(ServletRequest req, ServletResponse res,
			FilterChain chain) throws IOException, ServletException {
		HttpServletRequest request = (HttpServletRequest) req;
        HttpServletResponse response = (HttpServletResponse) res;
        
        /**
         * Armazena o conteúdo da URL a partir do contexto da aplicação.
         * Por exemplo: se a url for www.site.com/produtos/limpeza teremos
         * path = "/produtos/limpeza"
         */
        String path = request.getServletPath();


        // Se foi acessado a raiz da aplicação...
        if (path.equals("/")) {
        	// ... fazemos o redirecionamento para a home.
        	response.sendRedirect(request.getContextPath() + "/home");
        } else {// senão, continuamos com o processamento da requisição.
        	chain.doFilter(req, res);
        }
		
	}
	
	/**
	 * Método executado quando o filtro é descarregado pelo container.
	 */
	@Override
	public void destroy() {}

}
