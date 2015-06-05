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
		
		
		Query query = sessionFactory.getCurrentSession().createQuery("from Aluleg where ALe_Per_ID = :ALe_Per_ID order by ALe_Fecha desc");
		query.setParameter("ALe_Per_ID", ALe_Per_ID);
		query.setMaxResults(1);
		//Aluleg aluleg = (Aluleg) query.setFirstResult(1);
		//Aluleg aluleg = (Aluleg) query.setMaxResults(1);
		Aluleg aluleg = (Aluleg) query.uniqueResult();
		 
		if (aluleg == null){
			throw new RuntimeException("No se encontró para la credencial: " + ALe_Per_ID);
		}
			
		return aluleg;
		
		
	}
}
