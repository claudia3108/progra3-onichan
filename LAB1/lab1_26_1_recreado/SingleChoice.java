import java.util.List;
import java.util.ArrayList;

public class SingleChoice extends Pregunta{
	private List<String> opciones; //hacemos una lista de las opciones que en general puede ser un string

	private int respuesta; //que seria la pos en la lista? ga 
	
	
	/*
	TODA PREGUNTA TIENE UN PROMPT Y CODIGO...
	SINGLE CHOICE ES TAMBIEN UNA PREGUNTA POR LO QUE DEBEMOS
	DEFINIRLO... PERO COMO LOS ATRIBUTOS SE ENCUENTRAN EN PREGUNTA
	DEBEMOS PONER SUPER PARA QUE LLAME AL CONSTRUCTOR DE LA CLASE BASE
	nota: los ponemos tambien como parametros en el constructor 
	nota 2: EL ORDEN DE LAS VARIABLES ES RELEVANTE  
		*/ 
		
	public SingleChoice(int codigo,String prompt, List<String> opciones,int respuesta){
		
		super(codigo,prompt);
		this.opciones = opciones;
		this.respuesta = respuesta;
	}
	
	//como tiene super, ya tiene a codigo y prompt... lo podemos poner pero CON GET 
	@Override 
	public String devolverDatos(){
		String texto; 
		texto = "Pregunta " +  getCodigo() + getPrompt() + " ? \n";
		int counter = 1;
		for (String opc : opciones){
			texto+= counter + "." + opc + "\n";
			counter++;
		}
		texto += "Ingrese su respuesta: ";
		
		
		return texto;
	}
}