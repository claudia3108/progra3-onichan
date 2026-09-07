public class Linea extends Figura{
	private Punto p1;
	private Punto p2;
	
	
	//siempre en los constructores hacemos referencia a las variables con las q vamos a trabajar ojito 
	public Linea(int x1, int y1, int x2, int y2 ){
	//EMPEZAMOS A RELACIONAR LINEA CON PUNTO... 	
		this.p1 = new Punto (x1, y1);
		this.p2 = new Punto (x2, y2);
	}
	
	//es toString , con la mayus ahi y todo
	public String toString(){
		return this.p1 + "," + this.p2;
	}
}