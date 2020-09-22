/*
e) [for] Desenvolva um programa que exibe a tabuada de um número natural escolhido pelo usuário. Os múltiplos apresentados devem ser de 1 a 10.
 */
package Lista2;

import javax.swing.JOptionPane;

public class ExercicioE {
    public static void main(String[] args)
    {
    
    int n = Integer.parseInt(JOptionPane.showInputDialog("Digite um número inteiro"));
    
    for(int i = 1; i <=10; i++)
    {
        System.out.println(n + " x "+i+" = "+(n*i)+"\n");
    }
}
}
