package tema3;

import java.util.Scanner;

public class IfElse {

    private final Scanner consola = new Scanner(System.in);
    
    
        public void ejerciciosClase() {
              int edad = 5;
             if (edad >= 18){
                System.out.println("Eres mayor de edad");
             } else{
                System.out.println("Eres menor de edad");  
             }
         
             int hora = 16;
            if (hora < 12){
                System.out.println("Buenos dias");
            } else if (hora < 20) {
                System.out.println("Buenas tardes");
            } else {
                System.out.println("Buenas noches");
            }
        
            final int valor_minimo = 10;
            final int valor_maximo = 10;
            int valor = 100;
        
            if(valor >= valor_minimo && valor <= valor_maximo){
                System.out.println("Estoy dentro de rango");
            } else {
                System.out.println("Estoy fuera");}

        }
    

        /**
         * Ejercicio 1: Un padre puede asistir al partido de futbol de su hijo si
         * está de vacaciones o si es fin de semana. Realiza un algoritmo que
         * realice al usuario esas dos preguntas (es fin de semana?, estás de
         * vacaciones?) y nos indique si puede asistir al partido de su hijo.
         * Nota/Pista: el usuariotiene que responder true o false. Recuerda cómo se
         * tienen que leer esosvalores por teclado, no son Strings.
         */
        public void ejercicio1() {
            System.out.println("¿Es fin de semana?, solo true o false");
            boolean finSemana = consola.nextBoolean();
            System.out.println("¿Estas de vacaciones?, solo true o false");
            boolean vacaciones = consola.nextBoolean();

            if (finSemana || vacaciones) {
                System.out.println(" Puedes ir al partido");
            } else {
                System.out.println("No puedes ir al partido");
            }
        }

        /**
         * Ejercicio 2: Crea un algoritmo que pida al usuario el número del mes del
         * año en el que está y saqué por pantalla la estación meteorológica que
         * corresponde. Si introduce un número que esté fuera del rango de meses del
         * año que salga “estación desconocida” - Invierno si el mes es 12,1,2 -
         * Primavera si el mes es: 3,4,5 - Verano si el mes es: 6,7,8 - Otoño si el
         * mes es: 9,10,11
         */
        public void ejercicio2() {
            System.out.println("Introduzca el mes del año");
            int mes = consola.nextInt();

    //        if (mes <= 0 || mes > 12) {
    //            System.out.println("Estación desconocida");
            if (mes == 12 || (mes >= 1 && mes <= 2)) {
                System.out.println("Invierno");
            } else if (mes >= 3 && mes <= 5) {
                System.out.println("Primavera");
            } else if (mes >= 6 && mes <= 8) {
                System.out.println("Verano");
            } else if (mes >= 9 && mes <= 11) {
                System.out.println("Otoño");
            } else {
                System.out.println("Estación desconocida");
            }

            // Mirar haber como solucionar si es un double y decirle al usuario que no es valido.
        }

        /**
         * Ejercicio 3: Solicita dos números N y M distintos y muestra cual es el
         * mayor Salida: N es mayor que M ó M es mayor que N ó N y M son iguales.
         */
        public void ejercicio3() {
            System.out.println("Introduce el primer numero");
            double n = consola.nextDouble();
            System.out.println("Introduce el segundo numero");
            double m = consola.nextDouble();

            if (n > m) {
                System.out.println(n + " es mayor que " + m);
            } else if (n < m) {
                System.out.println(m + " es mayor que " + n);
            } else {
                System.out.println(n + " y " + m + " son iguales");
            }
        }

        /**
         * Ejercicio 4: Crea un algoritmo que pida al usuario que introduzca un
         * número entero N y saque por pantalla si el número es positivo o negativo
         * y si es par o impar “El numero N es positivo/negativo y par/impar”
         */
        public void ejercicio4() {

            System.out.println("Introduce un número entero");
            int n = consola.nextInt();

            // Metodo 1
            if (n >= 0 && n % 2 == 0) {
                System.out.println("El número " + n + " es positivo y par");
            } else if (n < 0 && n % 2 == 0) {
                System.out.println("El número " + n + " es negativo y par");
            } else if (n >= 0 && n % 2 != 0) {
                System.out.println("El número " + n + " es positivo e impar");
            } else {
                System.out.println("El número " + n + " es negativo e impar");
            }

            // Metodo 2
            String condicion1 = (n == Math.abs(n)) ? "positivo" : "negativo";
            String condicion2 = (n % 2 == 0) ? "par" : "impar";
            System.out.println("El número " + n + " es " + condicion1 + " y/e " + condicion2);
        }

        /**
         * Ejercicio 5: Escribe una aplicación que indique cuántas cifras tiene un
         * número entero introducido por teclado, que estará comprendido entre 0 y
         * 99.999Salida: “El número N tiene x cifras”
         */
        public void ejercicio5() {
            System.out.println("Ingresa un número entre el 0 y el 99999");
            int n = consola.nextInt();

            if (n >= 0 && n <= 9) {
                System.out.println("El número " + n + " tiene 1 cifra");
            } else if (n >= 10 && n <= 99) {
                System.out.println("El número " + n + " tiene 2 cifra");
            } else if (n >= 100 && n <= 999) {
                System.out.println("El número " + n + " tiene 3 cifra");
            } else if (n >= 1000 && n <= 9999) {
                System.out.println("El número " + n + " tiene 4 cifra");
            } else if (n >= 10000 && n <= 99999) {
                System.out.println("El número " + n + " tiene 5 cifra");
        }
    }
}
