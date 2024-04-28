package Pratica_10;

public class Veiculo {
	private String numeroChassi;
    private String placa;
    private String marca;
    private String modelo;
    private String ano;
    
    public Veiculo(String numeroChassi, String placa, String marca, String modelo, String ano) {
        this.numeroChassi = numeroChassi;
        this.placa = placa;
        this.marca = marca;
        this.modelo = modelo;
        this.ano = ano;
    }
    
    public String getNumeroChassi() {
        return numeroChassi;
    }

    public String getPlaca() {
        return placa;
    }

    public String getMarca() {
        return marca;
    }

    public String getModelo() {
        return modelo;
    }

    public String getAno() {
        return ano;
    }
    
    public void setNumeroChassi(String chassi) {
        this.numeroChassi = chassi;
    }
    
    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public void setAno(String ano) {
        this.ano = ano;
    }
}
