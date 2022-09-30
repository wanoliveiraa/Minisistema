package model;

import java.util.ArrayList;

public class Turma {
   private Docente docente;
   private Disciplina disciplina;
   private ArrayList <Aluno> turma = new ArrayList<Aluno>();

    public Turma(Docente docente, Disciplina disciplina) {
        this.docente = docente;
        this.disciplina = disciplina;
    }

    public Docente getDocente() {
        return docente;
    }

    public void setDocente(Docente docente) {
        this.docente = docente;
    }

    public Disciplina getDisciplina() {
        return disciplina;
    }

    public void setDisciplina(Disciplina disciplina) {
        this.disciplina = disciplina;
    }

    public ArrayList<Aluno> getTurma() {
        return turma;
    }

    public void setTurma(ArrayList<Aluno> turma) {
        this.turma = turma;
    }



   
   
   
   
}
