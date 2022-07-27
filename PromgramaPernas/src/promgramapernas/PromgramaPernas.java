/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package promgramapernas;

import java.util.Scanner;

/**
 *
 * @author biara
 */
public class PromgramaPernas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner t = new Scanner(System.in);
        
        System.out.print("Quantas pernas você tem?");
        int perna = t.nextInt();
        
        String tipo;
        
        System.out.print("Você é um(a) ");
        switch(perna){
            case 1:
                tipo = "Saci";
                break;
            case 2:
                tipo = "Bipede";
                break;
            case 3: 
                tipo = "Tripé";
                break;
            case 4:
                tipo = "Quadrupide";
                break;
            case 6:
                tipo = "Aranha";
                break;
            default
                tipo = "ET";
                break;
        }
        System.out.println(tipo);
    }
    
}
