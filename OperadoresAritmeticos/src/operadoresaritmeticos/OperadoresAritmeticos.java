/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package operadoresaritmeticos;

/**
 *
 * @author biara
 */
public class OperadoresAritmeticos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      
        /*int n1 = 3;
         * int n2 = 5;
         * float m = (n1 + n2)/2;
         * System.out.println("A média é " + m);
         */
        
        
        //NOTAÇÃO POLONESA
        /*int numero = 10;
         * int valor = 4 + numero--;
         * System.out.println(valor);
         * System.out.println(numero);
         */
        
        /*int x = 4;
         * x %= 2; //x = x % 2
         * System.out.println(x);
         */
        
        
        //FUNÇÕES MATH
        /*float v = 8.4f;
         * //int ar = (int) Math.floor(v); -- ARREDONDA PARA BAIXO
         * //int ar = (int) Math.ceil(v); -- ARREDONDA PARA CIMA
         * int ar = (int) Math.round(v);
         * System.out.println(ar);
         */
        
        double ale = Math.random(); //GERA UM NUMERO ENTRE 0 E 1
        int n = (int) (15 + ale * (50 - 15));
        System.out.println(n);
    }
    
}
