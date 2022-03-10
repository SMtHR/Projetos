/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package p5q9;

import java.util.Scanner;

/**
 *
 * @author Matheus
 */
public class P5Q9 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner in = new Scanner(System.in);
        
        int nota1,nota2,nota3,nota4;
        
        System.out.println("Digite a notas do aluno: ");
        System.out.print("Nota A: "); nota1 = in.nextInt();
        
        switch(nota1){
            case 0:
            case 1:
            case 2:
            case 3:
                System.out.println("Reprovado");
                break;
            case 4:
            case 5:
            case 6:
                System.out.println("Final");
                break;
            case 7:
            case 8:
            case 9:
            case 10:
                System.out.println("Aprovado");
                break;
            default:
                System.out.println("Valor além dos limites. Digite notas de 0 a 10");    
        }
        
        System.out.print("Nota B: "); nota2 = in.nextInt();
        
        switch(nota2){
            case 0:
            case 1:
            case 2:
            case 3:
                System.out.println("Reprovado");
                break;
            case 4:
            case 5:
            case 6:
                System.out.println("Final");
                break;
            case 7:
            case 8:
            case 9:
            case 10:
                System.out.println("Aprovado");
                break;
            default:
                System.out.println("Nota além dos limites. Digite notas de 0 a 10");    
        }
        
        System.out.print("Nota C: "); nota3 = in.nextInt();
        
        switch(nota3){
            case 0:
            case 1:
            case 2:
            case 3:
                System.out.println("Reprovado");
                break;
            case 4:
            case 5:
            case 6:
                System.out.println("Final");
                break;
            case 7:
            case 8:
            case 9:
            case 10:
                System.out.println("Aprovado");
                break;
            default:
                System.out.println("Nota além dos limites. Digite notas de 0 a 10");    
        }
        
        System.out.print("Nota D: "); nota4 = in.nextInt();
        
        switch(nota4){
            case 0:
            case 1:
            case 2:
            case 3:
                System.out.println("Reprovado");
                break;
            case 4:
            case 5:
            case 6:
                System.out.println("Final");
                break;
            case 7:
            case 8:
            case 9:
            case 10:
                System.out.println("Aprovado");
                break;
            default:
                System.out.println("Nota além dos limites. Digite notas de 0 a 10");    
        }
        
        
    }
    
}
