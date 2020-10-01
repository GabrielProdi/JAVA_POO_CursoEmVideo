package projetoyoutube;

/**
 *
 * @author Gabriel Ferreira Prodi
 * Curso POO Java #014b e #15b
 * 16/07/2020
 * 
 */
public class Gafanhoto extends Pessoa {
    
    private String login;
    private int totAssistido;

    public Gafanhoto(String nome, int idade, char sexo, String login) {
        super(nome, idade, sexo);
        
        this.login = login;
        this.totAssistido = 0;
    }
    
    
    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public int getTotAssistido() {
        return totAssistido;
    }

    public void setTotAssistido(int totAssistido) {
        this.totAssistido = totAssistido;
    }

    @Override
    public String toString() {
        return "Gafanhoto{" + super.toString() + "\nlogin=" + login + ", totAssistido=" + totAssistido + '}';
    }
    

    public void viuMaisUm(){
        this.totAssistido++;
    }
    
}
