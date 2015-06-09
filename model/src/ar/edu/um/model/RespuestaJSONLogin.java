package ar.edu.um.model;

public class RespuestaJSONLogin {
	
	private String status_code;
	private String session_token;
	
	public String getStatus_code() {
		return status_code;
	}
	public void setStatus_code(String status_code) {
		this.status_code = status_code;
	}
	public String getSession_token() {
		return session_token;
	}
	public void setSession_token(String session_token) {
		this.session_token = session_token;
	}
	
	@Override
	public String toString() {
		return "RespuestaJSONUserInfo [status_code=" + status_code
				+ ", session_token=" + session_token + "]";
	}
	
	
}

