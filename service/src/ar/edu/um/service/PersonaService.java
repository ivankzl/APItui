package ar.edu.um.service;

import java.math.BigDecimal;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import ar.edu.um.dao.PersonaDAO;
import ar.edu.um.model.Persona;
import ar.edu.um.model.RespuestaJSONLogin;

@Service("personaService")
public class PersonaService implements IPersonaService {
	
	@Autowired
	PersonaDAO personaDAO;

	@Transactional 
	public void persistPersona (Persona persona) {
		personaDAO.persistPersona (persona);
	}

	@Transactional 
	public List<Persona> list() {
		return personaDAO.list();
	}

	@Transactional 
	public Persona findPersonaByClave(Integer clave) {
		return (Persona)personaDAO.findPersonaByClave(clave);
	}

	@Transactional 
	public Persona findPersonaByPerID(BigDecimal Per_ID) {
		return (Persona)personaDAO.findPersonaByPerID(Per_ID);
	}

	@Override
	public RespuestaJSONLogin validarLogin(String login_id, String password) {
		// TODO Auto-generated method stub
		return null;
	}


}
