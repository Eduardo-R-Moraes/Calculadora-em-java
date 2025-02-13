import java.util.Scanner;

public class Main {

    private static float lerNumero(Scanner scanner, String mensagem) {
        System.out.print(mensagem);
        return scanner.nextFloat();
    }

    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);
        float numero1, numero2, resultado;
        
        while (true) {
            System.out.println("1 - Somar");
            System.out.println("2 - Subtrair");
            System.out.println("3 - Multiplicar");
            System.out.println("4 - Dividir");
            System.out.println("5 - Sair do programa");
            System.out.print("-> ");

            int opcao = leitura.nextInt();
            
            if (opcao == 5) {
                System.out.println("Encerrando programa...");
                break;
            }
            
            numero1 = lerNumero(leitura, "Primeiro Número: ");
            numero2 = lerNumero(leitura, "Segundo Número: ");

            switch (opcao) {
                case 1:
                    resultado = Calculadora.somar(numero1, numero2);
                    System.out.println("A soma de " + numero1 + " e " + numero2 + " é igual a " + resultado);
                    break;

                case 2:
                    resultado = Calculadora.subtrair(numero1, numero2);
                    System.out.println("A subtração de " + numero1 + " e " + numero2 + " é igual a " + resultado);

                    break;
                    
                case 3:
                    resultado = Calculadora.multiplicar(numero1, numero2);
                    System.out.println("A multiplicação de " + numero1 + " e " + numero2 + " é igual a " + resultado);
                    break;

                case 4:
                    if (numero2 != 0) {
                        resultado = Calculadora.dividir(numero1, numero2);
                        System.out.println("A divisão de " + numero1 + " e " + numero2 + " é igual a " + resultado);
                        break;
                    }

                    System.out.println("Não é possível dividir por zero.");

                    break;

                default:
                    System.out.println("Operação inválida.");
                    break;
            }
            System.out.print("\nPressione <ENTER> para continuar...");
            System.out.println();
            
            leitura.nextLine();
            leitura.nextLine();
        }
        leitura.close();
    }
}
