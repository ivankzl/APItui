package ar.edu.um.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import ar.edu.um.dao.CredencialDAO;
import ar.edu.um.model.Credencial;

@Service("credencialService")
public class CredencialService implements ICredencialService {
	
	@Autowired
	CredencialDAO credencialDAO;
	

	@Transactional 
	public void persistCredencial(Credencial credencial) {
		credencialDAO.persistCredencial(credencial);
	}


	
}
