package app;
import java.util.Scanner;

public class ControleRemoto extends Televisao{
    private int digito = 0;
    
//===================================Metodos===================================
    public void VolumeMais(){
        if(volume < 100){
            volume = volume + 1;
        }
        else{
        }
    }
    public void VolumeMenos(){
        if(volume > 0){
            volume = volume - 1;
        }
        else{
        }
    }
    public void CanalMais(){
        if(canal <= 99){
            canal = canal + 1;
            if(canal == 100){
                canal = 1;
            }
        }
    }
    public void CanalMenos(){
        if(canal > 0){
            canal = canal -1;
            if(canal == 0){
                canal = 99;
            }
        }
    }

    public void digitarCanal(){
        Scanner s = new Scanner(System.in);
        
        System.out.println("Digite o canal desejado: ");

        digito = s.nextInt();
        //volume = s.nextInt();

        if(digito > 99 || digito < 1){
            System.out.println("Canal digitado inexistente");
        }
        else{
            canal = digito
        }
    }

}