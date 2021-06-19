
package aula13;

import java.util.Scanner;

public class Exercicio01 {

    public static void main(String[] args) {
        Scanner ler=new Scanner(System.in);
		int lado1=ler.nextInt();
		int lado2=ler.nextInt();
		int lado3=ler.nextInt();
		
		if(lado1+lado2>lado3 || lado1+lado3>lado2 || lado2+lado3>lado1) {
			System.out.println("É um triangulo");
			
		}
		else {
			System.out.println("Não é um triangulo");
		}

    }
    
}
