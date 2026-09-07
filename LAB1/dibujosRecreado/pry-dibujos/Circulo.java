public class Circulo extends Figura{
	private Punto centro;
	private int radio;
	
	public Circulo(Punto centro, int radio){
		this.centro = centro;
		this.radio = radio;
	}
	
	public String toString(){
		return "CIRCULO: CENTRO = " + this.centro + ", RADIO = " + radio;
	}
}