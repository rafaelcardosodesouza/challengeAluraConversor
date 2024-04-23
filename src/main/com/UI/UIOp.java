package main.com.UI;

import main.com.conversormoedas.api.CurrencyConverterService;

import java.io.IOException;
import java.util.Scanner;

public class UIOp {
    public static void inicio(){
        Scanner sc = new Scanner(System.in);
        System.out.println("\n*************************************\n");
        System.out.println("Bem vindo ao super convetor de moedas\n");
        try {
            int op;
            do {
                System.out.print("""
                      1) Real -> Dólar
                      2) Real -> Peso argentino
                      3) Real -> Euro
                      4) Dólar -> Real
                      5) Peso argentino -> Real
                      6) Euro -> Real
                      7) Outras opções
                      0) Sair
                      
                      Escolha uma opção:  """);
                op = sc.nextInt();
                switch (op) {
                    case 1:
                        // Implemente a conversão de Real para Dólar
                        CurrencyConverterService.currencyApi("BRL");

                        break;
                    case 2:
                        // Implemente a conversão de Real para Peso argentino
                        CurrencyConverterService.currencyApi("BRL");

                        break;
                    case 3:
                        // Real para Euro
                        CurrencyConverterService.currencyApi("BRL");

                        break;
                    case 4:
                        // Dólar para Real
                        CurrencyConverterService.currencyApi("USD");

                        break;
                    case 5:
                        // Peso argentino para Real
                        CurrencyConverterService.currencyApi("ARS");

                        break;
                    case 6:
                        // Euro para Real
                        CurrencyConverterService.currencyApi("EUR");

                        break;
                    case 7:
                        // Exibir submenu de outras opções
                        UIOutrasOp.exibirSubMenuOutrasOpcoes();
                        break;
                    case 0:
                        System.out.println("Saindo...");
                        break;
                    default:
                        System.out.println("Opção inválida! Tente novamente.");
                }

            } while (op != 0);

        } catch (RuntimeException e){
            System.out.println("Ocorreu um erro: "+e.getMessage());
        } catch (IOException e) {
            throw new RuntimeException(e);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

    // Método para exibir o submenu de outras opções
    public static void exibirSubMenuOutrasOpcoes() {
        System.out.println("\n*** Outras opções ***\n");
        // Implemente aqui o submenu com todas as outras opções oferecidas pela API
    }
}
