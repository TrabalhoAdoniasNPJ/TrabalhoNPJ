package br.unama.npj.Dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

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
				String sqlPessoa = "INSERT INTO Pessoa (Nome, CPF, Email) values (?, ? ,?)";
				ps = con.prepareStatement(sqlPessoa, Statement.RETURN_GENERATED_KEYS);
				
				ps.setString(1, p.getNome());
				ps.setString(2, p.getCpf());
				ps.setString(3, p.getEmail());
				
				ps.execute();
				
				rs = ps.getGeneratedKeys();
				int generatedKey = 0;
				if(rs.next()) {
					generatedKey = rs.getInt(1);
				}
				
				String sqlEndereco = "INSERT INTO Endereco (Cep, Logradouro, Numero, complemento, bairro, estado, municipio, Pessoa_id1) values (?, ? , ?, ?, ?, ?, ?, ?)";
				ps = con.prepareStatement(sqlEndereco, Statement.RETURN_GENERATED_KEYS);
				
				ps.setString(1, e.getCep());
				ps.setString(2, e.getLogradouro());
				ps.setString(3, e.getNumero());
				ps.setString(4, e.getComplemento());
				ps.setString(5, e.getBairro());
				ps.setString(6, e.getEstado());
				ps.setString(7, e.getMunicipio());
				ps.setInt(8, generatedKey);
				
				
				ps.execute();
				
				
				
				
			} catch (SQLException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
			
			
			
			
		}
}
