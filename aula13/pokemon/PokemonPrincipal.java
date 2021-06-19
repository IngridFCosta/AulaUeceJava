
package pokemon;

import java.util.Scanner;

public class PokemonPrincipal {
    public static void main(String[] args) {
        Scanner ler=new Scanner(System.in);
        Pokemon p1=new Pokemon();
        
        System.out.println("Digite a habilidade");
        p1.habilidade=ler.nextLine();
        System.out.println("Digite o nome");
        p1.nome=ler.nextLine();
        System.out.println("Digite o tamanho");
        p1.tamanho=ler.nextLine();
        System.out.println("Digite o poder");
        p1.poder=ler.nextInt();
        
        
        System.out.println("nome "+p1.nome);
        System.out.println("Tamanho "+p1.tamanho);
        System.out.println("Poder "+p1.poder);
        System.out.println("Habilidade "+p1.habilidade);
        p1.atacar();
        p1.defender();
    }
    
    
}
