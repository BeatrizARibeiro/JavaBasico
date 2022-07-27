/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package programaidade;

import java.util.Scanner;

/**
 *
 * @author biara
 */
public class ProgramaIdade {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner teclado = new Scanner(System.in);
        System.out.print("Ano de Nascimento: ");
        int nasc = teclado.nextInt();
        int idade = 2022 - nasc;
        
        System.out.println("Você tem " + idade + " anos");
        if(idade >= 18){
            System.out.println("E é maior de idade");
        }
        else{
            System.out.println("E é menor de idade");
        }
    }
    
}
