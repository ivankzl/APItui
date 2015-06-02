package ar.edu.um.service;

import java.math.BigDecimal;

import ar.edu.um.model.Credencial;


public interface ICredencialService {

	void persistCredencial(Credencial credencial);
	Credencial findCredencialByCreNumero(BigDecimal cre_numero);

}
