package Pratica_10_2;
import javax.swing.JOptionPane;
public class Cadastro {
	private PessoaFisica[] pessoasFisicas;
    private PessoaJuridica[] pessoasJuridicas;
    private int totalPessoasFisicas;
    private int totalPessoasJuridicas;

    public Cadastro(int tamanhoMaximo) {
        pessoasFisicas = new PessoaFisica[tamanhoMaximo];
        pessoasJuridicas = new PessoaJuridica[tamanhoMaximo];
        totalPessoasFisicas = 0;
        totalPessoasJuridicas = 0;
    }

    public void cadastrarPessoaFisica(String nome, String CPF) {
        PessoaFisica pessoaFisica = new PessoaFisica(nome, CPF);
        pessoasFisicas[totalPessoasFisicas] = pessoaFisica;
        totalPessoasFisicas++;
    }

    public void cadastrarPessoaJuridica(String nome, String CNPJ) {
        PessoaJuridica pessoaJuridica = new PessoaJuridica(nome, CNPJ);
        pessoasJuridicas[totalPessoasJuridicas] = pessoaJuridica;
        totalPessoasJuridicas++;
    }

    public void imprimirCadastro() {
        StringBuilder mensagem = new StringBuilder("Pessoas Físicas cadastradas:\n");
        for (int i = 0; i < totalPessoasFisicas; i++) {
            mensagem.append(pessoasFisicas[i]).append("\n");
        }
        mensagem.append("\n\nPessoas Jurídicas cadastradas:\n");
        for (int i = 0; i < totalPessoasJuridicas; i++) {
            mensagem.append(pessoasJuridicas[i]).append("\n");
        }
        JOptionPane.showMessageDialog(null, mensagem.toString());
    }

    public void imprimirPessoasFisicas() {
        StringBuilder mensagem = new StringBuilder("Pessoas Físicas cadastradas:\n");
        for (int i = 0; i < totalPessoasFisicas; i++) {
            mensagem.append(pessoasFisicas[i]).append("\n");
        }
        JOptionPane.showMessageDialog(null, mensagem.toString());
    }

    public void imprimirPessoasJuridicas() {
        StringBuilder mensagem = new StringBuilder("Pessoas Jurídicas cadastradas:\n");
        for (int i = 0; i < totalPessoasJuridicas; i++) {
            mensagem.append(pessoasJuridicas[i]).append("\n");
        }
        JOptionPane.showMessageDialog(null, mensagem.toString());
    }

    public void pesquisarPessoa(String chave) {
        boolean encontrado = false;
        for (int i = 0; i < totalPessoasFisicas; i++) {
            PessoaFisica pessoaFisica = pessoasFisicas[i];
            if (pessoaFisica.getCPF().equals(chave)) {
                JOptionPane.showMessageDialog(null, "Pessoa Física encontrada:\n" + pessoaFisica);
                encontrado = true;
                break;
            }
        }
        for (int i = 0; i < totalPessoasJuridicas; i++) {
            PessoaJuridica pessoaJuridica = pessoasJuridicas[i];
            if (pessoaJuridica.getCNPJ().equals(chave)) {
                JOptionPane.showMessageDialog(null, "Pessoa Jurídica encontrada:\n" + pessoaJuridica);
                encontrado = true;
                break;
            }
        }
        if (!encontrado) {
            JOptionPane.showMessageDialog(null, "Pessoa não encontrada.");
        }
    }

    public void atualizarPessoa(String chave, String novoNome, String novoCPF_CNPJ) {
        for (int i = 0; i < totalPessoasFisicas; i++) {
            PessoaFisica pessoaFisica = pessoasFisicas[i];
            if (pessoaFisica.getCPF().equals(chave)) {
                pessoaFisica.setNome(novoNome);
                pessoaFisica.setCPF(novoCPF_CNPJ);
                JOptionPane.showMessageDialog(null, "Pessoa Física atualizada com sucesso.");
                return;
            }
        }
        for (int i = 0; i < totalPessoasJuridicas; i++) {
            PessoaJuridica pessoaJuridica = pessoasJuridicas[i];
            if (pessoaJuridica.getCNPJ().equals(chave)) {
                pessoaJuridica.setNome(novoNome);
                pessoaJuridica.setCNPJ(novoCPF_CNPJ);
                JOptionPane.showMessageDialog(null, "Pessoa Jurídica atualizada com sucesso.");
                return;
            }
        }
        JOptionPane.showMessageDialog(null, "Pessoa não encontrada.");
    }

    public void excluirPessoa(String chave) {
        for (int i = 0; i < totalPessoasFisicas; i++) {
            PessoaFisica pessoaFisica = pessoasFisicas[i];
            if (pessoaFisica.getCPF().equals(chave)) {
                for (int j = i; j < totalPessoasFisicas - 1; j++) {
                    pessoasFisicas[j] = pessoasFisicas[j + 1];
                }
                totalPessoasFisicas--;
                JOptionPane.showMessageDialog(null, "Pessoa Física excluída com sucesso.");
                return;
            }
        }
        for (int i = 0; i < totalPessoasJuridicas; i++) {
            PessoaJuridica pessoaJuridica = pessoasJuridicas[i];
            if (pessoaJuridica.getCNPJ().equals(chave)) {
                for (int j = i; j < totalPessoasJuridicas - 1; j++) {
                    pessoasJuridicas[j] = pessoasJuridicas[j + 1];
                }
                totalPessoasJuridicas--;
                JOptionPane.showMessageDialog(null, "Pessoa Jurídica excluída com sucesso.");
                return;
            }
        }
        JOptionPane.showMessageDialog(null, "Pessoa não encontrada.");
    }
}
