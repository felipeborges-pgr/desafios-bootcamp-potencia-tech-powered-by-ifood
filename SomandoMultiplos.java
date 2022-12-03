
/*
--------------------------------------------------------------------------------------------

Desafio

Dado um número A e o seu limite N, encontre a soma de todos os múltiplos A até o seu limite N.
Entrada

A entrada deverá ser composta pelo valor A na primeira linha, seguido do valor N na segunda. 
Saída

A saída deverá retornar o valor da soma de todos os múltiplos A até o seu limite N.

Exemplo 1
Entrada   Saída
5
20  50

Exemplo 2
Entrada   Saída
3
18  63

--------------------------------------------------------------------------------------------

*/

// * My code * //



// IMPORTANTE: Para ler os dados de entrada do usuário, utilize a classe Scanner, 
// instanciando seu leitor da seguinte forma: "Scanner leitor = new Scanner(System.in);". 
// Por outro lado, para imprimir suas saídas, utilize System.out.print ou System.out.println.  

import java.util.Scanner;

public class SomandoMultiplos {
    public static void main(String[] args) {
        int A, N;
        int contador = 1;
        int soma = 0;

        Scanner input = new Scanner(System.in);
        A = input.nextInt();
        N = input.nextInt();

        //TODO:  Retorne o valor da soma de todos múltiplos de "A" até o seu limite "N".
        for(int i = A; i <= N; i++) {
          
          if (i % A == 0) {
            soma = soma + i;
          }
          
        } 
        
        contador++;
        
        System.out.println(soma);
    }
}