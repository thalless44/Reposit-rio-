package visao;

import javax.swing.JOptionPane;

import controle.FuncionarioDao;
import modelo.Funcionario;

public class Project {
	static Funcionario funcionarioDoMes = null;

	public static void main(String[] args) {

		FuncionarioDao dao = FuncionarioDao.getInstancia(); // novo incremento


		int op1 = 0;
		while (op1 != 999) {
			String numTxt = JOptionPane.showInputDialog(
					"MENU.\n 1: CADASTRAR FUNCIONÁRIO.\n 2: INFORMAÇÃO DO FUNCIONÁRIO.\n 3: DEMITIR FUNCIONÁRIO.\n 4: LISTA DE FUNCIONÁRIOS.\n 5: PROCURAR UM FUNCIONÁRIO.\n 6: ATUALIZAR CARGO DE FUNCIONÁRIO.\n 7: SELECIONAR FUNCIONÁRIO DO MES.\n 8: RETIRAR FUNCIONÁRIO DO MÊS.\n 9: EXIBIR FUNCIONÁRIO DO MÊS.\n 10: SAIR.\n DIGITE O NUMERO DA OPÇÃO QUE DESEJA ");
			Integer op = Integer.valueOf(numTxt);

			switch (op) {

//   : 1- Linhas que pediam cod/ id
			// 2 - tirar o ArrayList

			case 1:
				Funcionario fun = new Funcionario();

				String nome = JOptionPane.showInputDialog("Digite o nome do funcionario : ");
				fun.setNome(nome);

				String cpf = JOptionPane.showInputDialog("Digite o cpf do funcionario : ");
				fun.setCPF(cpf);

				String cargo = JOptionPane.showInputDialog("Digite o cargo do funcionario");
				fun.setCargo(cargo);

				String data = JOptionPane.showInputDialog("Digite a data do funcionario contratado");
				fun.setDataContratacao(data);
				dao.inserir(fun);

				break;

			case 2:
				String nomeExibir = JOptionPane.showInputDialog("Digite o nome do funcionário:");
				boolean funcionarioEncontradoInfo = false;
				String infoFuncionario = "";

				for (Funcionario funcionario : dao.listar()) {
					if (funcionario.getNome().equalsIgnoreCase(nomeExibir)) {
						infoFuncionario += "CPF: " + funcionario.getCPF() + "\n";
						infoFuncionario += "Cargo: " + funcionario.getCargo() + "\n";
						infoFuncionario += "Data de contratação: " + funcionario.getDataContratacao()
								+ "\n--------------------------------\n";
						funcionarioEncontradoInfo = true;
						break;
					}
				}

				if (funcionarioEncontradoInfo) {
					JOptionPane.showMessageDialog(null, infoFuncionario);
				} else {
					JOptionPane.showMessageDialog(null, "Funcionário não encontrado.");
				}

				break;
			case 3:
				String exibeCadastros = "";
				for (Funcionario funcionario : dao.listar()) {
					exibeCadastros += funcionario.getID() + " - " + funcionario.getNome() + "\n";
				}
				 String idExcluirString = JOptionPane.showInputDialog(exibeCadastros +"Digite o ID do funcionário que deseja excluir:");
				    int idExcluir = Integer.parseInt(idExcluirString);
				    
				    Funcionario excluido = dao.excluirPorId(idExcluir);
				    if (excluido != null) {
				        JOptionPane.showMessageDialog(null, "Funcionário removido com sucesso.");
				    } else {
				        JOptionPane.showMessageDialog(null, "Não foi possível remover o funcionário.");
				    }
				    break;

			case 4:
				String infoFuncionarios = "";
				for (Funcionario funcionario : dao.listar()) {
					infoFuncionarios += "Nome: " + funcionario.getNome() + "\n";
				}
				JOptionPane.showMessageDialog(null, infoFuncionarios);
				break;

			case 5:
				nome = JOptionPane.showInputDialog("Digite o nome do funcionario que deseja encontrar:");

				boolean funcionarioEncontradoProcurar = false;

				for (Funcionario funcionario : dao.listar()) {
					if (funcionario.getNome().equalsIgnoreCase(nome)) {
						funcionarioEncontradoProcurar = true;
						break;
					}
				}

				if (funcionarioEncontradoProcurar) {
					JOptionPane.showMessageDialog(null, "Funcionario encontrado com sucesso.");
				} else {
					JOptionPane.showMessageDialog(null, "Funcionario nao encontrado.");
				}

				break;


			case 6:
				exibeCadastros = "";
				for (Funcionario funcionario : dao.listar()) {
					exibeCadastros += funcionario.getID() + " - " + funcionario.getNome() + "\n";
				}
			    String idString = JOptionPane.showInputDialog(exibeCadastros +"Digite o ID do funcionário que deseja atualizar o cargo:");
			    int idAtualizar = Integer.parseInt(idString);
			    
			    Funcionario funcionarioParaAtualizar = dao.buscarPorId(idAtualizar);
			    if (funcionarioParaAtualizar != null) {
			        String novoCargo = JOptionPane.showInputDialog("Digite o novo cargo:");
			        funcionarioParaAtualizar.setCargo(novoCargo);
			        boolean atualizado = dao.atualizarCargo(funcionarioParaAtualizar);
			        if (atualizado) {
			            JOptionPane.showMessageDialog(null, "Cargo do funcionário atualizado com sucesso.");
			        } else {
			            JOptionPane.showMessageDialog(null, "Erro ao atualizar o cargo do funcionário.");
			        }
			    } else {
			        JOptionPane.showMessageDialog(null, "Funcionário com o ID fornecido não encontrado.");
			    }
			    break;

			case 7:
				exibeCadastros = "";
				for (Funcionario funcionario : dao.listar()) {
					exibeCadastros += funcionario.getID() + " - " + funcionario.getNome() + "\n";
				}
				String nomeSelecionar = JOptionPane.showInputDialog(exibeCadastros +"funcionario do mês:");
				for (Funcionario funcionario : dao.listar()) {
					if (funcionario.getNome().equalsIgnoreCase(nomeSelecionar)) {
						funcionarioDoMes = funcionario;
						JOptionPane.showMessageDialog(null,
								"Funcionario do mes selecionado: " + funcionarioDoMes.getNome());
						break;
					}
				}
				break;

			case 8:
				funcionarioDoMes = null;
				JOptionPane.showMessageDialog(null, "Funcionario do mes removido com sucesso.");
				break;

			case 9:
				if (funcionarioDoMes != null) {
					JOptionPane.showMessageDialog(null, "Funcionario do mes: " + funcionarioDoMes.getNome());
				} else {
					JOptionPane.showMessageDialog(null, "Nenhum funcionario do mes selecionado.");
				}
				break;

			case 10:
				op1 = 999;
				break;

			}
		}
	}
}
