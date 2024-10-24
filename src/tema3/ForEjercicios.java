package tema3;

import java.util.Scanner;

public class ForEjercicios {

    private final Scanner consola = new Scanner(System.in);

    /**
     * Ejercicios que hemos hecho en clase para explicar el for.
     */
    public void clase() {
        // Ejemplos echos en clase.
        for (int i = 1; i <= 2; i++) {
            System.out.println("La i vale: " + i);
        }

        for (int i = 2; i < 10; i += 2) {
            System.out.println(i);
        }

        for (int i = 5; i >= 1; i--) {
            System.out.println(i);
        }

        int suma = 0;
        for (int i = 1; i <= 100; i++) {
            suma += i;
        }
        System.out.println(suma);

        /**
         * Mostrar números del 1 l 50.
         */
        for (int i = 1; i <= 50; i++) {
            System.out.println(i);

        }

        /**
         * Contador hacia atras del 5 al 1.
         */
        for (int i = 5; i >= 1; i--) {
            System.out.println(i);
        }
    }

    /**
     * Ejercicio 1: Muestra los números múltiplos de 5 de 0 a 100.
     */
    public void ejercicio1() {
        for (int i = 0; i <= 100; i += 5) {
            System.out.println(i);
        }
    }

    /**
     * Ejercicio 2: Crea un programa que muestre todos los múltiplos de 6 hasta
     * el múltiplo 200 incluido
     */
    public void ejercicio2() {
        for (int i = 6; i <= 200; i += 6) {
            System.out.println(i);
        }
    }

    /**
     * Ejercicio 3: Muestra los números del 320 al 160, contando de 20 en 20
     * hacia atrás
     */
    public void ejercicio3() {
        for (int i = 320; i >= 160; i -= 20) {
            System.out.println(i);
        }
    }

    /**
     * Ejercicio 4: Escribe un programa que lea de teclado 2 números enteros y
     * saque en pantalla todos los números que estén entre ellos. Importante: El
     * programa NO debe asumir que el usuario introducirá primero el número más
     * pequeño.
     */
    public void ejercicio4() {
        System.out.println("Numero 1");
        int numero1 = consola.nextInt();
        System.out.println("Numero 2");
        int numero2 = consola.nextInt();

        if (numero1 < numero2) {
            for (int i = numero1; i <= numero2; i++) {
                System.out.println(i);
            }
        } else if (numero1 > numero2) {
            for (int i = numero1; i >= numero2; i--) {
                System.out.println(i);
            }
        }

        // Metodo2
        int menor = Math.min(numero1, numero2);
        int mayor = Math.max(numero1, numero2);

        for (int i = menor; i <= mayor; i++) {
            System.out.println(i);
        }
    }

    /**
     * Ejercicio 5: Modifica el programa anterior para que solo escriba en
     * pantalla los números pares del intervalo.
     */
    public void ejercicio5() {
        System.out.println("Numero 1");
        int numero1 = consola.nextInt();
        System.out.println("Numero 2");
        int numero2 = consola.nextInt();

        if (numero1 < numero2) {
            for (int i = numero1; i <= numero2; i++) {
                if (i % 2 == 0) {
                    System.out.println(i);
                }
            }
        } else if (numero1 > numero2) {
            for (int i = numero1; i >= numero2; i--) {
                if (i % 2 == 0) {
                    System.out.println(i);
                }
            }
        }

        // Metodo2
        int menor = Math.min(numero1, numero2);
        int mayor = Math.max(numero1, numero2);

        for (int i = menor; i <= mayor; i++) {
            if (i % 2 == 0) {
                System.out.println(i);
            }
        }
    }

    /**
     * Ejercicio 6: Escribe un programa que lea de teclado 2 números enteros y
     * saque en pantalla la suma de los números que estén en ese rango.
     * Importante: El programa NO debe asumir que el usuario introducirá primero
     * el número más pequeño.
     */
    public void ejercicio6() {
        System.out.println("Primer numero");
        int numero1 = consola.nextInt();
        System.out.println("Segundo numero");
        int numero2 = consola.nextInt();
        int suma = 0;

        if (numero1 < numero2) {
            for (int i = numero1; i <= numero2; i++) {
                suma += i;
            }
        } else if (numero1 > numero2) {
            for (int i = numero1; i >= numero2; i--) {
                suma += i;
            }
        } else {
            System.out.println("Los numeros tienen que ser diferentes");
        }

        System.out.println(suma);

        // Metodo2
        int menor = Math.min(numero1, numero2);
        int mayor = Math.max(numero1, numero2);

        for (int i = menor; i <= mayor; i++) {
            suma += i;
        }
        System.out.println(suma);
    }

    /**
     * Ejercicio 7: Diseñar un programa que muestre el producto de los 10
     * primeros números impares
     */
    public void ejercicio7() {
        int producto = 1;
        for (int i = 0; i < 20; i++) {
            if (i % 2 != 0) {
                producto *= i;
            }
        }
        System.out.println(producto);

        // Metodo 2 (Desde cualquier numero).
        System.out.println("Ingresa el numero");
        long producto2 = 1;
        int numero = consola.nextInt();
        for (int i = numero; i < (20 + numero); i++) {
            if (i % 2 != 0) {
                producto2 *= i;
                System.out.println(producto2);
            }
        }
    }

    /**
     * Ejercicio 8: Realizar un algoritmo que pida por teclado un numero entero
     * y a continuación muestre todos los divisores de ese número. (Un divisor
     * es aquel que nos da resto 0)
     */
    public void ejercicio8() {
        System.out.println("Ingresa el numero entero");
        int numero = consola.nextInt();

        for (int i = 1; i <= numero; i++) {
            if (numero % i == 0) {
                System.out.println(i);
            }
        }
    }

    /**
     * Ejercicio 9: Realizar un programa que calcule el resultado de elevar un
     * número a otro. Para ello, leerá dos números enteros por teclado (la base
     * y el exponente) y calculará el resultado, mostrándolo en pantalla. Debes
     * controlar que tanto la base como el exponente sean positivos. En el caso
     * de que alguno no lo sea volvemos a solicitarlos. No se pueden utilizar
     * las funciones que te calculen automáticamente el resultado como, por
     * ejemplo, la función Math.pow.
     */
    public void ejercicio9() {
        System.out.println("Ingresa la base");
        int base = consola.nextInt();
        System.out.println("Ingresa el exponente");
        int exponente = consola.nextInt();
        int resultado = 1;

        for (int i = 1; base < 0 || exponente < 0; i++) {
            System.out.println("Numero de intentos fallidos: " + i);
            System.out.println("Los numeros tienen que ser positivos.");
            System.out.println("Ingresa la base");
            base = consola.nextInt();
            System.out.println("Ingresa el exponente");
            exponente = consola.nextInt();
        }

        for (int i = 1; i <= exponente; i++) {
            resultado *= base;
        }

        System.out.println(resultado);
    }

    /**
     * Ejercicio 10: Implementa un programa que solicite al usuario dos números:
     * n y m. A continuación, debe mostrar todos los múltiplos de n, entre n (no
     * incluido) y m*n (incluido). Los múltiplos tienen que aparecer como una
     * cadena de números separados por “,”
     */
    public void ejercicio10() {
        System.out.println("Ingresa n");
        int n = consola.nextInt();
        System.out.println("Ingresa m");
        int m = consola.nextInt();

        String cadena = "";
        int multiplo = n * 2;
        int fin = m * n;

        for (int i = multiplo; i <= fin; i += n) {
            cadena += i;
            if (i < fin) {
                cadena = cadena + ", ";
            }
        }
        System.out.println(cadena);
    }

    /**
     * Ejercicio 11: Realiza un programa que solicite al usuario un número e
     * imprima la tabla del multiplicar del 1 al 10 de ese número.
     */
    public void ejercicio11() {
        System.out.println("Ingresa el numero");
        int numero = consola.nextInt();
        int resultado;

        for (int i = 1; i <= 10; i++) {
            resultado = numero * i;
            System.out.println(numero + " x " + i + " = " + resultado);
        }
    }

    /**
     * Ejercicio 12: Diseña un algoritmo que pida dos números por teclado (m y
     * n) y calcule el número combinatorio de ambos. El número combinatorio se
     * calcula usando la expresión: m! / (n!*(m-n)!) Importante: No hay dar por
     * supuesto que m es mayor que n. Hay que averiguar cuál es el mayor y cuál
     * es el menor. m!: factorial de m n!: factorial de n (m-n)!: factorial de
     * (m-n)
     */
    public void ejercicio12() {
        System.out.println("Ingresa el primer numero");
        double m = consola.nextDouble();
        System.out.println("Ingresa el segundo numero");
        double n = consola.nextDouble();
        double factorialM = 1;
        double factorialN = 1;
        double factorialMN = 1;
        for (int i = 1; i <= m; i++) {
            factorialM *= i;
        }

        for (int i = 1; i <= n; i++) {
            factorialN *= i;
        }

        double mayor = Math.max(m, n);
        double menor = Math.min(m, n);
        double resta = mayor - menor;

        for (int i = 1; i <= resta; i++) {
            factorialMN *= i;
        }

        double formula = 0;

        if (m > n) {
            formula = factorialM / (factorialN * factorialMN);
        } else if (m < n) {
            formula = factorialN / (factorialM * factorialMN);
        }
        System.out.println(formula);
    }

    /**
     * Ejercicio 13: Pedir 5 notas de alumnos y decir al final cuantos suspensos
     * hay. Hay que controlar que las notas sean válidas (entre 0 y 10). Si la
     * nota no es válida no se cuenta, al final tenemos que tener 5 notas
     * válidas introducidas por el usuario.
     */
    public void ejercicio13() {
        int nota;
        int suspensos = 0;
        for (int i = 0; i < 5;) {
            System.out.println("Introduce la nota");
            nota = consola.nextInt();
            if (nota >= 0 && nota <= 10) {
                if (nota > 5) {
                    suspensos++;
                }
                i++;
            }
        }
        String resultado = (suspensos == 0) ? "No hay suspensos" : "Alumnos suspensos: " + suspensos;
        System.out.println(resultado);
    }
}
