package projetolivro;

/**
 *
 * @author Gabriel Ferreira Prodi
 * Curso POO Java #09b
 * 14/07/2020
 * 
 */
public class Livro implements Publicacao {
    //Atributos
    private String titulo;
    private String autor;
    private int totPaginas;
    private int pagAtual;
    private boolean aberto;
    private Pessoa leitor;
    
    
    // alt + insert -> toString para gerar automaticamente
    public String detalhes() {
        return "Livro{" + " titulo= " + titulo +
                "\nautor= " + autor + 
                "\ntotPaginas= " + totPaginas + ", pagAtual= " + pagAtual + 
                "\naberto= " + aberto + 
                "\nleitor= " + leitor.getNome() + ", " + leitor.getIdade() + " anos, sexo " + leitor.getSexo() + " }";
    }
    

    public Livro(String titulo, String autor, int totPaginas, Pessoa leitor) {
        this.titulo = titulo;
        this.autor = autor;
        this.totPaginas = totPaginas;
        this.pagAtual = 0;
        this.aberto = false;
        this.leitor = leitor;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getTotPaginas() {
        return totPaginas;
    }

    public void setTotPaginas(int totPaginas) {
        this.totPaginas = totPaginas;
    }

    public int getPagAtual() {
        return pagAtual;
    }

    public void setPagAtual(int pagAtual) {
        this.pagAtual = pagAtual;
    }

    public boolean isAberto() {
        return aberto;
    }

    public void setAberto(boolean aberto) {
        this.aberto = aberto;
    }

    public Pessoa getLeitor() {
        return leitor;
    }

    public void setLeitor(Pessoa leitor) {
        this.leitor = leitor;
    }
    
    

    //Implementa interface Publicacao
    @Override
    public void abrir() {
        this.aberto = true;
        
    }

    @Override
    public void fechar() {
        this.aberto = false;

    }

    @Override
    public void folhear(int pag) {
        if(pag < this.totPaginas){
            this.aberto = true;
            this.pagAtual = pag;
        } else {
            System.out.println("Este livro não tem tantas páginas");
        }
        
    }

    @Override
    public void avancarPag() {
        this.pagAtual++;

    }

    @Override
    public void voltarPag() {
        this.pagAtual--;

    }
    
}
