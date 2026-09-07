public class Cuadrilatero extends Figura{
	private Linea linea1;
	private Linea linea2;
	private Linea linea3;
	private Linea linea4;
	
	public Cuadrilatero(Linea linea1, Linea linea2, Linea linea3, Linea linea4){
		this.linea1 = linea1;
		this.linea2 = linea2;
		this.linea3 = linea3;
		this.linea4 = linea4;
	
	}
	
	public String toString(){
		String text = "CUADRILATERO: \n";
		text += "LINEA: " + this.linea1 + "\n";
		text += "LINEA: " + this.linea2 + "\n";
		text += "LINEA: " + this.linea3 + "\n";
		text += "LINEA: " + this.linea4;
		
		return text;
	}
}