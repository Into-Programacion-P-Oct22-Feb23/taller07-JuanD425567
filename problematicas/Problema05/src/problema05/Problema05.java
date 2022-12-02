/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package problema05;

import java.util.Locale;
import java.util.Scanner;

public class Problema05 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        entrada.useLocale(Locale.US);
        
        int contador; 
        contador = 1;
        int denominador; 
        denominador = 1;
        String mensaje; 
        mensaje = "";
        
        while (contador <= 9) {
            if (contador%2 == 0) {
                mensaje = mensaje + "" + "- 1/" + denominador + " ";
            } else {
                mensaje = mensaje + "" + "+ 1/" + denominador + " ";
            }
            contador = contador + 1;
            denominador = denominador + 2;
        }
        System.out.println(mensaje);
    }

}
