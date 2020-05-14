package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import model.Cidade;


public class CidadeDAO {

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

}
