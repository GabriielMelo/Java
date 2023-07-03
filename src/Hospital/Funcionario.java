package Hospital;

import javax.swing.JOptionPane;

public class Funcionario implements Login {

	public String nome;
	protected int cracha;
	private String senha;
	public String cargo;

	public Funcionario(String nome,
			int cracha, String cargo) {
		this.nome = nome;
		this.cracha = cracha;
		this.cargo = cargo;
		
	}
	public Funcionario(){

	}

	public void login(String usuario, String senha) {
		String aux_usuario = "";
		String aux_senha = "";
		JOptionPane.showMessageDialog(null, "Bem vindo");
		while (true) {
			aux_usuario = JOptionPane.showInputDialog("Digite o usuario");
			if (!aux_usuario.equals(this.nome)) {
				JOptionPane.showMessageDialog(null, "Usuário Inválido");
				break;
			}
		}
		while (true) {
			aux_senha = JOptionPane.showInputDialog("Digite a senha");
			if (!aux_senha.equals(this.senha)) {
				JOptionPane.showMessageDialog(null, "Senha Inválida");

			} else {
				JOptionPane.showMessageDialog(null, "Acesso Autorizado");
			}
		}
		
	}

	public void Cadastro() {
		int aux = 0;
		this.nome = JOptionPane.showInputDialog(null, "Digite o nome do funcionário");
		this.cargo = JOptionPane.showInputDialog(null, "Digite o Cargo ");
		while (true) {
			this.senha = JOptionPane.showInputDialog(null, "Crie uma senha de 6 digitos numericos\n");
			if (this.senha.length() != 6) {
				JOptionPane.showMessageDialog(null, "senha deve conter 6 digitos");
			} else {
				try {
					while (true) {
						aux = Integer.parseInt(this.senha);
					}
				} catch (NumberFormatException e) {
					JOptionPane.showMessageDialog(null, "Digite apenas numeros");
				}
			}
			this.senha = Integer.toString(aux);
		}
	}

	public static void main(String[] args) {
		// this.nome = nome;
		// this.cracha = cracha;
		// this.cargo = cargo;
		// this.senha = senha;
		
		Funcionario f1 = new Funcionario();

		
		

	}

}
