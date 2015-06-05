package ar.edu.um.model;

import java.io.Serializable;
import java.math.BigDecimal;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "persona")
public class Aluleg implements Serializable{
	@Id
	@Column(name = "ALe_Per_ID", nullable = false)
	private BigDecimal ALe_Per_ID;
	@Id
	@Column(name = "ALe_Doc_ID", nullable = false)
	private int ALe_Doc_ID;
	@Id
	@Column(name = "ALe_Fac_ID", nullable = false)
	private int ALe_Fac_ID;
	@Column(name = "ALe_Leg_ID", nullable = false)
	private int ALe_Leg_ID;
	@Column(name = "ALe_Fecha", nullable = false)
	private String ALe_Fecha;
	@Column(name = "ALe_Lec_ID", nullable = false)
	private int ALe_Lec_ID;
	@Column(name = "ALe_Pla_ID", nullable = false)
	private int ALe_Pla_ID;
	@Column(name = "ALe_Car_ID", nullable = false)
	private int ALe_Car_ID;
	@Column(name = "ALe_Carrera", nullable = false)
	private int ALe_Carrera;
	@Column(name = "ALe_Geo_ID", nullable = false)
	private int ALe_Geo_ID;
	@Column(name = "ALe_ID", nullable = true)
	private int ALe_ID;
	@Column(name = "ALe_Contrasenia", nullable = true)
	private int ALe_Contrasenia;
	
	
	public Aluleg(){
		
	}

	public BigDecimal getALe_Per_ID() {
		return ALe_Per_ID;
	}

	public void setALe_Per_ID(BigDecimal aLe_Per_ID) {
		ALe_Per_ID = aLe_Per_ID;
	}

	public int getALe_Doc_ID() {
		return ALe_Doc_ID;
	}

	public void setALe_Doc_ID(int aLe_Doc_ID) {
		ALe_Doc_ID = aLe_Doc_ID;
	}

	public int getALe_Fac_ID() {
		return ALe_Fac_ID;
	}

	public void setALe_Fac_ID(int aLe_Fac_ID) {
		ALe_Fac_ID = aLe_Fac_ID;
	}

	public int getALe_Leg_ID() {
		return ALe_Leg_ID;
	}

	public void setALe_Leg_ID(int aLe_Leg_ID) {
		ALe_Leg_ID = aLe_Leg_ID;
	}

	public String getALe_Fecha() {
		return ALe_Fecha;
	}

	public void setALe_Fecha(String aLe_Fecha) {
		ALe_Fecha = aLe_Fecha;
	}

	public int getALe_Lec_ID() {
		return ALe_Lec_ID;
	}

	public void setALe_Lec_ID(int aLe_Lec_ID) {
		ALe_Lec_ID = aLe_Lec_ID;
	}

	public int getALe_Pla_ID() {
		return ALe_Pla_ID;
	}

	public void setALe_Pla_ID(int aLe_Pla_ID) {
		ALe_Pla_ID = aLe_Pla_ID;
	}

	public int getALe_Car_ID() {
		return ALe_Car_ID;
	}

	public void setALe_Car_ID(int aLe_Car_ID) {
		ALe_Car_ID = aLe_Car_ID;
	}

	public int getALe_Carrera() {
		return ALe_Carrera;
	}

	public void setALe_Carrera(int aLe_Carrera) {
		ALe_Carrera = aLe_Carrera;
	}

	public int getALe_Geo_ID() {
		return ALe_Geo_ID;
	}

	public void setALe_Geo_ID(int aLe_Geo_ID) {
		ALe_Geo_ID = aLe_Geo_ID;
	}

	public int getALe_ID() {
		return ALe_ID;
	}

	public void setALe_ID(int aLe_ID) {
		ALe_ID = aLe_ID;
	}
	
	

	public int getALe_Contrasenia() {
		return ALe_Contrasenia;
	}

	public void setALe_Contrasenia(int aLe_Contrasenia) {
		ALe_Contrasenia = aLe_Contrasenia;
	}

	@Override
	public String toString() {
		return "Aluleg [ALe_Per_ID=" + ALe_Per_ID + ", ALe_Doc_ID="
				+ ALe_Doc_ID + ", ALe_Fac_ID=" + ALe_Fac_ID + ", ALe_Leg_ID="
				+ ALe_Leg_ID + ", ALe_Fecha=" + ALe_Fecha + ", ALe_Lec_ID="
				+ ALe_Lec_ID + ", ALe_Pla_ID=" + ALe_Pla_ID + ", ALe_Car_ID="
				+ ALe_Car_ID + ", ALe_Carrera=" + ALe_Carrera + ", ALe_Geo_ID="
				+ ALe_Geo_ID + ", ALe_ID=" + ALe_ID + "]";
	}
	
	

}
