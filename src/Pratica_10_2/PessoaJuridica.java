package Pratica_10_2;

public class PessoaJuridica {
	private String nome;
    private String CNPJ;

    public PessoaJuridica(String nome, String CNPJ) {
        this.nome = nome;
        this.CNPJ = CNPJ;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCNPJ() {
        return CNPJ;
    }

    public void setCNPJ(String CNPJ) {
        this.CNPJ = CNPJ;
    }

    public String toString() {
        return "Nome: " + nome + ", CNPJ: " + CNPJ;
    }
}

