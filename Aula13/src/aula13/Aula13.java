package aula13;

/**
 *
 * @author Gabriel Ferreira Prodi
 * Curso POO Java #013b
 * 16/07/2020
 * 
 */
public class Aula13 {

    public static void main(String[] args) {
        
        Lobo l = new Lobo();
        Cachorro c = new Cachorro();
        
        c.reagir("Ola");
        c.reagir("vai apanhar");
        
        c.reagir(11,45);
        c.reagir(19,00);
        
        c.reagir(true);
        c.reagir(false);
        
        c.reagir(2, 12.5);
        c.reagir(17,4.5);
    }
    
}
