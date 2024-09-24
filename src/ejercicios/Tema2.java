/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicios;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author Celia
 */
public class Tema2 {
    
    private final Scanner consola = new Scanner(System.in);
    // private final Random random = new Random();
    
    /**
     *
     * Ejercicio 1: Diseña un algoritmo que pida por teclado 
     * un tiempo expresado en segundos y muestre por pantalla 
     * ese valor expresado en horas, minutos y segundos. 
     */
    public void ejercicio1() {
        System.out.println("\n------Ejercicio 1------\n");
    }
    
    /**
     *
     * Ejercicio 2: Crea un algoritmo que simule el lanzamiento de un dado de N caras. 
     * El número de caras del dado se solicitará por teclado.  
     */
    public void ejercicio2() {
        System.out.println("\n------Ejercicio 2------\n");
        System.out.println("Mete el numero de caras del dado");
        
        double n = consola.nextDouble();
        int cara = (int) Math.ceil(Math.random() * n);
        System.out.println("La cara es: " + cara);
        
        // Forma David
        int n2 = consola.nextInt();
        Random random = new Random();
        int caraRandom = random.nextInt(n2) + 1;
        System.out.println("La cara es: " + caraRandom);
    }
    
    /**
     *
     * Ejercicio 3: Crea un algoritmo que sirva para resolver ecuaciones 
     * de primer grado del tipo: ax+b=0 
     * Vamos a suponer que a y b no van a ser cero nunca. 
     */
    public void ejercicio3() {}
    
    /**
     *
     * Ejercicio 4: Crea un algoritmo que sirva para resolver ecuaciones
     * de segundo grado del tipo: `ax²+bx+c`
     * Vamos a suponer que a,b y c no van a ser cero nunca.
     */
    public void ejercicio4() {}
    
    /**
     *
     * Ejercicio 5: Crea un programa que, tomando como dato por teclado
     * la cantidad de Mbps que tiene una línea, calcule cual será la descarga 
     * máxima de esa línea en MiB por segundo.
     */
    public void ejercicio5() {}
       
    /**
     *
     * Ejercicio 6: Codifica un programa que calcule la conversión de: 
     * a) MegaBytes (MB) a MebiBytes (MiB) 
     * b) MebiBytes (MiB) a Megabits (Mb)
     */
    public void ejercicio6() {}
     
    /**
     *
     * Ejercicio 7: Se necesita un algoritmo que calcule el coste total
     * de baldosas cuadradas necesarias para cubrir el suelo de una
     * habitación rectangular. El programa solicitará como datos las dimensiones
     * de la habitación en metros (ancho y largo), el lado de cada baldosa
     * expresado en centímetros y el precio por baldosa expresado en euros. 
     * Con esos datos calculará el número de baldosas necesarias que hay que colocar 
     * en la habitación (redondeando hacia arriba si el resultado no es un numero 
     * entero) y el precio total a invertir.
     */
    public void ejercicio7() {}
     
    /**
     *
     * Ejercicio 8: Un partido de fútbol tiene una duración de 90 minutos. 
     * El minuto 1 se considera que abarca desde los 0 segundos hasta
     * los 59 segundos. El minuto 2 abarca desde los 60 segundos hasta
     * los 119 segundos... así sucesivamente hasta el último minuto, 
     * que es el minuto 90 y abarca desde los 5340 segundos hasta
     * los 5399 segundos. Crea un programa que pida al usuario el 
     * número de segundos transcurridos y muestre el minuto en que nos encontramos.
     */
    public void ejercicio8() {}
       
    /**
     *
     * Ejercicio 9: Pedir por teclado un número entero de 4 cifras. 
     * a) Mostrar cada una de sus cifras (una debajo de otra) 
     * b) Crear un nuevo número con las cifras del primero, pero al revés.
     */
    public void ejercicio9() {}  
}
