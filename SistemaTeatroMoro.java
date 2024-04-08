package sistemateatromoro;

import java.util.Scanner;

public class SistemaTeatroMoro {

    public static void main(String[] args) {

        Scanner inicioScanner = new Scanner(System.in);
        Scanner opcionScanner = new Scanner(System.in);

        Scanner ubicacionScanner = new Scanner(System.in);

        Scanner cantidadEntradasVipScanner = new Scanner(System.in);
        Scanner cantidadEntradasPbajaScanner = new Scanner(System.in);
        Scanner cantidadEntradasPaltaScanner = new Scanner(System.in);
        Scanner cantidadEntradasPalcoScanner = new Scanner(System.in);

        Scanner edadScanner = new Scanner(System.in);

        int inicio;
        int opcion;
        int edad;

        int ubicacion;
        int cantidadEntradasVip = 0;
        int cantidadEntradasPlateaBaja = 0;
        int cantidadEntradasPlateaAlta = 0;
        int cantidadEntradasPalcos = 0;

        int valorEntradaVip = 25000;
        int valorEntradaPlateaBaja = 19000;
        int valorEntradaPlateaAlta = 11000;
        int valorEntradaPalcos = 7200;

        int cantidadEntradas = 0;
        int valorEntrada = 0;
        int descuento;
        int subtotal;
        int total = 0;

        // Entrada del sistema.
        System.out.println("## Bienvenido al sistema de ventas del Teatro Moro ##");
        System.out.println("    ");

        // Para iniciar el sistema se debe presionar 1, de lo contrario, sale del programa.
        System.out.println("- Para comprar entradas, presione: 1");
        System.out.println("- Para salir presione cualquier numero.");

        System.out.println("    ");

        inicio = inicioScanner.nextInt();

        if (inicio == 1) {

            do {

                do {
                    System.out.println("    ");
                    System.out.println("Indique la ubicacion que desea:");
                    System.out.println("    ");
                    System.out.println("1: VIP - precio: $25.000");
                    System.out.println("2: Platea Baja - precio: $19.000");
                    System.out.println("3: Platea Alta - precio: $11.000");
                    System.out.println("4: Palcos - precio: $7.200");
                    System.out.println("    ");

                    // se pide una ubicacion de entrada valida entre 1 y 4 de lo contrario vuelve a pedir una ubicacion valida.
                    ubicacion = ubicacionScanner.nextInt();
                    switch (ubicacion) {
                        case 1:
                            do {
                                System.out.println("    ");
                                System.out.println("Ha elegido la ubicacion: VIP");
                                System.out.println("    ");
                                System.out.println("Indique cuantas entradas desea:");
                                System.out.println("    ");

                                // se pide cantidad de entradas mayor a 1, de lo contrario vuelve a pedir el numero de entradas valido.
                                cantidadEntradasVip = cantidadEntradasVipScanner.nextInt();

                                if (cantidadEntradasVip > 0) {

                                    // asigno la cantidad de entradas para mostrarlas en la salida.
                                    cantidadEntradas = cantidadEntradasVip;

                                    // asigno el valor de la entrada
                                    valorEntrada = valorEntradaVip;

                                } else {
                                    System.out.println("    ");
                                    System.out.println("El sistema detecta 0 entradas, vuelva a intentarlo.");
                                }

                            } while (cantidadEntradasVip < 1);
                            break;
                        case 2:
                            do {
                                System.out.println("    ");
                                System.out.println("Ha elegido la ubicacion: Platea Baja");
                                System.out.println("    ");
                                System.out.println("Indique cuantas entradas desea:");
                                System.out.println("    ");

                                // se pide cantidad de entradas mayor a 1, de lo contrario vuelve a pedir el numero de entradas valido.
                                cantidadEntradasPlateaBaja = cantidadEntradasPbajaScanner.nextInt();

                                if (cantidadEntradasPlateaBaja > 0) {

                                    // asigno la cantidad de entradas para mostrarlas en la salida.
                                    cantidadEntradas = cantidadEntradasPlateaBaja;

                                    // asigno el valor de la entrada
                                    valorEntrada = valorEntradaPlateaBaja;

                                } else {
                                    System.out.println("    ");
                                    System.out.println("El sistema detecta 0 entradas, vuelva a intentarlo.");
                                }

                            } while (cantidadEntradasPlateaBaja < 1);
                            break;
                        case 3:
                            do {
                                System.out.println("    ");
                                System.out.println("Ha elegido la ubicacion: Platea Alta");
                                System.out.println("    ");
                                System.out.println("Indique cuantas entradas desea:");
                                System.out.println("    ");

                                // se pide cantidad de entradas mayor a 1, de lo contrario vuelve a pedir el numero de entradas valido.
                                cantidadEntradasPlateaAlta = cantidadEntradasPaltaScanner.nextInt();

                                if (cantidadEntradasPlateaAlta > 0) {

                                    // asigno la cantidad de entradas para mostrarlas en la salida.
                                    cantidadEntradas = cantidadEntradasPlateaAlta;

                                    // asigno el valor de la entrada
                                    valorEntrada = valorEntradaPlateaAlta;

                                } else {
                                    System.out.println("    ");
                                    System.out.println("El sistema detecta 0 entradas, vuelva a intentarlo.");
                                }

                            } while (cantidadEntradasPlateaAlta < 1);
                            break;
                        case 4:
                            do {
                                System.out.println("    ");
                                System.out.println("Ha elegido la ubicacion: Palcos");
                                System.out.println("    ");
                                System.out.println("Indique cuantas entradas desea:");
                                System.out.println("    ");

                                // se pide cantidad de entradas mayor a 1, de lo contrario vuelve a pedir el numero de entradas valido.
                                cantidadEntradasPalcos = cantidadEntradasPalcoScanner.nextInt();

                                if (cantidadEntradasPalcos > 0) {

                                    // asigno la cantidad de entradas para mostrarlas en la salida.
                                    cantidadEntradas = cantidadEntradasPalcos;

                                    // asigno el valor de la entrada
                                    valorEntrada = valorEntradaPalcos;

                                } else {
                                    System.out.println("    ");
                                    System.out.println("El sistema detecta 0 entradas, vuelva a intentarlo.");
                                }

                            } while (cantidadEntradasPalcos < 1);
                            break;
                        default:
                            System.out.println("    ");
                            System.out.println("La opcion es incorrecta, vuelva a intentarlo.");
                            System.out.println("    ");
                    }
                } while (ubicacion < 1 || ubicacion > 4);

                do {
                    System.out.println("    ");
                    System.out.println("Indique su edad:");
                    System.out.println("    ");
                    edad = edadScanner.nextInt();

                    // valido que la edad sea mayo a 0, de lo contrario vuelve a pedir una edad valida
                    if (edad < 1) {
                        System.out.println("la edad no puede ser 0, vuelva a intentarlo.");
                    }

                } while (edad < 1);

                if (edad <= 17) {
                    System.out.println("    ");
                    System.out.println("ud posee un descuento del 10% por cada entrada.");
                    descuento = (int) (valorEntrada * 0.9);
                } else if (edad >= 60) {
                    System.out.println("    ");
                    System.out.println("ud posee un descuento del 15% por cada entrada.");
                    descuento = (int) (valorEntrada * 0.85);

                } else {
                    descuento = valorEntrada;
                }

                // calculo la cantidad de entradas por el valor de cada entrada.
                subtotal = cantidadEntradas * descuento;

                // sumo el subtotal cada vez que vuelve a comprar entradas y lo asigno a la variable total.
                total += subtotal;

                // salida de información.
                System.out.println("    ");
                switch (ubicacion) {
                    case 1:
                        if (cantidadEntradasVip > 0) {
                            System.out.println("- ubicacion: VIP" + " - " + "cantidad de entradas: " + cantidadEntradasVip);
                        }
                        break;
                    case 2:
                        if (cantidadEntradasPlateaBaja > 0) {
                            System.out.println("- ubicacion: Platea baja" + " - " + "cantidad de entradas: " + cantidadEntradasPlateaBaja);
                        }
                        break;
                    case 3:
                        if (cantidadEntradasPlateaAlta > 0) {
                            System.out.println("- ubicacion: Platea alta" + " - " + "cantidad de entradas: " + cantidadEntradasPlateaAlta);
                        }
                        break;
                    case 4:
                        if (cantidadEntradasPalcos > 0) {
                            System.out.println("- ubicacion: Palcos" + " - " + "cantidad de entradas: " + cantidadEntradasPalcos);
                        }
                        break;
                }

                // muestro el valor de la entrada sin descuento.                
                System.out.println("- precio normal de entrada:" + " " + "$" + valorEntrada);

                // si la edad aplica para el descuento, se muestra este mensaje.
                if (edad <= 17 || edad >= 60) {
                    System.out.println("- precio de entrada con descuento aplicado:" + " " + "$" + descuento);
                }

                System.out.println("- total a pagar es:" + " " + "$" + total);
                System.out.println("    ");

                // consulta para volver a comprar o salir.
                System.out.println("¿Desea hacer otra compra?");
                System.out.println("1: Si");
                System.out.println("2: No");
                System.out.println("    ");

                /* si la opcion es 1 vuelve al inicio para hacer la compra, si es 2, sale del programa,
                   de lo contrario indica que la opcion no es valida y vuelve a consultar por la opcion valida. */
                opcion = opcionScanner.nextInt();
                System.out.println("    ");
                if (opcion < 1 || opcion > 2) {
                    System.out.println("    ");
                    System.out.println("La opcion es incorrecta, vuelva a intentarlo.");
                    System.out.println("    ");
                }

            } while (opcion == 1);
            // salida en caso de que el usuario envia la opcion 2 para salir.
            System.out.println("Gracias por su compra!!");
            System.out.println("    ");

        } else {
            System.out.println("Saliendo del sistema.");
        }
        // cierre variables scanner
        inicioScanner.close();
        opcionScanner.close();
        ubicacionScanner.close();
        cantidadEntradasVipScanner.close();
        cantidadEntradasPbajaScanner.close();
        cantidadEntradasPaltaScanner.close();
        cantidadEntradasPalcoScanner.close();
        edadScanner.close();
    }
}
