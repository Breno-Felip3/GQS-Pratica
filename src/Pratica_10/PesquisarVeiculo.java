package Pratica_10;

public class PesquisarVeiculo {
    private CadastrarExcluirAtualizarVeiculos cadastrarVeiculos; // Adiciona uma referência à classe CadastrarVeiculos

    public PesquisarVeiculo(CadastrarExcluirAtualizarVeiculos cadastrarVeiculos) {
        this.cadastrarVeiculos = cadastrarVeiculos;
    }

    public Veiculo pesquisaPorChassi(String chassi) {
        // Obtém o array de veículos da classe CadastrarVeiculos
        Veiculo[] arrayVeiculos = cadastrarVeiculos.getArrayVeiculos();

        if (arrayVeiculos != null) {
            for (Veiculo veiculoCadastrado : arrayVeiculos) {
                if (veiculoCadastrado.getNumeroChassi().equalsIgnoreCase(chassi)) {
                    return veiculoCadastrado;
                }
            }
        }
        return null;
    }

    public Veiculo pesquisarPorPlaca(String placa) {
        // Obtém o array de veículos da classe CadastrarVeiculos
        Veiculo[] arrayVeiculos = cadastrarVeiculos.getArrayVeiculos();

        if (arrayVeiculos != null) {
            for (Veiculo veiculo : arrayVeiculos) {
                if (veiculo.getPlaca().equalsIgnoreCase(placa)) {
                    return veiculo;
                }
            }
        }
        return null; // Retorna null se o veículo não for encontrado
    }
}
