package ar.edu.um.service;

import java.util.List;

import ar.edu.um.model.Persona;

public interface IPersonaService {

	void persistPersona(Persona persona);
	List<Persona> list();
	Persona findPersonaByClave(Integer clave);

}
