package visao;

import java.util.ArrayList;
import javax.swing.JOptionPane;

import controle.FuncionarioDao;
import modelo.Funcionario;

public class project {
	static Funcionario funcionarioDoMes = null;
    public static void main(String[] args) {
    FuncionarioDao dao = new FuncionarioDao(); //novo incremento
    
    
        ArrayList<Funcionario> funcionarios = new ArrayList<>();

        int op1 = 0;
        while (op1 != 999) {
            String numTxt = JOptionPane.showInputDialog("MENU.\n 1: CADASTRAR FUNCIONÁRIO.\n 2: INFORMAÇÃO DO FUNCIONÁRIO.\n 3: DEMITIR FUNCIONÁRIO.\n 4: LISTA DE FUNCIONÁRIOS.\n 5: PROCURAR UM FUNCIONÁRIO.\n 6: ATUALIZAR CARGO DE FUNCIONÁRIO.\n 7: SELECIONAR FUNCIONÁRIO DO MES.\n 8: RETIRAR FUNCIONÁRIO DO MÊS.\n 9: EXIBIR FUNCIONÁRIO DO MÊS.\n 10: SAIR.\n DIGITE O NUMERO DA OPÇÃO QUE DESEJA ");
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
              
                    funcionarios.add(fun);
                    
                    Funcionario f = new Funcionario();
                    f.setNome("jao");
                     
                    
                    //substituir o lista.add pela 
                    
                    dao.inserir(f);
                    
                    for(Funcionario fun1 : dao.listar()) {
                    	
                    }
                    
                    break;

                case 2:
                    String nomeExibir = JOptionPane.showInputDialog("Digite o nome do funcionário:");
                    boolean funcionarioEncontradoInfo = false;
                    String infoFuncionario = "";

                    for (Funcionario funcionario : funcionarios) {
                        if (funcionario.getNome().equalsIgnoreCase(nomeExibir)) {
                            infoFuncionario += "CPF: " + funcionario.getCPF() + "\n";
                            infoFuncionario += "Cargo: " + funcionario.getCargo() + "\n";
                            infoFuncionario += "Data de contratação: " + funcionario.getDataContratacao() + "\n--------------------------------\n";
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
                    String nomeDemitir = JOptionPane.showInputDialog("Digite o nome do funcionario a demitir:");
                    boolean funcionarioEncontradoDemitir = false;

                    for (int i = 0; i < funcionarios.size(); i++) {
                        Funcionario funcionario = funcionarios.get(i);

                        if (funcionario.getNome().equalsIgnoreCase(nomeDemitir)) {
                            funcionarios.remove(i);
                            JOptionPane.showMessageDialog(null, "Funcionario demitido com sucesso.");
                            funcionarioEncontradoDemitir = true;
                            break;
                        }
                    }

                    if (!funcionarioEncontradoDemitir) {
                        JOptionPane.showMessageDialog(null, "Funcionario não encontrado.");
                    }
                    break;

                case 4:
                    String infoFuncionarios = "";
                    for (Funcionario funcionario : funcionarios) {
                        infoFuncionarios += "Nome: " + funcionario.getNome() + "\n";
                       }
                    JOptionPane.showMessageDialog(null,infoFuncionarios);
                    break;

                case 5:
                    String nomeProcurar = JOptionPane.showInputDialog("Digite o nome do funcionario que deseja encontrar:");
                    boolean funcionarioEncontradoProcurar = false;

                    for (Funcionario funcionario : funcionarios) {
                        if (funcionario.getNome().equalsIgnoreCase(nomeProcurar)) {
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
                    String nomeAtualizar = JOptionPane.showInputDialog("Digite o nome do funcionario que deseja atualizar:");
                    boolean funcionarioEncontradoAtualizar = false;

                    for (Funcionario funcionario : funcionarios) {
                        if (funcionario.getNome().equalsIgnoreCase(nomeAtualizar)) {
                            String novoCargo = JOptionPane.showInputDialog("Digite o novo cargo:");
                            funcionario.setCargo(novoCargo);
                            JOptionPane.showMessageDialog(null, "Cargo atualizado com sucesso.");
                            funcionarioEncontradoAtualizar = true;
                            break;
                        }
                    }

                    if (!funcionarioEncontradoAtualizar) {
                        JOptionPane.showMessageDialog(null, "Funcionario nao encontrado.");
                    }

                    break;

                case 7:
                    String nomeSelecionar = JOptionPane.showInputDialog("funcionario do mês:");
                    for (Funcionario funcionario : funcionarios) {
                        if (funcionario.getNome().equalsIgnoreCase(nomeSelecionar)) {
                            funcionarioDoMes = funcionario;
                            JOptionPane.showMessageDialog(null, "Funcionario do mes selecionado: " + funcionarioDoMes.getNome());
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
