package ifpi.edu.br.dominio;
import java.time.LocalDate;

public class Aluno {
    private String nome;
    private String email;
    private LocalDate dataNasc;
    private Certificado certificado;
    private Curso curso;
    
    public Aluno(String nome,LocalDate dataNasc,String email){
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
    public LocalDate getDataNasc() {
        return dataNasc;
    }
    public Certificado getCertificado() {
        return certificado;
    }
    public Curso getCurso() {
        return curso;
    }

}
