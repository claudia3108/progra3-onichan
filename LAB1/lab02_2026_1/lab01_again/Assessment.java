import java.util.Date;
import java.util.List;
import java.util.ArrayList;

// Representa un examen completo: duracion, fecha de inicio, profesores a cargo
// y las preguntas (con puntaje) que lo componen.
class Assessment {
	private double duration ;
	private Date   date_hour_start;
	private List <Question_exam> questions;
	private List <Teacher> teachers;
	public Assessment(double duration , Date date_hour_start ,List<Teacher> teachers , List<Question_exam> questions){
		this.duration = duration;
		this.date_hour_start = date_hour_start;
		this.teachers = new ArrayList<>(teachers);
		this.questions = new ArrayList<>(questions);
	}

 	public Date get_date_hour_start(){
		return this.date_hour_start;
	}
	public double get_duration(){
		return this.duration;
	}

	// Concatena el texto de todas las preguntas del examen, en el orden en que fueron agregadas.
	public String show_questions(){
	  String output="";
	  for(Question_exam q : questions){
		output+=q.get_datos();
	  }
	  return output;
	}


}
