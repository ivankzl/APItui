package ar.edu.um.service;

import java.math.BigDecimal;
import java.util.List;

import ar.edu.um.model.*;

public interface IPersonaService {

	void persistPersona(Persona persona);
	List<Persona> list();
	Persona findPersonaByClave(Integer clave);
	Persona findPersonaByPerID(BigDecimal Per_ID);
	Persona validarLogin(BigDecimal login_id, String password);
//<<<<<<< HEAD
	//RespuestaJSON (String login_id, String password);
//=======
//	RespuestaJSONLogin validarLogin(String login_id, String password);
//>>>>>>> 24e13898f82db340655c556306e611e54a046803

}
