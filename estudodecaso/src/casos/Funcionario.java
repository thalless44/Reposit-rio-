package casos;

public class Funcionario {

	private String nome;
	private String CPF;
	private String cargo;
	private Contrato contrato;



	public Contrato getDataContratacao() {
		return contrato;
	}

	public void setcontrato(Contrato contrato) {
		this.contrato = contrato;
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
