/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package problema01;

import java.util.Locale;
import java.util.Scanner;

public class Problema01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        entrada.useLocale(Locale.US);

        int contador = 1;
        String nombre;
        String posicion;
        int edad;
        double estatura;
        String mensaje = "";
        String edades = "";
        boolean bandera = true;
        String salida;
        int sumaedad = 0;
        double promedioedad;
        double cantidad = 0;
        double promedioestatura;
        double sumaestatura = 0;

        do {
            System.out.println("Ingrese el nombre del jugador:");
            nombre = entrada.nextLine();

            System.out.println("Ingrese la posición en el campo de juego del"
                    + "jugador:");
            posicion = entrada.nextLine();

            System.out.println("Ingrece la edad del jugador:");
            edad = entrada.nextInt();

            System.out.println("Ingrece la estatura del jugador:");
            estatura = entrada.nextDouble();
            entrada.nextLine();

            mensaje = mensaje + contador + "." + " " + nombre + " " + "-"
                    + posicion + "-" + "," + " " + "edad" + " " + edad + ","
                    + " " + "estatura" + " " + estatura + "\n";
            edades = edades + edad + "\n";
            contador = contador + 1;
            sumaedad = sumaedad + edad;
            sumaestatura = sumaestatura + estatura;
            cantidad = cantidad + 1;

            System.out.println("Ingrese (s) si desea salir del ciclo ");
            salida = entrada.nextLine();
            if (salida.equals("s")) {
                bandera = false;
            }

        } while (bandera == true);
        promedioedad = sumaedad / cantidad;
        promedioestatura = sumaestatura / cantidad;
        System.out.printf("Listado de Jugadores\n%sListado de edades\n"
                + "%sPromedio de edades: %.2f\nPromedio de estaturas: %.2f\n",
                mensaje, edades, promedioedad, promedioestatura);
    }
}
