
package aula13;

import java.util.Scanner;

public class Exercicio05 {
    public static void main(String[] args) {
        Scanner ler=new Scanner(System.in);
        String palavra;
        palavra=ler.nextLine();
        System.out.println("Caixa alta:"+palavra.toUpperCase());
        System.out.println("Caixa baixa:"+ palavra.toLowerCase());
        
    }
    
}
