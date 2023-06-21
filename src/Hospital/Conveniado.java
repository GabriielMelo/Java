package Hospital;

public class Conveniado extends Paciente{
	
	private String convenio;
	
	public Conveniado(String n,String d, Double v,String convenio) {
		super(n,d,v);
		this.convenio = convenio;
	}
	
	public String getConvenio() {
		return convenio;
	}

	public void setConvenio(String convenio) {
		this.convenio = convenio;
	}

	@Override
	public String imprimir() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Float calcCobrado() {
		// TODO Auto-generated method stub
		return null;
	}
	
	

}
