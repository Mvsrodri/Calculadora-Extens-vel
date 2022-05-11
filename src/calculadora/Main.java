package Calculadora;

import static Calculadora.Calcular.calcular;
import java.util.Scanner;


public class Main {

    public static void main(String[] args) throws Exception {
        Adicao ad = new Adicao();
        Subtracao sub = new Subtracao();
        Divisao div = new Divisao();
        Multiplicacao mult = new Multiplicacao();
        
        Scanner sc = new Scanner(System.in);
        int op;
        double num1, num2;

        System.out.println("Escolha a operação que deseja realizar?");
        System.out.println("1-Soma / 2-Subtração / 3-Divisão / 4-Multiplicação");
        op = sc.nextInt();

        System.out.println("Digite o primeiro numero para realizar a operação escolhida");
        num1 = sc.nextDouble();
        System.out.println("Digite o segundo numero para realizar a operação escolhida");
        num2 = sc.nextDouble();
        
        switch (op) {
            case 1:
                System.out.println("O resultado é: " + calcular (ad, num1, num2));
                break;
            case 2:
                System.out.println("O resultado é: " + calcular (sub, num1, num2));
                break;
            case 3:
                System.out.println("O resultado é: " + calcular (div, num1, num2));
                break;
            case 4:
                System.out.println("O resultado é: " + calcular (mult, num1, num2));
                break;
            default:
                System.out.println("Opcao Invalida");
                break;
        }

    }
    
}
