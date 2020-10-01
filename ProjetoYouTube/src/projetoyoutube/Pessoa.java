package projetoyoutube;

/**
 *
 * @author Gabriel Ferreira Prodi
 * Curso POO Java #014b e #15b
 * 16/07/2020
 * 
 */
public abstract class Pessoa {
    
    protected String nome;
    protected int idade;
    protected char sexo;
    protected double experiencia;

    public Pessoa(String nome, int idade, char sexo) {
        this.nome = nome;
        this.idade = idade;
        this.sexo = sexo;
        this.experiencia = 0;
    }
    
    
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public char getSexo() {
        return sexo;
    }

    public void setSexo(char sexo) {
        this.sexo = sexo;
    }

    public double getExperiencia() {
        return experiencia;
    }

    public void setExperiencia(double experiencia) {
        this.experiencia = experiencia;
    }
    
    protected void ganharExp(double exp){
        this.experiencia += exp;
    }

    @Override
    public String toString() {
        return "Pessoa{" + "nome=" + nome + ", idade=" + idade +
                ", sexo=" + sexo + ", experiencia=" + experiencia + '}';
    }
    
    
}
