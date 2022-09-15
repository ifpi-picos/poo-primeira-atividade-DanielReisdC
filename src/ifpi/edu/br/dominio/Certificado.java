package ifpi.edu.br.dominio;

import java.time.LocalDate;

public class Certificado {
    public String nomeAluno;
    public String nomeCurso;
    public int ch;
    public String modalidade;
    public LocalDate dataInicio;
    public LocalDate dataFim;
    public int nivel;
    public LocalDate dataNasc;
    public Curso curso;
    public Aluno aluno;

    public Certificado(String nomeAluno, String nomeCurso, int ch,String modalidade,LocalDate dataInicio, LocalDate dataFim, int nivel,LocalDate dataNasc){
        this.nomeAluno = nomeAluno;
        this.nomeCurso = nomeCurso;
        this.ch = ch;
        this.modalidade = modalidade;
    }
    
    
}
