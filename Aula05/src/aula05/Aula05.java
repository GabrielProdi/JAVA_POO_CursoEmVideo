package aula05;

/**
 *
 * @author Gabriel Ferreira Prodi
 * Curso POO Java #05b
 * 09/07/2020
 * 
 */


public class Aula05 {

    public static void main(String[] args) {
        
        ContaBanco pessoa1 = new ContaBanco();
        ContaBanco pessoa2 = new ContaBanco();
        
        
        pessoa1.setNumConta(1111);
        pessoa1.setNomeCliente("Jubileu");
        pessoa1.abrirConta("CC");    
        
        pessoa2.setNumConta(5555);
        pessoa2.setNomeCliente("Creuza");
        pessoa2.abrirConta("CP");
        
        pessoa1.depositar(150);
        pessoa2.depositar(500);
        
        pessoa2.sacar(100);
        pessoa1.sacar(200);
        pessoa1.fecharConta();
        
        pessoa1.estadoAtual();
        pessoa2.estadoAtual();
        
    }
    
}
