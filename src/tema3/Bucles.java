
package tema3;

import java.util.Scanner;

public class Bucles {
    private final Scanner consola = new Scanner(System.in);
    
    public void clase() {
    
        //Ejercicio 1 : Mostras los numeros del 1 al 50
        int contador = 1;
        while (contador <= 50) {
            System.out.println(contador);
            contador++;
        }
        
        //Ejercicio2: Un contador hacia atras de 5 a 1
        contador = 5;
        while (contador >= 1) {
            System.out.println(contador);
            contador--;
        }
        
        // Ejercicio 3: Comenenzado 1, sumar numeros enteros consectivos de manera acumulativa hasta que la suma total sea mayor que 10.
        contador = 1;
        int suma = 0;
        while (suma < 10) {
            suma = suma + contador;
            contador++;
            System.out.println(suma);
        }
        
        // Ejercicio 4: Pedir una opcionn al usuario hasta que sea valida. (El menu en el que se puede elegir entre 1 y 3).
        System.out.println("Introduce el menu entre 1 y 3");
        int opcion = consola.nextInt();
        
        while(opcion <= 0 || opcion > 3) { // opcion no valida
            System.out.println("Opcion no valida");
            System.out.println("Vuelva a introducirlo");
            opcion = consola.nextInt();
        }
        
        /*
        Algoritmo que solicite al usuario ingresar una serie de numeros enteros positivos. 
        El programa debe calcular la suma de todos los numeros ingresados hasta que el usuario 
        ingrese un numero negativo. Una vez ingrese un numero negativo, el programa debe mostras 
        la suma total de todos los numeros ingresados(excluyendo el numero negativo) y terminar.
        */
        
        suma = 0;
        System.out.println("Introduce un numero");
        int n = consola.nextInt();
        
        while(n >= 0) {
        suma = suma + n;
        System.out.println("Pedir otro numero");
        n = consola.nextInt();
        }
        System.out.println(suma);
        
        
            
            
            
            
            
    }
}
    
    
