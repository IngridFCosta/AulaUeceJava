/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula13;

import java.util.Scanner;

/**
 *
 * @author usuario
 */
public class Exercicio08 {
    public static void main(String[] args) {
         Scanner ler=new Scanner(System.in);
        int matriz[][]=new  int[3][3];
        for(int i=0;i<matriz.length;i++){
            for(int j=0;j<matriz.length;j++){
                matriz[i][j]=ler.nextInt();
            }
        }
        System.out.println("Elementos da matriz secundaria");
       for(int i=0;i<matriz.length;i++){
            for(int j=0;j<matriz.length;j++){
               if(j==(matriz.length-1-i)){
                   System.out.println(matriz[i][j]);
                   
               }
            }
       }
        
    }
    
}
