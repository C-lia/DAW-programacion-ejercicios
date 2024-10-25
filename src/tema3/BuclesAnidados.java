package tema3;

import java.util.Scanner;

public class BuclesAnidados {

    private final Scanner consola = new Scanner(System.in);

    /**
     * Ejercicios echos en clase que nos sirven de ejemplo.
     */
    public void clase() {

        for (int i = 1; i <= 2; i++) {
            System.out.println("bucle externo. i= " + i);
            for (int j = 1; j <= 3; j++) {
                System.out.println("bucle medio. j= " + j);
                for (int k = 1; k <= 4; k++) {
                    System.out.println("bucle externo. k= " + k);
                }
            }
        }

        for (int i = 1; i <= 3; i++) {
            System.out.println("Bucle externo i=" + i);
            int j = 1;
            while (j <= i) {
                System.out.println("Bucle interno j=" + j);
                j++;
            }
        }

        // Tabla de multiplicar del 1 al 5.
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= 10; j++) {
                int resultado = i * j;
                System.out.println(i + " x " + j + " = " + resultado);
            }
        }

        // Imprimir una tabla de coordenaddas.
        for (int i = 1; i <= 3; i++) {
            for (int j = 1; j <= 3; j++) {
                System.out.println("(" + i + "," + j + ")");
            }
        }

        // Dibujar un triángulo de altura 5 de *.
        int altura = 5;
        for (int i = 1; i <= altura; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println("");
        }
    }

    /**
     * Ejercicio 1: Algoritmo que muestre la tabla de multiplicar de los números
     * del 1 al 10
     */
    public void ejercicio1() {
        for (int i = 1; i <= 10; i++) {
            for (int j = 1; j <= 10; j++) {
                int resultado = i * j;
                System.out.println(i + " x " + j + " = " + resultado);
            }
        }
    }

    /**
     * Ejercicio 2: Escribe un algoritmo que lea por teclado un número N entero
     * positivo y dibuje un cuadrado de asteriscos de lado N. Nota: con
     * System.out.print () podemos escribir caracteres sin saltar línea. Pej: Si
     * el número es 4, se obtiene (respeta los espacios entre *).
     *
     */
    public void ejercicio2() {
        int n;
        do {
            System.out.println("Introduce el numero");
            n = consola.nextInt();
        } while (n < 0);

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                System.out.print(" * ");
            }
            System.out.println("");
        }
    }

    /**
     * Ejercicio 3: Escribe un algoritmo que lea por teclado un número N entero
     * positivo y dibuje un triángulo de asteriscos con base y altura N. Pej, Si
     * el número es 5 se obtiene:
     */
    public void ejercicio3() {
        System.out.println("Numero");
        int n = consola.nextInt();
        int altura = n;

        for (int i = 1; i <= altura; i++) {
            for (int k = 1; k <= (altura - i); k++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print(" ");
                System.out.print("*");
            }
            System.out.println("");
        }

    }

    /**
     * Ejercicio 4: Igual que en el ejercicio anterior, pero además, ahora el
     * usuario introduce el carácter a dibujar:
     */
    public void ejercicio4() {
        System.out.println("Numero");
        int n = consola.nextInt();
        consola.nextLine();
        System.out.println("Introduce el caracter");
        String caracter = consola.nextLine();
        int altura = n;

        for (int i = 1; i <= altura; i++) {
            for (int k = 1; k <= (altura - i); k++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print(" ");
                System.out.print(caracter);
            }
            System.out.println("");
        }
    }

    /**
     * Ejercicio 5: Realiza un programa que pida al usuario un número entero N
     * mayor a 10. A continuación, haz que muestre la lista de números del 1 al
     * N sustituyendo los múltiplos de 3 por la palabra FIZZ y los múltiplos de
     * 5 por la palabra BUZZ. Además, también deben sustituirse los múltiplos de
     * 3 y 5 por la palabra FIZZBUZZ. a) Muestra la lista de números en
     * vertical. b) Muestra la lista de números en horizontal separados por
     * espacio. c) Muestra la lista de números en horizontal separado por coma
     * (,). Obviamente, el último valor no debe llevar coma detrás.
     */
    public void ejercicio5() {
        System.out.println("Introduce el numero");
        int n = consola.nextInt();
        String guardar;
        String guardar2 = "";
        String guardar3 = "";

        for (int i = 1; i <= n; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                guardar = "FIZZBUZZ";
            } else if (i % 3 == 0) {
                guardar = "FIZZ";
            } else if (i % 5 == 0) {
                guardar = "BUZZ";
            } else {
                guardar = "" + i;
            }
            System.out.println(guardar);
            guardar2 = guardar2 + guardar + " ";
            if (i < n) {
                guardar3 = guardar3 + guardar + ",";
            } else {
                guardar3 = guardar3 + guardar;
            }
        }
        System.out.println(guardar2);
        System.out.println(guardar3);
    }

    /**
     * Ejercicio 6: Adivina el número: Crea un programa que simule el juego de
     * adivinar un número. El funcionamiento del juego es el siguiente: • El
     * programa “piensa” un número entero aleatorio entre 1 y 100. • A
     * continuación, pide un número entero al usuario entre 1 y 100 • Mientras
     * el número del usuario no sea el número “pensado”, el juego no acaba. • Si
     * el número del usuario es mayor que el “pensado”, se debe mostrar el
     * mensaje: “Te has pasado!!” • Si el número del usuario es menor que el
     * “pensado”, se debe mostrar el mensaje: “Te has quedado corto!!” • Cuando
     * el usuario meta el mismo número que el “pensado”, se muestra el mensaje:
     * “Lo lograste!” y el juego acaba.
     */
    public void ejercicio6() {
        int n = (int) (Math.random() * 100) + 1;
        int usuario;
        do {
            System.out.println("Introduce el numero para adivinar");
            usuario = consola.nextInt();
            if (usuario > n) {
                System.out.println("Te has pasado!!");
            }
            if (usuario < n) {
                System.out.println("Te has quedado corto!!");
            }
        } while (usuario != n);

        System.out.println("Lo lograstes!!");

    }

    /**
     * Ejercicio 7: El juego de las bolas: Este es un juego donde el jugador
     * compite contra la máquina. Para ello: • El usuario comienza introduciendo
     * un numero natural positivo que representará la cantidad de bolas inicial
     * que hay en una urna. • A continuación, la maquina decide quien empieza de
     * forma aleatoria. • En cada turno, el usuario o la máquina podrán retirar
     * 1,2 o 3 bolas (es decir, eligen restar 1, 2 o 3). • Si es el jugador, se
     * le preguntará cuantas bolas quiere sacar (hay que controlar que sean 1, 2
     * o 3). • Si es la máquina, decidirá de forma aleatoria si saca 1,2 o 3
     * bolas. • Tras cada turno se muestra el número de bolas que quedan en la
     * urna • Los turnos se repiten de forma alternativa hasta que uno de los
     * dos retira la última bola. Quien haga eso, pierde.
     */
    public void ejercicio7() {

        final int numeroBolas;
        int maquina;
        int turno = (int) (Math.random() * 2) + 1;
        int persona;
        int bolas;

        do {
            System.out.println("Introduce el numero de bolas inicial.");
            bolas = consola.nextInt();
            if (bolas < 0) {
                System.out.println("El numero de bolas tiene que ser positivo");
            }
        } while (bolas < 0);

        if (turno == 2) {
            System.out.println("Comienza el usuario");
        } else if (turno == 1) {
            System.out.println("Comienza la maquina");
        }

        while (bolas > 0) {
            if (turno % 2 == 0) {
                System.out.println("Turno persona");
                persona = consola.nextInt();
                if (persona >= 1 && persona <= 3) {
                    bolas -= persona;
                } else {
                    System.out.println("El numero debe de ser entre 1 y 3.");
                    System.out.println("Turno persona");
                    persona = consola.nextInt();

                    do {
                        System.out.println("Turno persona");
                        persona = consola.nextInt();
                        if (persona >= 1 && persona <= 3) {
                            bolas -= persona;
                        } else {
                            System.out.println("El numero debe de ser entre 1 y 3.");
                        }
                    } while (true);
                }
            } else if (turno % 2 != 0) {
                System.out.println("Turno maquina");
                maquina = (int) (Math.random() * 3) + 1;
                bolas -= maquina;

            }

            turno++;
            System.out.println(bolas);
        }
    }
}
