/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package problema02;

import java.util.Locale;
import java.util.Scanner;

public class Problema02 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        entrada.useLocale(Locale.US);

        int contador; 
        contador = 2;
        int total;
        total=4;
        String mensaje; 
        mensaje = "";

        while (contador <= 110) {
            mensaje = mensaje + contador + "\n";
            contador = contador + total;
            total = total + 2;
        }
        System.out.println(mensaje);
    }
}
