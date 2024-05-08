package modelo;

public class Funcionario {
    
	private String nome;
	private String CPF;
	private String cargo;
	private String dataContratacao;
    private int ID;

	public int getID() {
		return ID;
	}

	public void setID(int iD) {
		ID = iD;
	}

	public String getDataContratacao() {
		return dataContratacao;
	}

	public void setDataContratacao(String data) {
		this.dataContratacao = data;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCPF() {
		return CPF;
	}

	public void setCPF(String CPF) {
		this.CPF = CPF;
	}

	public String getCargo() {
		return cargo;
	}

	public void setCargo(String cargo) {
		this.cargo = cargo;
	}

}
