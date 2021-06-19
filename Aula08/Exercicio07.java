/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Aula08;

/**
 *
 * Faça um programa que apresente todas as letras do alfabeto
 */
public class Exercicio07 {
    public static void main(String[] args) {
        /*String [] alfabeto={"A","B","C","D","E","F","G","H","I","J","K",
            "L","M","N","O","P","Q","R","S", "T", "U","V","W","Y","Z"};
        
       for (int i=0; i< alfabeto.length;i++){
           System.out.println(alfabeto[i]);
           
       }*/
        char a;
	for(a='a';a<='z';a++){
            System.out.print(a +" "); // minusculo    
        }
         System.out.println();
        
        char A;
	for(A='A';A<='Z';A++){
            System.out.print(A+" ");// maiusculo
           
	}
    }
}
