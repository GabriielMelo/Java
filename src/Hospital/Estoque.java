package Hospital;

import java.util.ArrayList;
import javax.swing.JOptionPane;


public class Estoque extends GerenciadorHospital {
	
private ArrayList vacina = new ArrayList<Estoque>();
private ArrayList droga = new ArrayList<Estoque>();

	public Estoque(String u, String s) {
		super(u,s);
		
	}
	
	@Override
	public String imprimir() {
		
		return this.toString();
	}
	
	public void addEstoque() {
		
	}
	public void removerEstoque() {
		
	}
	
	public ArrayList getVacina() {
		return vacina;
	}

	public void setVacina(ArrayList vacina) {
		this.vacina = vacina;
	}

	public ArrayList getDroga() {
		return droga;
	}

	public void setDroga(ArrayList droga) {
		this.droga = droga;
	}
	

}
