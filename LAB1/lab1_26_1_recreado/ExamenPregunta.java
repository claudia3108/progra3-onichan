public class ExamenPregunta{
	private Pregunta pregunta;
	private int puntaje;
	
	public ExamenPregunta(Pregunta pregunta, int puntaje){
		this.pregunta = pregunta;
		this.puntaje = puntaje;
	}
	
	public Pregunta getPregunta(){
		return pregunta;
	}
}