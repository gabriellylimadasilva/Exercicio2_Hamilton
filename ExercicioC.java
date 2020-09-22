/*
c) Elabore um programa que exibe qual o número natural que mais se aproxima da raiz quadrada de um número natural fornecido pelo usuário sem ultrapassá-lo. 
Use apenas as operações básicas (adição, subtração, multiplicação e divisão). Exemplo: O número natural que mais se aproxima de √48, sem ultrapassar, é 6.
 */
package Lista2;

import javax.swing.JOptionPane;


public class ExercicioC {
    public static void main(String[] args)
    {
        double r = 0, n;
        
        n = Double.parseDouble(JOptionPane.showInputDialog("Digite um número inteiro"));
        
        r = n;
        for (int i = 0; i<n; i++){
            r = r/2 + n/(2*r);
        }
        r = (int) r;
        System.out.println("o resultado conforme enunciado: "+r);
        
        System.out.println("o resultado conforme explicação em aula: "+(r-1));
    }
}



 