
package controller;

import java.util.ArrayList;
import model.*;

public class AlunoServices {


    public static Aluno getAluno(String matricula, ArrayList <Aluno> alunos){
        for (Aluno elm: alunos){
            if(elm.getMatricula().equals(matricula)){
                return elm;
            }
        }
        return null;
    }
   
    public static ArrayList <Disciplina> getDisc(Aluno aluno,ArrayList <Turma> turmas){
        ArrayList <Disciplina> disciplinas= new ArrayList <Disciplina>();
        
        for(Turma turma:turmas){
            for(Aluno elm:turma.getTurma()){
                if(elm.equals(aluno)){
                    disciplinas.add(turma.getDisciplina());
                    break;
                }
            }
        }
        return disciplinas;
    }
    
}
