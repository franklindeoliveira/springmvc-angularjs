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
 */
@WebFilter("/*")
public class RedirecionaFilter implements Filter {

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

        if (path.equals("/")) {// Se foi acessado a raiz da aplicação...
			// ..., redireciona para a página home.
			response.sendRedirect(request.getContextPath() + "/home");
        } else {
        	chain.doFilter(req, res);// Senão, prosegue com o processamento da requisição.
        }

	}
	
	/**
	 * Método executado quando o filtro é carregado pelo container.
	 */
	@Override
	public void init(FilterConfig filterConfig) throws ServletException {}
	
	/**
	 * Método executado quando o filtro é descarregado pelo container.
	 */
	@Override
	public void destroy() {}
	
}
