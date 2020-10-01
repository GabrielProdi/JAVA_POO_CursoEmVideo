package projetopessoas;

/**
 *
 * @author Gabriel Ferreira Prodi
 * Curso POO Java #011b
 * 15/07/2020
 * 
 */
public class Bolsista extends Aluno {
    
    private double bolsa;
    
    public void renovarBolsa(){
        System.out.println("Renovando bolsa de " + this.nome);
    }
    
    
    @Override
    public void pagarMensalidade(){
        System.out.println(this.nome + " é bolsista, pagamento facilitado!");
        
    }

    public double getBolsa() {
        return bolsa;
    }

    public void setBolsa(double bolsa) {
        this.bolsa = bolsa;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    
    
    
    
}
