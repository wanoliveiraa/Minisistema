
package view;
import model.*;
import java.util.ArrayList;
import java.util.Scanner;
import view.Status;

public class Main {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        ArrayList <Aluno> alunos = new ArrayList <Aluno>();
        ArrayList <Docente> docentes = new ArrayList <Docente>();
        ArrayList <Turma> turmas = new ArrayList <Turma>();
        ArrayList <Disciplina> disciplinas = new ArrayList <Disciplina>();
        ArrayList <Curso> cursos = new ArrayList <Curso>();
        
        
        int opcao;
        do{
        System.out.println("1- Cadastrar Aluno");
        System.out.println("2- Cadastrar Docente");
        System.out.println("3- Cadastrar Curso");
        System.out.println("4- Cadastrar Disciplina");
        System.out.println("5- Cadastrar Turma");
        System.out.println("6- Cadastrar Aluno em Turma");
        System.out.println("7- Disciplinas por Aluno");
        System.out.println("8- Alunos em Turma");
        System.out.println("9- Alunos por Docente");
        System.out.println("10- Disciplinas Docente");
        System.out.println("11- Sair");
        System.out.println("-");
        opcao = teclado.nextInt();
        teclado.nextLine();
            switch(opcao){
            case 1: 
                Status.addAluno(alunos);
                break;
            case 2: 
                Status.addDocente(docentes, cursos);
                break;
            case 3:
                Status.cadastrarCurso(cursos);
                break;
            case 4:
                Status.cadastrarDisciplina(disciplinas);
                break;
            case 5:
                Status.AddTurma(turmas, docentes, disciplinas);
                break;
            case 6:                
                Status.inscreveAlunoClasse(turmas, alunos);
                break;
            case 7:
                Status.StatusDisAuno(alunos, turmas);
                break;
            case 8:
                Status.Aluno(turmas);
                break;
            case 9: 
                Status.TotalAlunos(turmas, docentes);
                break;
            case 10:
                Status.StatsDiscProf(turmas, docentes);
            }
            System.out.println(" ");
        }while(opcao!=11);
        teclado.close();
    }
}
    

