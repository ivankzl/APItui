package ar.edu.um.dao;

import java.math.BigDecimal;

import ar.edu.um.model.Credencial;
import ar.edu.um.model.Domicilio;

public interface IDomicilioDAO {

	Domicilio findDomicilioByPerID(BigDecimal Dom_Per_ID);
	
}
