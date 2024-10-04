package tema1;

import java.util.Scanner;

public class EjerciciosCalcular {

    Scanner consola = new Scanner(System.in);

    public void edad() {

        System.out.println("Escribe un numero");
        int edad = consola.nextInt();
        System.out.println("Tu edad es " + edad);
    }

    public void sumar() {
        Calculadora calculadora = new Calculadora(5, 4);
        int resultado = calculadora.sumar();

        System.out.println(resultado);

        Calculadora calculadora2 = new Calculadora(3, 4);
        int resultado2 = calculadora2.sumar();
    }

    public void restar() {
        var calculadora3 = new Calculadora(5, 8);
        int resultado3 = calculadora3.restar();

        System.out.println(resultado3);
    }

    public void multiplicar() {
        Calculadora calculadora4 = new Calculadora(3, 7);
        int resultado4 = calculadora4.multiplicar();

        System.out.println(resultado4);
    }

    public void dividir() {
        Calculadora calculadora5 = new Calculadora(3, 0);
        Double resultado5 = calculadora5.dividir();

        System.out.println(resultado5);
    }

    public void areas() {
        int radio = 5;
        Formulas areaCirculo = new Formulas(radio);
        double resultado6 = areaCirculo.areaCirculo();

        System.out.println(resultado6);

        // Ejercicio 2: Par o impar
        int numero = 8;
        int numero2 = 5;

        if (numero2
                % 2 == 0) {
            System.out.println("Número par");
        } else {
            System.out.println("Número impar");
        }
    }
}
