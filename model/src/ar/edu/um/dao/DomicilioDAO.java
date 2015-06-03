package ar.edu.um.dao;
import java.math.BigDecimal;

import org.hibernate.Query;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ar.edu.um.model.Credencial;
import ar.edu.um.model.Domicilio;
import ar.edu.um.model.Persona;

@Service("domicilioDAO")
public class DomicilioDAO implements IDomicilioDAO{
	
	@Autowired
	private SessionFactory sessionFactory;
	
	public Domicilio findDomicilioByPerID(BigDecimal Dom_Per_ID) {
		 Query query = sessionFactory.getCurrentSession().createQuery("from Domicilio where Dom_Per_ID = :Dom_Per_ID");
		 query.setParameter("Dom_Per_ID", Dom_Per_ID);
		 Domicilio domicilio = (Domicilio) query.uniqueResult();
		 
		 return domicilio;
	}

}
