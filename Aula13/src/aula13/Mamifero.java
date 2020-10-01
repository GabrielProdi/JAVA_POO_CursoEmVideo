package aula13;

/**
 *
 * @author Gabriel Ferreira Prodi
 * Curso POO Java #013b
 * 16/07/2020
 * 
 */
public class Mamifero extends Animal {
    
    private String corPelo;

    
    @Override
    public void emitirSom() {
        System.out.println("som de Mamifero");
    }

    public String getCorPelo() {
        return corPelo;
    }

    public void setCorPelo(String corPelo) {
        this.corPelo = corPelo;
    }
    
    
}
