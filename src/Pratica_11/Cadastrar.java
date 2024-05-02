package Pratica_11;
import javax.swing.JOptionPane;
public class Cadastrar {
	private static Cadastro cadastro = new Cadastro(100);
    public static void main(String[] args) {
        int opcao;

        do {
            opcao = Integer.parseInt(JOptionPane.showInputDialog(
                    "Menu:\n1. Cadastrar Pessoa Física\n2. Cadastrar Pessoa Jurídica\n3. Imprimir cadastro\n4. Imprimir apenas pessoas físicas\n5. Imprimir apenas pessoas jurídicas\n6. Pesquisar pessoa\n7. Atualizar pessoa\n8. Excluir pessoa\n9. Sair"));

            switch (opcao) {
                case 1:
                    cadastrarPessoaFisica();
                    break;
                case 2:
                    cadastrarPessoaJuridica();
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
                    pesquisarPessoa();
                    break;
                case 7:
                    atualizarPessoa();
                    break;
                case 8:
                    excluirPessoa();
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

    public static void cadastrarPessoaFisica() {
        PessoaFisica pessoa = new PessoaFisica();
        pessoa.setNome(JOptionPane.showInputDialog("Nome:"));
        pessoa.setCpf(JOptionPane.showInputDialog("CPF:"));
        cadastro.cadastrarPessoa(pessoa);
    }

    public static void cadastrarPessoaJuridica() {
        PessoaJuridica pessoa = new PessoaJuridica();
        pessoa.setNome(JOptionPane.showInputDialog("Nome:"));
        pessoa.setCnpj(JOptionPane.showInputDialog("CNPJ:"));
        cadastro.cadastrarPessoa(pessoa);
    }

    public static void pesquisarPessoa() {
        String documento = JOptionPane.showInputDialog("Digite o CPF ou CNPJ da pessoa:");
        cadastro.pesquisarPessoa(documento);
    }

    public static void atualizarPessoa() {
        String documento = JOptionPane.showInputDialog("Digite o CPF ou CNPJ da pessoa a ser atualizada:");
        String novoNome = JOptionPane.showInputDialog("Digite o novo nome:");
        cadastro.atualizarPessoa(documento, novoNome);
    }

    public static void excluirPessoa() {
        String documento = JOptionPane.showInputDialog("Digite o CPF ou CNPJ da pessoa a ser excluída:");
        cadastro.excluirPessoa(documento);
    }
}
