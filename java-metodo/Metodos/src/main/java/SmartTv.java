import java.util.Scanner;

public class SmartTv {

    Boolean ligado = false;
    Integer  canal = 1;
    Integer volume = 25;


    public void ligarTv(){
        ligado = true;
    }

    public void desligarTv(){

        ligado = false;


    }

    public void aumentarCanal(){
        canal++;
        System.out.println("Aumentando canal para :" + canal);
    }

    public void dimunuirCanal(){
        canal--;
        System.out.println("diminuindo canal para :" + volume);
    }

    public void mudarCanal(int novoCanal){

        canal = novoCanal;

    }

    public void aumentarVolume(){
        volume++;
        System.out.println("Aumentando volume para :" + volume);
    }

    public void diminuirVolume(){
        volume--;
        System.out.println("diminuindo volume para :" + volume);
    }






}
