package Hospital;

public class Funcionario extends GerenciadorHospital{
	
	public String nome;
	protected int cracha;
	public String cargo;
	
	public Funcionario(String u,String s,String nome, 
			int cracha,String cargo) {
		super(u,s);
		this.nome = nome;
		this.cracha = cracha;
		this.cargo = cargo;
	}
	
	protected boolean Login(String u,String s) {
		
		
		return
	}
	
	public void Cadastro(Funcionario Funcionario) {
		
		
	}

	public String imprimir() {
		return this.toString();
	}

	
}
