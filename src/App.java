import java.time.LocalDate;

import ifpi.edu.br.dominio.Aluno;
import ifpi.edu.br.dominio.Certificado;
import ifpi.edu.br.dominio.Curso;
import ifpi.edu.br.dominio.Professor;

public class App {
    public static void main(String[] args) throws Exception {

    String nome;
    LocalDate dataNasc;
    String email;
    Aluno a1 = new Aluno(nome, dataNasc, email);
    Aluno a2 = new Aluno(nome, dataNasc, email);

    String formação;
    Professor p1 =new Professor(nome, email, formação);

    

    
    String nivel;
    int ch;
    Curso c1 = new Curso(nome, nivel, ch, p1 );

    c1.nome = "ADS";
    c1.ch = 2000;
    c1.professor=p1;

    Certificado c2 = new Certificado(nome,curso);
    c2.nomeAluno = "Daniel";
    c2.nomeCurso = "ADS";






        //System.out.println("Curso "+c1.nome+ " professor "+ p1.nome);
                              
    }
}
