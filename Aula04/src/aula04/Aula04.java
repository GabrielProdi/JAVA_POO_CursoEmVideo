package aula04;

/**
 *
 * @author Gabriel Ferreira Prodi
 * Curso POO Java #04b
 * 01/07/2020
 * 
 */

public class Aula04 {

    public static void main(String[] args) {
        
        Caneta c1 = new Caneta("BIC Cristal", "Preto", 0.8f);
        
        c1.status();
        
        c1.setModelo("BIC");
        //c1.modelo = "BIC cristal";
        
        c1.setPonta(0.5f);
        //c1.ponta = 0.8f;
        
        System.out.println("Tenho uma caneta " + c1.getModelo()+ " de ponta " + c1.getPonta() + "\n");
        
        c1.status();
        
    }
    
}
