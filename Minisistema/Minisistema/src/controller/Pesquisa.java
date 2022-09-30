package controller;

import java.util.ArrayList;

import model.*;

public class Pesquisa{
    
    public static Curso pesquisarCurso (String codigo, ArrayList <Curso> cursos){
        for (Curso el: cursos){
            if(el.getCodigo().equals(codigo)){
                return el;
            }
        }
        return null;
    }

    public static Disciplina pesquisarDisciplina (String codigo, ArrayList <Disciplina> disciplinas){
        for (Disciplina el: disciplinas){
            if(el.getCodigo().equals(codigo)){
                return el;
            }
        }
        return null;
    }
    
}
