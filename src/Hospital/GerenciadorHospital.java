package Hospital;
import javax.swing.JOptionPane;
public abstract class GerenciadorHospital {
	
	private String usuario;
	private String senha;
	
	public GerenciadorHospital(String usuario,String senha) {
		this.usuario = usuario;
		this.senha = senha;
	}
	
	// Métodos de acesso.
	public String getUsuario() {
		return usuario;
	}

	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}
	
	public abstract String imprimir();
	
	
}
