package ar.edu.um.model;

import java.math.BigDecimal;

public class ContentUserInfo {
	
	private BigDecimal user_id;
	private String email;
	private String tlf;
	private String name;
	private String surname;
	private String photo;
	private String admin_unit;
	private String relation;
	private String roles;
	private String status;
	
	public ContentUserInfo(){
		
	}

	public BigDecimal getUser_id() {
		return user_id;
	}

	public void setUser_id(BigDecimal user_id) {
		this.user_id = user_id;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getTlf() {
		return tlf;
	}

	public void setTlf(String tlf) {
		this.tlf = tlf;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSurname() {
		return surname;
	}

	public void setSurname(String surname) {
		this.surname = surname;
	}

	public String getPhoto() {
		return photo;
	}

	public void setPhoto(String photo) {
		this.photo = photo;
	}

	public String getAdmin_unit() {
		return admin_unit;
	}

	public void setAdmin_unit(String admin_unit) {
		this.admin_unit = admin_unit;
	}

	public String getRelation() {
		return relation;
	}

	public void setRelation(String relation) {
		this.relation = relation;
	}

	public String getRoles() {
		return roles;
	}

	public void setRoles(String roles) {
		this.roles = roles;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	@Override
	public String toString() {
		return "ContentUserInfo [user_id=" + user_id + ", email=" + email
				+ ", tlf=" + tlf + ", name=" + name + ", surname=" + surname
				+ ", photo=" + photo + ", admin_unit=" + admin_unit
				+ ", relation=" + relation + ", roles=" + roles + ", status="
				+ status + "]";
	}
	
	
	
}
