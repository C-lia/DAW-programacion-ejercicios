package tema3;

import java.util.Scanner;

/**
 *
 * @author Celia
 */
public class BuclesEjercicios {

    private final Scanner consola = new Scanner(System.in);

    /**
     * Ejercicio 1: Crea un programa que muestre todos los múltiplos de 6 hasta
     * el múltiplo 200 incluido
     */
    public void ejercicio1() {
        int n = 6;
        int multiplo = 1;
        int resultado = 0;

        // While
        while (multiplo <= 200) {
            resultado = n * multiplo;
            System.out.println(resultado);
            multiplo++;
        }

        // Do while
        do {
            System.out.println(n);
            n = n + 6;
            multiplo++;
        } while (multiplo <= 200);
    }

    /**
     * Ejercicio 2: Mejora el ejercicio 3 de condicionales (minuto partido de
     * futbol) añadiendo lo siguiente: - Impide la entrada de segundos máximos
     * (5400). Si el usuario se pasa, saca un mensaje por pantalla indicándolo y
     * vuelve a pedir el número. - El programa no termina hasta que el usuario
     * mete un numero negativo.
     */
    public void ejercicio2() {
        int segundo;

        System.out.println("Ingrese el segundo del partido.");
        segundo = consola.nextInt();

        // While
        while (segundo > 0) {
            if (segundo > 0 && segundo <= 5400) {
                int minuto = (segundo / 60) + 1;
                System.out.println("Minuto: " + minuto);
            } else if (segundo > 5400) {
                System.out.println("El segundo tiene que ser inferior o igual a 5400");
            }
            System.out.println("Ingrese el segundo del partido.");
            segundo = consola.nextInt();
        }

//         Do while
        do {
            System.out.println("Ingrese el segundo del partido.");
            segundo = consola.nextInt();
            if (segundo > 0 && segundo <= 5400) {
                int minuto = (segundo / 60) + 1;
                System.out.println("Minuto: " + minuto);
            } else if (segundo > 5400) {
                System.out.println("El segundo tiene que ser inferior o igual a 5400");
            }
        } while (segundo > 0);

    }

    /**
     * Ejercicio 3: Implementa un programa que solicite al usuario dos números:
     * n y m. A continuación, debe mostrar todos los múltiplos de n, entre n (no
     * incluido) y m*n (incluido). La salida tiene que ser justo la indicada en
     * este ejemplo: Los múltiplos tienen que aparecer como una cadena de
     * números separados por “,”
     */
    public void ejercicio3() {
        System.out.println("Introduce el primer numero");
        int n = consola.nextInt();
        System.out.println("Introduce el segundo numero");
        int m = consola.nextInt();

        int multiplo = n * 2;
        String guardar = "";
        int fin = m * n;

        // While
        while (multiplo <= fin) {
            guardar = guardar + multiplo + ", ";
            multiplo = multiplo + n;
        }
        System.out.println(guardar);

        // Do while
        do {
            guardar = guardar + multiplo + ", ";
            multiplo = multiplo + n;
        } while (multiplo <= fin);
        System.out.println(guardar);

    }

    /**
     * Ejercicio 4: Desarrolla un algoritmo que pida 5 elementos por teclado y a
     * continuación muestre la suma de todos los elementos, la suma de aquellos
     * números mayores a 36 y la suma de aquellos números menores a 10. Nota: no
     * puedes usar 5 variables para ir leyendo de teclado.
     */
    public void ejercicio4() {
        int contador = 5;
        int numero;
        int sumaMayor = 0;
        int sumaMenor = 0;

        System.out.println("suma mayor: " + sumaMayor);
        System.out.println("suma menor: " + sumaMenor);

        // While 
        System.out.println("Introduce el numero");
        numero = consola.nextInt();

        while (contador > 0) {
            if (numero > 36) {
                sumaMayor = sumaMayor + numero;
            } else if (numero < 10) {
                sumaMenor = sumaMenor + numero;
            }
            contador--;
            System.out.println("Introduce el numero");
            numero = consola.nextInt();
        }

        //Do while
        do {
            System.out.println("Introduce el numero");
            numero = consola.nextInt();
            if (numero > 36) {
                sumaMayor = sumaMayor + numero;
            } else if (numero < 10) {
                sumaMenor = sumaMenor + numero;
            }
            contador--;
        } while (contador > 0);
    }

    /**
     * Ejercicio 5: Escribe un algoritmo que pida una lista de números enteros
     * uno a uno hasta que se introduzca el valor 0. A continuación debe
     * escribir por pantalla la posición de la primera y de la última aparición
     * del número 12 dentro de la lista. Importante: Si el número 12 no está en
     * la lista, se mostrará el valor 0 tanto para la primera posición como para
     * la segunda, y si el número 12 aparece sólo una vez, tanto la primera como
     * la última posición serán el mismo valor.
     */
    public void ejercicio5() {
        // Pedir una lista de numeros enteros.
        // Se pedira hasta que el valor sea 0 (while: numero != 0)
        // Escribir por pantalla la posicion de la primer y ultima posicion del numero 12. 
        // Si no hay poner en primera y ultima posicion un 0.
        // Si solo hay una posicion la primera y la ultima seran la misma.

        int numeros;
        int posicionPrimera = 0;
        int posicionUltima = 0;
        int posicion = 1;

        // While
        System.out.println("Introduce el numero entero");
        numeros = consola.nextInt();

        while (numeros != 0) {
            if (numeros == 12) {
                if (posicionPrimera == 0) {
                    posicionPrimera = posicion;
                }
                posicionUltima = posicion;
            }
            posicion++;
            System.out.println("Introduce el numero entero");
            numeros = consola.nextInt();
        }

        System.out.println("La primera posicion del 12 es: " + posicionPrimera);
        System.out.println("La primera posicion del 12 es: " + posicionUltima);

        // Do while
        do {
            System.out.println("Introduce el numero entero");
            numeros = consola.nextInt();
            if (numeros == 12) {
                if (posicionPrimera == 0) {
                    posicionPrimera = posicion;
                }
                posicionUltima = posicion;
            }
            posicion++;
        } while (numeros != 0);

        System.out.println("La primera posicion del 12 es: " + posicionPrimera);
        System.out.println("La primera posicion del 12 es: " + posicionUltima);
    }

    /**
     * Ejercicio 6: Mismo ejercicio anterior, pero mostrando además de la
     * primera y última aparición del número 12, la lista de todos los números
     * introducidos separados por “,” Ejemplo de salida Numeros:
     * 8,9,12,7,6,5,4,12,3,2,1,0 Primera aparición en posición 3 Segunda
     * aparición en posición 8
     */
    public void ejercicio6() {
        int numeros;
        int posicionPrimera = 0;
        int posicionUltima = 0;
        int posicion = 1;
        String guardar = "";

        // While
        System.out.println("Introduce el numero entero");
        numeros = consola.nextInt();

        while (numeros != 0) {
            if (numeros == 12) {
                if (posicionPrimera == 0) {
                    posicionPrimera = posicion;
                }

                posicionUltima = posicion;
            }
            guardar = guardar + numeros + ", ";
            posicion++;
            System.out.println("Introduce el numero entero");
            numeros = consola.nextInt();
        }

        System.out.println("La primera posicion del 12 es: " + posicionPrimera);
        System.out.println("La primera posicion del 12 es: " + posicionUltima);

        // Do while
        do {
            System.out.println("Introduce el numero entero");
            numeros = consola.nextInt();
            if (numeros == 12) {
                if (posicionPrimera == 0) {
                    posicionPrimera = posicion;
                }
                posicionUltima = posicion;
            }
            guardar = guardar + numeros + ", ";
            posicion++;
        } while (numeros != 0);

        System.out.println(guardar);
        System.out.println("La primera posicion del 12 es: " + posicionPrimera);
        System.out.println("La primera posicion del 12 es: " + posicionUltima);

    }

    /**
     * Ejercicio 7: Queremos realizar un algoritmo que vaya pidiendo una
     * sucesión de notas por teclado hasta que se introduzca el valor -1. Tras
     * eso se mostrará la media aritmética de las notas introducidas.
     * Importante: Hay que controlar que los valores de las notas introducidas
     * sea el correcto (entre 0 y 10), si es incorrecto no se tiene en cuenta
     * para el cálculo de la media. Ejemplo de salida Notas válidas: x. La media
     * es: x
     */
    public void ejercicio7() {
        double numeros;
        double sumatorio = 0;
        String guardar = "";
        int contador = 0;
        double media;

        // While
        System.out.println("Introduce los numeros");
        numeros = consola.nextDouble();

        while (numeros != 0) {
            if (numeros >= 0 && numeros <= 10) {
                guardar = guardar + numeros + ", ";
                sumatorio = sumatorio + numeros;
                contador++;
            }
            System.out.println("Introduce los numeros");
            numeros = consola.nextDouble();
        }
        media = sumatorio / contador;

        System.out.println("Notas validas: " + guardar);
        System.out.println("La media es: " + media);

        // Do while
        do {
            System.out.println("Introduce los numeros");
            numeros = consola.nextDouble();

            if (numeros >= 0 && numeros <= 10) {
                guardar = guardar + numeros + ", ";
                sumatorio = sumatorio + numeros;
                contador++;
            }
        } while (numeros != -1);
        media = sumatorio / contador;

        System.out.println("Notas validas: " + guardar);
        System.out.println("La media es: " + media);
    }

    /**
     * Ejercicio 8: Realiza una variante del ejercicio anterior donde el primer
     * valor que se solicita indica el número total de calificaciones que se
     * deben introducir.
     */
    public void ejercicio8() {
        double numeros;
        double sumatorio = 0;
        String guardar = "";
        double media;
        System.out.println("Indica el numero para hacer la media");
        int contador = consola.nextInt();
        final int numerosDividir = contador;

        // While
        System.out.println("Introduce los numeros");
        numeros = consola.nextDouble();

        while (numeros != -1 && contador > 0) {
            if (numeros >= 0 && numeros <= 10) {
                guardar = guardar + numeros + ", ";
                sumatorio = sumatorio + numeros;
                contador--;
            }
            System.out.println("Introduce los numeros");
            numeros = consola.nextDouble();
        }
        media = sumatorio / numerosDividir;

        System.out.println("Notas validas: " + guardar);
        System.out.println("La media es: " + media);

        // Do while
        do {
            System.out.println("Introduce los numeros");
            numeros = consola.nextDouble();

            if (numeros >= 0 && numeros <= 10) {
                guardar = guardar + numeros + ", ";
                sumatorio = sumatorio + numeros;
                contador--;
            }
        } while (numeros != -1 && contador > 0);
        media = sumatorio / numerosDividir;

        System.out.println("Notas validas: " + guardar);
        System.out.println("La media es: " + media);
    }

    /**
     * Ejercicio 9: Diseña un algoritmo que calcule el factorial de un número
     * positivo pedido por teclado (si introduce un 0 ó un número negativo
     * volver a pedirlo). El factorial de un número es la multiplicación desde
     * el 1 hasta ese número. Pej 5! = 1*2*3*4*5 = 120
     */
    public void ejercicio9() {
        int numero;
        int multiplicar = 1;
        do {
            System.out.println("Introduce el numero para calcular el factorial");
            numero = consola.nextInt();
            if (numero <= 0) {
                System.out.println("El numero debe ser positivo");
            }
        } while (numero <= 0);

        while (numero > 0) {
            multiplicar = multiplicar * numero;
            numero--;
        }
        System.out.println(multiplicar);

    }
}
