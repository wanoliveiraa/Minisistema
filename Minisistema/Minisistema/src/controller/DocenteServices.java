
package controller;
import java.util.ArrayList;
import model.*;

public class DocenteServices {
    
    public static ArrayList<Disciplina> DiscProfessor(ArrayList <Turma> turmas,Docente docente){
        ArrayList<Disciplina> disciplina =new  ArrayList<Disciplina> ();
        for(Turma turma:turmas){
            if(turma.getDocente().equals(docente)){
                disciplina.add(turma.getDisciplina());
            }
        }
        return disciplina;
    }
    
    public static Docente ProcurarDocente(String matricula,ArrayList <Docente> docentes){
        for (Docente docente: docentes){
            if(docente.getMatricula().equals(matricula)){
                return docente;
            }
        }
        return null;
    }

    
    public static int qtdAlunos(ArrayList <Turma> turmas,Docente docente){
     int total=0;
     for(Turma turma:turmas){
         if(turma.getDocente().equals(docente)){
             total+=turma.getTurma().size();
            }
        }
     return total;
    }    
}    
