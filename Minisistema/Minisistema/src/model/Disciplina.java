
package model;
public class Disciplina extends Curso{
    private double ch;

    public Disciplina(String nomeCurso, String codigo,double ch) {
        super(nomeCurso, codigo);
        this.ch=ch;
    }

    public double getCh() {
        return ch;
    }
    
    
}
