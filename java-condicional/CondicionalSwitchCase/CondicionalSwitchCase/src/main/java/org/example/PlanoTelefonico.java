package org.example;

public class PlanoTelefonico {

    public static void main(String[] args) {

        String plano = "M";

        switch(plano){

            case "B" : {
                System.out.println("100 minutos de ligação");
                break;
            }

            case "M" : {
                System.out.println("100 minutos de ligação");
                System.out.println("Whats e Intagram Grátis");
                break;
            }

            case "T" : {

                System.out.println("100 minutos de ligação");
                System.out.println("Whats e instagram grátis");
                System.out.println("5GB Youtube");
                break;
            }
            default :
                System.out.println("COMANDO INVALIDO");



        }


    }


}
