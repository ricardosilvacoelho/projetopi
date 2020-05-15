package service;

import java.util.ArrayList;

import dao.CidadeDAO;
import model.Cidade;

public class CidadeService {
	
	CidadeDAO dao = new CidadeDAO();

	public ArrayList<Cidade> listarTodos(){
	return dao.listarTodos();
	}
}
