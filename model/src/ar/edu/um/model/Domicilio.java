package ar.edu.um.model;


import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "domicilio")
public class Domicilio implements Serializable{
	@Id
	@Column(name = "Dom_Per_ID", nullable = false)
	private BigDecimal Dom_Per_ID;
	@Id
	@Column(name = "Dom_Doc_ID", nullable = false)
	private int Dom_Doc_ID;
	@Column(name = "Dom_Fecha", nullable = false)
	private String Dom_Fecha;
	@Column(name = "Dom_Calle", nullable = false)
	private String Dom_Calle;
	@Column(name = "Dom_Puerta", nullable = false)
	private String Dom_Puerta;
	@Column(name = "Dom_Piso", nullable = false)
	private String Dom_Piso;
	@Column(name = "Dom_Dpto", nullable = false)
	private String Dom_Dpto;
	@Column(name = "Dom_Telefono", nullable = false)
	private String Dom_Telefono;
	@Column(name = "Dom_Observ", nullable = false)
	private String Dom_Observ;
	@Column(name = "Dom_CodPostal", nullable = false)
	private String Dom_CodPostal;
	@Column(name = "Dom_Prv_ID", nullable = false)
	private int Dom_Prv_ID;
	@Column(name = "Dom_Fac_ID", nullable = false)
	private String Dom_Fac_ID;
	@Column(name = "Dom_Loc_ID", nullable = false)
	private String Dom_Loc_ID;
	@Column(name = "Dom_e_mail", nullable = false)
	private String Dom_e_mail;
	@Column(name = "Dom_laboral", nullable = false)
	private String Dom_laboral;
	@Column(name = "Dom_ID", nullable = false)
	private int Dom_ID;
	
	public Domicilio() {
		
	}

	public BigDecimal getDom_Per_ID() {
		return Dom_Per_ID;
	}

	public void setDom_Per_ID(BigDecimal dom_Per_ID) {
		Dom_Per_ID = dom_Per_ID;
	}

	public int getDom_Doc_ID() {
		return Dom_Doc_ID;
	}

	public void setDom_Doc_ID(int dom_Doc_ID) {
		Dom_Doc_ID = dom_Doc_ID;
	}

	public String getDom_Fecha() {
		return Dom_Fecha;
	}

	public void setDom_Fecha(String dom_Fecha) {
		Dom_Fecha = dom_Fecha;
	}

	public String getDom_Calle() {
		return Dom_Calle;
	}

	public void setDom_Calle(String dom_Calle) {
		Dom_Calle = dom_Calle;
	}

	public String getDom_Puerta() {
		return Dom_Puerta;
	}

	public void setDom_Puerta(String dom_Puerta) {
		Dom_Puerta = dom_Puerta;
	}

	public String getDom_Piso() {
		return Dom_Piso;
	}

	public void setDom_Piso(String dom_Piso) {
		Dom_Piso = dom_Piso;
	}

	public String getDom_Dpto() {
		return Dom_Dpto;
	}

	public void setDom_Dpto(String dom_Dpto) {
		Dom_Dpto = dom_Dpto;
	}

	public String getDom_Telefono() {
		return Dom_Telefono;
	}

	public void setDom_Telefono(String dom_Telefono) {
		Dom_Telefono = dom_Telefono;
	}

	public String getDom_Observ() {
		return Dom_Observ;
	}

	public void setDom_Observ(String dom_Observ) {
		Dom_Observ = dom_Observ;
	}

	public String getDom_CodPostal() {
		return Dom_CodPostal;
	}

	public void setDom_CodPostal(String dom_CodPostal) {
		Dom_CodPostal = dom_CodPostal;
	}

	public int getDom_Prv_ID() {
		return Dom_Prv_ID;
	}

	public void setDom_Prv_ID(int dom_Prv_ID) {
		Dom_Prv_ID = dom_Prv_ID;
	}

	public String getDom_Fac_ID() {
		return Dom_Fac_ID;
	}

	public void setDom_Fac_ID(String dom_Fac_ID) {
		Dom_Fac_ID = dom_Fac_ID;
	}

	public String getDom_Loc_ID() {
		return Dom_Loc_ID;
	}

	public void setDom_Loc_ID(String dom_Loc_ID) {
		Dom_Loc_ID = dom_Loc_ID;
	}

	public String getDom_e_mail() {
		return Dom_e_mail;
	}

	public void setDom_e_mail(String dom_e_mail) {
		Dom_e_mail = dom_e_mail;
	}

	public String getDom_laboral() {
		return Dom_laboral;
	}

	public void setDom_laboral(String dom_laboral) {
		Dom_laboral = dom_laboral;
	}

	public int getDom_ID() {
		return Dom_ID;
	}

	public void setDom_ID(int dom_ID) {
		Dom_ID = dom_ID;
	}

	@Override
	public String toString() {
		return "Domicilio [Dom_Per_ID=" + Dom_Per_ID + ", Dom_Doc_ID="
				+ Dom_Doc_ID + ", Dom_Fecha=" + Dom_Fecha + ", Dom_Calle="
				+ Dom_Calle + ", Dom_Puerta=" + Dom_Puerta + ", Dom_Piso="
				+ Dom_Piso + ", Dom_Dpto=" + Dom_Dpto + ", Dom_Telefono="
				+ Dom_Telefono + ", Dom_Observ=" + Dom_Observ
				+ ", Dom_CodPostal=" + Dom_CodPostal + ", Dom_Prv_ID="
				+ Dom_Prv_ID + ", Dom_Fac_ID=" + Dom_Fac_ID + ", Dom_Loc_ID="
				+ Dom_Loc_ID + ", Dom_e_mail=" + Dom_e_mail + ", Dom_laboral="
				+ Dom_laboral + ", Dom_ID=" + Dom_ID + "]";
	}

	
	
	
}