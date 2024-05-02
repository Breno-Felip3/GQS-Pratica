package Pratica_10_2;
import javax.swing.JOptionPane;
public class CadastrarPfPj {
	 public static void main(String[] args) {
        Cadastro cadastro = new Cadastro(100);

        int opcao;
        do {
            opcao = Integer.parseInt(JOptionPane.showInputDialog(
                    "Menu:\n1. Cadastrar Pessoa Física\n2. Cadastrar Pessoa Jurídica\n3. Imprimir cadastro\n4. Imprimir apenas pessoas físicas\n5. Imprimir apenas pessoas jurídicas\n6. Pesquisar pessoa\n7. Atualizar pessoa\n8. Excluir pessoa\n9. Sair"));

            switch (opcao) {
                case 1:
                    cadastrarPessoaFisica(cadastro);
                    break;
                case 2:
                    cadastrarPessoaJuridica(cadastro);
                    break;
                case 3:
                    cadastro.imprimirCadastro();
                    break;
                case 4:
                    cadastro.imprimirPessoasFisicas();
                    break;
                case 5:
                    cadastro.imprimirPessoasJuridicas();
                    break;
                case 6:
                    pesquisarPessoa(cadastro);
                    break;
                case 7:
                    atualizarPessoa(cadastro);
                    break;
                case 8:
                    excluirPessoa(cadastro);
                    break;
                case 9:
                    JOptionPane.showMessageDialog(null, "Saindo...");
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "Opção inválida.");
                    break;
            }
        } while (opcao != 9);
    }

    public static void cadastrarPessoaFisica(Cadastro cadastro) {
        String nome = JOptionPane.showInputDialog("Digite o nome da pessoa física:");
        String CPF = JOptionPane.showInputDialog("Digite o CPF:");
        cadastro.cadastrarPessoaFisica(nome, CPF);
    }

    public static void cadastrarPessoaJuridica(Cadastro cadastro) {
        String nome = JOptionPane.showInputDialog("Digite o nome da pessoa jurídica:");
        String CNPJ = JOptionPane.showInputDialog("Digite o CNPJ:");
        cadastro.cadastrarPessoaJuridica(nome, CNPJ);
    }

    public static void pesquisarPessoa(Cadastro cadastro) {
        String chave = JOptionPane.showInputDialog("Digite o CPF ou CNPJ da pessoa:");
        cadastro.pesquisarPessoa(chave);
    }

    public static void atualizarPessoa(Cadastro cadastro) {
        String chave = JOptionPane.showInputDialog("Digite o CPF ou CNPJ da pessoa a ser atualizada:");
        String novoNome = JOptionPane.showInputDialog("Digite o novo nome:");
        String novoCPF_CNPJ = JOptionPane.showInputDialog("Digite o novo CPF ou CNPJ:");
        cadastro.atualizarPessoa(chave, novoNome, novoCPF_CNPJ);
    }

    public static void excluirPessoa(Cadastro cadastro) {
        String chave = JOptionPane.showInputDialog("Digite o CPF ou CNPJ da pessoa a ser excluída:");
        cadastro.excluirPessoa(chave);
    }
}
