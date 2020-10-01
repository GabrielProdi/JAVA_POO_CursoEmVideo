package projetolivro;

/**
 *
 * @author Gabriel Ferreira Prodi
 * Curso POO Java #09b
 * 14/07/2020
 * 
 */
public interface Publicacao {
    //Metodos abstratos
    public abstract void abrir();
    public abstract void fechar();
    public abstract void folhear(int pag);
    public abstract void avancarPag();
    public abstract void voltarPag();
    
}
