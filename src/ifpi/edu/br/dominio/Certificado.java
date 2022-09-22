package ifpi.edu.br.dominio;
import java.util.Date;


public class Certificado {
    public String nomeAluno;
    public String nomeCurso;
    public int ch;
    public String modalidade;
    public Date dataInicio;
    public Date dataFim;
    public int nivel;
    public Date dataNasc;
    public Curso curso;
    public Aluno aluno;

    public Certificado(String nomeAluno, String nomeCurso, int ch,String modalidade,Date dataInicio, Date dataFim, int nivel,Date dataNasc){
        this.nomeAluno = nomeAluno;
        this.nomeCurso = nomeCurso;
        this.ch = ch;
        this.modalidade = modalidade;
    }
    
    
}
