
package controller;
import java.util.ArrayList;
import model.*;

public class TurmaServices {
    
    public static void cadastrarTurma(Turma turma,Aluno aluno){
        turma.getTurma().add(aluno);
    }
    
      public static Turma procurarTurma(String disciplina, ArrayList<Turma> turmas){
        for(Turma elm: turmas){
            if(elm.getDisciplina().getNomeCurso().equals(disciplina)){
                return elm;
            }
        }
        
        return null;
    }
}
