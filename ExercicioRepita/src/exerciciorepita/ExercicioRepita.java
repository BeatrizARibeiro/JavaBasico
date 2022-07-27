/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package exerciciorepita;

import javax.swing.JOptionPane;

/**
 *
 * @author biara
 */
public class ExercicioRepita {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //JOptionPane.showMessageDialog(null, "Olá Mundo!", "Boas Vindas", JOptionPane.INFORMATION_MESSAGE);
        int n, s = 0, p = 0, i = 0, c = 0, qtde = 0,m = 0;
        do{
            n = Integer.parseInt(JOptionPane.showInputDialog(null, 
                    "<html>Informe um número: <br><em>(valor 0 interrompe)</em></html>"));
            s += n;
            qtde ++;
            ///////////////////
            if(n % 2 == 0)
            {
                p++;
            }
            else
            {
                i++;
            }
            /////////////////
            if(n > 100)
            {
               c++; 
            }
            m = s/qtde;
        }while(n != 0);
        
        JOptionPane.showMessageDialog(null, "<html>RESULTADO FINAL<hr> " + 
                "<br>Total de Valores: " + qtde +
                "<br>Total de Pares " + p +
                "<br>Total de Impares: " + i +
                "<br>Acima de cem: " + c + 
                "<br>Média dos Valores: " + m);
    }
    
    
}
