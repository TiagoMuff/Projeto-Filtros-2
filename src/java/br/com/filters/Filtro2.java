package br.com.filters;

import java.io.IOException;
import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class Filtro2 implements Filter {

    @Override
    public void init(FilterConfig filterConfig) throws ServletException {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.

        /*conversão request e reponse*/
        HttpServletRequest conversaoreq = (HttpServletRequest) request;
        HttpServletResponse conversaoresp = (HttpServletResponse) response;

        HttpSession sessao = conversaoreq.getSession();
        String n = sessao.getAttribute("name").toString();

        //Teste da sessão no console 
        //System.out.println(n);
        
        
        //Funcionando, o erro deveria ser por usar codigo do servletdecide que usa redirect ao invés do chain.dofilter,
        if (n.equals("Tiago") && (conversaoreq.getParameter("btnT") != null)) {
            chain.doFilter(request, response);

        } else if (n.equals("Coelho") && (conversaoreq.getParameter("btnC") != null)) {
            chain.doFilter(request, response);

        } else {
            conversaoresp.sendRedirect("AcessoNegado.jsp");
        }

        
        
//CODIGO ANTIGO - ERRO sempre vai pra Acesso negado.
// COLOQUEI O && conversaoreq.getParameter("btnT") para que o 
//redirect só ocorra se caso o botão com o nome do respectivo usuario logado seja clicado
//        if (n.equals("Tiago") && (conversaoreq.getParameter("btnT") != null)) {
//           conversaoresp.sendRedirect("Tiago.jsp");
//
//        } else if (n.equals("Coelho") && (conversaoreq.getParameter("btnC") != null)) {
//            conversaoresp.sendRedirect("Coelho.jsp");
//
//        } else {
//            conversaoresp.sendRedirect("AcessoNegado.jsp");
//        }
    }

    @Override
    public void destroy() {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
