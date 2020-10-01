
package aula04;

/**
 *
 * @author Gabriel Ferreira Prodi
 * Curso POO Java #04b
 * 30/06/2020
 * 
 */

public class Caneta {
    
    private String modelo;
    private float ponta;
    private boolean tampada;
    private String cor;
    
    
    public Caneta(String modelo, String cor, float ponta){   //Este é o método construtor
        this.modelo = modelo;
        this.cor = cor;
        this.setPonta(ponta);
        this.tampar();
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public float getPonta() {
        return ponta;
    }

    public void setPonta(float ponta) {
        this.ponta = ponta;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }
    
    
    
    public void tampar(){
        this.tampada = true;
    }
    
    public void destampar(){
        this.tampada = false;
    }
    
    public void status(){
        System.out.println("SOBRE A CANETA:");
        System.out.println("Modelo: " + this.getModelo());
        System.out.println("Ponta: " + this.getPonta());
        System.out.println("Cor: " + this.cor);
        System.out.println("Tampada: " + this.tampada + "\n");
    }
}
