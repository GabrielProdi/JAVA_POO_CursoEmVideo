package projetopessoas;

/**
 *
 * @author Gabriel Ferreira Prodi
 * Curso POO Java #010b
 * 15/07/2020
 * 
 */
public class ProjetoPessoas {

    public static void main(String[] args) {
        
        // Programa Principal
        Pessoa p1 = new Pessoa();
        Aluno p2 = new Aluno();
        Professor p3 = new Professor();
        Funcionario p4 = new Funcionario();
        
        p1.setNome("Pedro");
        p2.setNome("Maria");
        p3.setNome("Cláudio");
        p4.setNome("Fabiana");
        
        p1.setIdade(25);
        p2.setIdade(5);
        p3.setIdade(40);
        p4.setIdade(18);
        
        p1.setSexo("M");
        p2.setSexo("F");
        p3.setSexo("M");
        p4.setSexo("F");
        
        p1.fazerAniver();
        p2.cancelarMatricula();
        p3.receberAumento(500);
        p4.mudarTrabalho();
        
        System.out.println(p1.toString());
        System.out.println(p2.toString());
        System.out.println(p3.toString());
        System.out.println(p4.toString());
        
        
    }
    
}
