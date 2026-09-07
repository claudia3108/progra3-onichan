public abstract class Pregunta implements IPrintable{
	private int codigo; 
	private String prompt;
	
	public Pregunta(int codigo, String prompt){
		this.codigo = codigo;
		this.prompt = prompt;
	}
	
	public int getCodigo(){
		return codigo;
	}
	
	
	public String getPrompt(){
		return prompt;
	}
	public abstract String devolverDatos();
}