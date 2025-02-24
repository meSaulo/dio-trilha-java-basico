import java.util.Scanner;

public class Metodos {


    public static void main(String[] args){

       SmartTv tv = new SmartTv();


       System.out.println("ESTADO TV ATUAL");
       System.out.println("TV LIGADA : " + tv.ligado);
       System.out.println("CANAL ATUAL : " + tv.canal);
       System.out.println("VOLUME ATUAL : " + tv.volume);

        System.out.println("NOVO ESTADO");

        tv.ligarTv();
        System.out.println("TV LIGADA : " + tv.ligado);

        tv.aumentarVolume();
        System.out.println("VOLUME ATUAL : " + tv.volume);

        tv.aumentarCanal();
        System.out.println("CANAL ATUAL : " + tv.canal);

        tv.mudarCanal(13);
        System.out.println("CANAL ATUAL : " + tv.canal);

    }








}
