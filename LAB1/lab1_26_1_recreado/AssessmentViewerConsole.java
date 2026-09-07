import java.util.Date;
import java.text.SimpleDateFormat;


public class AssessmentViewerConsole{
	
	public static void show(Assessment assessment){
		//ahora imprimimos el examen? ga...
		//hacemos
		System.out.println("Inicio de examen =====");
		System.out.println("Duracion :  " + assessment.getDuracion() +  "minutos");
		//para agregar formato a fechas 
		SimpleDateFormat sdf = new SimpleDateFormat ("dd/MM/yyyy HH:mm");
		System.out.println("Fecha hora de inicio :  " + sdf.format(assessment.getFecha()));
		
		assessment.imprimirExamen(); 
	}
}