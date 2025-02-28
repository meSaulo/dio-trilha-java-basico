package org.example;

import java.util.Random;
import java.util.Scanner;

public class DoWhile {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        do{

            System.out.println("Telefone tocando....");

        }while(tocando());

        System.out.println("alo !");

    }

    public static boolean tocando(){

        boolean atendeu = new Random().nextInt(3)==1;
        System.out.println("Atendeu ?" + atendeu);

        return ! atendeu;
    }

}
