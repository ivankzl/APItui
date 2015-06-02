package ar.edu.um.dao;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ar.edu.um.model.Credencial;

@Service("credencialDAO")
public class CredencialDAO {
	
	@Autowired
	private SessionFactory sessionFactory;

	public void persistCredencial(Credencial credencial) {
		sessionFactory.getCurrentSession().persist(credencial);
	}

}
