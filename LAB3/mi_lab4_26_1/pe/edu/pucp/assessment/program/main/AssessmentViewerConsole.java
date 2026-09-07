package pe.edu.pucp.assessment.program.main;


import pe.edu.pucp.assessment.question.model.Question;
import pe.edu.pucp.assessment.exam.model.Assessment;
import pe.edu.pucp.assessment.exam.model.AssessmentItem;



import java.text.SimpleDateFormat;
import java.util.List;
import java.util.Map;

public class AssessmentViewerConsole {

    private AssessmentViewerConsole() {
    }

    public static void show(Assessment assessment) {
        System.out.println("Inicio de examen ================");
        System.out.println("Duracion: " + assessment.getDurationInMinutes() + " minutos");
        System.out.println("Fecha Hora Inicio: " + new SimpleDateFormat("dd/MM/yyyy hh:mm").format(assessment.getStartDate()));
        System.out.println();

        List<AssessmentItem> assessmentItemList = assessment.getAssessmentItems();
        for(int i = 0; i < assessmentItemList.size(); i++) {
            AssessmentItem assessmentItem = assessmentItemList.get(i);
            Question question = assessmentItem.getQuestion();
            System.out.println("Pregunta " + (i + 1) + ") " + question.devolverDatos());
            System.out.println();
        }
    }

}


 /* NOTA A LA HORA DE COMPILAR, NOTA Q SE COMPILA CARPETA 
 javac pe/edu/pucp/assessment/question/model/*.java 
javac pe/edu/pucp/assessment/teacher/model/*.java 
javac pe/edu/pucp/assessment/management/model/*.java 
javac pe/edu/pucp/assessment/exam/model/*.java 
javac pe/edu/pucp/assessment/program/main/*.java

Si quieres ver si funciona de preferenciar has esto nya

Osea haces java Main.java dentro de la carpeta donde esta el main
PS C:\Users\Claudia\Desktop\CLASES_PUCP\2026-2\P3_GENERAL\P3_para_github\LAB3\mi_lab4_26_1\pe\edu\pucp\assessment\program\main> java Main.java

 */