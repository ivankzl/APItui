package ar.edu.um.dao;

import java.math.BigDecimal;
import java.util.List;

import ar.edu.um.model.Persona;

public interface IPersonaDAO {
	void persistPersona (Persona persona);

	public List<Persona> list();
	Persona findPersonaByClave(Integer clave);
	Persona findPersonaByPerID (BigDecimal Per_ID);

}