package ejercicios.tema3;

import java.util.Scanner;


public class MySwitch {
     private final Scanner consola = new Scanner(System.in);
     
     /**
     * Ejercicio 1: Ejercicio ya realizado en el Tema 2. Crea un algoritmo que sirva para resolver
     * ecuaciones de segundo grado del tipo:  Vamos a suponer que a,b y c no van a ser cero nunca. 
     * Comprueba si el determinante es negativo para avisar de que no tiene solución dentro de los números reales.
     */
     public void ejercicio1 () {
         System.out.println("Ingrese a");
         double a = consola.nextDouble();
         System.out.println("Ingrese b");
         double b = consola.nextDouble();
         System.out.println("Ingrese c");
         double c = consola.nextDouble();
     
         double determinante =  Math.pow(b, 2) - 4 * a * c;
         
         if (determinante < 0) {
             System.out.println("No tiene solución dentro de los números reales.");
         } else {
            int resultado1 =(int) ((-b + Math.sqrt(determinante)) / (2*a)); 
            int resultado2 =(int) ((-b - Math.sqrt(determinante)) / (2*a)); 
            System.out.println("Los resultados de esta ecuacion son: " + resultado1 + " y " + resultado2);
         }
     
        //double x = (determinante < 0)?  : ;
     }
     
     /**
     * Ejercicio2: Ya realizado en el Tema 2. Codifica un programa que calcule la conversión de: 
     * a) MegaBytes (MB) a MebiBytes (MiB) 
     * b) MebiBytes (MiB) a Megabits (Mb)
     */
     public void ejercicio2 () {
         
         
     }
     
     /**
     * Ejercicio 3: Ejercicio ya realizado en el Tema 2. Un partido de fútbol tiene una 
     * duración de 90 minutos. El minuto 1 se considera que abarca desde los 0 
     * segundos hasta los 59 segundos. El minuto 2 abarca desde los 60 segundos hasta 
     * los 119 segundos... así sucesivamente hasta el último minuto, que es el minuto 90 
     * y abarca desde los 5340 segundos hasta los 5399 segundos. 
     * Crea un programa que pida al usuario el número de segundos transcurridos y 
     * muestre el minuto en que nos encontramos. 
     * Controla que el número de segundos introducidos no exceda los 90 minutos de 
     * partido. Si es así informa al usuario de que el número de segundos introducidos 
     * excede la duración del partido.
     */
     public void ejercicio3() {
     
        System.out.println("Ingrese el segundo del partido.");
        int segundo = consola.nextInt();

        if (segundo > 5400 || segundo < 0) {
            System.out.println("Segundo fuera de rango");
        } else {
            int minuto = (int) (segundo / 60) + 1;
            System.out.println("Minuto: " + minuto);
        }
     }

    /**
     * Ejercicio 4: Pedir el día, mes y año de una fecha e indicar si la fecha es correcta. 
     * Recordamos que existen meses con 28, 30 y 31 días. No consideramos los años 
     * bisiestos
     */
     public void ejercicio4() {
         System.out.println("Introduce el dia");
         int dia = consola.nextInt();
         System.out.println("Introduce el mes");
         int mes = consola.nextInt();
         System.out.println("Introduce el año");
         int año = consola.nextInt();
     
         if (dia < 0 || dia > 31) {
             System.out.println("Ese dia no existe");
         }
         
     }
     
}