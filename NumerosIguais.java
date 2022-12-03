/* 

--------------------------------------------------------------------------------------------

Desafio

Nesse desafio, dados dois números, verifique se eles são iguais. Caso sejam, retorne "Sao iguais!”. Caso contrário, retorne "Nao sao iguais!” sem as aspas. 
Entrada

As entradas serão dois valores, um em cada linha, representados por A e B, que sempre serão números inteiros. 
Saída

A saída deverá retornar a frase "Sao iguais!" caso A e B sejam o mesmo valor. Caso contrário,  retorne "Nao sao iguais!", sem as aspas.

--------------------------------------------------------------------------------------------

*/

// * My code * //

// IMPORTANTE: Para ler os dados de entrada do usuário, utilize a classe Scanner, 
// instanciando seu leitor da seguinte forma: "Scanner leitor = new Scanner(System.in);". 
// Por outro lado, para imprimir suas saídas, utilize System.out.print ou System.out.println.

import java.util.*;

public class NumerosIguais {

    public static void main(String[] args) {

       Scanner scan = new Scanner(System.in);
       
       int A = scan.nextInt();
      
       int B = scan.nextInt();
       
       if (A == B) {
         System.out.print("Sao iguais!");
       } else {
         System.out.print("Nao sao iguais!");
       } 

    }
}