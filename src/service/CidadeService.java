package service;

import dao.CidadeDAO;
import model.Cidade;

public class CidadeService {
	
	CidadeDAO dao = new CidadeDAO();

	public Cidade carregar(String nome) {
		return dao.carregar(nome);
	}

}
