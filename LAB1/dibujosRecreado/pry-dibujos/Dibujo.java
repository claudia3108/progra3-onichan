import java.util.ArrayList;
import java.util.List;

public class Dibujo{
	private List<Figura> figuras;
	
	public Dibujo(){
		this.figuras = new ArrayList<>();
		
		//las figuras se generan cuando se crea la lista d 
		GenerarFiguras();
	}
	
	
	public void ImprimeInfoFiguras(){
		for (Figura fig : figuras){
			System.out.println(fig);
		}
	}
	
	//el generar figuras es un metodo privado....
	private void GenerarFiguras(){
		Linea linea1 = new Linea (10,20,20,30);
		Linea linea2 = new Linea (30,30,15,15);
		
		
		//como aplicamos poli... si podemos agregar linea1 linea2 en figuras
		this.figuras.add(linea1);
		this.figuras.add(linea2);
	
	
		//primero defino los 4 lados 
				
		Linea lado1 = new Linea (0,0,5,5);
		Linea lado2 = new Linea (5,5,10,5);
		Linea lado3 = new Linea (10,5,8,0);
		Linea lado4 = new Linea (8,0,0,0);
		
		Cuadrilatero cuad = new Cuadrilatero (lado1,lado2,lado3,lado4);
		
		this.figuras.add(cuad);
		
		//ahora hacemos el circulo
		Punto center = new Punto (11,12);
		Circulo cir = new Circulo(center,10);
		
		this.figuras.add(cir);

	}

}