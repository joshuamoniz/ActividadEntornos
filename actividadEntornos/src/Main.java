
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static String[] anadirProducto(String palabra, String[] inventarios) {
        String[] newInventario = Arrays.copyOf(inventarios, inventarios.length + 1);
        newInventario[newInventario.length -1] = palabra;
        return newInventario;
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
                    case 1 : {
                        System.out.println("Que quieres añadir:");
                        String palabranueva = sc.next();
                        inventario=anadirProducto(palabranueva,inventario);
                    } break;
                    case 2 : {
                        System.out.println("Que producto quieres eliminar?: ");
                        palabraQuitar = sc.next();
                        for (int i = 0; i < inventario.length; i++) {
                            if (inventario[i].contains(palabraQuitar)) {
                                inventario[i]="";
                            }
                        }
                        } break;
                    case 3 : {}
                    case 4 : {}
                    case 5 : {}
                    case 6 : {
                        System.out.println("Aqui tienes el inventario actual: ");
                        System.out.println(Arrays.toString(inventario)); break;
                    }
                    case 7 : {}
                    case 8 : {
                        System.out.println("Has finalizado el programa!");
                        seguir = false;
                    }
                }
        }while (seguir);

    }
}
