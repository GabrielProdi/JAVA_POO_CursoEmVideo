package projetoyoutube;

/**
 *
 * @author Gabriel Ferreira Prodi
 * Curso POO Java #014b e #15b
 * 16/07/2020
 * 
 */
public class ProjetoYouTube {

    public static void main(String[] args) {
        
        Video[] v = new Video[3];
        
        v[0] = new Video("Aula de POO");
        v[1] = new Video("Aula de PHP");
        v[2] = new Video("Aula de HTML");
        
        Gafanhoto g[] = new Gafanhoto[2];
        g[0] = new Gafanhoto("Jubileu", 22, 'M', "juba");
        g[1] = new Gafanhoto("creuza", 12, 'F', "creuzita");
        
        Visualizacao[] visual = new Visualizacao[5];
        
        visual[0] = new Visualizacao(g[0], v[0]);
        visual[0].avaliar();
        System.out.println(visual[0].toString());
        
        visual[1] = new Visualizacao(g[0], v[0]);
        visual[1].avaliar(73.5);
        System.out.println(visual[1].toString());
        
        visual[2] = new Visualizacao(g[0], v[0]);
        visual[2].avaliar(7);
        System.out.println(visual[2].toString());
/*        
        visual[3] = new Visualizacao(g[1], v[0]);
        System.out.println(visual[3].toString());
        visual[4] = new Visualizacao(g[0], v[2]);
        System.out.println(visual[4].toString());
*/        
        
/*                
        System.out.println("-------- VIDEOS --------");
        System.out.println(v[0].toString());
        System.out.println(v[1].toString());
        System.out.println(v[2].toString());
        System.out.println("======== PESSOAS ========");
        System.out.println(g[0].toString());
        System.out.println(g[1].toString());
*/        
    }
    
}
