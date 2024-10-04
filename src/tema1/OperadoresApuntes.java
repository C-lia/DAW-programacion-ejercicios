
package tema1;

public class OperadoresApuntes {
    double a = 3;
        double b = 2;
        
        public void apuntes(){
        
            // Operador suma
            double suma = a + b;
            System.out.println(suma);

             //Operador resta
            double resta = a - b;
            System.out.println(resta);

            // Operador multiplicación
            double producto = a * b;
            System.out.println(producto);

            // Operador división
            double division = a/b;
            System.out.println(division);

            //Resto
            double resto = a%b;
            System.out.println(resto);

            // Raiz cuadrada
            double raizCuadrada = Math.sqrt(a);
            System.out.println(raizCuadrada);

            // Redondear
            long redondear = Math.round(raizCuadrada);
            System.out.println(redondear);

            // Potencia
            double potencia = Math.pow(a, b);
            System.out.println(potencia);

            //Incremento - REVISAR
            int x = 10;

            System.out.println(x++);
            System.out.println(++x);
        }
}
