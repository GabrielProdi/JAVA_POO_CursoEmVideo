/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula05;

/**
 *
 * @author Gabriel Ferreira Prodi
 * Curso POO Java #05a
 * 09/07/2020
 * 
**/

public class ContaBanco {
    public int numConta;
    protected String tipoConta;       // CC = conta corrente, CP = conta poupanca
    private String nomeCliente;
    private double saldo;
    private boolean status;    // conta aberta? true|false 

    /** 
     * Ao criar uma nova conta:
     *  saldo = 0
     *  status = false
     * 
     */
    public ContaBanco() {   
        this.saldo = 0;
        this.status = false;
    }
    
    
    public int getNumConta() {
        return numConta;
    }

    public void setNumConta(int numConta) {
        this.numConta = numConta;
    }

    public String getTipoConta() {
        return tipoConta;
    }

    public void setTipoConta(String tipoConta) {
        this.tipoConta = tipoConta;
    }

    public String getNomeCliente() {
        return nomeCliente;
    }

    public void setNomeCliente(String nomeCliente) {
        this.nomeCliente = nomeCliente;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }
   
    
    public void estadoAtual(){
        System.out.println("---------------------------------------------------------");
        System.out.println("Conta: " + this.getNumConta());
        System.out.println("Tipo: " + this.getTipoConta());
        System.out.println("Dono: " + this.getNomeCliente());
        System.out.println("Saldo: " + this.getSaldo());
        System.out.println("Status: " + this.isStatus());
        System.out.println("---------------------------------------------------------");
    }
    
    
    /** 
     * se abrir conta CC ganha 50 , se CP ganha 150
     * 
     * @param tipo
     */
    public void abrirConta(String tipo){          
        this.setTipoConta(tipo);
        
        if(this.getTipoConta().equals("CC")){
            this.setSaldo(50);
        } else if(this.getTipoConta().equals("CP")){
            this.setSaldo(150);
        }
        
        this.setStatus(true);
        System.out.println("Conta aberta com SUCESSO!");
    }
    
    
    /** 
     * para fechar n pode ter saldo nem divida
     * 
     */
    public void fecharConta(){         
        
        if(this.getSaldo()>0){
            System.out.println("Conta não pode ser fechada por ter DINHEIRO");       //Evitar mostrar msgs dentro de classes
        } else if(this.getSaldo()<0){
            System.out.println("Conta não pode ser fechada por ter DÉBITO");
        } else{
            this.setStatus(false);
            System.out.println("Conta fechada com SUCESSO");
        }
    }
    
    
    /** 
     * para depositar a conta deve estar aberta
     * 
     * @param valor
     */
    public void depositar(double valor){
        
        if(this.isStatus()){
            this.setSaldo(this.getSaldo() + valor);       //credita o valor na conta
            System.out.println("Depósito realizado com sucesso na conta de " + this.getNomeCliente());
        } else{
            System.out.println("IMPOSSÍVEL DEPOSITAR em uma conta inexistente!");
        }
        
    }
    
    
    /** 
     * para sacar:
     *      conta deve estar aberta
     *      saldo deve ser limite max de saque
     * 
     * @param valor
     */
    public void sacar(double valor){
        
        if (this.isStatus()) {
            if(this.getSaldo() >= valor){
                this.setSaldo(this.getSaldo() - valor);       // debita o valor da conta
                System.out.println("Saldo realizado na conta de " + this.getNomeCliente());
            } else{
                System.out.println("Saldo insulficiente para saque.");
            }
        } else{
            System.out.println("IMPOSSÍVEL SACAR de uma conta fechada");
        }
        
    }
    
    
    /** 
     * sem gatilho
     * CC paga 12
     * CP para 20
     * 
     */
    public void pagarMensal(){     //pagar taxa de manutencao da conta
        double valor = 0;
        
        if(this.getTipoConta().equals("CC")){
            valor = 12;
        } else if (this.getTipoConta().equals("CP")){
            valor = 20;
        }
        
        if (this.isStatus()){
            if (this.getSaldo() > valor) {
                this.setSaldo(this.getSaldo() - valor);
                System.out.println("Manutenção paga com sucesso por " + this.getNomeCliente());
            } else{
                System.out.println("Saldo insulficiente para pagar a manutenção");
            }
        } else{
            System.out.println("CONTA INEXISTENTE");
        }
        
    }
    
}
