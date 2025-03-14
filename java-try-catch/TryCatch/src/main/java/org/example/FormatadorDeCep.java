package org.example;

public class FormatadorDeCep {


    public static void main(String[] args) {
        try {
            String cepFormatado = formatarCep("12121313141");
        } catch (CepInvalidoException e) {
            throw new RuntimeException(e);
        }
    }






    static String formatarCep(String cep) throws CepInvalidoException{
        if(cep.length() != 8)
            throw new CepInvalidoException();

        //simulando um cep formatado
        return "23.765-064";
    }


}

