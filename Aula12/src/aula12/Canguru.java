package aula12;

/**
 *
 * @author Gabriel Ferreira Prodi
 * Curso POO Java #012b
 * 15/07/2020
 * 
 */
public class Canguru extends Mamifero {
    
    @Override
    public void locomover(){
        System.out.println("Saltando");
    }
    
    public void usarBolsa(){
        System.out.println("Usando bolsa");
    }
    
}
