/*Hacer un algoritmo que genere e imprima los N primeros términos de la serie de Fibonacci
0   1   1    2    3    5   8   */
package practicafibonacci;

import java.util.Scanner;

public class PracticaFibonacci {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Definicion de objetos y variables
        Scanner objread=new Scanner(System.in);
        int num1=0,num2=1,num3,n;
        //Leer la cantidad de elementos de la serie 
        System.out.print("¿Cuantos elementos tiene la serie? ");
        n=objread.nextInt();
        System.out.println("\n Elementos de la serie\n");
        System.out.print(num1 + "  " + num2 + "  ");
        for (int i = 3; i <= n; i++) {
            num3=num1 + num2;
            System.out.print(num3 + "  ");
            num1=num2;
            num2=num3;
        }
    }
}
