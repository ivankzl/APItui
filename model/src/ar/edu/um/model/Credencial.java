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
@Table(name = "credencial")
public class Credencial implements Serializable{
	@Id
	@Column(name = "cre_doc_id", nullable = false)
	private int cre_doc_id;
	@Id
	@Column(name = "cre_per_id", nullable = false)
	private BigDecimal cre_per_id;
	@Column(name = "cre_numero", nullable = false)
	private BigDecimal cre_numero;
	@Column(name = "cre_chip_id", nullable = false)
	private String cre_chip_id;
	@Column(name = "cre_alta", nullable = false)
	private Date cre_alta;
	
	@Column(name = "cre_perdida", nullable = false)
	private int cr_perdida;
	@Column(name = "cre_id", nullable = false)
	private int cre_id;

	
	
	public Credencial() {
		
	}


	public int getCre_doc_id() {
		return cre_doc_id;
	}


	public void setCre_doc_id(int cre_doc_id) {
		this.cre_doc_id = cre_doc_id;
	}


	public BigDecimal getCre_per_id() {
		return cre_per_id;
	}


	public void setCre_per_id(BigDecimal cre_per_id) {
		this.cre_per_id = cre_per_id;
	}


	public BigDecimal getCre_numero() {
		return cre_numero;
	}


	public void setCre_numero(BigDecimal cre_numero) {
		this.cre_numero = cre_numero;
	}


	public String getCre_chip_id() {
		return cre_chip_id;
	}


	public void setCre_chip_id(String cre_chip_id) {
		this.cre_chip_id = cre_chip_id;
	}


	public Date getCre_alta() {
		return cre_alta;
	}


	public void setCre_alta(Date cre_alta) {
		this.cre_alta = cre_alta;
	}


	public int getCr_perdida() {
		return cr_perdida;
	}


	public void setCr_perdida(int cr_perdida) {
		this.cr_perdida = cr_perdida;
	}


	public int getCre_id() {
		return cre_id;
	}


	public void setCre_id(int cre_id) {
		this.cre_id = cre_id;
	}


	@Override
	public String toString() {
		return "Credencial [cre_doc_id=" + cre_doc_id + ", cre_per_id="
				+ cre_per_id + ", cre_numero=" + cre_numero + ", cre_chip_id="
				+ cre_chip_id + ", cre_alta=" + cre_alta + ", cr_perdida="
				+ cr_perdida + ", cre_id=" + cre_id + "]";
	}


	
	
}