public class Punto{ //un punto tiene dos coordenadas
	private int x;
	private int y;
	
	public Punto (int x, int y){
		this.x = x;
		this.y = y;
	}
	
	public String toString(){
		return "(" + x + "," + y + ")";
	}
}