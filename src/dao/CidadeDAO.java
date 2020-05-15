package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import model.Cidade;


public class CidadeDAO {
	
	ArrayList<Cidade> lista = new ArrayList<>();
	
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
	//Código pronto para banco de dados:
	//SELECT cidade.nome , clima.temp_inst, data FROM cidade INNER JOIN clima  WHERE cidade.id = 1 AND data BETWEEN '2019-08-25' AND '2019-09-25';

}
