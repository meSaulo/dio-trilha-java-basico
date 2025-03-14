import java.util.Scanner;

public class Treinamento  {

     public static void main(String[] args) {

        int [] vetorA = new int[4];

        try{
            for(int i = 0; i < 10; i++){

                int contador = 0;
                contador++;

                vetorA[i] = contador;

            }
        }catch(ArrayIndexOutOfBoundsException e){
            System.out.println("Passou do limite jogador");

        }
        finally {
            System.out.println("😁😁😁😁😁😁😁");
        }








    }


}
