import java.util.List;
import java.util.ArrayList;

public class Dibujo {

    private List<Figura> figuras;

    public Dibujo() {
      this.figuras = new ArrayList<Figura>();
      this.GenerarFiguras();
    }

    private void GenerarFiguras() {
       Linea l1 = new Linea(10, 20, 20, 30);
       this.figuras.add(l1);
       Linea l2 = new Linea(30, 30, 15, 15);
       this.figuras.add(l2);  
    
       Linea lado1 = new Linea(0, 0, 5, 5);
       Linea lado2 = new Linea(5, 5, 10, 5);
       Linea lado3 = new Linea(10, 5, 8, 0);
       Linea lado4 = new Linea(8, 0, 0, 0);
       Cuadrilatero cuadrilatero = new Cuadrilatero(lado1, lado2, lado3, lado4);

       this.figuras.add(cuadrilatero);

       Circulo circulo = new Circulo(new Punto(11, 12), 10);
       this.figuras.add(circulo);
    
    }

    public void ImprimeInfoFiguras() {
       for(Figura fig: figuras) {
         System.out.println(fig);
       }
    }

}