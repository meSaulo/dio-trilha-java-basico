package org.example;


import java.text.NumberFormat;
import java.text.ParseException;

public class TratamentoDeErro {

    public static void main(String [] args){

        Number valor;

       try{

           valor = NumberFormat.getInstance().parse("a1.75");

       }catch(ParseException e){
           e.printStackTrace();
       }


    }



}
