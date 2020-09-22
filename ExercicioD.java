/*
d) Crie um programa que exibe uma lista de graus Fahrenheit (𝐹) e os correspondentes em graus centígrados (𝐶),
variando de 50 a 150, com passos de uma unidade. A fórmula de conversão é 𝐶 = 5 ÷ 9 × (𝐹 − 32).

 */
package Lista2;

public class ExercicioD {
    public static void main(String[] args)
    {
    
    double c;
    for (int i= 50; i <=150; i++)
    {
        c = (i-32.0)*5.0/9.0;
         
        System.out.println("Fahrenheit: " +i+" celsius: " +c);
    }
    }   
}
