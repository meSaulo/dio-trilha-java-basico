public class MinhaClasse {

    public static void main(String [] args){

        /**
         * <h1> Hello World pelo terminal </h1>
         *
         * @author Saulo Marcus
         * @version 1.0
         * @since 24/2/2024
         */

        System.out.println("Hello World, Terminal");
        System.out.println("Fui Executado Pelo terminal");

        String nome = args [0];

        String sobrenome = args [1];

        int idade = Integer.valueOf(args[2]);

        double altura = Double.valueOf(args[3]);

        System.out.println("Meu Nome é " + nome + " " + sobrenome + "\n" + "tenho " + idade +" de idade" +
        "\n" + "e " + altura + " de altura");



    }




}
