package projetoyoutube;

/**
 *
 * @author Gabriel Ferreira Prodi
 * Curso POO Java #014b e #15b
 * 16/07/2020
 * 
 */
public class Visualizacao {
    
    private Gafanhoto espectador ;
    private Video video;

    public Visualizacao(Gafanhoto espectador, Video video) {
        this.espectador = espectador;
        this.video = video;
        this.espectador.setTotAssistido(this.espectador.getTotAssistido() + 1);
        this.video.setViews(this.video.getViews() + 1);
    }

    public Gafanhoto getEspectador() {
        return espectador;
    }

    public void setEspectador(Gafanhoto espectador) {
        this.espectador = espectador;
    }

    public Video getVideo() {
        return video;
    }

    public void setVideo(Video video) {
        this.video = video;
    }

    @Override
    public String toString() {
        return "Visualizacao{" + "espectador=" + espectador + ", \nvideo=" + video + "}\n";
    }
    
    
    
    public void avaliar(){
        this.video.setAvaliacao(5);
    }
    
    public void avaliar(int nota){
        this.video.setAvaliacao(nota);
    }
    
    public void avaliar (double porcent){
        int tot = 0;
        
        if (porcent <= 20) {
            tot = 2;
        } else if (porcent <= 50) {
            tot = 5;
        } else if (porcent <= 90){
            tot = 8;
        } else {
            tot = 10;
        }
        
        this.video.setAvaliacao(tot);
    }
    
}
