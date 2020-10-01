package projetopessoas;

/**
 *
 * @author Gabriel Ferreira Prodi
 * Curso POO Java #011b
 * 15/07/2020
 * 
 */
public class ProjetoPessoas {

    public static void main(String[] args) {
        
        // Programa Principal
        //Pessoa p2 = new Pessoa();
        Visitante v1 = new Visitante();
        Aluno a1 = new Aluno();
        Professor p1 = new Professor();
        Funcionario f1 = new Funcionario();
        Bolsista b1 = new Bolsista();
        
        v1.setNome("Pedro");
        a1.setNome("Maria");
        p1.setNome("Cláudio");
        f1.setNome("Fabiana");
        b1.setNome("Gabriel");
        
        v1.setIdade(20);
        a1.setIdade(5);
        p1.setIdade(40);
        f1.setIdade(18);
        
        v1.setSexo("M");
        a1.setSexo("F");
        p1.setSexo("M");
        f1.setSexo("F");
        
        v1.fazerAniver();
        a1.cancelarMatricula();
        p1.receberAumento(500);
        f1.mudarTrabalho();
        
        System.out.println(v1.toString());
        System.out.println(a1.toString());
        System.out.println(p1.toString());
        System.out.println(f1.toString());
        
        a1.pagarMensalidade();
        b1.renovarBolsa();
        b1.pagarMensalidade();
        
        
    }
    
}
