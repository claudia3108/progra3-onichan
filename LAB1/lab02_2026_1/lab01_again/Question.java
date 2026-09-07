import java.util.List;
import java.util.ArrayList;


// Clase base abstracta para toda pregunta (de opcion unica o multiple).
// Guarda el enunciado y su codigo, comunes a cualquier tipo de pregunta.
abstract class Question implements IPrintable {
   protected String prompt;
   protected int code_question;

// builders with parameters
  public Question(String prompt , int code_question){
       this.prompt = prompt;
       this.code_question = code_question;
  }

  // clone() se usa para poder copiar la pregunta al armar el examen,
  // sin modificar la pregunta original que quedo en el banco de preguntas.
  public abstract Question clone ();
  public abstract String devolverDatos();


}
