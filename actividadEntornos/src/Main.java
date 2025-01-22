import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean seguir = true;
        int eleccion = 0;
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
                    case 1 : {}
                    case 2 : {}
                    case 3 : {}
                    case 4 : {}
                    case 5 : {}
                    case 6 : {}
                    case 7 : {}
                    case 8 : {
                        System.out.println("Has finalizado el programa!");
                        seguir = false;
                    }
                }
        }while (seguir);

    }
}