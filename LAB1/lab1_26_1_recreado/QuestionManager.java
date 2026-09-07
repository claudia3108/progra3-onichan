import java.util.List;
import java.util.ArrayList;
import java.util.Random;
public class QuestionManager{
	//question manager contiene la lista de preguntas ya que vemos que
	//hace como un questionManager.add(eltipodepregunta);
	private List<Pregunta> preguntas;
	
	
	public QuestionManager(){
		this.preguntas = new ArrayList<>();
	}
	
	public void add(Pregunta pregunta){
		this.preguntas.add(pregunta);
	}
	
	
	//un metodo q bota una lista llamada selectRandomN con parametro n
	public List<Pregunta> selectRandomN(int n) {
		Random random = new Random();
		
		
		List <Pregunta> seleccionados = new ArrayList<>();
		int counter = 0;
		while (counter < n){
			//para que escoga un indice random... QUE DEBE SER DE LA LISTA DE PREGUNTAS QUE YA SE
			// LLENO PREVIAMENTE CON .ADD 
			int idx = random.nextInt(this.preguntas.size());
			
			//aca en java Arraylist si tiene indice como vector 
			//para hacerlo debemos hacer nombrelista.get(indice);
			
			//y sacamos la pregunta de la lista d preguntas y lo llamamos seleccionado
			Pregunta seleccionado = this.preguntas.get(idx);
			
			//si no se repite entonces lo podemos agregar
			if (!seleccionados.contains(seleccionado)){
				//lo agregamos a la lista
				seleccionados.add(seleccionado);
				counter++;
			}
			//sino q busque otro ga, ojo q counter va dentro del if 

		}
	
		return seleccionados;
	
	}
	
}