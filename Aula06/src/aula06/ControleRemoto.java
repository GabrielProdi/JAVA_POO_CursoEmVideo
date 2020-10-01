package aula06;

import sun.nio.cs.ext.TIS_620;

/**
 *
 * @author Gabriel Ferreira Prodi
 * Curso POO Java #06b
 * 13/07/2020
 * 
 */
public class ControleRemoto implements Controlador{
    
    // Atributos
    private int volume;
    private boolean ligado;
    private boolean tocando;
    
    //Métodos Especiais
    
    public ControleRemoto() {
        this.volume = 50;
        this.ligado = false;
        this.tocando = false;
    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    public boolean isLigado() {
        return ligado;
    }

    public void setLigado(boolean ligado) {
        this.ligado = ligado;
    }

    public boolean isTocando() {
        return tocando;
    }

    public void setTocando(boolean tocando) {
        this.tocando = tocando;
    }
    
    
    //Métodos Abstratos

    @Override
    public void ligar() {
        setLigado(true);
        
    }

    @Override
    public void desligar() {
        setLigado(false);
        
    }
    
    @Override
    public void abrirMenu() {
        System.out.println("------MENU------");
        System.out.println("Está ligado?  " + this.isLigado());
        System.out.println("Está tocando?  " + this.isTocando());
        System.out.print("Volume: " + this.getVolume() + " ");
        for(int i = 0; i <= this.getVolume(); i += 10){
            System.out.print("[]");
        }
        System.out.println("");
    }

    @Override
    public void fecharMenu() {
        System.out.println("Fechando Menu...");
    }

    @Override
    public void maisVolume() {
        if(this.isLigado()){
            this.setVolume(this.getVolume() + 10);
        }
        
    }

    @Override
    public void menosVolume() {
        if(this.isLigado() && this.getVolume() > 0){
            this.setVolume(this.getVolume() - 10);
        }
        
    }

    @Override
    public void ligarMudo() {
        if(this.isLigado() && this.getVolume() > 0){
            this.setVolume(0);
        }
        
    }

    @Override
    public void desligarMudo() {
        if(this.isLigado() && this.getVolume() == 0){
            this.setVolume(50);
        }
        
    }

    @Override
    public void play() {
        if(this.isLigado() && !(this.isTocando())){
            this.setTocando(true);
        }
        
    }

    @Override
    public void pause() {
        if(this.isLigado() && this.isTocando()){
            this.setTocando(false);
        }
        
    }
    
    
    
    
}
