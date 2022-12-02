/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package programa03;

import java.util.Locale;
import java.util.Scanner;

public class Programa03 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        entrada.useLocale(Locale.US);

        String mensaje = "";
        int contador = 2;
        contador = 2;
        int total; 
        total = 3;
        do {
            mensaje = mensaje + contador + "\n";
            contador = contador + total;
            total = total + 2;
        } while (contador <= 37);
        System.out.println(mensaje);
    }

}

