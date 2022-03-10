/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package p5q8;

import java.util.Scanner;

/**
 *
 * @author Matheus
 */
public class P5Q8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner in = new Scanner(System.in);
        
        int opcao;
        
        System.out.println("Escolha uma das opcoes: ");
        System.out.println("1 - Solteiro(a)");
        System.out.println("2 - Desquitado(a)");
        System.out.println("3 - Casado(a)");
        System.out.println("4 - Divorciado(a)");
        System.out.println("5 - Viuvo(a)");
        
        System.out.print("Opcao: ");
        opcao = in.nextInt();
        
        switch (opcao) {
            case 1:
                System.out.println("Voce e solteiro(a)");
                break;
            case 2:
                System.out.println("Voce e desquitado(a)");
                break;
            case 3:
                System.out.println("Voce e casado(a)");
                break;
            case 4:
                System.out.println("Voce e divorciado(a)");
                break;
            case 5:
                System.out.println("Voce e viuvo(a)");
                break;
            default:
                System.out.println("Opcao invalida! Tente novamente.");
                break;
        }
    }
    
}
