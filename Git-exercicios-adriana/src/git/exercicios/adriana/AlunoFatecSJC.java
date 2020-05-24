
package git.exercicios.adriana;

/**
 *
 * @author Denise
 */
public class AlunoFatecSJC {//classe com atributos
    public String nome;
    public int ra;
    public String curso;
    public float nota;

    public String getNome() {
        return nome;
    }

    public float getNota() {
        return nota;
    }

    public void setNota(float nota) {
        this.nota = nota;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getRa() {
        return ra;
    }

    public void setRa(int ra) {
        this.ra = ra;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    
    public AlunoFatecSJC(String nome, int ra, String curso, float nota) {
        this.nome = nome;
        this.ra = ra;
        this.curso = curso;
        this.nota = nota;
    }
    
    //MÉTODO NOTA
    public void visualizarnota(){
        if (nota<6.0) {
            System.out.println("Você reprovou!");
        }
        else {
          System.out.println("Você passou!");
      
        }
      
    }
     
         
    
}

