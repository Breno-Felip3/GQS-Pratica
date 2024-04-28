package Pratica_10;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        CadastrarExcluirAtualizarVeiculos cadastroVeiculo = new CadastrarExcluirAtualizarVeiculos();
        PesquisarVeiculo ArrayVeiculos = new PesquisarVeiculo(cadastroVeiculo);
    	Scanner entrada = new Scanner(System.in);
     	String chassiPesquisa;
     	String placaPesquisa;
     	int escolha;
        
        // Chama o método para cadastrar um veículo
     	cadastroVeiculo.cadastro(); 
     	cadastroVeiculo.imprimirVeiculos();
        
        // Pesquisar veiculo por chassi
    	System.out.println("Informe 1 para pesquisar por chassi ou 2 para pesquisar por placa:");
    	escolha = entrada.nextInt();
    	
    	switch (escolha) {
    		case 1:
    			
				System.out.println("Informe o chassi para a pesquisa: ");
				chassiPesquisa = entrada.next();
				Veiculo veiculoChassi = ArrayVeiculos.pesquisaPorChassi(chassiPesquisa);
		         
				if (veiculoChassi != null) {
					System.out.println("\nVeículo encontrado:");
					System.out.println("\nNúmero do chassi: " + veiculoChassi.getNumeroChassi());
					System.out.println("Placa: " + veiculoChassi.getPlaca());
					System.out.println("Marca: " + veiculoChassi.getMarca());
					System.out.println("Modelo: " + veiculoChassi.getModelo());
					System.out.println("Ano: " + veiculoChassi.getAno());
					
					System.out.println("1 - Excluir o veiculo\n 2 - Atualizar o veiculo");
					int opcao = entrada.nextInt();
					switch (opcao) {
					    case 1:
					        cadastroVeiculo.excluirPorPlaca(chassiPesquisa);
					        break;
					    case 2:
					    	cadastroVeiculo.atualizarPorPlaca(chassiPesquisa);
					    	cadastroVeiculo.imprimirVeiculos();
					        break;
					    default:
					    	System.out.println("Opção inválida!");
					        break;
					}	 
				} 
				else 
				{
	             System.out.println("Veículo não encontrado com o chassi fornecido.");
				}
		         break;
    		case 2:
    			
    			System.out.println("Informe a placa para a pesquisa: ");
    			placaPesquisa = entrada.next();
    			Veiculo veiculoPlaca = ArrayVeiculos.pesquisarPorPlaca(placaPesquisa);
    			if (veiculoPlaca != null) {
					System.out.println("\nVeículo encontrado:");
					System.out.println("\nNúmero do chassi: " + veiculoPlaca.getNumeroChassi());
					System.out.println("Placa: " + veiculoPlaca.getPlaca());
					System.out.println("Marca: " + veiculoPlaca.getMarca());
					System.out.println("Modelo: " + veiculoPlaca.getModelo());
					System.out.println("Ano: " + veiculoPlaca.getAno());
					
					System.out.println("1 - Excluir o veiculo\n 2 - Atualizar o veiculo");
					int opcao = entrada.nextInt();
					switch (opcao) {
					    case 1:
					        cadastroVeiculo.excluirPorPlaca(placaPesquisa);
					        break;
					    case 2:
					    	cadastroVeiculo.atualizarPorPlaca(placaPesquisa);
					    	cadastroVeiculo.imprimirVeiculos();
					        break;
					    default:
					    	System.out.println("Opção inválida!");
					        break;
					}
				} 
				else 
				{
	             System.out.println("Veículo não encontrado com o chassi fornecido.");
				}
		         break;
		    default:
		    	System.out.println("Opção inválida.");
	         	break;
    	}  
    	
        entrada.close();
    }
}
