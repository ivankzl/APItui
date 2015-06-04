package ar.edu.um.dao;

import java.math.BigDecimal;

import org.hibernate.Query;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ar.edu.um.model.Aluleg;

@Service("alulegDAO")
public class AlulegDAO implements IAlulegDAO{
	@Autowired
	private SessionFactory sessionFactory;
	
	public Aluleg findFacultadByPerID(BigDecimal ALe_Per_ID) {
		 Query query = sessionFactory.getCurrentSession().createQuery("from Aluleg where ALe_Per_ID = :ALe_Per_ID ");
		 query.setParameter("ALe_Per_ID", ALe_Per_ID);
		 Aluleg aluleg = (Aluleg) query.uniqueResult();
		 
		 return aluleg;
	}
}
