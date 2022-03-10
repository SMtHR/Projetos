/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package questao7;

import java.util.Scanner;

/**
 *
 * @author Matheus
 */
public class Questao7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        double A , B , soma, subtracao, multiplicacao , divisao;
        Scanner in = new Scanner(System.in);
        
        System.out.println("Insira o valor de A: ");
        A = in.nextDouble();
        
        System.out.println("Insira o valor de B: ");
        B = in.nextDouble();
        
        soma = A + B;
        subtracao = A - B;
        divisao = A / B;
        multiplicacao = A * B;
        
        System.out.println("Resultados:");
        System.out.println("Soma: " + soma);
        System.out.println("Subtracao: " + subtracao);
        System.out.println("Divisao: " + divisao);
        System.out.println("Multiplicacao: " + multiplicacao);
        
    }
    
}
