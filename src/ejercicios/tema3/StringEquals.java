
package ejercicios.tema3;

import java.util.Scanner;

public class StringEquals {
        private final Scanner consola = new Scanner(System.in);
        
        /**
         * Ejercicio 5: Se necesita un algoritmo que calcule la media de tres notas 
         * introducidas por teclado y en caso de que esa media sea superior a 6.5, se muestre por pantalla 
         * ‘Promocionado con una media de XX’. En caso contrario, mostrar ‘No 
         * promocionas’.
         */
        public void ejercicio5 () {
        System.out.println("---EJERCICIO 5---");
        
        System.out.println("Mete la 1 nota");
        double nota1 = consola.nextDouble();
        System.out.println("Mete la 2 nota");
        double nota2 = consola.nextDouble();        
        System.out.println("Mete la 3 nota");
        double nota3 = consola.nextDouble();
        
        double media = (nota1 + nota2 + nota3) / 3;
        
        String calificacion = (media > 6.5)? "Promocionando con nota media de " + media : "No promocionas";
        System.out.println(calificacion);
        }
        
        /**
         * Ejercicio 6: Solicitar que el usuario introduzca una clave dos veces. Mostrar un 
         * mensaje indicando si las claves son iguales o si son diferentes.
         */
        public void ejercicio6_1 () {
        System.out.println("---EJERCICIO 6_1---");
        
        consola.nextLine();
        System.out.println("Mete la 1 clave");
        String clave1 = consola.nextLine();
        System.out.println("Mete la 2 clave");
        String clave2 = consola.nextLine();  
        
        String x = (clave1.equals(clave2))? "Son iguales" : "Son diferentes" ;
        System.out.println(x);
        }
        
        /**
         * Ejercicio 6: Realizar un algoritmo que pida por teclado dos números. Si el primero 
         * es mayor al segundo, mostrar la resta y la división de ambos. Si el segundo es 
         * mayor o igual al primero, mostrar la suma y el producto de ambos.
         */
        public void ejercicio6_2 () {
        System.out.println("---EJERCICIO 6_2---");
       
        System.out.println("Primer numero");
        double n1 = consola.nextDouble();
        System.out.println("Segundo numero");
        double n2 = consola.nextDouble();
        
        if (n1 > n2) {
            double resta = n1 - n2;
            double division = n1 / n2;
            System.out.println("Resta: " + resta + "\nDivision: " + division);
        } else {
            double suma = n1 + n2;
            double producto = n1 * n2;
            System.out.println("Producto: " + producto + "\nSuma: " + suma);
        }
        }
        
        /**
         * Ejercicio 7: Diseña un algoritmo que calcule el mayor de 5 números introducidos 
         * por el usuario (no usar bucles, se sabe que serán 5 números). 
         * Hay que controlar además, que los valores de introducidos sean correctos: 
         * números positivos.
         */
        public void ejercicio7 () {
        System.out.println("---EJERCICIO 7---");
        
        System.out.println("Mete el 1 numero");
        double num1 = consola.nextDouble();
        System.out.println("Mete el 2 numero");
        double num2 = consola.nextDouble();
        System.out.println("Mete el 3 numero");
        double num3 = consola.nextDouble();
        System.out.println("Mete el 4 numero");
        double num4 = consola.nextDouble();        
        System.out.println("Mete el 5 numero");
        double num5 = consola.nextDouble();

        if(num1 < 0 && num2 < 0 && num3 < 0 && num4 < 0 && num5 < 0 ) {
            System.out.println("Los numeros tienen que ser positivos");
        } else if(num1>num2 && num1>num3 && num1>num4 && num1>num5) {
             System.out.println("El primer numero es mayor: " + num1);
        } else if (num2>num1 && num2>num3 && num2>num4 && num2>num5) {
             System.out.println("El segundo numero es mayor: " + num2);
        } else if (num3>num1 && num3>num2 && num3>num4 && num3>num5) {
            System.out.println("El tercer numero es mayor: " + num3);
        } else if (num4>num1 && num4>num2 && num4>num3 && num4>num5) {
            System.out.println("El cuarto numero es mayor: " + num4);
        } else if (num5>num1 && num5>num2 && num5>num3 && num5>num4) {
            System.out.println("El quinto numero es mayor: " + num5);
        }
        }
        
        /**
         * Ejercicio 8: Se pide realizar un algoritmo que solicite por teclado tres números. Si 
         * todos los valores ingresados son menores a 0, se mostrará por pantalla:
         * - Los nçumeros son: números introducidos
         * - El mayor es: el número mayor
         * -El menor es: el número menor
         */
        public void ejercicio8 () {
        System.out.println("---EJERCICIO 8 ---");
        
        System.out.println("Mete el 1 numero");
        double num_1 = consola.nextDouble();
        System.out.println("Mete el 2 numero");
        double num_2 = consola.nextDouble();
        System.out.println("Mete el 3 numero");
        double num_3 = consola.nextDouble();
        
        if(num_1<0 && num_2<0 && num_3<0) {
            System.out.println("Los numeros son: " + num_1 + " " + num_2 + " " + num_3);
        }
        
         if(num_1 >= 0 && num_2 >= 0 && num_3 >= 0) {
            System.out.println("Los numeros tienen que ser negativos");
        } else if(num_1>num_2 && num_1>num_3) {
             System.out.println("El primer numero es mayor: " + num_1);        
        } else if (num_2>num_1 && num_2>num_3) {
             System.out.println("El segundo numero es mayor: " + num_2);
        } else if (num_3>num_1 && num_3>num_2) {
            System.out.println("El tercer numero es mayor: " + num_3);
        }
            
         if(num_1 >= 0 && num_2 >= 0 && num_3 >= 0) {
            System.out.println("Los numeros tienen que ser negativos");
        } else if(num_1<num_2 && num_1<num_3) {
             System.out.println("El primer numero es menor: " + num_1);
        } else if (num_2<num_1 && num_2<num_3) {
             System.out.println("El segundo numero es menor: " + num_2);
        } else if (num_3<num_1 && num_3<num_2) {
            System.out.println("El tercer numero es menor: " + num_3);
        }
        }
        
        /**
         * Ejercicio 9: Realiza un algoritmo que indique si un año es bisiesto o no. Un año es 
         * bisiesto si es divisible entre 4 y no es divisible entre 100 o es divisible entre 400. 

         */
        public void ejercicio9 () {
        System.out.println("---EJERCICIO 9---");
        
        System.out.println("Ingresa el anio");
        int anio = consola.nextInt();
        
        if (anio % 4 == 0 && anio % 100 != 0) {
            System.out.println("Es bisiesto");
        } else {
            System.out.println("No es bisiesto");
        }
        }
        
        /**
         * Ejercicio 10: Necesitamos realizar un algoritmo que dados un mes (número del 1 al 12) 
         * y un año introducidos por el usuario, indique si ese mes tiene 31, 30, 29 o 28 días. 
         * Recuerda que en los años bisiestos, Febrero tiene 29 días y no 28. 
         */
        public void ejercicio10 () {
        System.out.println("---EJERCICIO 10---");
        
        System.out.println("Ingresa el mes");
        String mes = consola.nextLine();
        System.out.println("Ingresa el año");
        int anio2 = consola.nextInt();
            
        String febrero = "febrero";
//            if(mes.equals(febrero)) {
//                
//            } 

            if (anio2 % 4 == 0 && anio2 % 100 != 0) {
            // renombrar para usar abajo el case.
            } else {
            System.out.println("No es bisiesto");
            }
            
            switch (mes) {
                case "enero": 
                case "marzo":
                case "mayo":
                case "julio":
                case "agosto":
                case "octubre":
                case "diciembre":
                    System.out.println("El mes " + mes + " tiene 31 dias");
                    break;
                case "abril":
                case "junio":
                case "septiembre":
                case "noviembre":
                    System.out.println("El mes " + mes + " tiene 30 dias");
                    break;
                default:
            }
        }
        
        /**
         * Ejercicio 11: Pregunta el nombre de dos jugadores. A continuación, simula una partida 
         * de tirada de dados: el primer jugador tira un dado de 6 caras y saca una puntuación. 
         * Luego hace lo mismo el segundo jugador. Al final se indica que jugador ha ganado. 
         */
        public void ejercicio11 () {}
        
        /**
         * Ejercicio 12: Realiza un programa que indique si un numero introducido por 
         * teclado es de 5 cifras y además es par. 
         */
        public void ejercicio12 () {
            System.out.println("Introduce un numero");
            double n = consola.nextDouble();
            
            
            
            boolean par = (n % 2 == 0)? true : false;
        }
        
        /**
         * Ejercicio 14: El sistema de verificación en dos pasos funciona de la siguiente manera: - - - - - 
         * Se le pide al usuario que introduzca su nick, su email y la contraseña. 
         * Si el email y la contraseña son correctos (definir los dos valores que querais), 
         * el programa va a generar un número aleatorio de 4 cifras y lo va 
         * a mostrar por pantalla. 
         * A continuación, se vuelve a pedir el email, la contraseña y, esta vez, el número aleatorio. 
         * Si todo ha ido correctamente, se mostrará el mensaje: “Verificación aceptada. 
         * Bienvenid@: xxxxxx (siendo xxxxxx el nick del usuario). 
         * Si hay algún fallo, se mostrará un mensaje de error. 
         * Crea un algoritmo que reproduzca el comportamiento antes indicado.
         */
        public void ejercicio14 () {}
        
        /**
         * Ejercicio 15: Una empresa maneja números enteros positivos de 4 dígitos para controlar sus productos. 
         * Estos números se denominan POOC: - P representa una de 8 provincias. - - OO un tipo de operación. C es un dígito de control. 
         * Escribe un programa que lea por teclado un número entero y escriba en pantalla 
         * los dígitos desglosados si es un número POOC válido, o un mensaje de error si no es un número POOC válido. 
         * Para ser válido se debe cumplir las 3 condiciones siguientes: - - 
         * El número debe ser exactamente de 4 cifras. 
         * El número de provincia debe ser un número entre 1 y 8 (ambos incluidos).
         * El dígito de control tiene que ser igual al resto de la división entera del tipo de 
         * operación entre el número de provincia.
         */
        public void ejercicio15 () {}
        
        /**
         * Realiza un programa que dada una cantidad de dinero en Euros, realice un desglose en billetes y monedas.
         * Los billetes disponibles son de 500,200,10,50,20,10 y 5€ y las monedas de 2 y 1€. 
         */
        public void ejercicio16 () {}

}
