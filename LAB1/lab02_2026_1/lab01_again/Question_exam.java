// Relaciona una pregunta con el puntaje que vale dentro de un examen.
// Se clona la pregunta en el constructor para que el examen tenga su propia copia,
// independiente del banco de preguntas original.
class Question_exam{
    private Question question;
    private double score;
    public Question_exam(Question question , double score){
        this.question = question.clone();
	this.score = score ;
    }
    public String get_datos(){
	return this.question.devolverDatos();
    }
}
