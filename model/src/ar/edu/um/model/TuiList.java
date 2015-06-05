package ar.edu.um.model;

import java.math.BigDecimal;

public class TuiList {
	private BigDecimal user_id;
	private String status;
	private String delivery_date;
	private String delivery_place_coordinates;
	private String delivery_place_name;
	private String expiration_date;
	public BigDecimal getUser_id() {
		return user_id;
	}
	public void setUser_id(BigDecimal user_id) {
		this.user_id = user_id;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public String getDelivery_date() {
		return delivery_date;
	}
	public void setDelivery_date(String delivery_date) {
		this.delivery_date = delivery_date;
	}
	public String getDelivery_place_coordinates() {
		return delivery_place_coordinates;
	}
	public void setDelivery_place_coordinates(String delivery_place_coordinates) {
		this.delivery_place_coordinates = delivery_place_coordinates;
	}
	public String getDelivery_place_name() {
		return delivery_place_name;
	}
	public void setDelivery_place_name(String delivery_place_name) {
		this.delivery_place_name = delivery_place_name;
	}
	public String getExpiration_date() {
		return expiration_date;
	}
	public void setExpiration_date(String expiration_date) {
		this.expiration_date = expiration_date;
	}
	
	
}
