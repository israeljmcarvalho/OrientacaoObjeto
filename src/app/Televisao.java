package app;

public class Televisao {
    protected int canal = 1;
    protected int volume = 0;

    public int getCanal() {
        return canal;
    }
    public int getVolume() {
        return volume;
    }
    public void setCanal(int informaCanal) {
        this.canal = informaCanal;
    }
    public void setVolume(int informaVolume) {
        this.volume = informaVolume;
    }



//===================================Metodos===================================
    public String ConsultaCanal() {
        return "Canal atual " + this.canal;
    }
    public String ConsultaVolume() {
        return "Volume atual " + this.volume;
    }


}