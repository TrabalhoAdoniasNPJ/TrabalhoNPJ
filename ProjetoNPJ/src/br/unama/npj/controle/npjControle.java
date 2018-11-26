package br.unama.npj.controle;

import java.io.IOException;
import java.io.PrintWriter;

import javax.annotation.Resource;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.sql.DataSource;

import br.unama.npj.Dao.PessoaDAO;
import br.unama.npj.Model.Endereco;
import br.unama.npj.Model.Pessoa;

/**
 * Servlet implementation class npjControle
 */
@WebServlet("/npjControle")
public class npjControle extends HttpServlet {
	private static final long serialVersionUID = 1L;
    
	@Resource(name="jdbc/web-npj")
	private DataSource ds;
    
    public npjControle() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see Servlet#init(ServletConfig)
	 */
	public void init(ServletConfig config) throws ServletException {
		// TODO Auto-generated method stub
	}

	/**
	 * @see HttpServlet#service(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String action = request.getParameter("action");
		if(action.equals("cadastroPessoa")) {
			
			String nome = (String)request.getParameter("nome");
			String cpf = (String)request.getParameter("cpf");
			String email = (String)request.getParameter("email");

			Pessoa p = new Pessoa(nome, cpf, email);
				
			
			String bairro = (String)request.getParameter("bairro");
			String cep = (String)request.getParameter("cep");
			String complemento = (String)request.getParameter("complemento");
			String estado = (String)request.getParameter("estado");
			String logradouro = (String)request.getParameter("logradouro");
			String municipio = (String)request.getParameter("municipio");
			String numero = (String)request.getParameter("numero");
			
			Endereco e = new Endereco(cep, logradouro,  numero, complemento, bairro, estado,  municipio, p);
			
			PessoaDAO pDAO = new PessoaDAO(ds);
			
			pDAO.cadastroPessoa(p, e);
			
			
		}if(action.equals("cadastroAtendimento")) {
			
		}
		
		if(action.equals("consultarPessoa")){
			
			response.setContentType("text/plain"); 	
			response.getWriter().write("eric");

	}

	}
}
