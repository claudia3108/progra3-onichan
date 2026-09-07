import java.util.List;
import java.util.ArrayList;
import java.util.Random;

// Administra el banco de preguntas disponibles y permite elegir preguntas al azar
// para armar un examen (Assessment).
class QuestionManager{
 	private List<Question> questions;
	public QuestionManager(){
		this.questions = new ArrayList<>();
	}
	public QuestionManager(List<Question> questions){
		this.questions = new ArrayList<>(questions);
	}

	//methods
	public void add (Question question){
            this.questions.add(question);
	}

	// Elige N preguntas distintas al azar del banco de preguntas.
	// Se valida "!selected.contains" para no repetir la misma pregunta dos veces.
	public List <Question> choose_random_question(int N){
	   List <Question> selected = new ArrayList<>();
	   for(int i = 0 ; i<N ;){
		Random rand = new Random();
		int idx = rand.nextInt(questions.size());
		Integer index_random = new Integer (idx);
		Question question_finded = questions.get(index_random);
		if(!selected.contains(question_finded)){
			selected.add(question_finded);
			i++;
		}
	   }
	   return selected;
	}
}
