package figuras;

public class Circulo extends Figura  {
   private Punto centro;
   private int radio;

   public Circulo(Punto c, int radio) {
      this.centro = c;
      this.radio = radio;
   }

   // CIRCULO: CENTRO=(11,12),RADIO=10
   public String toString() {
      return "CIRCULO: CENTRO=" + this.centro + ",RADIO=" + this.radio;
   }
}