package ar.edu.um.service;

import java.math.BigDecimal;

import ar.edu.um.model.Credencial;
import ar.edu.um.model.Domicilio;


public interface IDomicilioService {

	Domicilio findDomicilioByPerID(BigDecimal Dom_Per_ID);

}
