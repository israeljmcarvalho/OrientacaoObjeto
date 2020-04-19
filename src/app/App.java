package app;

public class App {
    public static void main(String[] args) {

        ControleRemoto c1 = new ControleRemoto();
        
        c1.CanalMais();
        c1.CanalMais();
        c1.CanalMais();
        c1.CanalMais();
        c1.CanalMais();
        c1.CanalMais();
        c1.CanalMenos();
        c1.CanalMenos();
        c1.VolumeMais();
        c1.VolumeMais();
        c1.VolumeMais();
        c1.VolumeMais();
        c1.VolumeMais();
        c1.VolumeMais();
        c1.VolumeMais();
        c1.VolumeMais();
        c1.VolumeMais();
        c1.VolumeMais();
        c1.VolumeMenos();

        c1.digitarCanal();
        

        System.out.println(c1.ConsultaCanal());
        System.out.println(c1.ConsultaVolume());
    }
}