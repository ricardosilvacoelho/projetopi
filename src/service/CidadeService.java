package service;

import java.util.ArrayList;

import dao.CidadeDAO;
import model.Cidade;

public class CidadeService {
	
	CidadeDAO dao = new CidadeDAO();

	public Cidade carregar(String nome) {
		return dao.carregar(nome);
	}
	public ArrayList<Cidade> listarTodos(){
	return dao.listarTodos();
	}
}
