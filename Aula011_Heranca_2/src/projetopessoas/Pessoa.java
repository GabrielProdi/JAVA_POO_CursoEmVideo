package projetopessoas;

/**
 *
 * @author Gabriel Ferreira Prodi
 * Curso POO Java #011b
 * 15/07/2020
 * 
 */
public abstract class Pessoa {
    
     //Atributos
    protected String nome;
    private int idade;
    private String sexo;
    
    
    //Métodos
    public final void fazerAniver(){
        this.setIdade(getIdade() + 1);
        
    }
/*
    public Pessoa(String nome, int idade, String sexo) {
        this.nome = nome;
        this.idade = idade;
        this.sexo = sexo;
    }
*/
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

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    @Override
    public String toString() {
        return "Pessoa{" + "nome=" + nome + ", idade=" + idade + ", sexo=" + sexo + '}';
    }
    
    
}
