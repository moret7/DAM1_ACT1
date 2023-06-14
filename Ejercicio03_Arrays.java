package actividad02;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/*   Crea un programa que cree un array de 5 posiciones para controlar la cantidad de litros
     de refresco en 5 recipientes inicialmente a 0.
        1.1. Inicalmente el programa debe mostrar el siguiente mensaje al usuario:
                Introduzca la operación a realizar del siguiente menú de opciones:
                1- Añadir refresco a un recipiente.
                2-Quitar refresco de un recipiente.
                3- Calcular el total de refresco.
                0-Finalizar
        1.2. Cada vez que se realice la operación 1, 2, 3 se ha de mostrar por pantalla el estado de los recipientes.
        1.3. Controla mediante un DO WHILE que una vez realizada la operación seleccionada se vuelva a mostrar
        el menú de operaciones excepto si el usuario ha introducido un 0. Si se introduce un valor incorrecto
        (que no sea un número) o menor a 0, indica que se ha introducido un valor incorrecto y vuelve a mostrar el menú.
        1.4.  Si el usuario introduce un 1, el programa ha de pedir el número de recipiente y la cantidad de refresco
        con decimales y añadir esa cantidad al recipiente.
            1.4.1. Si la cantidad de refresco es inferior a 0 o el número de recipiente es incorrecto hay que volver
            a pedir el valor.
        1.5. Si el usuario introduce un 2, el programa ha de pedir el número de recipiente y la cantidad de refresco
        con decimales y quitar esa cantidad del recipiente.
            1.5.1. Si la cantidad de refresco restante o indicado es inferior a 0 o el número de recipiente es
            incorrecto hay que volver a pedir el valor.
        1.6. Si el usuario introduce un 3, el programa ha de mostrar la cantidad total de litros que hay en todos
        los recipientes
        1.7. Si el usuario introduce un 0, se ha de mostrar un mensaje de despedida y finalizar el programa.

 */
public class Ejercicio01 {
    public static void main(String[] args) {
        /*
         * Crea un programa que cree un array de 5 posiciones para controlar la cantidad
         * de litros de refresco en 5 recipientes inicialmente a 0. El programa debe
         * mostrar el siguiente mensaje al usuario:
*/
        // Declaramos las variables
        double movimiento = 0;
        double[] recipientes = new double[5];
        int opcion = 0, numero_recipiente1 = 0;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        // Dentro de un bucle do/while mostramos el menu hasta que se introduzca la
        // opcion 0 que es salir
        // En el switch tenemos las opciones posibles y las acciones a realizar segun el
        // caso.
        do {
            try {
                System.out.print("Menu opciones:" + "\n1. Añadir refresco a un recipiente."
                        + "\n2. Quitar refresco de un recipiente." + "\n3. Mostrar el total de refresco"
                        + "\n0. Finalizar" + "\n Por favor introduce la opcion elegida: ");
                opcion = Integer.parseInt(br.readLine());
            } catch (Exception e) {
                /*
                 * Si se introduce un valor incorrecto indica que se ha introducido un valor
                 * incorrecto y vuelve a mostrar el menú.
                 */
                System.out.println("El valor introducido es incorrecto, debe ser un numero del 0 al 3.");
                continue;
            }

            switch (opcion) {
                case 0:
                    System.out.println("Finalizando programa. Hasta pronto.");
                    break;
                case 1:
                    /*
                     * Si el usuario introduce un 1, el programa ha de pedir el número de recipiente
                     * y la cantidad de refresco con decimales y añadir ésa cantidad al recipiente.
                     */
                    System.out.println(
                            "Introduce el número a recipiente entre 0 y " + (recipientes.length - 1) + ", por favor");
                    do {
                        try {
                            /*
                             * El número de recipiente en el que ingresar ha de ser un valor valido
                             * empezando por 0. Si se introduce un número inválido hay que volver a pedirlo.
                             */
                            numero_recipiente1 = Integer.parseInt(br.readLine());
                            if (numero_recipiente1 < 0 || numero_recipiente1 >= recipientes.length) {
                                System.out.println("El valor " + numero_recipiente1 + " es un valor incorrecto.");
                                continue; // si es un valor menor a 0 o >= a la longitud del array, vuelve a pedirlo
                            }
                        } catch (Exception e) {
                            System.out.println("El valor " + numero_recipiente1 + " es un valor incorrecto.");
                            continue;
                        }
                        break;
                    } while (true);

                    do {
                        System.out.println("Introduce la cantidad a ingresar en el recipiente " + numero_recipiente1
                                + " , por favor");
                        try {
                            movimiento = Double.parseDouble(br.readLine());
                            if (movimiento < 0) {
                                System.out.println(
                                        "La cantidad " + movimiento + " es un valor incorrecto. Debe ser mayor a 0.");
                                        continue;
                            }
                        } catch (Exception e) {
                            System.out.println(
                                    "La cantidad " + movimiento + " es un valor incorrecto. Debe ser mayor a 0.");
                                    continue;
                        }
                        break;
                    } while (true);

                    recipientes[numero_recipiente1] += movimiento;
                    System.out.println("-----El estado actual en los recipientes es:");
                    for (int num_recipiente = 0; num_recipiente < recipientes.length; num_recipiente++) {
                        System.out.println("En el recipiente " + num_recipiente + " hay " + recipientes[num_recipiente]
                                + " litros");
                    }

                    break;
                case 2:
                    /*
                     * Si el usuario introduce un 2, el programa ha de pedir el número de recipiente
                     * y la cantidad de refresco con decimales y quitar ésa cantidad al recipiente.
                     */
                    System.out.println(
                            "Introduce el número a recipiente entre 0 y " + (recipientes.length - 1) + ", por favor");
                    do {
                        try {
                            /*
                             * El número de recipiente en el que ingresar ha de ser un valor valido
                             * empezando por 0. Si se introduce un número inválido hay que volver a pedirlo.
                             */
                            numero_recipiente1 = Integer.parseInt(br.readLine());
                            if (numero_recipiente1 < 0 || numero_recipiente1 >= recipientes.length) {
                                System.out.println("El valor " + numero_recipiente1 + " es un valor incorrecto.");
                                continue; // si es un valor menor a 0 o >= a la longitud del array, vuelve a pedirlo
                            }
                        } catch (Exception e) {
                            System.out.println("El valor " + numero_recipiente1 + " es un valor incorrecto.");
                            continue;
                        }
                        break;
                    } while (true);

                    do {
                        System.out.println("Introduce la cantidad a retirar  del recipiente " + numero_recipiente1
                                + " , por favor");
                        try {
                            movimiento = Double.parseDouble(br.readLine());
                            if (movimiento < 0) {
                                System.out.println(
                                        "La cantidad " + movimiento + " es un valor incorrecto. Debe ser mayor a 0.");
                                continue;
                            }
                            if (recipientes[numero_recipiente1] < movimiento) {
                                System.out.println("Error, la cantidad " + movimiento
                                        + " no puede ser mayor a la cantidad del recipiente ('"
                                        + recipientes[numero_recipiente1] + "')");
                                continue;
                            }
                        } catch (Exception e) {
                            System.out.println("La cantidad " + movimiento
                                    + " es un valor incorrecto. Debe ser un valor numérico");
                            continue;
                        }
                        break;
                    } while (true);

                    recipientes[numero_recipiente1] -= movimiento;
                    System.out.println("-----El estado actual en los recipientes es:");
                    for (int num_recipiente = 0; num_recipiente < recipientes.length; num_recipiente++) {
                        System.out.println("En el recipiente " + num_recipiente + " hay " + recipientes[num_recipiente]
                                + " litros");
                    }

                    break;
                case 3:
                    /*
                     * Si el usuario introduce un 3, el programa ha de mostrar la cantidad total de
                     * litros que hay en todos los recipientes
                     */
                    System.out.println("-----El estado actual en los recipientes es:");
                    for (int num_recipiente = 0; num_recipiente < recipientes.length; num_recipiente++) {
                        System.out.println("En el recipiente " + num_recipiente + " hay " + recipientes[num_recipiente]
                                + " litros");
                    }

                    double total = 0;
                    for (double cantidad : recipientes) {
                        total += cantidad;
                    }
                    System.out.println("La cantidad total de litros que hay en todos los recipientes es:" + total);
                    break;
                 
       

                default:
                    System.out.println("El valor introducido es incorrecto, debe ser un numero del 0 al 3.");

            }
            System.out.println("");

        } while (opcion != 0);
    }
}
