/*
 [while] Elabore um programa que recebe valores naturais até que seja digitado o valor zero. 
O programa deverá exibir a média aritmética. Lembre-se: o valor zero apenas sinaliza o fim da entrada, não deve ser contabilizado.
 */
package Lista2;

import javax.swing.JOptionPane;

public class ExercicioB {
    public static void main(String[] args)
    {
        
       int cont=0;
       double n=1, valor=0,media;
       
       while(n != 0)
       {
           n = Double.parseDouble(JOptionPane.showInputDialog("Digite um número"));
           valor = valor + n;
           cont++;
       }       
       media = valor / (cont-1);
       System.out.println("Média: " +media);    
        
    }
}
        
 
