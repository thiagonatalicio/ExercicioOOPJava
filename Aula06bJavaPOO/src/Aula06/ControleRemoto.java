package Aula06;

public class ControleRemoto implements Controlador{
    private boolean ligado;
    private boolean tocando;
    private int volume;

    public ControleRemoto(){
        this.ligado = false;
        this.tocando = false;
        this.volume = 50;
    }

    private boolean getLigado(){
        return this.ligado;
    }
    private void setLigado(boolean ligado){
        this.ligado = ligado;
    }

    private boolean getTocando(){
        return this.tocando;
    }
    private void setTocando(boolean tocando){
        this.tocando = tocando;
    }

    private int getVolume(){
        return this.volume;
    }
    private void setVolume(int volume){
        this.volume = volume;
    }

    @Override
    public void ligar(){
        this.setLigado(true);
    }

    @Override
    public void desligar(){
        this.setLigado(false);
    }

    @Override
    public void abrirMenu(){
        System.out.println(this.getLigado());
        System.out.println(this.getVolume());
        for(int i = 0; i < this.getVolume; i++){
            System.out.println("| ");
        }
        System.out.println(this.getTocando());
    }

    @Override
    public void maisVolume(){
        this.setVolume(this.getVolume() + 5);
    }
    @Override
    public void menosVolume(){
        this.setVolume(this.getVolume() - 5);
    }
}
