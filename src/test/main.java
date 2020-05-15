package test;

import java.sql.SQLException;
import java.util.ArrayList;

import dao.CidadeDAO;
import model.Cidade;


public class main {

	public static void main(String[] args) throws SQLException {
		
		CidadeDAO cidade = new CidadeDAO();
		ArrayList<Cidade> cd = cidade.listarTodos();
		for(int i = 0; i < cd.size(); i++) {
		System.out.println("Id:" + cd.get(i).getId() + "  -  " + "Cidade:" + cd.get(i).getNome());
		}
	}

}
