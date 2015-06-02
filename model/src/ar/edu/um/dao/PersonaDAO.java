package ar.edu.um.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ar.edu.um.model.Persona;

@Service("personaDAO")
public class PersonaDAO {
	@Autowired
	private SessionFactory sessionFactory;

	public void persistPersona(Persona persona) {
		sessionFactory.getCurrentSession().persist(persona);
	}
	
/*
	@SuppressWarnings("unchecked")
	public List<Persona> list() {
		Session session = this.sessionFactory.openSession();
        session.beginTransaction();
        List<Persona> personList = (List<Persona>) session.createQuery("from Persona").list();
        return personList;
    }
	*/
	public List<Persona> list() {
		
        @SuppressWarnings("unchecked")
		List<Persona> personList = (List<Persona>) sessionFactory.getCurrentSession().createQuery("from Persona").list();
        return personList;
    }

	public Persona findPersonaByClave(Integer clave) {
		Persona persona = (Persona)sessionFactory.getCurrentSession().get(Persona.class, clave);
		return persona;
	}

}