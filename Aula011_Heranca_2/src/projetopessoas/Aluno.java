package projetopessoas;

/**
 *
 * @author Gabriel Ferreira Prodi
 * Curso POO Java #011b
 * 15/07/2020
 * 
 */
public class Aluno extends Pessoa {
    
    private int matricula;
    private String curso;
    
    
    public void pagarMensalidade(){
        System.out.println("Pagando mensalidade do aluno " + this.getNome());
    }
    
    public void cancelarMatricula(){
        System.out.println("Matrícula será cancelada!");
    }

    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }
    
    
}
