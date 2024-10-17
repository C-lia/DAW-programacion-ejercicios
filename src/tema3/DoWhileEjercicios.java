package tema3;

import java.util.Scanner;

public class DoWhileEjercicios {

    private final Scanner consola = new Scanner(System.in);

    /**
     * Ejercicio 1: Muestra los números múltiplos de 5 de 0 a 100.
     */
    public void ejercicio1() {
        int numero = 0;
        do {
            System.out.println(numero);
            numero += 5;
        } while (numero <= 100);
    }

    /**
     * Ejercicio 2: Muestra los números del 320 al 160, contando de 20 en 20
     * hacia atrás
     */
    public void ejercicio2() {
        int numero = 320;
        do {
            System.out.println(numero);
            numero = numero - 20;
        } while (numero >= 160);
    }

    /**
     * Ejercicio 3: Diseña un programa que muestre, para cada número entero
     * introducido por teclado, si es par, si es positivo y su cuadrado. El
     * proceso se repetirá hasta que el número introducido por teclado sea 0.
     */
    public void ejercicio3() {
        int n;
        do {
            System.out.println("Introduce el numero.");
            n = consola.nextInt();
            if (n != 0) {
                String par = (n % 2 == 0) ? "Si" : "No";
                String positivo = (n >= 0) ? "Si" : "No";
                int cuadrado = n * n;
                System.out.println("Es par? " + par + ". Es positivo? " + positivo + ". Cuadrado: " + cuadrado);
            }
        } while (n != 0);
    }

    /**
     * Ejercicio 4: Escribe un programa que lea de teclado 2 números enteros y
     * saque en pantalla todos los números que estén entre ellos. Importante: El
     * programa NO debe asumir que el usuario introducirá primero el número más
     * pequeño.
     */
    public void ejercicio4() {
        System.out.println("Introduce el primer numero");
        int n1 = consola.nextInt();
        System.out.println("Introduce el segundo numero");
        int n2 = consola.nextInt();

        if (n1 < n2) {
            do {
                System.out.println(n1);
                n1++;
            } while (n1 <= n2);
        } else if (n1 > n2) {
            do {
                System.out.println(n1);
                n1--;
            } while (n1 >= n2);
        }
    }

    /**
     * Ejercicio 5: Modifica el programa anterior para que solo escriba en
     * pantalla los números pares del intervalo.
     */
    public void ejercicio5() {
        System.out.println("Introduce el primer numero");
        int n1 = consola.nextInt();
        System.out.println("Introduce el segundo numero");
        int n2 = consola.nextInt();

        if (n1 < n2) {
            do {
                if (n1 % 2 == 0) {
                    System.out.println(n1);
                }
                n1++;
            } while (n1 <= n2);
        } else if (n1 > n2) {
            do {
                if (n1 % 2 == 0) {
                    System.out.println(n1);
                }
                n1--;
            } while (n1 >= n2);
        }
    }

    /**
     * Ejercicio 6: Escribe un programa que lea de teclado 2 números enteros y
     * saque en pantalla la suma de los números que estén en ese rango.
     * Importante: El programa NO debe asumir que el usuario introducirá primero
     * el número más pequeño.
     */
    public void ejercicio6() {
        System.out.println("Introduce el primer numero");
        int n1 = consola.nextInt();
        System.out.println("Introduce el segundo numero");
        int n2 = consola.nextInt();
        int suma = 0;

        if (n1 < n2) {
            do {
                suma = suma + n1;
                n1++;
            } while (n1 <= n2);
        } else if (n1 > n2) {
            do {
                suma = suma + n1;
                n1--;
            } while (n1 >= n2);
        }
        System.out.println(suma);
    }

    /**
     * Ejercicio 7: Realizar un algoritmo que pida por teclado un numero entero
     * y a continuación muestre todos los divisores de ese número. (Un divisor
     * es aquel que nos da resto 0)
     */
    public void ejercicio7() {
        System.out.println("Ingresa el número");
        int n = consola.nextInt();
        int divisor = n;
        do {
            if (n % divisor == 0) {
                System.out.println("Es divisor: " + divisor);
            }
            divisor--;
        } while (divisor > 0);
    }

    /**
     * Ejercicio 8: Escriba un programa que pida un número al usuario. Si el
     * número introducido no es divisible por 2 y 3 entonces el programa
     * mostrará un mensaje de error y volverá a pedir un número al usuario. En
     * caso de que el número sea divisible por dichos números se mostrará el
     * resultado de dividirlo por ellos y se terminará el programa.
     */
    public void ejercicio8() {
        int n;
        do {
            System.out.println("Introduzca el número");
            n = consola.nextInt();
            if (n % 2 != 0 || n % 3 != 0) {
                System.out.println("El numero introducido no es divisible entre 2 ni 3");
            }
        } while (n % 2 != 0 || n % 3 != 0);

        //Calculamos el resultado de la division y lo sacamos por pantalla.
        int resultadoDivisor2 = n / 2;
        int resultadoDivisor3 = n / 3;
        System.out.println(resultadoDivisor2 + " , " + resultadoDivisor3);
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
        int numeroBase;
        int numeroExponente;

        do {
            System.out.println("Introduce el primer numero positivo");
            numeroBase = consola.nextInt();
            System.out.println("Introduce el primer numero positivo");
            numeroExponente = consola.nextInt();
            if (numeroBase <= 0 || numeroExponente <= 0) {
                System.out.println("los numeros ingresados deben ser positivo.");
            }
        } while (numeroBase <= 0 || numeroExponente <= 0);

        final int numeroBase2 = numeroBase;
        do {
            numeroBase = numeroBase * numeroBase2;
            System.out.println(numeroBase);
            numeroExponente--;
        } while (numeroExponente > 1);
        System.out.println("El resultado es: " + numeroBase);
    }

    /**
     * Ejercicio 10: Realiza el control de acceso a una caja fuerte. La
     * combinación será un número de 4 cifras que podemos definir como
     * constante. El programa nos pedirá la combinación para abrirla. Tendremos
     * cuatro oportunidades para abrir La caja fuerte. Si no acertamos, se nos
     * mostrará el mensaje “Lo siento, esa no es la combinación, te quedan x
     * oportunidades” y si acertamos se nos dirá “La caja fuerte se ha abierto
     * satisfactoriamente”, terminando el programa Si introducimos 4 veces la
     * combinación mal el programa termina con el mensaje “No hay más
     * oportunidades”
     */
    public void ejercicio10() {
        int combinacionReal = 1234;
        int oportunidades = 4;
        int combinacion; // Declarar antes para poder usar dentro y fuera del bucle.

        do {
            System.out.println("Introduce la clase de la caja fuerte.");
            combinacion = consola.nextInt();
            oportunidades--; // Restar oportunidades
            if (combinacion != combinacionReal && oportunidades > 0) { // El if porque osino nos sale por consola que nos queda 0 oportunidades, aunque no vuelva a pedir el numero.
                System.out.println("Lo siento, esa no es la combinación, te quedan " + oportunidades + " oportunidades.");
            }
        } while (combinacion != combinacionReal && oportunidades != 0);
        
        if (combinacion == combinacionReal) { // Comprubea si la combinacion es igual
            System.out.println("La caja fuerte se ha abierto satisfactoriamente");
        } else { // Nos dice que no hay mas oportunidades
            System.out.println("No hay mas oportunidades");
        }
    }
}
