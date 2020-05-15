package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import model.Cidade;



public class CidadeDAO {
	
	ArrayList<Cidade> lista = new ArrayList<>();
	
	public Cidade carregar (String nome) {
		Cidade cidade = new Cidade(); 
		String sqlSelect = "SELECT id, nome FROM clima WHERE cidade.nome = ?";
		try (Connection conn = ConexaoDB.conectar();
				PreparedStatement stm = conn.prepareStatement(sqlSelect);) {
			stm.setString(1, nome);
			try (ResultSet rs = stm.executeQuery();) {
				if (rs.next()) {
					cidade.setId(rs.getInt("id"));
					cidade.setNome(rs.getString("nome"));
				} 
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return cidade;
	}
	public ArrayList<Cidade> listarTodos() {
		ArrayList<Cidade> cidades = new ArrayList<>();
		String sqlSelect = "SELECT id, nome FROM cidade";
		Cidade cidade;
		try (Connection conn = ConexaoDB.conectar();
				PreparedStatement stm = conn.prepareStatement(sqlSelect);
				ResultSet rs = stm.executeQuery();) {
			while (rs.next()) {
				cidade = new Cidade();
				cidade.setId(rs.getInt("id"));
				cidade.setNome(rs.getString("nome"));
				cidades.add(cidade);
			} 
		} catch (SQLException e1) {
			System.out.print(e1.getStackTrace());
		}
		return cidades;
	}

}
