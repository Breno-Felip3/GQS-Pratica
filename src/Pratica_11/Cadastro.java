package Pratica_11;
import javax.swing.JOptionPane;
public class Cadastro {
	  private Pessoa[] pessoas;
	    private int quantidade;

	    public Cadastro(int tamanho) {
	        pessoas = new Pessoa[tamanho];
	        quantidade = 0;
	    }

	    public void cadastrarPessoa(Pessoa pessoa) {
	        if (quantidade < pessoas.length) {
	            pessoas[quantidade] = pessoa;
	            quantidade++;
	            JOptionPane.showMessageDialog(null, "Pessoa cadastrada com sucesso!");
	        } else {
	            JOptionPane.showMessageDialog(null, "Cadastro está cheio!");
	        }
	    }

	    public void imprimirCadastro() {
	        StringBuilder output = new StringBuilder();
	        for (int i = 0; i < quantidade; i++) {
	            output.append("Nome: ").append(pessoas[i].getNome()).append("\n");
	            if (pessoas[i] instanceof PessoaFisica) {
	                output.append("CPF: ").append(((PessoaFisica) pessoas[i]).getCpf()).append("\n\n");
	            } else if (pessoas[i] instanceof PessoaJuridica) {
	                output.append("CNPJ: ").append(((PessoaJuridica) pessoas[i]).getCnpj()).append("\n\n");
	            }
	        }
	        JOptionPane.showMessageDialog(null, output.toString());
	    }

	    public void imprimirPessoasFisicas() {
	        StringBuilder output = new StringBuilder();
	        for (int i = 0; i < quantidade; i++) {
	            if (pessoas[i] instanceof PessoaFisica) {
	                output.append("Nome: ").append(pessoas[i].getNome()).append("\n");
	                output.append("CPF: ").append(((PessoaFisica) pessoas[i]).getCpf()).append("\n\n");
	            }
	        }
	        JOptionPane.showMessageDialog(null, output.toString());
	    }

	    public void imprimirPessoasJuridicas() {
	        StringBuilder output = new StringBuilder();
	        for (int i = 0; i < quantidade; i++) {
	            if (pessoas[i] instanceof PessoaJuridica) {
	                output.append("Nome: ").append(pessoas[i].getNome()).append("\n");
	                output.append("CNPJ: ").append(((PessoaJuridica) pessoas[i]).getCnpj()).append("\n\n");
	            }
	        }
	        JOptionPane.showMessageDialog(null, output.toString());
	    }

	    public void pesquisarPessoa(String documento) {
	        StringBuilder output = new StringBuilder();
	        boolean encontrou = false;
	        for (int i = 0; i < quantidade; i++) {
	            if (pessoas[i] instanceof PessoaFisica && ((PessoaFisica) pessoas[i]).getCpf().equals(documento)) {
	                output.append("Nome: ").append(pessoas[i].getNome()).append("\n");
	                output.append("CPF: ").append(((PessoaFisica) pessoas[i]).getCpf()).append("\n\n");
	                encontrou = true;
	            } else if (pessoas[i] instanceof PessoaJuridica
	                    && ((PessoaJuridica) pessoas[i]).getCnpj().equals(documento)) {
	                output.append("Nome: ").append(pessoas[i].getNome()).append("\n");
	                output.append("CNPJ: ").append(((PessoaJuridica) pessoas[i]).getCnpj()).append("\n\n");
	                encontrou = true;
	            }
	        }
	        if (!encontrou) {
	            JOptionPane.showMessageDialog(null, "Pessoa não encontrada.");
	        } else {
	            JOptionPane.showMessageDialog(null, output.toString());
	        }
	    }

	    public void atualizarPessoa(String documento, String novoNome) {
	        for (int i = 0; i < quantidade; i++) {
	            if (pessoas[i] instanceof PessoaFisica && ((PessoaFisica) pessoas[i]).getCpf().equals(documento)) {
	                pessoas[i].setNome(novoNome);
	                JOptionPane.showMessageDialog(null, "Pessoa atualizada com sucesso!");
	                return;
	            } else if (pessoas[i] instanceof PessoaJuridica
	                    && ((PessoaJuridica) pessoas[i]).getCnpj().equals(documento)) {
	                pessoas[i].setNome(novoNome);
	                JOptionPane.showMessageDialog(null, "Pessoa atualizada com sucesso!");
	                return;
	            }
	        }
	        JOptionPane.showMessageDialog(null, "Pessoa não encontrada.");
	    }

	    public void excluirPessoa(String documento) {
	        for (int i = 0; i < quantidade; i++) {
	            if (pessoas[i] instanceof PessoaFisica && ((PessoaFisica) pessoas[i]).getCpf().equals(documento)) {
	                pessoas[i] = null;
	                rearranjarCadastro(i);
	                quantidade--;
	                JOptionPane.showMessageDialog(null, "Pessoa excluída com sucesso!");
	                return;
	            } else if (pessoas[i] instanceof PessoaJuridica
	                    && ((PessoaJuridica) pessoas[i]).getCnpj().equals(documento)) {
	                pessoas[i] = null;
	                rearranjarCadastro(i);
	                quantidade--;
	                JOptionPane.showMessageDialog(null, "Pessoa excluída com sucesso!");
	                return;
	            }
	        }
	        JOptionPane.showMessageDialog(null, "Pessoa não encontrada.");
	    }

	    private void rearranjarCadastro(int index) {
	        for (int i = index; i < quantidade - 1; i++) {
	            pessoas[i] = pessoas[i + 1];
	        }
	    }
	}
