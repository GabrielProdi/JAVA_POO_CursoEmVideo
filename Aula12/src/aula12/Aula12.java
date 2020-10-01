package aula12;

/**
 *
 * @author Gabriel Ferreira Prodi
 * Curso POO Java #012b
 * 15/07/2020
 * 
 */
public class Aula12 {

    public static void main(String[] args) {
        Mamifero m = new Mamifero();
        Reptil r = new Reptil();
        Peixe p = new Peixe();
        Ave a = new Ave();
        
        Canguru c = new Canguru();
        Cachorro k = new Cachorro();
        Cobra j = new Cobra();
        Tartaruga t =new Tartaruga();
        GoldFish g = new GoldFish();
        Arara e = new Arara();
        
        m.locomover();
        r.locomover();
        p.locomover();
        a.locomover();
        
        c.locomover();
        k.locomover();
        c.emitirSom();
        k.emitirSom();
        
        
    }
    
}
