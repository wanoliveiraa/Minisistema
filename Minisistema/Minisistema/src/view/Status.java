
package view;
import controller.*;
import model.*;
import java.util.ArrayList;
import java.util.Scanner;
public class Status {
    
    public static void cadastrarDisciplina(ArrayList<Disciplina> disciplinas){
        Scanner teclado = new Scanner(System.in);
        System.out.print("Nome: ");
        String nome = teclado.nextLine();

        System.out.print("Codigo: ");
        String codigo = teclado.nextLine();

        System.out.print("Ch: ");
        double ch = teclado.nextDouble();
        teclado.nextLine();

        disciplinas.add(new Disciplina(nome, codigo, ch));
        
    }

    public static void cadastrarCurso(ArrayList<Curso> cursos){
        Scanner teclado = new Scanner(System.in);
        System.out.print("Nome: ");
        String nome = teclado.nextLine();

        System.out.print("Codigo: ");
        String codigo = teclado.nextLine();

        cursos.add(new Curso(nome, codigo));
        
    }
    public static void addAluno(ArrayList<Aluno>alunos){
        Scanner teclado = new Scanner(System.in);
        System.out.print("Nome: ");
        String nome = teclado.nextLine();

        System.out.print("Cpf: ");
        String cpf = teclado.nextLine();

        System.out.print("Matricula: ");
        String matricula = teclado.nextLine();

        alunos.add(new Aluno(nome,cpf,matricula));
    }
      public static void addDocente(ArrayList<Docente> docentes,ArrayList<Curso> cursos){
        Scanner teclado = new Scanner(System.in);
        System.out.print("Nome: ");
        String nome = teclado.nextLine();

        System.out.print("Cpf: ");
        String cpf = teclado.nextLine();

        System.out.print("Matricula: ");
        String matricula = teclado.nextLine();
        
        System.out.print("Codigo do Curso: ");
        String codigo = teclado.nextLine();

        Curso curso = Pesquisa.pesquisarCurso(codigo,cursos);
        
        docentes.add(new Docente(nome, cpf, matricula, curso));   
    }
    public static void AddTurma(ArrayList <Turma> turmas ,ArrayList <Docente> docentes,ArrayList <Disciplina> disciplinas){
        Scanner teclado = new Scanner(System.in);
        if(disciplinas.size() <= 0){
            System.out.println("Nenhuma disciplina cadastrada");
            return;
        }else if (docentes.size() <= 0){
            System.out.println("Nenhum docente cadastrado");
            return;
        }

        System.out.print("Matricula Docente: ");
        String matricula = teclado.nextLine();

        Docente docente = DocenteServices.ProcurarDocente(matricula, docentes);

        if (docente == null){
            System.out.println("Docente nao cadastrado");
            return;
        }

        System.out.print("Codigo Disciplina: ");
        String codigo = teclado.nextLine();

        Disciplina disciplina = Pesquisa.pesquisarDisciplina(codigo,disciplinas);

        if (disciplina == null){
            System.out.println("Disciplina nao cadastrada");
            return;
        }

        turmas.add(new Turma(docente, disciplina));
    }
    
    public static void Aluno (ArrayList <Turma> turmas){
        Scanner teclado = new Scanner(System.in);
        System.out.print("Disciplina: ");
        String disciplina = teclado.nextLine();
        for(Turma turma: turmas){
            if (turma.getDisciplina().getNomeCurso().equals(disciplina)){
                for(Aluno elm: turma.getTurma()){
                    System.out.println(elm.getNome());
                }   
            }
        }

    }
    
    public static void StatusDisAuno(ArrayList <Aluno> alunos,ArrayList <Turma> turmas){
        Scanner teclado = new Scanner(System.in);
        System.out.print("Matricula: ");
        String matricula = teclado.nextLine();
        Aluno aux = AlunoServices.getAluno(matricula, alunos);

        if (aux == null){
            System.out.println("Aluno nao cadastrado");
        }

        ArrayList <Disciplina> disciplinas = AlunoServices.getDisc(aux, turmas);

        if (disciplinas.size() <= 0){
            System.out.println("Aluno nao esta cadastrado em nenhuma disciplina");
        }

        for(Disciplina elm: disciplinas){
            System.out.println("Matriculado");
            break;
        }
    }
    public static void StatsDiscProf(ArrayList<Turma> turmas, ArrayList<Docente> docentes){
        Scanner teclado = new Scanner(System.in);
        System.out.println("Matricula: ");
        String matricula = teclado.nextLine();

        Docente docente = DocenteServices.ProcurarDocente(matricula,docentes);
        if (docente == null){
            System.out.println("Docente nao cadastrado");
        }
        ArrayList <Disciplina> disciplinas = DocenteServices.DiscProfessor(turmas, docente);

        for(Disciplina discip: disciplinas){
            System.out.println(discip.getNomeCurso());
        }
    }
    public static void TotalAlunos(ArrayList <Turma> turmas, ArrayList<Docente> docentes){
        Scanner teclado = new Scanner(System.in);
        System.out.print("Codigo Doscente: ");
        String matricula = teclado.nextLine();
        Docente docente = DocenteServices.ProcurarDocente(matricula, docentes);

        if (docente == null){
            System.out.println("Docente nao cadastrado");
            return;
        }

        int total = DocenteServices.qtdAlunos(turmas, docente);

        System.out.println("Total Alunos:" + total);
    }
     public static void inscreveAlunoClasse(ArrayList <Turma> turmas, ArrayList<Aluno> alunos){
        Scanner teclado = new Scanner(System.in);   
        System.out.print("Matricula Aluno: ");
        String matricula = teclado.nextLine();

        Aluno aluno = AlunoServices.getAluno(matricula, alunos);

        if (aluno == null){
            System.out.println("Aluno nao cadastrado");
            return;
        }

        System.out.print("Disciplina: ");
        String disciplina = teclado.nextLine();

        Turma turma = TurmaServices.procurarTurma(disciplina, turmas);

        if (turma == null){
            System.out.println("Turma nao cadastrada");
            return;
        }

        TurmaServices.cadastrarTurma(turma, aluno);
    }
}
   
