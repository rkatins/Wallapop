package Wallapop;

import java.util.ArrayList;

public class CVendedor {
	String sNombreVendedor;
	ArrayList<CProducto> alProductosEnVenta;
	ArrayList<CProducto> alProductoVendido;
	
	public CVendedor(String isNombreVendedor) {
		sNombreVendedor = isNombreVendedor;
                alProductosEnVenta = new ArrayList<CProducto>();
                alProductoVendido = new ArrayList<CProducto>();
        } //mConstructor

	@Override
	public String toString() {
		return "CVendedor [sNombreVendedor= " + sNombreVendedor + "\n" 
				+ ", alProductosEnVenta= " + alProductosEnVenta + "\n"
				+ ", alVendidos= " + alProductoVendido + "]";
	} //toString()
	
	public void vender(String nombre) {
            for (int i = 0; i < alProductosEnVenta.size(); i++) {
                if (nombre.equalsIgnoreCase(alProductosEnVenta.get(i).sNombre)) {
                    alProductoVendido.add(alProductosEnVenta.get(i));
                    alProductosEnVenta.remove(i);
                    
                    System.out.println("Producto borrado");
                
                }
            }
	} //vender()
	
	public double calcularGanancias() {
		double wdGananciasTotales = 0;
		
		for (int i = 0; i < alProductoVendido.size(); i++) {
			wdGananciasTotales = wdGananciasTotales + alProductoVendido.get(i).dPrecioFinal;
		}
		return wdGananciasTotales;
	} //calcularGanancias()
}
