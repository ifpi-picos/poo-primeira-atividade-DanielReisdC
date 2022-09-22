import java.text.SimpleDateFormat;
import java.time.LocalDate;
import ifpi.edu.br.dominio.Aluno;
import ifpi.edu.br.dominio.Certificado;
import ifpi.edu.br.dominio.Curso;
import ifpi.edu.br.dominio.Professor;
import java.util.Date;

public class App {
    
    public static void main(String[] args) throws Exception {
    	SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        
		Professor p1 =new Professor("Jesiel", "Jesiel@gmail.com", "Mestre");
        Curso c1 = new Curso("ADS", "extensao", 50, p1);
        Aluno a1 = new Aluno("Daniel", sdf.parse("20/06/2000"), "r4eiddsd@gmail.com");
        Aluno a2 = new Aluno("nnnn", sdf.parse("00/00/0000"), "cdsce@gmail.com");
    
   
    System.out.println("quant alunos: "+c1.getAlunosMatriculados());

    c1.realizarMatricula(a1);
    c1.realizarMatricula(a2);

    System.out.println("quant alunos: "+c1.getAlunosMatriculados());
    

    System.out.println("nome do curso: "+c1.getNome() +", professor: "+p1.getNome());

    System.out.println("Alunos: "+a1.getNome()+"," +a2.getNome());
    







        //System.out.println("Curso "+c1.nome+ " professor "+ p1.nome);
                              
    }
}
