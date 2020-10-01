package aula12;

/**
 *
 * @author Gabriel Ferreira Prodi
 * Curso POO Java #012b
 * 15/07/2020
 * 
 */
public class Ave extends Animal{
    
    private String corPena;

    @Override
    public void locomover() {
        System.out.println("Voando");
    }

    @Override
    public void alimentar() {
        System.out.println("Comer frutas");
    }

    @Override
    public void emitirSom() {
        System.out.println("som de Ave");
    }
    
    public void fazerNinho(){
        System.out.println("Construiu um ninho");
    }
    
}
