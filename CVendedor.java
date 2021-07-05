package Wallapop;

import java.util.ArrayList;

public class CVendedor {
	String sNombreVendedor;
	ArrayList<CProducto> alProductosEnVenta;
	ArrayList<CProducto> alProductoVendido;
	
	public CVendedor(String isNombreVendedor) {
		sNombreVendedor = isNombreVendedor;
	} //mConstructor

	@Override
	public String toString() {
		return "CVendedor [sNombreVendedor= " + sNombreVendedor + "\n" 
				+ ", alProductosEnVenta= " + alProductosEnVenta + "\n"
				+ ", alVendidos= " + alProductoVendido + "]";
	} //toString()
	
	public void vender(ArrayList<CProducto> alProductoVendido) {
		
	} //vender()
	
	public double calcularGanancias() {
		double wdGananciasTotales = 0;
		
		for (int i = 0; i < alProductoVendido.size(); i++) {
			wdGananciasTotales = wdGananciasTotales + alProductoVendido.get(i).getdPrecioFinal();
		}
		return wdGananciasTotales;
	} //calcularGanancias()
}
