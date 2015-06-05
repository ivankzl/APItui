package ar.edu.um.model;

public class RespuestaJSONUserInfo {
	private ContentUserInfo content;
	private String status;
	public ContentUserInfo getContent() {
		return content;
	}
	public void setContent(ContentUserInfo content) {
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
		return "RespuestaJSONUserInfo [content=" + content + ", status="
				+ status + "]";
	}
	
	
}
