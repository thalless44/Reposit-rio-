package controle;

import java.util.ArrayList;

import modelo.Funcionario;

public class FuncionarioDao {

	private ArrayList<Funcionario> GerenFun;
	private int Id;

	public static FuncionarioDao instancia;

	public static FuncionarioDao getInstancia() {

		if (instancia == null) {
			instancia = new FuncionarioDao();

		}
		return instancia;
	}

	private FuncionarioDao() {
		this.GerenFun = new ArrayList<>();
		this.Id = 0;

	}

	public int inserir(Funcionario funcionario) {

		if (funcionario != null) {
			funcionario.setID(Id);
			Id = Id + 1; // Incrementar
			GerenFun.add(funcionario);
		}

		return funcionario.getID();

	}

	public ArrayList<Funcionario> listar() {
		return this.GerenFun;

	}
	
	public Funcionario buscarPorId(int cod) {
		for (Funcionario funcionario : GerenFun) {
			if (funcionario.getID() == cod) {
				return funcionario;
			}
		}
		return null;
	}
	// Método de excluir
	public boolean remover(Funcionario funcionario) {
		boolean verifica = GerenFun.remove(funcionario);
		return verifica;
	}
	
	
	

}
