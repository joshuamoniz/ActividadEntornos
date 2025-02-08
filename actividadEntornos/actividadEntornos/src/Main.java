import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static String[] anadirProducto(String palabra, String[] inventarios) {
        String[] newInventario = Arrays.copyOf(inventarios, inventarios.length + 1);
        newInventario[newInventario.length - 1] = palabra;
        return newInventario;
    }

    public static String[] quitarProducto(String palabraQuitar, String[] inventario) {
        int posicion = 0;
        String copia = "";
        for (int i = 0; i < inventario.length; i++) {
            if (inventario[i].equalsIgnoreCase(palabraQuitar)) {
                posicion = i;
                copia = inventario[inventario.length - 1];
                inventario = Arrays.copyOf(inventario, inventario.length - 1);
                inventario[posicion] = copia;
            } else if (inventario[inventario.length - 1].equals(palabraQuitar)) {
                inventario = Arrays.copyOf(inventario, inventario.length - 1);
            }
        }
        return inventario;
    }

    public static String[] quitarPosicion(int posicion2, String[] inventario) {
        String[] copia = new String[inventario.length - 1];
        if (posicion2 >= 0 && posicion2 < inventario.length) {
            System.arraycopy(inventario, 0, copia, 0, posicion2);
            System.arraycopy(inventario, posicion2 + 1, copia, posicion2, inventario.length - posicion2 - 1);
        }
        else {
            System.out.println("No hay tantas posiciones en la tabla.");
            copia = Arrays.copyOf(inventario, inventario.length);
        }

        return copia;
    }

    public static String[] modificar(String[] array, String nombre, String sustituir) {
        int index = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i].equalsIgnoreCase(nombre)) {
                array[i] = sustituir;
            }
        }
        return array;
    }
    public static String[] sustituirPorOtro(String[] array, String palabra, int posicion) {
        boolean hacer = false;
        int index = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i].equals(palabra)) {
                hacer = true;
                index = i;
            }
        }
        if (posicion >= 0 && posicion < array.length) {
            if (hacer) {
                String temp = array[posicion];
                array[posicion] = palabra;
                array[index] = temp;
            }
        }
        return array;
    }
    public static int[] contarInventario(String[] inventario) {
        int[] cantidadInventario = new int[inventario.length];
        for (int i = 0; i < inventario.length; i++) {
            for (int j = 0; j < inventario.length; j++) {
                if (inventario[i].equalsIgnoreCase(inventario[j])) {
                    cantidadInventario[i]++;
                }
            }
        }
        System.out.println(Arrays.toString(cantidadInventario));
        return cantidadInventario;
    }
    public static void main(String[] args) {
        int continuar = 0;
        String[] inventario = {"Ordenador", "Mesa", "Silla", "Carrito", "Teclado", "Cargador"};
        Scanner sc = new Scanner(System.in);
        String palabraQuitar = "";
        boolean seguir = true;
        int eleccion;
        do {
            System.out.println("INVENTARI CIFP PERE DE SON GALL");
            System.out.println("QUE DESEAS HACER?");
            System.out.println("1. Añadir producto");
            System.out.println("2. Eliminar producto por nombre");
            System.out.println("3. Eliminar producto por posición");
            System.out.println("4. Sustituir producto");
            System.out.println("5. Modificar producto");
            System.out.println("6. Mostrar productos");
            System.out.println("7. Mostrar resumen del inventario");
            System.out.println("8. Salir");
            eleccion = sc.nextInt();
            switch (eleccion) {
                case 1: {
                    System.out.println("Que producto quieres añadir:");
                    String palabranueva = sc.next();
                    inventario = anadirProducto(palabranueva, inventario);
                }
                break;
                case 2: {
                    System.out.println("Que producto quieres eliminar?: ");
                    palabraQuitar = sc.next();
                    inventario = quitarProducto(palabraQuitar, inventario);
                    System.out.println(Arrays.toString(inventario));
                }
                break;
                case 3: {
                    System.out.println("Que posicion quieres eliminar?: ");
                    int posicionquitar = sc.nextInt();
                    inventario = quitarPosicion(posicionquitar, inventario);
                    System.out.println(Arrays.toString(inventario));
                }
                break;
                case 4: {
                    System.out.println("Que palabra quieres cambiar");
                    String cambio = sc.next();
                    System.out.println("Que palabra quieres poner ");
                    String sustituto = sc.next();
                    inventario = modificar(inventario, cambio, sustituto);
                }
                break;
                case 5: {
                    System.out.println("Que palabra quieres mover?: ");
                    String palabraASustituir = sc.next();
                    System.out.println("En que posición quieres insertar la palabra?; ");
                    int posicion = sc.nextInt();
                    inventario = sustituirPorOtro(inventario, palabraASustituir, posicion);

                }
                break;
                case 6: {
                    System.out.println("Aqui tienes el inventario actual: ");
                    System.out.println(Arrays.toString(inventario));
                }
                break;
                case 7: {
                    System.out.println("Aquí tienes la informacion del inventario: ");
                    System.out.println(Arrays.toString(inventario));
                    contarInventario(inventario);
                }
                break;
                case 8: {
                    System.out.println("Has finalizado el programa!");
                    seguir = false;
                }
                break;
            }


        } while (seguir);

    }
}

