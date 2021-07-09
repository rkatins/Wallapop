package Wallapop;

import java.time.LocalDate;

public class CRopa extends CProducto {
	int iTalla;
	//int iDiaDelMes = LocalDate.getDayOfMonth();
        

	public CRopa(String isNombre, double diPrecio, int iiTalla) {
		super(isNombre, diPrecio);
		this.iIVA = 5;  // Seria mas conveniente usar this. o super. para hacerr referemcia a la variable IVA de la clase padre
		iTalla = iiTalla;
	} //mConstructor

	@Override
	public String toString() {
		return "CRopa [CProducto()=" + super.toString() + "\n"
					+ "Talla=" + iTalla + "]";
	} //toString()

	public void calcularPrecioFinal() {
            LocalDate fechaActual = LocalDate.now();
		if (fechaActual.getDayOfMonth() >= 15) {  //Alternativa: if (iDiaDelMes >= 15), instanciar LocalDate.getDayOfMonth() dentro de una variable iDiaDelMes 
			 this.dPrecio += ((10/100) * this.dPrecio);
		} else {
			 this.dPrecio += ((this.iIVA/100) * this.dPrecio);
		}
	} //calcularPrecioFinal()
}
