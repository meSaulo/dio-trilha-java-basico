public class Main
{
    public static void main(String[] args){

            String nomeUm = "Saulo";
            String nomeDois = new String("Saulo");

            System.out.println(nomeUm == nomeDois);
            System.out.println(nomeUm.equals(nomeDois)); // Iguais a objetos











            int numero1 =1;
            int numero2 = 2;

            boolean simNao = numero1 == numero2;

            if(numero1 < numero2){
                System.out.println("a nossa condição é verdadeira");
            }


            System.out.println("Numero um é igual a numero dois ? " + simNao );


            simNao = numero1 != numero2;
            System.out.println("Numero um é diferente de numero dois ? " + simNao);

            simNao = numero1 > numero2;
            System.out.println("Numero um é maior de numero dois ? " + simNao);

            simNao = numero1 < numero2;
            System.out.println("Numero um é menor de numero dois ? " + simNao);

    }


}
