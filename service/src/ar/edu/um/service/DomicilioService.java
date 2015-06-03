package ar.edu.um.service;

import java.math.BigDecimal;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import ar.edu.um.dao.CredencialDAO;
import ar.edu.um.dao.DomicilioDAO;
import ar.edu.um.model.Credencial;
import ar.edu.um.model.Domicilio;

@Service("domicilioService")
public class DomicilioService implements IDomicilioService {
	
	@Autowired
	DomicilioDAO domicilioDAO;


	@Transactional
	public Domicilio findDomicilioByPerID(BigDecimal Dom_Per_ID) {
		return domicilioDAO.findDomicilioByPerID(Dom_Per_ID);
	}


	
}
