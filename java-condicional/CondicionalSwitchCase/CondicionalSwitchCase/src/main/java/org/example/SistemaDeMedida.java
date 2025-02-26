package org.example;

import java.sql.SQLOutput;

public class SistemaDeMedida {

    public static void main(String[] args) {
//
//        String sigla = "M";
//
//        if(sigla == "P"){
//            System.out.println("PEQUENO");
//        }
//        else if(sigla == "M")
//            System.out.println("MEDIO");
//        else if(sigla == "G")
//            System.out.println("GRANDE");
//        else
//            System.out.println("INDEFINIDO");
//

        String sigla = "A";

        switch(sigla){

            case "P" : {
                System.out.println("Pequeno");
                break;
            }

            case "M" : {

                System.out.println("Medio");
                break;

            }
            case "G" : {

                System.out.println("Grande");
                break;
            }

            default:
                System.out.println("INDEFINIDO");

        }




    }

}
