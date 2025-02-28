package org.example;
import java.util.concurrent.ThreadLocalRandom;
//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        double mesada = 50.0;

        while(mesada > 0){
            Double valorDoce = geraValorAleatorio();

            if(valorDoce > mesada){
                valorDoce  = mesada;
                System.out.println("Doce do valor: " + valorDoce + " Adicionado no carrinho");
                mesada = mesada - valorDoce;
            }
            System.out.println("Mesada:" + mesada);
            System.out.println("Joãozinho gastou toda a sua mesada em doces");




        }



    }

    public static double geraValorAleatorio(){
        return ThreadLocalRandom.current().nextDouble(2,18);
    }
}