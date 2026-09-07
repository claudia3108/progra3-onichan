import java.util.List;
import java.util.ArrayList;

// Pregunta de opcion unica: el alumno elige una sola alternativa como respuesta.
class SingleChoice extends Question {
    private String answer;
    private List <String> options;
    public SingleChoice(String prompt , int code_question , List<String> options,String answer){
	super(prompt,code_question);
	this.answer=answer;
	this.options = new ArrayList<>(options);// best creation practices
    }
    public Question clone(){
	 return new SingleChoice(prompt,code_question,options,answer);
    }
    // Arma el texto de la pregunta numerando cada opcion.
     public  String devolverDatos(){
	 String output ="";
         output+=prompt + "?";
	 output +="\n";
	 int counter=1;
	 for(String iterator : options){
	     output+= counter + ".  " + iterator + "\n";
	     counter++;
	 }
	output+="Ingrese su respuesta: ";
	return output;
    }

}
