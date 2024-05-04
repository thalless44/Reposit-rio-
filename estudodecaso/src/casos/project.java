package casos;

import java.util.ArrayList;

import javax.swing.JOptionPane;

public class project {

	public static void main(String[] args) {
		
		int op1=0;
		while(op1 != 999) {
			String  numTxt = JOptionPane.showInputDialog("MENU.\n 1: CADASTRAR FUNCIONÁRIO.\n 2: INFORMAÇÃO DO FUNCIONÁRIO.\n 3 DEMITIR FUNCIONÁRIO.\n 4: LISTA DE FUNCIONÁRIOS.\n 5: PROCURAR UM FUNCIONÁRIO.\n 6: ATUALIZAR CADASTRO DE FUNCIONÁRIO.\n 7: SELECIONAR FUNCIONÁRIO.\n 8: RETIRAR FUNCIONÁRIO DO MÊS.\n DIGITE O NUMERO DA OPÇÂO QUE DESEJÁ ");
			Integer op = Integer.valueOf(numTxt);
			
		switch (op) {
		
		case 1:
			
			ArrayList<Funcionario> funcionarios = new ArrayList<>();
			
			Funcionario Fun = new Funcionario();
			
			
			ArrayList<String> nome = new ArrayList<>();
			String nomes = JOptionPane.showInputDialog("Digite o nome do funcionario : ");
			nome.add(nomes);
			
			
			ArrayList<String> cpf = new ArrayList<>();
			String cpfs = JOptionPane.showInputDialog("Digite o cpf do funcionario : ");
			cpf.add(cpfs);
			
			ArrayList<String> Cargo = new ArrayList<>();
			String cargo =  JOptionPane.showInputDialog("Digite o cargo do funcionario");
			Cargo.add(cargo);
			
			ArrayList<String> dataContratacao = new ArrayList<>();
			String DataContratacao =  JOptionPane.showInputDialog("Digite a data do funcionario contratado");
			dataContratacao.add(DataContratacao);
			

			break;
		case 2:
			
	
			
			
			
			
			
			
			
			
			
			
		
		
			break;
		case 3:
		
		    String nomeDemitir = JOptionPane.showInputDialog("Digite o nome do funcionario a demitir:");
		    boolean funcionarioEncontrado = false;
		    
		    for (int i = 0; i < funcionarios.size(); i++) {
		        Funcionario funcionario = funcionarios.get(i);
		        
		        if (funcionario.getNome().equalsIgnoreCase(nomeDemitir)) {
		            funcionarios.remove(i);
		            JOptionPane.showMessageDialog(null, "Funcionario demitido com sucesso.");
		            funcionarioEncontrado = true;
		            break;
		        }
		    }
		    
		    if (!funcionarioEncontrado) {
		        JOptionPane.showMessageDialog(null, "Funcionario não encontrado.");
		    }
		    break;

			
			
			
			
			
		case 4:
			
		
		
		    String nomeBuscar = JOptionPane.showInputDialog("Digite o nome do funcionário:");
		    boolean funcionarioEncontrado = false;
		    String infoFuncionario = "";
		    
		    for (Funcionario funcionario : funcionarios) {
		        if (funcionario.getNome().equalsIgnoreCase(nomeBuscar)) {
		            infoFuncionario += "Nome: " + funcionario.getNome() + "\n";
		            infoFuncionario += "CPF: " + funcionario.getCPF() + "\n";
		            infoFuncionario += "Cargo: " + funcionario.getCargo() + "\n\n";
		            funcionarioEncontrado = true;
		            break;
		        }
		    }
		    
		    if (funcionarioEncontrado) {
		        JOptionPane.showMessageDialog(null, infoFuncionario, "Informaçoes do Funcionario", JOptionPane.INFORMATION_MESSAGE);
		    } else {
		        JOptionPane.showMessageDialog(null, "Funcionario não encontrado.", "Aviso", JOptionPane.WARNING_MESSAGE);
		    }
		    break;

			
			
		case 5:
			
			
			break;
		case 6:
			
			
			break;
		case 7:
		
		
			break;
		case 8:
			
			
			break;
		
				
		
		
		}

	}
		
	}
}
