package usoDaBolsa;

import java.util.InputMismatchException;
import java.util.Scanner;

import bolsa.Bolsa;
import ferramentas.*;

public class UsandoABolsa {

    private Bolsa bolsa;

    public UsandoABolsa() {
        bolsa = new Bolsa();
    }

    public static void main(String[] args) {
        UsandoABolsa caixa = new UsandoABolsa();
        Scanner s = new Scanner(System.in);
        int opcao;

        do {
            System.out.println("\n=== MENU BOLSA DE FERRAMENTAS ===");
            System.out.println("1 - Mostrar itens");
            System.out.println("2 - Adicionar item");
            System.out.println("3 - Retirar item");
            System.out.println("4 - Organizar por peso");
            System.out.println("5 - Organizar por tamanho");
            System.out.println("0 - Sair");
            System.out.print("Escolha uma opção: ");

            try {
                opcao = s.nextInt();
                s.nextLine(); // consumir linha
            } catch (InputMismatchException e) {
                System.out.println("Entrada inválida! Digite apenas números inteiros.");
                s.nextLine();
                opcao = -1;
            }

            switch (opcao) {
                case 1:
                    caixa.bolsa.listarFerramentas();
                    break;
                case 2:
                    caixa.adicionarItemMenu(s);
                    break;
                case 3:
                    caixa.retirarItemMenu(s);
                    break;
                case 4:
                    caixa.bolsa.organizarPorPeso();
                    caixa.bolsa.listarFerramentas();
                    break;
                case 5:
                    caixa.bolsa.organizarPorTamanho();
                    caixa.bolsa.listarFerramentas();
                    break;
                case 0:
                    System.out.println("Encerrando programa...");
                    break;
                case -1:
                	break;
                default:
                    System.out.println("Opção inválida!");
            }
        } while (opcao != 0);

        s.close();
    }

    // adicionar item
    private void adicionarItemMenu(Scanner s) {
    	System.out.println("\n=== Tipos de ferramentas e limites ===");
    	System.out.println("Veja os pesos(Kg) e tamanhos(Cm) válidos antes de escolher:\n");

    	// Martelos
    	System.out.println("Martelos:");
    	System.out.println("Martelo de unha\t\t Peso: 0.4 - 1.0\t Tamanho: 250 - 350");
    	System.out.println("Martelo de borracha\t Peso: 0.3 - 0.8\t Tamanho: 200 - 300");
    	System.out.println("Martelo bola\t\t Peso: 0.5 - 1.5\t Tamanho: 250 - 400");

    	// Chaves
    	System.out.println("\nChaves:");
    	System.out.println("Chave de fenda\t\t Peso: 0.2 - 0.6\t Tamanho: 100 - 250");
    	System.out.println("Chave Phillips\t\t Peso: 0.2 - 0.6\t Tamanho: 100 - 250");
    	System.out.println("Chave inglesa\t\t Peso: 0.3 - 1.0\t Tamanho: 100 - 300");

    	// Brocas
    	System.out.println("\nBrocas:");
    	System.out.println("Broca para madeira\t Peso: 0.05 - 0.2\t Tamanho: 5 - 20");
    	System.out.println("Broca helicoidal\t Peso: 0.05 - 0.25\t Tamanho: 5 - 25");
    	System.out.println("Broca para concreto\t Peso: 0.1 - 0.4\t Tamanho: 6 - 30");

    	// Ferramentas elétricas
    	System.out.println("\nFerramentas elétricas:");
    	System.out.println("Furadeira\t\t Peso: 1.0 - 3.0\t Tamanho: 200 - 400");
    	System.out.println("Parafusadeira\t\t Peso: 0.8 - 2.5\t Tamanho: 180 - 350");
    	System.out.println("Lixadeira\t\t Peso: 1.2 - 4.0\t Tamanho: 250 - 450");

    	// Ferramentas de pedreiro
    	System.out.println("\nFerramentas de pedreiro:");
    	System.out.println("Martelo de pedreiro\t Peso: 1.0 - 3.0\t Tamanho: 250 - 400");
    	System.out.println("Colher de pedreiro\t Peso: 0.3 - 0.8\t Tamanho: 200 - 350");
    	System.out.println("Desempenadeira\t\t Peso: 0.4 - 1.0\t Tamanho: 250 - 400");

    	System.out.println("\nDigite o tipo de ferramenta (martelo, chave, broca, e (elétrica), p (pedreiro)): ");
        String tipo = s.nextLine();

        System.out.print("Digite o tamanho: ");
        String tamanhoStr = s.nextLine().replace(",", ".");
        double tamanho = Double.parseDouble(tamanhoStr);

        System.out.print("Digite o peso: ");
        String pesoStr = s.nextLine().replace(",", ".");
        double peso = Double.parseDouble(pesoStr);

        Ferramenta f = null;
        switch (tipo.toLowerCase()) {
        case "martelo":
            System.out.println("Escolha o tipo de martelo:");
            System.out.println("1 - Martelo de unha");
            System.out.println("2 - Martelo de borracha");
            System.out.println("3 - Martelo bola");
            System.out.print("Opção: ");
            int tipoMartelo = s.nextInt();
            s.nextLine();

            switch (tipoMartelo) {
            case 1:
                Validavel v1 = new MarteloDeUnha(tamanho, peso);
                if (v1.tamanhoValido() && v1.pesoValido()) {
                    f = (Ferramenta) v1;
                } else {
                    System.out.println("Valores inválidos para martelo de unha.");
                }
                break;

            case 2:
                Validavel v2 = new MarteloDeBorracha(tamanho, peso);
                if (v2.tamanhoValido() && v2.pesoValido()) {
                    f = (Ferramenta) v2;
                } else {
                    System.out.println("Valores inválidos para martelo de borracha.");
                }
                break;

            case 3:
                Validavel v3 = new MarteloBola(tamanho, peso);
                if (v3.tamanhoValido() && v3.pesoValido()) {
                    f = (Ferramenta) v3;
                } else {
                    System.out.println("Valores inválidos para martelo bola.");
                }
                break;

            default:
                System.out.println("Tipo de martelo inválido.");
          
        }
        break;

        case "chave":
            System.out.println("Escolha o tipo de chave:");
            System.out.println("1 - Chave de fenda");
            System.out.println("2 - Chave Phillips");
            System.out.println("3 - Chave inglesa");
            System.out.print("Opção: ");
            int tipoChave = s.nextInt();
            s.nextLine();

            switch (tipoChave) {
            case 1:
                Validavel v1 = new ChaveDeFenda(tamanho, peso);
                if (v1.tamanhoValido() && v1.pesoValido()) {
                    f = (Ferramenta) v1;
                } else {
                    System.out.println("Valores inválidos para chave de fenda.");
                }
                break;

            case 2:
                Validavel v2 = new ChavePhillips(tamanho, peso);
                if (v2.tamanhoValido() && v2.pesoValido()) {
                    f = (Ferramenta) v2;
                } else {
                    System.out.println("Valores inválidos para chave Phillips.");
                }
                break;

            case 3:
                Validavel v3 = new ChaveInglesa(tamanho, peso);
                if (v3.tamanhoValido() && v3.pesoValido()) {
                    f = (Ferramenta) v3;
                } else {
                    System.out.println("Valores inválidos para chave Inglesa.");
                }
                break;
                default:
                    System.out.println("Tipo de chave inválido.");
            }
            break;

        case "broca":
            System.out.println("Escolha o tipo de broca:");
            System.out.println("1 - Broca para madeira");
            System.out.println("2 - Broca helicoidal");
            System.out.println("3 - Broca para concreto");
            System.out.print("Opção: ");
            int tipoBroca = s.nextInt();
            s.nextLine();

            switch (tipoBroca) {
            case 1:
                Validavel v1 = new BrocaParaMadeira(tamanho, peso);
                if (v1.tamanhoValido() && v1.pesoValido()) {
                    f = (Ferramenta) v1;
                } else {
                    System.out.println("Valores inválidos para broca para madeira.");
                }
                break;

            case 2:
                Validavel v2 = new BrocaHelicoidal(tamanho, peso);
                if (v2.tamanhoValido() && v2.pesoValido()) {
                    f = (Ferramenta) v2;
                } else {
                    System.out.println("Valores inválidos para broca helicoidal.");
                }
                break;

            case 3:
                Validavel v3 = new BrocaConcreto(tamanho, peso);
                if (v3.tamanhoValido() && v3.pesoValido()) {
                    f = (Ferramenta) v3;
                } else {
                    System.out.println("Valores inválidos para broca para concreto.");
                }
                break;
                default:
                    System.out.println("Tipo de broca inválido.");
            }
            break;
            
        case "e":
            System.out.println("Escolha o tipo de ferramenta elétrica:");
            System.out.println("1 - Furadeira");
            System.out.println("2 - Parafusadeira");
            System.out.println("3 - Lixadeira");
            System.out.print("Opção: ");
            int tipoE = s.nextInt();
            s.nextLine();

            switch (tipoE) {
            case 1:
                Validavel v1 = new Furadeira(tamanho, peso);
                if (v1.tamanhoValido() && v1.pesoValido()) {
                    f = (Ferramenta) v1;
                } else {
                    System.out.println("Valores inválidos para furadeira.");
                }
                break;

            case 2:
                Validavel v2 = new Parafusadeira(tamanho, peso);
                if (v2.tamanhoValido() && v2.pesoValido()) {
                    f = (Ferramenta) v2;
                } else {
                    System.out.println("Valores inválidos para parafusadeira.");
                }
                break;

            case 3:
                Validavel v3 = new Lixadeira(tamanho, peso);
                if (v3.tamanhoValido() && v3.pesoValido()) {
                    f = (Ferramenta) v3;
                } else {
                    System.out.println("Valores inválidos para lixadeira.");
                }
                break;
                default:
                    System.out.println("Tipo de ferramenta elétrica inválido.");
            }
            break;
            
        case "p":
            System.out.println("Escolha o tipo de ferramenta de pedreiro:");
            System.out.println("1 - Martelo de pedreiro");
            System.out.println("2 - Colher de pedreiro");
            System.out.println("3 - Desempenadeira");
            System.out.print("Opção: ");
            int tipoP = s.nextInt();
            s.nextLine();

            switch (tipoP) {
            case 1:
                Validavel v1 = new MarteloDePedreiro(tamanho, peso);
                if (v1.tamanhoValido() && v1.pesoValido()) {
                    f = (Ferramenta) v1;
                } else {
                    System.out.println("Valores inválidos para martelo de pedreiro.");
                }
                break;

            case 2:
                Validavel v2 = new ColherDePedreiro(tamanho, peso);
                if (v2.tamanhoValido() && v2.pesoValido()) {
                    f = (Ferramenta) v2;
                } else {
                    System.out.println("Valores inválidos para colher de pedreiro.");
                }
                break;

            case 3:
                Validavel v3 = new Desempenadeira(tamanho, peso);
                if (v3.tamanhoValido() && v3.pesoValido()) {
                    f = (Ferramenta) v3;
                } else {
                    System.out.println("Valores inválidos para desempenadeira.");
                }
                break;
                default:
                    System.out.println("Tipo de ferramenta de pedreiro inválido.");
            }
            break;

        default:
            System.out.println("Tipo desconhecido.");
    }
    
        if(f != null) bolsa.adicionarFerramenta(f);
        
    }

    // retirar item
    private void retirarItemMenu(Scanner s) {
    	if(bolsa.vazia()) {
    		System.out.println("Impossível remover. A bolsa está vazia.");
    	} else {
    		System.out.print("Digite o nome da ferramenta a retirar: ");
    		String nome = s.nextLine();

    		Ferramenta encontrada = bolsa.buscarPorNome(nome);
    		if (encontrada != null) {
    			bolsa.removerFerramenta(encontrada);
    		} else {
    			System.out.println("Ferramenta não encontrada.");
    		}
    	}
    }
}