
import java.lang.reflect.Array;
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
            if (inventario[i].equals(palabraQuitar)) {
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
       String[] copia = new String[inventario.length-1];
       System.arraycopy(inventario,0,copia,0,posicion2);
       System.arraycopy(inventario,posicion2+1,copia,posicion2,inventario.length-posicion2-1);

        return copia;
    }

    public static String [] sustituir(String[] array, String nombre , String sustituir){
        int index =0;
        for (int i = 0; i <array.length ; i++) {
            if (array[i].equals(nombre)){
             array[i]=sustituir;
            }
        }
        return array;
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
                    System.out.println("Que quieres añadir:");
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
                    String sustituto= sc.next();
                    inventario=sustituir(inventario,cambio,sustituto);
                }
                case 5: {

                }
                case 6: {
                    System.out.println("Aqui tienes el inventario actual: ");
                    System.out.println(Arrays.toString(inventario));
                    break;
                }
                case 7: {
                }
                case 8: {
                    System.out.println("Has finalizado el programa!");
                    seguir = false;
                }
            }


        }while (seguir) ;

    }
}

