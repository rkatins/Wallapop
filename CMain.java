package Wallapop;

import java.util.Scanner;

//import java.time.LocalDate;

public class CMain {
	static Scanner woTeclado = new Scanner(System.in);
	static CVendedor woCVendedor;
	
	public static void main(String[] args) {
		//System.out.println(LocalDate.getDayOfMonth());
		CVendedor vendedor1 = new CVendedor("CVendedor1");
		System.out.println("Creado vendedor 1");
		CVendedor vendedor2 = new CVendedor("vendedor2");
		System.out.println("Creado vendedor 2");
		CVendedor vendedor3 = new CVendedor("vendedor3");
		System.out.println("Creado vendedor 3");
		
		System.out.println("\n");
		
		int opcion = 0;
		while (opcion != 4) {
			System.out.println("1. Poner un objeto a la venta");
			System.out.println("2. Vender un objeto");
			System.out.println("3. Calcular ganancias de un vendedor");
			System.out.println("4. Salir");
			opcion = woTeclado.nextInt();woTeclado.nextLine();
			
			System.out.println("\n");
			
			menu(opcion);
		}
	} //main()
	
	public static void menu(int opcion) {
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
					int wsPesoElectrodomestico = woTeclado.nextInt();woTeclado.nextLine();
					System.out.println("Precio del electrodomestico");
					double wsPrecioElectrodomestico = woTeclado.nextDouble();woTeclado.nextLine();
					
					CElectrodomestico woCElectrodomestico = new CElectrodomestico(wsNombreElectrodomestico, wsPrecioElectrodomestico, wsPesoElectrodomestico);
					
					woCVendedor.alProductosEnVenta.add(woCElectrodomestico);
					
					System.out.println("Electrodomestico a la venta");
				} else if (sTipoProductoCompra.equalsIgnoreCase("ropa")) {
					System.out.println("Categoria: Ropa");
					System.out.println("Nombre de la ropa/prenda");
					String wsNombreRopa = woTeclado.nextLine();
					System.out.println("Talla de la ropa/prenda");
					int wsTallaRopa = woTeclado.nextInt();woTeclado.nextLine();
					System.out.println("Precio de la ropa/prenda");
					double wsPrecioRopa = woTeclado.nextDouble();woTeclado.nextLine();
					
					CRopa woCRopa = new CRopa(wsNombreRopa, wsPrecioRopa, wsTallaRopa);
					
					woCVendedor.alProductosEnVenta.add(woCRopa);
					System.out.println("Ropa/Prenda a la venta");
				}
				
				System.out.println("\n");
				break;
			case 2:
				System.out.println("< Vender un objeto >");
				System.out.println("Selecciona categoria (Electrodomestico/Ropa)");
				String sTipoProductoVenta = woTeclado.nextLine();
				System.out.println("\n");
				
				if (sTipoProductoVenta.equalsIgnoreCase("electrodomestico")) {
					System.out.println("Categoria: Electrodomestico");
					System.out.println("Nombre del electrodomestico");
					String wsNombreElectrodomestico = woTeclado.nextLine();
					
					if (woCVendedor.alProductosEnVenta.contains(wsNombreElectrodomestico)) {
						System.out.println("Producto no a la venta");
					}
									
				} else if (sTipoProductoVenta.equalsIgnoreCase("ropa")) {
					System.out.println("Categoria: Ropa");
					System.out.println("Nombre de la ropa/prenda");
					String wsNombreRopa = woTeclado.nextLine();
					
					if (woCVendedor.alProductosEnVenta.contains(wsNombreRopa)) {
						System.out.println("Producto no a la venta");
					}
				}
				
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
}
