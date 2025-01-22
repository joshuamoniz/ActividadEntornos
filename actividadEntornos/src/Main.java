import java.util.Arrays;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static String[] anadirProducto(String palabra, String[] inventarios) {
        String[] newInventario = Arrays.copyOf(inventarios, inventarios.length + 1);
        newInventario[newInventario.length -1] = palabra;
        return newInventario;
    }

    public static void main(String[] args) {
        int continuar = 0;
        String[] inventario = {"Ordenador", "Mesa", "Silla", "Carrito", "Teclado", "Cargador",};

            Scanner sc = new Scanner(System.in);
            String palabranueva = sc.nextLine();
            inventario=anadirProducto(palabranueva,inventario);
            System.out.println(Arrays.toString(inventario));

    }
}
