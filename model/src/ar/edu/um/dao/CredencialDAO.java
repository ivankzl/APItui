package ar.edu.um.dao;
import java.math.BigDecimal;

import org.hibernate.Query;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ar.edu.um.model.Credencial;
import ar.edu.um.model.Persona;

@Service("credencialDAO")
public class CredencialDAO implements ICredencialDAO{
	
	@Autowired
	private SessionFactory sessionFactory;

	public void persistCredencial(Credencial credencial) {
		sessionFactory.getCurrentSession().persist(credencial);
	}
	
	public Credencial findCredencialByCreNumero(BigDecimal cre_numero) {
		 Query query = sessionFactory.getCurrentSession().createQuery("from Credencial where cre_numero = :cre_numero ");
		 query.setParameter("cre_numero", cre_numero);
		 Credencial credencial = (Credencial) query.uniqueResult();
		 
		 return credencial;
	}

}
