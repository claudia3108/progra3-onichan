import java.text.SimpleDateFormat;

// Se encarga solo de mostrar un examen por consola, separado de la logica del examen.
class AssessmentViewerConsole{
	public static void show(Assessment assessment){
	    System.out.println("Inicio de examen ==========");
	    System.out.println("Duracion: " + assessment.get_duration());
	    SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm");

	    System.out.println("Fecha Hora Inicio: " + sdf.format(assessment.get_date_hour_start()));
	    System.out.println(assessment.show_questions());
	}
}
