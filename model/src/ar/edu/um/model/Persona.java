package ar.edu.um.model;

import java.io.Serializable;
import java.math.BigDecimal;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "persona")
public class Persona implements Serializable {
	@Id
	@Column(name = "Per_ID", nullable = false)
	private BigDecimal Per_ID;
	@Id
	@Column(name = "Per_Doc_ID", nullable = false)
	private int Per_Doc_ID;
	@Column(name = "Per_Nombre", nullable = false)
	private String Per_Nombre;
	@Column(name = "Per_Apellido", nullable = false)
	private String Per_Apellido;
	@Column(name = "Per_Sexo", nullable = false)
	private String Per_Sexo;
	@Column(name = "Per_Primero", nullable = false)
	private int Per_Primero;
	@Column(name = "Per_CUIT", nullable = false)
	private String Per_CUIT;
	@Column(name = "Per_CBU", nullable = false)
	private String Per_CBU;
	@Id
	@Column(name = "clave", nullable = false)
	private int clave;


	public Persona() {

	}

	public BigDecimal getPer_ID() {
		return Per_ID;
	}

	public void setPer_ID(BigDecimal per_ID) {
		Per_ID = per_ID;
	}

	public int getPer_Doc_ID() {
		return Per_Doc_ID;
	}

	public void setPer_Doc_ID(int per_Doc_ID) {
		Per_Doc_ID = per_Doc_ID;
	}

	public String getPer_Nombre() {
		return Per_Nombre;
	}

	public void setPer_Nombre(String per_Nombre) {
		Per_Nombre = per_Nombre;
	}

	public String getPer_Apellido() {
		return Per_Apellido;
	}

	public void setPer_Apellido(String per_Apellido) {
		Per_Apellido = per_Apellido;
	}

	public String getPer_Sexo() {
		return Per_Sexo;
	}

	public void setPer_Sexo(String per_Sexo) {
		Per_Sexo = per_Sexo;
	}

	public int getPer_Primero() {
		return Per_Primero;
	}

	public void setPer_Primero(int per_Primero) {
		Per_Primero = per_Primero;
	}

	public String getPer_CUIT() {
		return Per_CUIT;
	}

	public void setPer_CUIT(String per_CUIT) {
		Per_CUIT = per_CUIT;
	}

	public String getPer_CBU() {
		return Per_CBU;
	}

	public void setPer_CBU(String per_CBU) {
		Per_CBU = per_CBU;
	}

	public int getClave() {
		return clave;
	}

	public void setClave(int clave) {
		this.clave = clave;
	}

	

}
