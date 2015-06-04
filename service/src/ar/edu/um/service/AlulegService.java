package ar.edu.um.service;

import java.math.BigDecimal;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import ar.edu.um.dao.AlulegDAO;
import ar.edu.um.model.Aluleg;

@Service("alulegService")
public class AlulegService implements IAlulegService {
	
	@Autowired
	AlulegDAO alulegDAO;
	
	@Transactional
	public Aluleg findFacultadByPerID(BigDecimal ALe_Per_ID) {
		return alulegDAO.findFacultadByPerID(ALe_Per_ID);
	}
}
