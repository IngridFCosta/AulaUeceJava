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
public class Exerc02Pt2Angulos {
    public static void main(String[] args) {
        
        Scanner ler=new Scanner(System.in);
        double angulo01, angulo02,angulo03, soma;
        
        angulo01=ler.nextDouble();
        angulo02=ler.nextDouble();
        angulo03=ler.nextDouble();
        
        
        if(angulo01==angulo02 && angulo01==angulo03){
            System.out.println("O triangulo é equilatero");
        }
        else{
            System.out.println("Não é equilatero");
        }
        
        
        
    }
}
