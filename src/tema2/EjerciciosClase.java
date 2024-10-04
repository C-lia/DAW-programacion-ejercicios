
package tema2;

import java.util.Scanner;


public class EjerciciosClase {
    
    public void ejerciciosClase () {
    // EJERCICIO 1
        String nombre = "Celia";
        int edad = 27;
        boolean carnet = false;
        
        System.out.println("Me llamo" + " " + nombre);
        System.out.println("Mi edad es" + " " + edad);
        System.out.println("Carnet de conducir:" + " " + carnet);
        
        System.out.println("\nMe llamo "+ nombre + "\nMi edad es " + edad + "\nCarnet de conducir: " + carnet);
        
        // EJERCICIO 2
        Scanner consola = new Scanner (System.in);
     
        System.out.println("Escribe tu nombre");
        String nombre2 = consola.nextLine();
        
        System.out.println("Escribe tu DNI");
        String DNI = consola.nextLine();
        
        System.out.println("Escribe tu fecha de nacimiento");
        String fecha = consola.nextLine();
        
        System.out.println("\nNombre: " + nombre2 + "\nDNI: " + DNI + "\nFecha de nacimiento: " + fecha);
        
        
        // EJERCICIO 3
        System.out.println("Escribe el primer numero");
        double a = consola.nextDouble();
        
        System.out.println("Escribe el segundo numero");
        double b = consola.nextDouble();
        
        double suma = a + b;
        double resta = a - b;
        double multiplicacion = a *b;
        double potencia = Math.pow(a, b);
        double raizCuadrada = Math.sqrt(a);
        
        System.out.println("La suma de " + a + " y " + b + " : " + suma);
        System.out.println("La resta de " + a + " y " + b + " : " + resta);
        System.out.println("La multiplicacion de " + a + " y " + b + " : " + multiplicacion);
        System.out.println("El cociente de " + a + " entre " + b + " : " + potencia);
        System.out.println("La raiz de " + a + " : " + raizCuadrada);
        
        
        // Crea un algoritmo que calcule la media de 5 números que se le pasan por teclado y muestre el resultado.
        
        System.out.println("\nEscribe el primer numero");
        double n1 = consola.nextDouble();
        System.out.println("Escribe el segundo numero");
        double n2 = consola.nextDouble();
        System.out.println("Escribe el tercer numero");
        double n3 = consola.nextDouble();
        System.out.println("Escribe el cuarto numero");
        double n4 = consola.nextDouble();
        System.out.println("Escribe el quinto numero");
        double n5 = consola.nextDouble();
        
        double media = (n1 + n2 + n3 + n4+ n5) / 5;
        System.out.println(media);

        // Diseña un algoritmo que pida dos números por teclado (m y n) y calcule las siguientes expresiones. Muestra el resultado de cada una de ella.
        
        System.out.println("\nEscribe el primer numero");
        double m = consola.nextDouble();
        System.out.println("Escribe el segundo numero");
        double n = consola.nextDouble();
        
        double operacion1 = m / n*(m-n) ;
        double operacion2 = 12.3 / m+5 - n * 9 ;
        double operacion3 = m * 2048 / n*1024 - Math.pow(m, n) ;
        double operacion4 = Math.pow((3203 /m - n),n) % (Math.pow(n, 2) * Math.pow(m, 3));
        
        System.out.println("Resultado 1 operacion: " + operacion1);
        System.out.println("Resultado 2 operacion: " + operacion2);
        System.out.println("Resultado 3 operacion: " + operacion3);
        System.out.println("Resultado 4 operacion: " + operacion4);
        
         if( operacion1 % 2 == 0) {
            System.out.println("Es un numero par");
        } else {
            System.out.println("Es un numero inpar");
        }
    }   
}
