package ar.edu.um.model;

public class RespuestaJSON {
	
	private Content content;
	private String status;
	public Content getContent() {
		return content;
	}
	public void setContent(Content content) {
		this.content = content;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	@Override
	public String toString() {
		return "RespuestaJSON [content=" + content + ", status=" + status + "]";
	}
	
	

}
