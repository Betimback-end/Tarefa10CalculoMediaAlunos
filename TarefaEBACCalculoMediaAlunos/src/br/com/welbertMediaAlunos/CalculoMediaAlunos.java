package br.com.welbertMediaAlunos;

import java.util.Scanner;

public class CalculoMediaAlunos {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
//Declaração das váriaveis
        int op = 0 ;
        double notes = 0;
        double soma = 0;
        double result = 0 ;
//Iniciando com a pergunta
        System.out.println(" Calculo media de 4 Alunos" +  " Digite 1 para iniciar");
        op = ler.nextInt();

//Verificando a condição para o cálculo
        while (op == 1){
                for ( int nota = 1; nota <=4 ; nota ++){
                    System.out.println(" Ditite a Nota " + nota );
                    notes  = ler.nextDouble() ;
                    soma += notes ;
                    //soma = soma + notes;
                }
                    result = soma / 4;

                    System.out.println("*******************************************");
                    System.out.printf( "Resultado da Media foi de %.2f  " , result );
                    System.out.println("");
                    System.out.println("*******************************************");

                    if (result <= 3){
                         System.out.println("*******************************************");
                         System.out.println( "Aluno Reprovado " + " Resultado da Media e = " + result);
                         System.out.println("*******************************************");
                     } else if (result >3 && result <= 5) {
                         System.out.println("*******************************************");
                         System.out.println( "Aluno em Recuperacao " + " Resultado da Media e = " + result);
                         System.out.println("*******************************************");
                      } else if (result >5 && result <= 10) {
                         System.out.println("*******************************************");
                         System.out.println( "Aluno Aprovado " + " Resultado da Media e = " + result);
                         System.out.println("*******************************************");
                     }else  System.out.println("***************-Valores Digitados Acima de 10 -Para Calcular Media Usar Numeros Ate 10-******************");

                System.out.println(" Digite 1 para continuar ou qualquer outro numero para sair");
                op = ler.nextInt();

        }

    }
}
