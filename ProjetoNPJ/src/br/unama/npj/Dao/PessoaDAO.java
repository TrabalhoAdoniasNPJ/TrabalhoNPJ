package br.unama.npj.Dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.sql.DataSource;

import br.unama.npj.Model.Endereco;
import br.unama.npj.Model.Pessoa;

public class PessoaDAO {

		private DataSource ds;

		public PessoaDAO(DataSource ds) {
			super();
			this.ds = ds;
		}
	
		public void cadastroPessoa(Pessoa p, Endereco e) {
			Connection con;
			PreparedStatement ps;
			ResultSet rs;
			
			try {
				con = ds.getConnection();
				String sqlPessoa = "INSERT INTO PESSOA (Nome, CPF, Email) values (?, ? ,?)";
				ps = con.prepareStatement(sqlPessoa);
				
				ps.setString(1, p.getNome());
				ps.setString(2, p.getCpf());
				ps.setString(3, p.getEmail());
				
				ps.execute();
			} catch (SQLException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
			
			
			
			
		}
}
