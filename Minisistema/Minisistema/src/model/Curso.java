package model;
public class Curso {
    protected String nomeCurso;
    protected String codigo;

    public Curso(String nomeCurso, String codigo) {
        this.nomeCurso = nomeCurso;
        this.codigo = codigo;
    }

    public String getNomeCurso() {
        return nomeCurso;
    }

    public String getCodigo() {
        return codigo;
    }
    
    
}
