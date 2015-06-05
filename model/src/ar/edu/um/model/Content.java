package ar.edu.um.model;

public class Content {
	private String login_id;
	private String name;
	private String roles;
	private String photo;
	private int new_user_id;
	
	public String getLogin_id() {
		return login_id;
	}
	public void setLogin_id(String login_id) {
		this.login_id = login_id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getRoles() {
		return roles;
	}
	public void setRoles(String roles) {
		this.roles = roles;
	}
	public String getPhoto() {
		return photo;
	}
	public void setPhoto(String photo) {
		this.photo = photo;
	}
	public int getNew_user_id() {
		return new_user_id;
	}
	public void setNew_user_id(int new_user_id) {
		this.new_user_id = new_user_id;
	}
	
	@Override
	public String toString() {
		return "Content [login_id=" + login_id + ", name=" + name + ", roles="
				+ roles + ", photo=" + photo + ", new_user_id=" + new_user_id
				+ "]";
	}
	
	
	
}


