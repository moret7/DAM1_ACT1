package actividad01;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*    1. Identificación de los elementos de un programa informático y utilización de las estructuras de control.

        1.1. Configura tu IDE y crea un archivo de nombre  Ejercicio01.java dentro de un package (una carpeta)
        de nombre actividad01. Copia el siguiente código, añade los import necesarios (import java.io.BufferedReader;
        import java.io.IOException; import java.io.InputStreamReader;)  y ejecútalo.
        1.2. Al código (ejercicio01.java) añade después del último System.out.println(); :
                1.2.1. Un mensaje indicando que quedan 30 mangos a 2€ la unidad.
                1.2.2. Un mensaje que pregunte al usuario cuántos mangos quiere comprar.
                1.2.3. El código que reciba del usuario el número de mangos que quiere comprar
                y muestre el coste total con decimales  (multiplica el número de mangos por el precio de cada mango)
                1.2.4.  Un mensaje indicando el total de mangos que quedan en la tienda.
*/
public class Ejercicio01 {
    public static void main(String[] args) throws IOException {
        int manzanas_tienda;
        int manzanas_queremos_comprar;
        double precio_manzana;
        double dinero_pagado;

        manzanas_tienda = 20;
        manzanas_queremos_comprar = 2;
        precio_manzana = 0.40;

        System.out.println("Vamos a comprar " + manzanas_queremos_comprar + " manzanas");
        // modificamos el contenido de las variables numericas para representar la
        // compra de manzanas
        dinero_pagado = precio_manzana * manzanas_queremos_comprar;
        manzanas_tienda = manzanas_tienda - manzanas_queremos_comprar;

        // mostramos por consola el valor de las variables numericas. De forma implícita
        // se convierte de de numero a string.
        System.out.println("Nos han costado:" + dinero_pagado);
        System.out.println("En la tienda quedan " + manzanas_tienda + " manzanas");

        System.out.println("Cuantas mazanas más quieres comprar?");
        // Declaramos una variable compleja de nombre "br" y de tipo "BufferedReader".
        // Las variables del tipo "BufferedReader" contienen funciones para leer datos
        // por consola
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        // utilizamos la función "readLine" de la variable "br" para leer un dato por
        // consola. Guardamos el número introducido en la variable "valor_escrito"
        String valor_escrito = br.readLine();

        /*
         * Convertimos mediante una conversion explicita la variable "valor_escrito" a
         * un valor entero para poder operar con él y lo almacenamos en la variable
         */
        manzanas_queremos_comprar = Integer.parseInt(valor_escrito);

        System.out.println("Vamos a comprar " + manzanas_queremos_comprar + " manzanas");
        // modificamos el contenido de las variables numericas para representar la
        // compra de manzanas
        dinero_pagado = precio_manzana * manzanas_queremos_comprar;
        manzanas_tienda = manzanas_tienda - manzanas_queremos_comprar;
        // mostramos por consola el valor de las variables numericas. De forma implícita
        // se convierte de de numero a string.
        System.out.println("Nos han costado:" + dinero_pagado);
        System.out.println("En la tienda quedan " + manzanas_tienda + " manzanas");

        /* Pregunta 02
        2.	Al código anterior (ejercicio01.java) añade después del último System.out.println(); 
        1.2.1.	Un mensaje indicando que quedan 30 mangos a 2€ la unidad
        */
        System.out.println("La tienda tienen 30 mangos a 2 € la unidad.");
        int mangos=30;
        double precio =3;
        //1.2.2.	Un mensaje que pregunte al usuario cuántos mangos quiere comprar.
        System.out.print("Cuantos mangos quieres comprar?");
        //1.2.3.	El código que reciba del usuario el número de mangos que quiere comprar y muestre el coste total con decimales  (multiplica el número de mangos por el precio de cada mango)
        valor_escrito=br.readLine();
        int unidades_comprar = Integer.parseInt(valor_escrito);
        double coste_total= precio*unidades_comprar;
        System.out.println("Coste total de "+unidades_comprar+" mangos es de: "+coste_total+" €");
        //Un mensaje indicando el total de mangos que quedan en la tienda.
        mangos= mangos-unidades_comprar;
        System.out.println("Quedan "+mangos+" mangos");





    }

}
