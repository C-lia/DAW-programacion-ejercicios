<<<<<<< HEAD
=======

>>>>>>> b52ff38c700f170e3d98faaffe39b55243a8de7d
package tema3;

import java.util.Scanner;

public class Bucles {
<<<<<<< HEAD

    private final Scanner consola = new Scanner(System.in);

    /**
     * Ejercicio 1: Muestra los números múltiplos de 5 de 0 a 100.
     */
    public void ejercicio1() {
        int numero = 0;

        while (numero <= 100) {
            System.out.println(numero);
            numero = numero + 5;
//            numero += 5;
        }
    }

    /**
     * Ejercicio 2: Muestra los números del 320 al 160, contando de 20 en 20
     * hacia atrás
     */
    public void ejercicio2() {
        int n = 320;
        while (n >= 160) {
            System.out.println(n);
            n = n - 20;
        }
    }

    /**
     * Ejercicio 3: Diseña un programa que muestre, para cada número entero
     * introducido por teclado, si es par, si es positivo y su cuadrado. El
     * proceso se repetirá hasta que el número introducido por teclado sea 0.
     */
    public void ejercicio3() {
        System.out.println("Introduce el numero.");
        int n = consola.nextInt();

        while (n != 0) {
            String par = (n % 2 == 0) ? "Si" : "No";
            String positivo = (n >= 0) ? "Si" : "No";
            int cuadrado = n * n;
            System.out.println("Es par? " + par + ". Es positivo? " + positivo + ". Cuadrado: " + cuadrado);
            n = consola.nextInt();
        }
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
            while (n1 <= n2) {
                System.out.println(n1);
                n1 = n1 + 1;
            }
        } else if (n1 > n2) {
            while (n1 >= n2) {
                System.out.println(n1);
                n1 = n1 - 1;
            }
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
            while (n1 <= n2) {
                if (n1 % 2 == 0) {
                    System.out.println(n1);
                }
                n1 = n1 + 2;
            }
        } else if (n1 > n2) {
            while (n1 >= n2) {
                if (n1 % 2 == 0) {
                    System.out.println(n1);
                }
                System.out.println(n1);
                n1 = n1 - 2;
            }
        }

        // 2 METODO 
        // Se calcula si es par o inpar y luego se le suma o se le resta uno antes de hacerle el bucle.
//            n1 = (n1 % 2 == 0)? n1 : n1 + 1; 
//            n1 = (n1 % 2 == 0)? n1 : n1 - 1;
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

        // Comparamos que numero es mayor que otro.
        if (n1 < n2) {
            while (n1 <= n2) { // Hacemos un  bucle para ir sumando los numeros, comprobamos hasta que la condicion no se cumpla.
                suma = suma + n1; // Hacemos la suma y la guardamos en su propia variable.
                n1 = n1 + 1; // Le sumamos un numero para que siga la secuencia y la guardamos en su propia variable.
            }
            System.out.println(suma); //  Mostramos la suma total.
        } else if (n1 > n2) {
            while (n1 >= n2) {
                suma = suma + n1;
                n1 = n1 - 1;
            }
            System.out.println(suma);
        }
    }

    /**
     * Ejercicio 7: Realizar un algoritmo que pida por teclado un numero entero
     * y a continuación muestre todos los divisores de ese número. (Un divisor
     * es aquel que nos da resto 0)
     */
    public void ejercicio7() {
        // Pedir el numero y guardarlo en una variable.
        // Hacer otra variable con el numero pedido.
        // Hacer un bucle hasta que llegue a 0.
        // Dentro del bucle lo primero dividir el numero entre la 2 variable y si el resto es 0 sacar que es un divisor.
        // Restarle a la 2variable un numero.

        System.out.println("Introducir un numero");
        int n = consola.nextInt();
        int divisor = n;

        while (divisor > 0) {
            if (n % divisor == 0) {
                System.out.println("Es divisor: " + divisor);
            }
//            divisor = divisor - 1;
            divisor--;
        }
    }

    /**
     * Ejercicio 8: Escriba un programa que pida un número al usuario. Si el
     * número introducido no es divisible por 2 y 3 entonces el programa
     * mostrará un mensaje de error y volverá a pedir un número al usuario. En
     * caso de que el número sea divisible por dichos números se mostrará el
     * resultado de dividirlo por ellos y se terminará el programa.
     */
    public void ejercicio8() {
        System.out.println("Introduzca el numero.");
        int n = consola.nextInt();

        //Hacemos el bucle hasta que el numeri sea divisible entre 2 y 3.
        while (n % 2 != 0 || n % 3 != 0) {
            System.out.println("El numero introducido no es divisible ni entre 2 y 3");
            n = consola.nextInt();
        }

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
        System.out.println("Introduce el primer numero positivo");
        int numeroBase = consola.nextInt();
        System.out.println("Introduce el primer numero positivo");
        int numeroExponente = consola.nextInt();
        final int numeroBase2 = numeroBase; // Lo guardamos en una variable para que no cambie cuando vayamos guardando en la varible numeroBase.

        // Hacemos el bucle para comprobar que los 2 numeros son positivos.
        while (numeroBase <= 0 || numeroExponente <= 0) { // Para que entre en los 2 casos que los numeros sean negativos hay que ponerle ||
            System.out.println("Los numeros tienen que ser positivos.");
            System.out.println("Introduce el numero base positivo.");
            numeroBase = consola.nextInt();
            System.out.println("Introduce el numero exponente positivo.");
            numeroExponente = consola.nextInt();
        }

        while (numeroExponente > 1) { // Con el exponente le indicamos el numero de vueltas, el 1 no lo incluimos porque osino entra dentro del bucle.
            numeroBase = numeroBase * numeroBase2; // Multiplicamos el numero por si mismo
            numeroExponente--; // Restamos al exponente un numero que es el que nos indica el numero de vueltas.
        }
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
        System.out.println("Introduce la clase de la caja fuerte.");
        int combinacion = consola.nextInt();

        int combinacionReal = 1234;
        int oportunidades = 4;

        // Bucle para comprobar si el numero es incorrecto e ir restando oportunidades
        while (combinacion != combinacionReal && oportunidades != 1) { // Entra cuando la combinacion es distinta y la oportunidad es distinta a 1
            oportunidades--; // Restar oportunidades
            System.out.println("Lo siento, esa no es la combinación, te quedan " + oportunidades + " oportunidades.");
            combinacion = consola.nextInt(); // Vuelve a pedir un numero
        }

        if (combinacion == combinacionReal) { // Comprubea si la combinacion es igual
            System.out.println("La caja fuerte se ha abierto satisfactoriamente");
        } else { // Nos dice que no hay mas oportunidades
            System.out.println("No hay mas oportunidades");
        }
    }
}
=======
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
    
    
>>>>>>> b52ff38c700f170e3d98faaffe39b55243a8de7d
