package ar.edu.um.model;

import java.math.BigDecimal;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "facultad")
public class Facultad {
	@Id
	@Column(name = "Fac_ID", nullable = false)
	private int Fac_ID;
	@Column(name = "Fac_Nombre", nullable = false)
	private String Fac_Nombre;
	@Column(name = "Fac_Cuenta", nullable = false)
	private String Fac_Cuenta;
	@Column(name = "Fac_Codigo_Empresa", nullable = false)
	private String Fac_Codigo_Empresa;
	@Column(name = "Fac_Server", nullable = false)
	private String Fac_Server;
	@Column(name = "Fac_DB_ADM", nullable = false)
	private String Fac_DB_ADM;
	@Column(name = "Fac_DSN", nullable = false)
	private String Fac_DSN;
	@Column(name = "Fac_Pla_Cuenta", nullable = false)
	private int Fac_Pla_Cuenta;
	
	public Facultad(){
		
	}

	public int getFac_ID() {
		return Fac_ID;
	}

	public void setFac_ID(int fac_ID) {
		Fac_ID = fac_ID;
	}

	public String getFac_Nombre() {
		return Fac_Nombre;
	}

	public void setFac_Nombre(String fac_Nombre) {
		Fac_Nombre = fac_Nombre;
	}

	public String getFac_Cuenta() {
		return Fac_Cuenta;
	}

	public void setFac_Cuenta(String fac_Cuenta) {
		Fac_Cuenta = fac_Cuenta;
	}

	public String getFac_Codigo_Empresa() {
		return Fac_Codigo_Empresa;
	}

	public void setFac_Codigo_Empresa(String fac_Codigo_Empresa) {
		Fac_Codigo_Empresa = fac_Codigo_Empresa;
	}

	public String getFac_Server() {
		return Fac_Server;
	}

	public void setFac_Server(String fac_Server) {
		Fac_Server = fac_Server;
	}

	public String getFac_DB_ADM() {
		return Fac_DB_ADM;
	}

	public void setFac_DB_ADM(String fac_DB_ADM) {
		Fac_DB_ADM = fac_DB_ADM;
	}

	public String getFac_DSN() {
		return Fac_DSN;
	}

	public void setFac_DSN(String fac_DSN) {
		Fac_DSN = fac_DSN;
	}

	public int getFac_Pla_Cuenta() {
		return Fac_Pla_Cuenta;
	}

	public void setFac_Pla_Cuenta(int fac_Pla_Cuenta) {
		Fac_Pla_Cuenta = fac_Pla_Cuenta;
	}

	@Override
	public String toString() {
		return "Facultad [Fac_ID=" + Fac_ID + ", Fac_Nombre=" + Fac_Nombre
				+ ", Fac_Cuenta=" + Fac_Cuenta + ", Fac_Codigo_Empresa="
				+ Fac_Codigo_Empresa + ", Fac_Server=" + Fac_Server
				+ ", Fac_DB_ADM=" + Fac_DB_ADM + ", Fac_DSN=" + Fac_DSN
				+ ", Fac_Pla_Cuenta=" + Fac_Pla_Cuenta + "]";
	}
	
		
	
	
	
	

}
