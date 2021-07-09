package Wallapop;

public class CProducto {
	String sNombre;
	double dPrecio;
	double dPrecioFinal;
	float iIVA;
	
	public CProducto(String isNombre, double diPrecio) {
		sNombre = isNombre;
		dPrecio = diPrecio;
		calcularPrecioFinal();
		iIVA = 20;
	} //mConstructor

	@Override
	public String toString() {
		return "CProducto [Nombre=" + sNombre + "\n" + ", Precio=" + dPrecio + "� \n" + ", PrecioFinal=" + dPrecioFinal + "� \n" + ", IVA=" + iIVA + "]";
	} //toString()

	public void calcularPrecioFinal() {
		this.dPrecioFinal = dPrecio + ((iIVA/100) * dPrecio);
	} //calcularPrecioFinal()

		
}
