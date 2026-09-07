import java.util.List;
import java.util.ArrayList;

public class MultipleChoice extends Pregunta{
	private List<String> opciones; 
	private List<Integer> respuestas; 
	
	public MultipleChoice(int codigo, String prompt,List<String> opciones,List<Integer> respuestas){
		
		super(codigo,prompt);
		this.opciones = opciones;
		this.respuestas = respuestas;
	}
	
	
	@Override 
	public String devolverDatos(){
		String texto; 
		texto = "Pregunta " +  getCodigo() + getPrompt() + " ? \n";
		int counter = 1;
		for (String opc : opciones){
			texto+= counter + "." + opc + "\n";
			counter++;
		}
		texto += "Seleccione las opciones de su respuesta: ";
		
		return texto;
	}
}