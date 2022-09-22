package ifpi.edu.br.dominio;

import java.util.ArrayList;
import java.util.List;
import java.util.Date;
public class Curso {
    private String nome;
    private int ch;
    private String modalidade;
    private Date dataInicio;
    private Date dataFim;
    private String nivel;
    private Professor professor;
    private Curso curso;
    private List<Aluno> alunos;

    
    public Curso(String nome,String nivel,int ch,Professor p){
        this.nome = nome;
        this.nivel = nivel;
        this.ch=ch;
        this.professor=p;
        this.alunos = new ArrayList<>();

    }
    public int getAlunosMatriculados(){
        return this.alunos.size();

    }
    public void realizarMatricula(Aluno aluno){
        this.alunos.add(aluno);

    }

    public String getNome() {
        return nome;
    }

    public int getCh() {
        return ch;
    }

    public String getModalidade() {
        return modalidade;
    }
    
    public List<Aluno> getAlunos() {
        return alunos;
    }

    public Date getDataInicio() {
        return dataInicio;
    }

    public Date getDataFim() {
        return dataFim;
    }

    public String getNivel() {
        return nivel;
    }

    public Professor getProfessor() {
        return professor;
    }

    public Curso getCurso() {
        return curso;
    }
}

    
    
