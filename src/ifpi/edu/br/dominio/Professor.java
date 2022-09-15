package ifpi.edu.br.dominio;
public class Professor {
     private String nome;
	private String email;
	private String formação;
     private Curso curso;
     public Professor(String nome, String email, String formação) {
          this.nome=nome;
          this.email=email;
          this.formação=formação;
     }
     public String getNome() {
          return nome;
     }
     public String getEmail() {
          return email;
     }
     public String getFormação() {
          return formação;
     }
     public Curso getCurso() {
          return curso;
     }

}

