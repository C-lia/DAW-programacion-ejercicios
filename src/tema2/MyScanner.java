
package tema2;

import java.util.Scanner;

public class MyScanner {
    Scanner consola = new Scanner (System.in);
        
        public void ejerciciosClase() {
        System.out.println("Escribe tu nombre");
        String nombre = consola.nextLine();
        System.out.println("Hola " + nombre);
        
        System.out.println("Escribe tu edad");
        int edad = consola.nextInt();
        System.out.println("Tu edad es " + edad);
        
        System.out.println("Escribe tu nota de la ESO");
        double nota = consola.nextDouble(); // te obliga a escribirlo con ","
        System.out.println("Tu nota de la ESO es " + nota);
        
        System.out.println("Escribe tu nombre");
        String nombre2 = consola.nextLine();
        
        System.out.println("Escribe tu DNI");
        String DNI = consola.nextLine();
        
        System.out.println("Escribe tu fecha de nacimiento");
        String fecha = consola.nextLine();
        
        System.out.println("\nNombre: " + nombre2 + "\nDNI: " + DNI + "\nFecha de nacimiento: " + fecha);
        }
}
