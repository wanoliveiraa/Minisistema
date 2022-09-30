package model;
public class Docente extends Pessoa {
   protected Curso curso;
    public Docente(String nome, String cpf, String matricula,Curso curso) {
        super(nome, cpf, matricula);
        this.curso=curso;
    }

    public Curso getCurso() {
        return curso;
    }

    public void setCurso(Curso curso) {
        this.curso = curso;
    }
    
    
}
