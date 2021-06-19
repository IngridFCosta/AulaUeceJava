/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Aula08;

import java.util.Scanner;

/**
 *
 * Escreva 4 palavras e armazene cada uma em uma variável, depois apresente na tela elas juntas?

 */
public class Exercicio06 {
    public static void main(String[] args) {
        Scanner ler=new Scanner(System.in);
        
        String palavra1=ler.nextLine();
        String palavra2=ler.nextLine();
        String palavra3=ler.nextLine();
        String palavra4=ler.nextLine();
        
        System.out.println(palavra1+" "+palavra2+" "+palavra3+" "+palavra4 );
        
        
    }
    
}
