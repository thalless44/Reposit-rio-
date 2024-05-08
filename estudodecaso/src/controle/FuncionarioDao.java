package controle;

import java.util.ArrayList;

import modelo.Funcionario;

public class FuncionarioDao {
	
	private ArrayList<Funcionario> GerenFun;
	private int Id;
	
	public FuncionarioDao() {
		this.GerenFun = new ArrayList<>();
		this.Id = 0;
		
	}
	
	
	
	public int inserir(Funcionario funcionario) {
		
		if(funcionario!=null) {
			funcionario.setID(Id);
			Id = Id + 1; //Incrementar
			GerenFun.add(funcionario);
		}
		
		return funcionario.getID();
		
		
		
	}
	public ArrayList<Funcionario> listar(){
		return this.GerenFun;
		
		
	}
	
}
