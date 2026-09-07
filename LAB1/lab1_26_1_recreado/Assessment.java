import java.util.List;
import java.util.ArrayList;
import java.util.Date; //importar la fecha
public class Assessment {
	private int duracion;
	private Date fechaHoraInicio;
	
	private List<Teacher> profesores; 
	private List <ExamenPregunta> preguntas;
	
	
	public Assessment(int duracion, Date fechaHoraInicio,List<Teacher> profesores,
	List <ExamenPregunta> preguntas){
		this.duracion =  duracion;
		this.fechaHoraInicio = fechaHoraInicio;
		this.profesores = profesores;
		this.preguntas = preguntas;
	}
	
	public int getDuracion(){
		return duracion;
	}
	
	public Date getFecha(){
		return fechaHoraInicio; 
	}
	
	public void imprimirExamen(){
		for (ExamenPregunta exPreg : preguntas){
			//todo eso ya es de la clase PREGUNTA 
			System.out.println(exPreg.getPregunta().devolverDatos());
		}
	}
}