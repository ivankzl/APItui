package ar.edu.um.dao;

import java.math.BigDecimal;

import ar.edu.um.model.Aluleg;

public interface IAlulegDAO {
	Aluleg findFacultadByPerID(BigDecimal ALe_Per_ID);
}
