 import java.util.List;
 import java.util.ArrayList;

// Pregunta de opcion multiple: el alumno puede marcar mas de una alternativa correcta.
class MultipleChoice extends Question{
     private List <String> answers;
     private List <String> options;

     public MultipleChoice (String prompt , int code_question , List<String> options,List<String> answers){
	super(prompt,code_question);
	this.answers = new ArrayList<>(answers);
	this.options = new ArrayList<>(options);
     }
     public Question clone(){
	return new MultipleChoice(prompt,code_question ,options,answers);
     }
     // Arma el texto de la pregunta numerando cada opcion (igual formato que SingleChoice).
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
