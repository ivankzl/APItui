package ar.edu.um.dao;

import java.util.List;

import ar.edu.um.model.Persona;

public interface IPersonaDAO {
	void persistPersona (Persona persona);

	public List<Persona> list();
	Persona findPersonaByClave(Integer clave);

}