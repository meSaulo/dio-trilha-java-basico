import java.util.Scanner;

public class ContaTerminal {


    /**
     * <h1>Desafio Conta De Banco DIO</h1>
     * <p>
     * <b>Note:</b> Imprimir as informações dadas pelo o user
     *
     *
     * @author  Saulo Marcus
     * @version 1.0
     * @since   25/2/2024
     */



    public static void main(String [] args){

        Scanner sc = new Scanner(System.in);
        Scanner scStr = new Scanner(System.in);

        int numeroConta;
        String agenciaConta;
        String nomeCliente;
        double saldoConta = 1500;

        System.out.print("Digite o numero de sua conta : ");
        numeroConta = sc.nextInt();
        System.out.println("");

        System.out.print("Digite o numero da agencia (Exemplo : 067-8): ");
        agenciaConta = scStr.nextLine();
        System.out.println("");

        System.out.print("Digite seu nome : ");
        nomeCliente = scStr.nextLine();
        System.out.println("");

        scStr.close();
        sc.close();


        System.out.println("Olá ".concat(nomeCliente).concat(", " +
                "obrigado por criar uma conta em nosso banco, sua agência é ")
                .concat(agenciaConta)
                .concat(", conta ").concat(Integer.toString(numeroConta))
                .concat(" e seu saldo ")
                .concat(Double.toString(saldoConta))
                .concat(" " + " já está disponivel para saque")
        );


    }


}
