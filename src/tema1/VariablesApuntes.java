/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tema1;

/**
 *
 * @author Celia
 */
public class VariablesApuntes {
    public void apuntes () {
        // Declaro una variable de tipo entero y le asigno un valor.
        int miVariableEntera =10;
        System.out.println(miVariableEntera);
        
        miVariableEntera =4;
        System.out.println(miVariableEntera);
        
        // Declarar una varible de tipo real.
        
        double numero1 = 2.3;
        double numero2 = 5.0, numero3= 52.14;
        int numero4 = 5;
        
        // Suma
        double suma = numero1 + numero2 + numero3;
        double suma2 = numero1 + numero4;
        
        // Suma numeros decimales
        System.out.println(suma);
        
        // Suma numeros enteros y decimales
        System.out.println(suma2);
        
        //Declarar una constante de tipo real
        final double piReal = 3.1416;
        
        System.out.println(numero1);
        System.out.println(piReal);
        
        //Declarar una cadena de caracteres.
        String miVariableCadena = "Saludos";
                System.out.println(miVariableCadena);
        
        String miVariableCadena2 = "Adios";
        System.out.println(miVariableCadena + " " + miVariableCadena2);
        
        // Libreria Math
        double PI = Math.PI;
        
        double suma3 =5 + PI;
        double areaCirculo = PI * Math.pow(5, 2);
        
        System.out.println("Suma numero PI" + " " + suma2);
        System.out.println(areaCirculo);
        
        String texto = "Mi primo dijo: \"Al final era yo\"";
        String texto2 = "Hola me llamo \nCelia";
        String texto3 = "Tengo \t27\\anios";
        String texto4 ="Tengo muchos\\gatos";
        System.out.println(texto);
        System.out.println(texto2);
        System.out.println(texto3);
        System.out.println(texto4);
        
        boolean valor1 = true;
        boolean valor2 = true, valor3 = false;
        System.out.println(valor1);
        
        //Identificadores
        // Poniendo el principio de mi variable si le doy control y espacio se me despliegan los que empiezan por ese.
        // Para ver donde esta la variable le das a control y "click".
    }
}
