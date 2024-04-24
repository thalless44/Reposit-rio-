package casos;

public class Funcionario {

	private String nome;
	private String CPF;
	private String cargo;
	private Contrato dataContratacao;



	public Contrato getDataContratacao() {
		return dataContratacao;
	}

	public void setDataContratacao(Contrato dataContratacao) {
		this.dataContratacao = dataContratacao;
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
		CPF = CPF;
	}

	public String getCargo() {
		return cargo;
	}

	public void setCargo(String cargo) {
		this.cargo = cargo;
	}

}
