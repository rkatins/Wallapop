package Wallapop;

import java.util.ArrayList;
import java.util.Scanner;

//import java.time.LocalDate;
public class CMain {

    static Scanner woTeclado = new Scanner(System.in);
    
   

    public static void main(String[] args) {
        //System.out.println(LocalDate.getDayOfMonth());
        CVendedor woCVendedor = new CVendedor("Vendedor1");

        System.out.println("\n");

        int opcion = 0;
        while (opcion != 4) {
            System.out.println("1. Poner un objeto a la venta");
            System.out.println("2. Vender un objeto");
            System.out.println("3. Calcular ganancias de un vendedor");
            System.out.println("4. Salir");
            opcion = woTeclado.nextInt();
            woTeclado.nextLine();

            System.out.println("\n");

            menu(opcion, woCVendedor);
        }
    } //main()

    public static void menu(int opcion, CVendedor woCVendedor) {
        switch (opcion) {
            case 1:
                System.out.println("< Poner un objeto a la venta >");
                System.out.println("Selecciona categoria (Electrodomestico/Ropa)");
                String sTipoProductoCompra = woTeclado.nextLine();
                System.out.println("\n");

                if (sTipoProductoCompra.equalsIgnoreCase("electrodomestico")) {
                    System.out.println("Categoria: Electrodomestico");
                    System.out.println("Nombre del electrodomestico");
                    String wsNombreElectrodomestico = woTeclado.nextLine();
                    System.out.println("Peso del electrodomestico");
                    int wsPesoElectrodomestico = woTeclado.nextInt();
                    woTeclado.nextLine();
                    System.out.println("Precio del electrodomestico");
                    double wsPrecioElectrodomestico = woTeclado.nextDouble();
                    woTeclado.nextLine();

                    CElectrodomestico woCElectrodomestico = new CElectrodomestico(wsNombreElectrodomestico, wsPrecioElectrodomestico, wsPesoElectrodomestico);

                    woCVendedor.alProductosEnVenta.add(woCElectrodomestico);

                    System.out.println("Electrodomestico a la venta");
                } else if (sTipoProductoCompra.equalsIgnoreCase("ropa")) {
                    System.out.println("Categoria: Ropa");
                    System.out.println("Nombre de la ropa/prenda");
                    String wsNombreRopa = woTeclado.nextLine();
                    System.out.println("Talla de la ropa/prenda");
                    int wsTallaRopa = woTeclado.nextInt();
                    woTeclado.nextLine();
                    System.out.println("Precio de la ropa/prenda");
                    double wsPrecioRopa = woTeclado.nextDouble();
                    woTeclado.nextLine();

                    CRopa woCRopa = new CRopa(wsNombreRopa, wsPrecioRopa, wsTallaRopa);
                                System.out.println("Objeto creado");
        
                    woCVendedor.alProductosEnVenta.add(woCRopa);
                    
                    System.out.println("Ropa/Prenda a la venta");
                }

                System.out.println("\n");
                break;
            case 2:
                mostrar(woCVendedor.alProductosEnVenta);
                System.out.println("< Vender un objeto >");
                System.out.println("nombre del producto");
                String nombre = woTeclado.nextLine();
                woCVendedor.vender(nombre);
                System.out.println("_______");
                mostrar(woCVendedor.alProductoVendido);
                System.out.println("_______");
                break;
            case 3:
                System.out.println("< Calcular ganancias de un vendedor >");

                if (!woCVendedor.alProductoVendido.isEmpty()) {
                    System.out.println(woCVendedor.calcularGanancias());
                } else {
                    System.out.println("Ningun articcula vendido");
                }

                break;
            case 4:
                System.out.println("Saliendo ...");
                break;
        } //switch
    } //menu()
    
    public static void mostrar(ArrayList<CProducto> alCProducto) {
        for (int i = 0; i < alCProducto.size(); i++) {
            System.out.println(alCProducto.get(i));
        }
    }
}
