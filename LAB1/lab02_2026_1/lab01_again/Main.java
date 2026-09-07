import java.util.ArrayList;
import java.util.Date;
import java.util.List;

// Clase de prueba: arma preguntas, profesores y un examen completo
// para ver el resultado final impreso en consola.
public class Main {
public static void main(String[] args) {
QuestionManager questionManager = new QuestionManager();
SingleChoice sc1 = new SingleChoice( "1 + 1?",1, List.of("1", "2", "11", "0"), "2");
SingleChoice sc2 = new SingleChoice( "2*4?",2, List.of("24", "2", "8", "16"), "3");
MultipleChoice mc1 = new MultipleChoice( "is a planet?", 3,List.of("Earth", "Moon","Europe", "Mars"), List.of("1", "4"));
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
List<Question> questionsSelected = questionManager.choose_random_question(3);
// TODO
// 4. Creación del Examen (Assessment) con su metadata
List <Question_exam> questions_exams = new ArrayList<>();
questions_exams.add(new Question_exam (questionsSelected.get(0),3));
questions_exams.add(new Question_exam (questionsSelected.get(1),4));
questions_exams.add(new Question_exam (questionsSelected.get(2),1));
Assessment assessment = new Assessment(
120, // Duración en minutos
new Date(), // Fecha y hora de inicio
teachers, // Lista de profesores
questions_exams // Lista de ítems (Pregunta + Puntaje)
);
// 5. Ejecución de la evaluación
AssessmentViewerConsole.show(assessment);
}
}
