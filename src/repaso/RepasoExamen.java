
package repaso;
import java.util.Scanner;

public class RepasoExamen {
    private final Scanner consola = new Scanner(System.in);
    /**     
     * Ejercicio 5: Se necesita un algoritmo que calcule la media de tres notas
     * introducidas por teclado y en caso de que esa media sea superior a 6.5,     * se muestre por pantalla ‘Promocionado con una media de XX’. En caso
     * contrario, mostrar ‘No promocionas’.     
     */
    public void ejercicio5() {        
        System.out.println("---EJERCICIO 5---");
        System.out.println("Mete la 1 nota");
        double nota1 = consola.nextDouble();        
        System.out.println("Mete la 2 nota");
        double nota2 = consola.nextDouble();        
        System.out.println("Mete la 3 nota");
        double nota3 = consola.nextDouble();
        double media = (nota1 + nota2 + nota3) / 3;
        String calificacion = (media > 6.5) ? "Promocionando con nota media de " + media : "No promocionas";        
        System.out.println(calificacion);
    }
    
    /**     
     * Ejercicio 6: Solicitar que el usuario introduzca una clave dos veces.
     * Mostrar un mensaje indicando si las claves son iguales o si son     
     * diferentes.
     */    
    public void ejercicio6_1() {
        System.out.println("---EJERCICIO 6_1---");
        consola.nextLine();        
        System.out.println("Mete la 1 clave");
        String clave1 = consola.nextLine();        
        System.out.println("Mete la 2 clave");
        String clave2 = consola.nextLine();
        String x = (clave1.equals(clave2)) ? "Son iguales" : "Son diferentes";        
        System.out.println(x);
    }
    
    /**     
     * Ejercicio 6: Realizar un algoritmo que pida por teclado dos números. Si
     * el primero es mayor al segundo, mostrar la resta y la división de ambos.     
     * Si el segundo es mayor o igual al primero, mostrar la suma y el producto
     * de ambos.     
     */
    public void ejercicio6_2() {        
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
     * Ejercicio 7: Diseña un algoritmo que calcule el mayor de 5 números
     * introducidos por el usuario (no usar bucles, se sabe que serán 5     * números). Hay que controlar además, que los valores de introducidos sean
     * correctos: números positivos.     
     */
    public void ejercicio7() {        
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
        
        if (num1 < 0 && num2 < 0 && num3 < 0 && num4 < 0 && num5 < 0) {            
            System.out.println("Los numeros tienen que ser positivos");
        } else if (num1 > num2 && num1 > num3 && num1 > num4 && num1 > num5) {            
            System.out.println("El primer numero es mayor: " + num1);
        } else if (num2 > num1 && num2 > num3 && num2 > num4 && num2 > num5) {            
            System.out.println("El segundo numero es mayor: " + num2);
        } else if (num3 > num1 && num3 > num2 && num3 > num4 && num3 > num5) {            
            System.out.println("El tercer numero es mayor: " + num3);
        } else if (num4 > num1 && num4 > num2 && num4 > num3 && num4 > num5) {            
            System.out.println("El cuarto numero es mayor: " + num4);
        } else if (num5 > num1 && num5 > num2 && num5 > num3 && num5 > num4) {            
            System.out.println("El quinto numero es mayor: " + num5);
        }    
    }
    
    /**
     * Ejercicio 8: Se pide realizar un algoritmo que solicite por teclado tres     
     * números. Si todos los valores ingresados son menores a 0, se mostrará por
     * pantalla: - Los nçumeros son: números introducidos - El mayor es: el     
     * número mayor -El menor es: el número menor
     */    
    public void ejercicio8() {
        System.out.println("---EJERCICIO 8 ---");
        System.out.println("Mete el 1 numero");        
        double num_1 = consola.nextDouble();
        System.out.println("Mete el 2 numero");        
        double num_2 = consola.nextDouble();
        System.out.println("Mete el 3 numero");        
        double num_3 = consola.nextDouble();
        if (num_1 < 0 && num_2 < 0 && num_3 < 0) {
            System.out.println("Los numeros son: " + num_1 + " " + num_2 + " " + num_3);        }
        if (num_1 >= 0 && num_2 >= 0 && num_3 >= 0) {
            System.out.println("Los numeros tienen que ser negativos");        
        } else if (num_1 > num_2 && num_1 > num_3) {
            System.out.println("El primer numero es mayor: " + num_1);        
        } else if (num_2 > num_1 && num_2 > num_3) {
            System.out.println("El segundo numero es mayor: " + num_2);        
        } else if (num_3 > num_1 && num_3 > num_2) {
            System.out.println("El tercer numero es mayor: " + num_3);        
        }

        if (num_1 >= 0 && num_2 >= 0 && num_3 >= 0) {            
            System.out.println("Los numeros tienen que ser negativos");
        } else if (num_1 < num_2 && num_1 < num_3) {            
            System.out.println("El primer numero es menor: " + num_1);
        } else if (num_2 < num_1 && num_2 < num_3) {            
            System.out.println("El segundo numero es menor: " + num_2);
        } else if (num_3 < num_1 && num_3 < num_2) {            
            System.out.println("El tercer numero es menor: " + num_3);
        }    
    }
 
    /**
     * Ejercicio 9: Realiza un algoritmo que indique si un año es bisiesto o no.     * Un año es bisiesto si es divisible entre 4 y no es divisible entre 100 o
     * es divisible entre 400. 
     */
    public void ejercicio9() {        
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
     * Ejercicio 10: Necesitamos realizar un algoritmo que dados un mes (número     
     * del 1 al 12) y un año introducidos por el usuario, indique si ese mes
     * tiene 31, 30, 29 o 28 días. Recuerda que en los años bisiestos, Febrero     
     * tiene 29 días y no 28.
     */    
    public void ejercicio10() {
        System.out.println("---EJERCICIO 10---");
        System.out.println("Ingresa el mes");        
        String mes = consola.nextLine();
        System.out.println("Ingresa el año");        
        int anio2 = consola.nextInt();
        if (mes.equals("febrero") && anio2 % 4 == 0 && anio2 % 100 != 0) {
            System.out.println("Es bisiesto por lo tanto tiene 29 dias");        
        } else if (mes.equals("febrero") && anio2 % 4 != 0) {
            System.out.println("No es bisiesto por lo tanto tiene 28 dias");        }
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
                System.out.println("Mes equivocado.");                
                break;
        }    
    }
    
    /**
     * Ejercicio
     * Pregunta el nombre de dos jugadores. A continuación, simula     
     * una partida de tirada de dados: el primer jugador tira un dado de 6 caras
     * y saca una puntuación. 
     * Luego hace lo mismo el segundo jugador. Al final     
     * se indica que jugador ha ganado.
     */    
    public void ejercicio11() {
        //REVISAR QUE ME HE LIADO
        double jugador1 = consola.nextDouble();        
        double jugador2 = consola.nextDouble();
        
        if (jugador1 <= 6 && jugador2 <= 6 && jugador1 > 0 && jugador2 > 0) {
            int tirada1 = (int) (Math.random() * 6 + 1);            
            int tirada2 = (int) (Math.random() * 6 + 1);
            String ganador = (tirada1 > tirada2) ? "Ganador jugador 1" : "Ganador jugador 2";            
            System.out.println(ganador);
        } else {            
            System.out.println("El numero no puede ser superior a 6 o inferior a 1");
        }        
        // valorInicial + (int) [Math.random() * (valorFnicial - valorInicial + 1) ] - Para numero aleatorio entre 4 y 8        
    }
    
    /**     
     * Ejercicio 12: Realiza un programa que indique si un numero introducido
     * por teclado es de 5 cifras y además es par.     
     */
    public void ejercicio12() {        
        System.out.println("Introduce un numero");
        double n = consola.nextDouble();
        int division = (int) (n / Math.pow(10, 4));        
        String cifras5 = (division < 10 && division > 0) ? "Si tiene 5 cifras" : "No tiene 5 cifras";
        String par = (n % 2 == 0) ? "Si es un numero par" : "No es un numero par";        
        System.out.println(cifras5 + "\n" + par);
        
        // Metodo 2 - longitud
        String conversion = Integer.toString((int) n);        
        int longitud = conversion.length();
        String cifras = (longitud < 10 && longitud > 0) ? "Si tiene 5 cifras" : "No tiene 5 cifras";        
        System.out.println(cifras);
    }
    
    /**
     * Ejercicio 14: El sistema de verificación en dos pasos funciona de la     
     * siguiente manera: - - - - - Se le pide al usuario que introduzca su nick,
     * su email y la contraseña. Si el email y la contraseña son correctos     
     * (definir los dos valores que querais), el programa va a generar un número
     * aleatorio de 4 cifras y lo va a mostrar por pantalla. A continuación, se     
     * vuelve a pedir el email, la contraseña y, esta vez, el número aleatorio.
     * Si todo ha ido correctamente, se mostrará el mensaje: “Verificación     
     * aceptada. Bienvenid@: xxxxxx (siendo xxxxxx el nick del usuario). Si hay
     * algún fallo, se mostrará un mensaje de error. Crea un algoritmo que     
     * reproduzca el comportamiento antes indicado.
     */    
    public void ejercicio14() {
        System.out.println("Introduce el nick");        
        String nick = consola.nextLine();
        System.out.println("Introduce el email");        
        String email = consola.nextLine();
        System.out.println("Introduce la contraseña");        
        String contraseña = consola.nextLine();
        String datoEmail = "michis_6@gmail.com";
        String datoContraseña = "freya";
        
        int codigo = (int) (Math.random() * Math.pow(10, 4));
        boolean verificacion1 = email.equals(datoEmail) && contraseña.equals(datoContraseña);
        
        if (verificacion1) {            
            System.out.println(codigo);
            System.out.println("Introduce el email");
            String emailVerificar = consola.nextLine();            
            System.out.println("Introduce la contraseña");
            String contraseñaVerificar = consola.nextLine();            
            System.out.println("Introduce el codigo");
            int codigoVerificar = consola.nextInt();
            boolean verificacion2 = emailVerificar.equals(email) && contraseñaVerificar.equals(contraseña) && codigoVerificar == codigo;            
            String verificacionUltima = (verificacion2) ? "Verificacion aceptada" + "\nBienvenid@: " + nick : "Los datos introducidos son incorrectos";
            System.out.println(verificacionUltima);        
        } else {
            System.out.println("Los datos no son correctos.");        
        }
    }
    
     /**     
     * Ejercicio 15: Una empresa maneja números enteros positivos de 4
     * para controlar sus productos. Estos números se denominan POOC: - P     
     * representa una de 8 provincias. - - OO un tipo de operación. C es un
     * dígito de control. Escribe un programa que lea por teclado un número     
     * entero y escriba en pantalla los dígitos desglosados si es un número POOC
     * válido, o un mensaje de error si no es un número POOC válido. Para ser     
     * válido se debe cumplir las 3 condiciones siguientes: - - El número debe
     * ser exactamente de 4 cifras. El número de provincia debe ser un número     
     * entre 1 y 8 (ambos incluidos). El dígito de control tiene que ser igual
     * al resto de la división entera del tipo de operación entre el número de     
     * provincia.
     */    
     public void ejercicio15() {
        final int longitudRequerida = 4;
        System.out.println("Introduce los numeros de 4 digitos");        
        int n = consola.nextInt();
        String cadena = Integer.toString(n);
        boolean tieneLongitudRequerida = cadena.length() == longitudRequerida;
        
        int division = (int) (n / Math.pow(10, 3));
        boolean provincia = division >= 1 && division <= 8;
        
        int provinciaPosicion = Integer.parseInt(cadena.substring(0, 1));        
        int tipoOperacionPosicion = Integer.parseInt(cadena.substring(1, 3));
        int codigoControlPosicion = Integer.parseInt(cadena.substring(3, 4));        
        boolean restoControl = tipoOperacionPosicion % provinciaPosicion == codigoControlPosicion;
        
        if (tieneLongitudRequerida && provincia && restoControl) {
            System.out.println(cadena.charAt(0));            
            System.out.println(cadena.charAt(1));
            System.out.println(cadena.charAt(2));            
            System.out.println(cadena.charAt(3));
            System.out.println("El codigo es valido");        
        } else {
            System.out.println("El codigo no es valido");        
        }
        
        // Metodo 2
        int primero = (int) n / 1000;
        int segundo = (int) (n / 100) - (primero * 10);            
        int tercero = (int) (n / 10) - (primero * 100)  - (segundo * 10);
        int cuarto = (int) n - (primero * 1000)  - (segundo * 100) - (tercero * 10);            
        int tipoOperacion2 = (segundo * 10) + tercero;    
     }
     
    /**
     * Realiza un programa que dada una cantidad de dinero en Euros, realice un     
     * desglose en billetes y monedas. Los billetes disponibles son de
     * 500,200,10,50,20,10 y 5€ y las monedas de 2 y 1€.     
     */
     
    public void ejercicio16() {        
        System.out.println("Ingresa la cantidad de dinero");
        int cantidad = consola.nextInt();
        int numeroBilletes;
        int numeroMonedas;
        
        if (cantidad>=500) {
        numeroBilletes = cantidad/500;
        cantidad = cantidad % 500;
            System.out.println(numeroBilletes + " billetes de 500");
        }
         if (cantidad>=200) {
        numeroBilletes = cantidad/200;
        cantidad = cantidad % 200;
            System.out.println(numeroBilletes + " billetes de 200");
        }
         if (cantidad>=100) {
        numeroBilletes = cantidad/100;
        cantidad = cantidad % 100;
            System.out.println(numeroBilletes + " billetes de 100");
        }
         if (cantidad>=50) {
        numeroBilletes = cantidad/50;
        cantidad = cantidad % 50;
            System.out.println(numeroBilletes + " billetes de 50");
        }
        if (cantidad>=20) {
        numeroBilletes = cantidad/20;
        cantidad = cantidad % 20;
            System.out.println(numeroBilletes + " billetes de 20");
        }
         if (cantidad>=10) {
        numeroBilletes = cantidad/10;
        cantidad = cantidad % 10;
            System.out.println(numeroBilletes + " billetes de 10");
        }
        if (cantidad>=5) {
        numeroBilletes = cantidad/5;
        cantidad = cantidad % 5;
            System.out.println(numeroBilletes + " billetes de 5");
        }
         if (cantidad>=2) {
        numeroMonedas = cantidad/2;
        cantidad = cantidad % 2;
            System.out.println(numeroMonedas + " monedas de 2");
        }
        if (cantidad>=1) {
        numeroMonedas = cantidad/1;
            System.out.println(numeroMonedas + " monedas de 1");
        }
    }
}