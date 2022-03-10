/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package p5q4;

import java.util.Scanner;

/**
 *
 * @author Matheus
 */
public class P5Q4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner in = new Scanner(System.in);
        String prod1 , prod2 , prod3 , prod4 , prod5;
        double p1 , p2 , p3 , p4 , p5 , maior , menor;
        
        System.out.println("Digite os nomes dos produtos e seus preços em seguida: ");
        
        System.out.print("Produto: "); prod1= in.next(); 
        System.out.print("Preço: "); p1= in.nextDouble();
        
        System.out.print("Produto: "); prod2= in.next(); 
        System.out.print("Preço: "); p2= in.nextDouble();
        
        System.out.print("Produto: "); prod3= in.next(); 
        System.out.print("Preço: "); p3= in.nextDouble();
        
        System.out.print("Produto: "); prod4= in.next(); 
        System.out.print("Preço: "); p4= in.nextDouble();
        
        System.out.print("Produto: "); prod5= in.next(); 
        System.out.print("Preço: "); p5= in.nextDouble();
        
        //descobrir produto mais caro
        
        maior = p1;
        
        if(p1 > maior){
            maior = p1;
        }
        if(p2 > maior){
            maior = p2;
        }
        if(p3 > maior){
            maior = p3;
        }
        if(p4 > maior){
            maior = p4;
        }
        if(p5 > maior){
            maior = p5;
        }
        
        //descobrir produto mais barato
        
        menor = p1;
        
        if(p1 < menor){
            menor = p1;
        }
        if(p2 < menor){
            menor = p2;
        }
        if(p3 < menor){
            menor = p3;
        }
        if(p4 < menor){
            menor = p4;
        }
        if(p5 < menor){
            menor = p5;
        }
        
        //exibir produto mais caro e preco
        
        if(maior == p1){
            System.out.println("Produto mais caro: " + prod1);
            System.out.println("Preço: " + p1);
        }
        if(maior == p2){
            System.out.println("Produto mais caro: " + prod2);
            System.out.println("Preço: " + p2);
        }
        if(maior == p3){
            System.out.println("Produto mais caro: " + prod3);
            System.out.println("Preço: " + p3);
        }
        if(maior == p4){
            System.out.println("Produto mais caro: " + prod4);
            System.out.println("Preço: " + p4);
        }
        if(maior == p5){
            System.out.println("Produto mais caro: " + prod5);
            System.out.println("Preço: " + p5);
        }
        
        //exibir produto mais barato e preco
        
        if(menor == p1){
            System.out.println("Produto mais barato: " + prod1);
            System.out.println("Preço: " + p1);
        }
        if(menor == p2){
            System.out.println("Produto mais barato: " + prod2);
            System.out.println("Preço: " + p2);
        }
        if(menor == p3){
            System.out.println("Produto mais barato: " + prod3);
            System.out.println("Preço: " + p3);
        }
        if(menor == p4){
            System.out.println("Produto mais barato: " + prod4);
            System.out.println("Preço: " + p4);
        }
        if(menor == p5){
            System.out.println("Produto mais barato: " + prod5);
            System.out.println("Preço: " + p5);
        }
    }
    
}
