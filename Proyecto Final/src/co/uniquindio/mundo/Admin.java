package co.uniquindio.mundo;

public class Admin {
	
	private String id;
	private String contrase�a;
	
	public Admin(String id, String contrase�a) {
		super();
		this.id = id;
		this.contrase�a = contrase�a;
	}
	
	public Admin () {}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getContrase�a() {
		return contrase�a;
	}

	public void setContrase�a(String contrase�a) {
		this.contrase�a = contrase�a;
	}
	
	
}
