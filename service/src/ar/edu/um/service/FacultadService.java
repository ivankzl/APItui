package ar.edu.um.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import ar.edu.um.dao.FacultadDAO;
import ar.edu.um.model.Facultad;

@Service("facultadService")
public class FacultadService implements IFacultadService {
	@Autowired
	FacultadDAO facultadDAO;
	
	@Transactional
	public Facultad findFacultadByID(int Fac_ID){
		return facultadDAO.findFacultadByID(Fac_ID);
	}
}
