package aula02;

/**
 *
 * @author Gabriel Ferreira Prodi
 * Curso POO Java #02b
 * 25/06/2020
 * 
 */

public class Aula02 {

    public static void main(String[] args) {
        Caneta c1 = new Caneta();
        c1.cor = "Azul";
        c1.ponta = 0.5f;
        c1.carga = 90;
        
        c1.tampar();
        c1.status();
        c1.rabiscar();
        System.out.println("");
        
        /*c1.destampar();
        c1.status();
        c1.rabiscar();
        System.out.println("");
       */ 
        Caneta c2 = new Caneta();
        c2.modelo = "Honra";
        c2.cor = "Preta";
        c2.destampar();
        c2.status();
        c2.rabiscar();
        System.out.println("");
    }
    
}
