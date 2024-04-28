package Pratica_10;
import java.util.Scanner;
public class CadastrarExcluirAtualizarVeiculos {
    private Veiculo[] arrayVeiculos;
    private int quantidadeVeiculos = 0;
    Scanner entrada = new Scanner(System.in);

    public void cadastro() {
        System.out.println("Digite a quantidade de veículos deseja cadastrar: ");
        quantidadeVeiculos = entrada.nextInt();
        entrada.nextLine();

        arrayVeiculos = new Veiculo[quantidadeVeiculos];

        for (int i = 0; i < quantidadeVeiculos; i++) {
            System.out.println("Digite o número do chassi:");
            String numeroChassi = entrada.nextLine();

            System.out.println("Digite a placa:");
            String placa = entrada.nextLine();

            System.out.println("Digite a marca:");
            String marca = entrada.nextLine();

            System.out.println("Digite o modelo:");
            String modelo = entrada.nextLine();

            System.out.println("Digite o ano:");
            String ano = entrada.nextLine();

            Veiculo novoVeiculoCadastrado = new Veiculo(numeroChassi, placa, marca, modelo, ano);
            arrayVeiculos[i] = novoVeiculoCadastrado;
            System.out.println("Veículo cadastrado com sucesso!");
        } 
    }
    
    public void excluirPorChassi(String chassi) {
        for (int i = 0; i < quantidadeVeiculos; i++) {
            if (arrayVeiculos[i].getNumeroChassi().equalsIgnoreCase(chassi)) {
                // Se encontrado, remove o veículo do array
                for (int j = i; j < quantidadeVeiculos - 1; j++) {
                    arrayVeiculos[j] = arrayVeiculos[j + 1];
                }
                quantidadeVeiculos--;
                System.out.println("Veículo com o chassi " + chassi + " excluído com sucesso.");
                return;
            }
        }
        System.out.println("Veículo com o chassi " + chassi + " não encontrado.");
    }

    public void excluirPorPlaca(String placa) {
        for (int i = 0; i < quantidadeVeiculos; i++) {
            if (arrayVeiculos[i].getPlaca().equalsIgnoreCase(placa)) {
                // Se encontrado, remove o veículo do array
                for (int j = i; j < quantidadeVeiculos - 1; j++) {
                    arrayVeiculos[j] = arrayVeiculos[j + 1];
                }
                quantidadeVeiculos--;
                System.out.println("Veículo com a placa " + placa + " excluído com sucesso.");
                return;
            }
        }
        System.out.println("Veículo com a placa " + placa + " não encontrado.");
    }
    
    public void atualizarPorChassi(String chassi) {
        for (int i = 0; i < quantidadeVeiculos; i++) {
             arrayVeiculos[i].getNumeroChassi().equalsIgnoreCase(chassi);
                Scanner entrada = new Scanner(System.in);

                System.out.println("Digite a nova placa:");
                String novaPlaca = entrada.nextLine();

                System.out.println("Digite a nova marca:");
                String novaMarca = entrada.nextLine();

                System.out.println("Digite o novo modelo:");
                String novoModelo = entrada.nextLine();

                System.out.println("Digite o novo ano:");
                String novoAno = entrada.nextLine();

                // Atualiza as informações do veículo usando os métodos set da classe Veiculo
                arrayVeiculos[i].setPlaca(novaPlaca);
                arrayVeiculos[i].setMarca(novaMarca);
                arrayVeiculos[i].setModelo(novoModelo);
                arrayVeiculos[i].setAno(novoAno);

                System.out.println("Veículo com o chassi " + chassi + " atualizado com sucesso.");
                entrada.close(); // Fechar o scanner após o uso
                return;
            
        }
    }

    public void atualizarPorPlaca(String placa) {
        for (int i = 0; i < quantidadeVeiculos; i++) {
            arrayVeiculos[i].getPlaca().equalsIgnoreCase(placa);
                Scanner entrada = new Scanner(System.in);

                System.out.println("Digite o novo número do chassi:");
                String novoChassi = entrada.nextLine();

                System.out.println("Digite a nova marca:");
                String novaMarca = entrada.nextLine();

                System.out.println("Digite o novo modelo:");
                String novoModelo = entrada.nextLine();

                System.out.println("Digite o novo ano:");
                String novoAno = entrada.nextLine();

                // Atualiza as informações do veículo usando os métodos set da classe Veiculo
                arrayVeiculos[i].setNumeroChassi(novoChassi);
                arrayVeiculos[i].setMarca(novaMarca);
                arrayVeiculos[i].setModelo(novoModelo);
                arrayVeiculos[i].setAno(novoAno);

                System.out.println("Veículo com a placa " + placa + " atualizado com sucesso.");
                entrada.close(); // Fechar o scanner após o uso
                return;
            }
    }
    
    public void imprimirVeiculos() {
        System.out.println("\nVeículos cadastrados:");
        for (Veiculo veiculoCadastrado : arrayVeiculos) {
            System.out.println("\nNúmero do chassi: " + veiculoCadastrado.getNumeroChassi());
            System.out.println("Placa: " + veiculoCadastrado.getPlaca());
            System.out.println("Marca: " + veiculoCadastrado.getMarca());
            System.out.println("Modelo: " + veiculoCadastrado.getModelo());
            System.out.println("Ano: " + veiculoCadastrado.getAno());
        }
    }
    
    public Veiculo[] getArrayVeiculos() {
        return arrayVeiculos;
    }
}
