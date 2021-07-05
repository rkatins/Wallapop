package Wallapop;

public class CElectrodomestico extends CProducto {
	int PesoKg;
	public CElectrodomestico(String iiNombre, double diPrecio, int iiPesoKg) {
		super(iiNombre, diPrecio);
		this.iIVA = 5;  // Seria mas conveniente usar this. o super. para hacerr referemcia a la variable IVA de la clase padre
		PesoKg = iiPesoKg;
	} //mConstructor

	@Override
	public String toString() {
		return "CElectrodomestico [CProducto()=" + super.toString() + "\n"
								+ "PesoKg=" + PesoKg + "]";
	} //toString()
	
	public double calcularPrecioFinal() {
		return (this.dPrecio + ((this.iIVA/100) * this.dPrecio)) + PesoKg;
	} //calcularPrecioFinal()
}
