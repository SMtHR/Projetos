/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package p5q6;

import java.util.Scanner;

/**
 *
 * @author Matheus
 */
public class P5Q6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner in = new Scanner(System.in);
        
        String idadeP, hobbieP, cabeloP, olhosP, cidadeP;
        
        System.out.println("Qual sua idade?");
        idadeP = in.nextLine();
        System.out.println("Qual seu hobbie?");
        hobbieP = in.nextLine();
        System.out.println("Qual cor de cabelo voce gosta?");
        cabeloP = in.nextLine();
        System.out.println("Qual cor de olhos voce gosta?");
        olhosP = in.nextLine();
        System.out.println("Onde voce mora?");
        cidadeP = in.nextLine();
        
        final String idade = "25" , hobbie = "Tocar piano" , cabelo = "Castanho";
        final String olhos = "Azul" , cidade = "Curitiba";
        
        int A,B,C,D,E;
        A = 0; B = 0; C = 0; D = 0; E = 0;
        
        if (idadeP.equals(idade)){
            A = 20;
        }
        if (hobbieP.equals(hobbie)){
            B = 20;
        }
        if (cabeloP.equals(cabelo)){
            C = 20;
        }
        if (olhosP.equals(olhos)){
            D = 20;
        }
        if (cidadeP.equals(cidade)){
            E = 20;
        }
        
        int total;
        total = A + B + C + D + E;
        
        if(total > 65){
            System.out.println("Match!!!");
        }
        else{
            System.out.println("Nenhum match encontrado.");
        }
        
    }
    
}
