/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package testetipos;

/**
 *
 * @author biara
 */
public class TesteTipos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        //CONVERTENDO INTEIRO PARA STRING
        /*int idade = 30;
        String valor = Integer.toString(idade);
        System.out.println(valor);*/
        
        //CONVERTENDO STRING PARA INTEIRO
        /*String valor = "40";
        int idade = Integer.parseInt(valor);
        System.out.println(idade);*/
        
        //CONVERTENDO STRING PARA FLOAT
        String valor = "50.6";
        float idade = Float.parseFloat(valor);
        System.out.printf("%.2f \n", idade);
    }
    
}
