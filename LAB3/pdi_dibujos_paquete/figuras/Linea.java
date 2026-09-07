package figuras;

public class Linea extends Figura {

    private Punto p1;
    private Punto p2;

    public Linea(int x1, int y1, int x2, int y2) {
       this.p1 = new Punto(x1, y1);
       this.p2 = new Punto(x2, y2);
    }
   
   // LINEA: (10,20),(20,30)
   public String toString() {
      return "LINEA: " + this.p1 + "," + this.p2;
   }
    

}