package ar.edu.um.dao;

import java.math.BigDecimal;

import ar.edu.um.model.Credencial;

public interface ICredencialDAO {

	void persistCredencial (Credencial credencial);
	Credencial findCredencialByCreNumero(BigDecimal cre_numero);
	
}
