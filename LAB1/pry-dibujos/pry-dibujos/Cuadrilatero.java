public class Cuadrilatero extends Figura  {

    private Linea linea1;
    private Linea linea2;
    private Linea linea3;
    private Linea linea4;

    public Cuadrilatero(Linea l1, Linea l2, Linea l3, Linea l4) {
       this.linea1 = l1;
       this.linea2 = l2;
       this.linea3 = l3;
       this.linea4 = l4;
    }

/*

CUADRILÁTERO:
LINEA: (0,0),(5,5)
LINEA: (5,5),(10,5)
LINEA: (10,5),(8,0)
LINEA: (8,0),(0,0)

*/

   public String toString() {
      String output = "CUADRILÁTERO: \n";
      output += "   " + this.linea1 + "\n";
      output += "   " + this.linea2 + "\n";
      output += "   " + this.linea3 + "\n";
      output += "   " + this.linea4;
      return output;
   }

}