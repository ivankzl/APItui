package ar.edu.um.dao;

import org.hibernate.Query;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ar.edu.um.model.Facultad;

@Service("facultadDAO")
public class FacultadDAO implements IFacultadDAO{
	@Autowired
	private SessionFactory sessionFactory;
	
	public Facultad findFacultadByID(int Fac_ID){
		 Query query = sessionFactory.getCurrentSession().createQuery("from Facultad where Fac_ID = :Fac_ID");
		 query.setParameter("Fac_ID", Fac_ID);
		 Facultad facultad = (Facultad) query.uniqueResult();
		 
		 return facultad;
	}

}
