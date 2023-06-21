package Hospital;

public class Particular extends Paciente implements Diaria {

	private Float valorDiaria = 69.9f;
	private int diarias;

	public Particular(String n, String d, Double vc, Float valorDiaria, int diarias) {
		super(n, d, vc);
		this.valorDiaria = valorDiaria;
		this.diarias = diarias;
	}

	@Override
	public String imprimir() {

		return null;
	}

	@Override
	public Float calcCobrado() {

		return null;
	}

	public float totalDiaria() {

		return 0;
	}

	public Float getValorDiaria() {
		return valorDiaria;
	}

	public void setValorDiaria(Float valorDiaria) {
		this.valorDiaria = valorDiaria;
	}

	public int getDiarias() {
		return diarias;
	}

	public void setDiarias(int diarias) {
		this.diarias = diarias;
	}

}
