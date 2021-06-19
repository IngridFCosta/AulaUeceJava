/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exerciciosaulauece.Aula05;

import java.util.Scanner;

/**
 *
 * @author usuario
 */
public class Exerc01Pt2Media {
    public static void main(String[] args) {
        Scanner ler=new Scanner(System.in);
        double nota1, nota2,nota3,nota4, media;
        
        nota1=ler.nextDouble();
        nota2=ler.nextDouble();
        nota3=ler.nextDouble();
        nota4=ler.nextDouble();
        
        media=(nota1+nota2+nota3+nota4)/4;
        
        System.out.println("Média: "+media);
        if(media >=7){
            System.out.println("Aprovado");
        }
        else{
            System.out.println("Reprovado");
        }
        
        
    }
    
}
