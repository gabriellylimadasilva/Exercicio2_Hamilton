/*
a) Elabore um programa que lê um número inteiro n, seguido de n inteiros, e exibe a média dos n números lidos.
 */
package Lista2;

import javax.swing.JOptionPane;

public class ExercicioA {
    public static void main(String[] args)
    {
    
        int n, cont=0, soma=0; 
        n = Integer.parseInt(JOptionPane.showInputDialog("Digite um número inteiro"));
        for(int i = 0; i <=n; i++)
        {
            soma = soma + i;
            cont++;
        }
        System.out.println("Média: " +soma/cont);
    }
}

