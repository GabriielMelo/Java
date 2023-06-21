package Hospital;

public abstract class Paciente  {
	

	private String nome;
	private String documento;
	private double valorCobrado;
	
	public abstract String imprimir();
	public abstract Float calcCobrado();
	
	public Paciente(String n,String d, Double vc) {
		this.nome = n;
		this.documento = d;
		this.valorCobrado = vc;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getDocumento() {
		return documento;
	}

	public void setDocumento(String documento) {
		this.documento = documento;
	}

	public double getValorCobrado() {
		return valorCobrado;
	}

	public void setValorCobrado(double valorCobrado) {
		this.valorCobrado = valorCobrado;
	}
	
}
