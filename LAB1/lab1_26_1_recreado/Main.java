import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Main {
	public static void main(String[] args) {
		QuestionManager questionManager = new QuestionManager();
		
		SingleChoice sc1 = new SingleChoice(1, "1 + 1?", List.of("1", "2", "11", "0"), 2);
		
		SingleChoice sc2 = new SingleChoice(2, "2*4?", List.of("24", "2", "8", "16"), 3);
		
		MultipleChoice mc1 = new MultipleChoice(3, "is a planet?", List.of("Earth", "Moon",
		"Europe", "Mars"), List.of(1, 4));
		
		questionManager.add(sc1);
		questionManager.add(sc2);
		questionManager.add(mc1);
// 2. Registro de Profesores
		Teacher teacher1 = new Teacher("11111111", "Freddy", "Paz");
		Teacher teacher2 = new Teacher("22222222", "Jose", "Corcuera");
		List<Teacher> teachers = new ArrayList<>();
		teachers.add(teacher1);
		teachers.add(teacher2);
// 3. Selección de preguntas para el examen y asignación de puntajes
		List<Pregunta> questionsSelected = questionManager.selectRandomN(3);
// TODO

		List<ExamenPregunta> listaItems = new ArrayList<>();
		ExamenPregunta aux; 
		int puntaje = 5; 
		
		for (Pregunta preg : questionsSelected){
			aux = new ExamenPregunta(preg,puntaje);
			listaItems.add(aux);
		}
		
// 4. Creación del Examen (Assessment) con su metadata
		Assessment assessment = new Assessment(
		120, new Date(), teachers, // Lista de profesores
		listaItems);
// 5. Ejecución de la evaluación
		AssessmentViewerConsole.show(assessment);
	}
}