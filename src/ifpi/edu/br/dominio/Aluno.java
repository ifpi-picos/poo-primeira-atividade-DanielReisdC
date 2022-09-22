package ifpi.edu.br.dominio;
import java.util.Date;

public class Aluno {
    private String nome;
    private String email;
    private Date dataNasc;
    private Certificado certificado;
    private Curso curso;
    
    public Aluno(String nome,Date dataNasc,String email){
        this.nome = nome;
        this.email=email;
        this.dataNasc = dataNasc;
    }
    public String getNome() {
        return nome;
    }
    
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getEmail() {
        return email;
    }
    public Date getDataNasc() {
        return dataNasc;
    }
    public Certificado getCertificado() {
        return certificado;
    }
    public Curso getCurso() {
        return curso;
    }

}
