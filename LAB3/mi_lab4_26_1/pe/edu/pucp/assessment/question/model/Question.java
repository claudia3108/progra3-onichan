package pe.edu.pucp.assessment.question.model;

//no es necesario hacerle import a printable porque son del mismo paquete
public abstract class Question implements Printable{
    private int code;
    protected String prompt;

    public Question(int code, String prompt) {
        this.prompt = prompt;
        this.code = code;
    }

    public int getCode() {
        return code;
    }

    public String getPrompt() {
        return prompt;
    }
}
