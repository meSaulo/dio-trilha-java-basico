package org.example;

public class ForArray {

    public static void main(String[] args) {
        String alunos[] = {"João","Felipe","Marcelo"};

        for(int i = 0; i < alunos.length; i++){

            System.out.println("O aluno no indice i =" + i + " é " + alunos[i]);

        }

        for(String aluno : alunos){
            System.out.println(aluno);
        }

    }


}
