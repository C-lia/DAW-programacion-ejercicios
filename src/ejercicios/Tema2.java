
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
 * Ejercicio 1: Diseña un algoritmo que pida por teclado 
 * un tiempo expresado en segundos y muestre por pantalla 
 * ese valor expresado en horas, minutos y segundos.
 */
    public void ejercicio1() {
    System.out.println("\n------Ejercicio 1------\n");

    System.out.println("Introduce los segundos");
    // Segundos que mete el usuario
    double s = consola.nextDouble();
    /* Convertimos los segundos a minutos dividiendolo entre 60, pero este no lo 
    sacaremos por pantalla porque los minutos que usaremos seran los restantes de las horas. */
    int x = (int) s / 60;
    // Con los minutos lo dividimos entre 60 para que nos de las horas.
    int horas = x / 60;
    // De las horas, le hacemos el resto para obtener los minutos.
    int minutos = x % 60;
    // Le hacemos el resto a los minutos y asi obtenemos los segundos restantes.
    int segundos = (int) s % 60;

    // Mostrar el resultado en la consola en el formato adecuado
    System.out.println("El tiempo será de: " + horas + " horas, " + minutos + " minutos y " + segundos + " segundos.");
    
    // REVISAR idea potencia.
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
    public void ejercicio6() {
    // 1 MB equivale a 1 millón de bytes (1 MB = 1,000,000 bytes).
    // 1 MiB equivale a 1,048,576 bytes (1 MiB = 2^20 bytes).
        System.out.println("\n------Ejercicio 6------\n");
    
        // Definimos cuantos bytes vale 1 mb y 1 mib.
        double bytes_mb = 1000000;
        double bytes_mib = Math.pow(2, 20);
        
        System.out.println(" Introduce MegaBytes(MB)");
        double mb = consola.nextDouble();
        System.out.println(" Introduce MebiBytes(MiB)");
        double mib = consola.nextDouble();
        
        double operacionMib = mib * bytes_mib / bytes_mb;
        double operacionMb = mb * bytes_mb / bytes_mib;
        
        System.out.println(mb + " MegaBytes(MB) equivale a " + operacionMb + " MebiBytes(MiB)");
        System.out.println(mib + " MebiBytes(MIB) equivale a " + operacionMib + " MegaBytes(MB)");
        
    
    }

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
    public void ejercicio7() {
        System.out.println("\n------Ejercicio 7------\n");
        
        System.out.println("Introduce el ancho de la habitacion en metros");
        double anchoHabitacion = consola.nextDouble();
        System.out.println("Introduce el largo de la habitacion en metros");
        double largoHabitacion = consola.nextDouble();
        System.out.println("Introduce el largo de la baldosa en centimetros");
        double baldosa = consola.nextDouble();
        System.out.println("Introduce el precio de la baldosa en euros");
        double precioBaldosa = consola.nextDouble();
        
        // METODO 1
        // Convertir el ancho y el largo de la habitacion a centimetros.
        double anchoHabCent = 100 * anchoHabitacion;
        double largoHabCent = 100 * largoHabitacion;
        // Dividir el ancho y el largo con la baldosa de fonma individual para saber el numero de baldosas del ancho y del largo.
        double anchoBaldosa = anchoHabCent / baldosa;
        double largoBaldosa = largoHabCent / baldosa;
        // Hacemos el area de la habitacion con el numero de baldosas y le hacemos un "Math.ceil()" para que nos salga el numero al alza".
        int numeroBaldosa =(int) Math.ceil(largoBaldosa * anchoBaldosa);
        // El resultado del número de baldosas lo multiplicamos por el precio y asi obtenemos el precio total.
        double precioTotal = numeroBaldosa * precioBaldosa;
        
        System.out.println("Numero de baldosas total: " + numeroBaldosa);
        System.out.println("Precio total de baldosas es: " + precioTotal + " euros");
        
        //Metodo 2
        // Convertimos el largo de la baldosa a metros.
        double largoBaldMetro = baldosa / 100;
        // Hacemos el area de la habitacion y de la baldosa.
        double areaHabitacion = anchoHabitacion * largoHabitacion;
        double areaBaldosa = largoBaldMetro * largoBaldMetro;
        // Dividimos el area de la habitacion entre el area de la baldosa para sacar el número de baldosas y le hacemos un "Mat.ceil()" para redondear al alza.
        int numeroBaldosa2 = (int) Math.ceil(areaHabitacion / areaBaldosa);
        // Multiplicamos el numero de baldosas por el precio de la baldosa para obtener el total.
        double precioTotal2 = numeroBaldosa2 * precioBaldosa;
        
        System.out.println("Numero de baldosas total: " + numeroBaldosa2);
        System.out.println("Precio total de baldosas es: " + precioTotal2 + " euros");
    }
     
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
    public void ejercicio8() {
        System.out.println("\n------Ejercicio 8------\n");
        System.out.println("Ingrese el segundo del partido.");
        double segundo = consola.nextDouble();
        
        int minuto =(int) Math.ceil(segundo / 60);
        System.out.println("Minuto: " + minuto);
    }
       
    /**
     *
     * Ejercicio 9: Pedir por teclado un número entero de 4 cifras. 
     * a) Mostrar cada una de sus cifras (una debajo de otra) 
     * b) Crear un nuevo número con las cifras del primero, pero al revés.
     */
    public void ejercicio9() {
        System.out.println("Ingresa un numero de 4 cifras");
        
    } 
}
