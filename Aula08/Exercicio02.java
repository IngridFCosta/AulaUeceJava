
package Aula08;

import java.util.Scanner;
//Faça um algoritmo em que o usuário entra com altura e o peso, e saída é o calculo do IMC?

public class Exercicio02 {
    public static void main(String[] args) {
        Scanner ler=new Scanner(System.in);
        double altura, peso, IMC;
        System.out.println("Digite o peso:");
        peso=ler.nextDouble();
        System.out.println("Digite a altura:");
        altura=ler.nextDouble();
        
        IMC=peso/(altura*altura);
        System.out.printf("O IMC é %.2f%n",IMC);
        
        
    }
    
}
