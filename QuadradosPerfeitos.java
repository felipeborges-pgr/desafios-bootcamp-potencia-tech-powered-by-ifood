
/*
--------------------------------------------------------------------------------------------

Desafio  

Dado um inteiro n, retorne o menor número de números quadrados perfeitos cuja soma seja n. Um quadrado perfeito é um inteiro que é o quadrado de um inteiro; em outras palavras, é o produto de algum inteiro consigo mesmo. Por exemplo, 1, 4, 9 e 16 são quadrados perfeitos, enquanto 3 e 11 não são. 

Entrada

A entrada consiste em um número inteiro n, representando o valor total. 

Saída

A saída consiste em retornar o menor número de números quadrados perfeitos. 

EXEMPLO DE ENTRADA 
	

EXEMPLO DE SAÍDA 

12 
	

3 

13 
	

2 

10 
	

2 

--------------------------------------------------------------------------------------------

*/

// * My code * //

import java.util.*;
import java.util.Scanner;

public class QuadradosPerfeitos {

	public static void main(String[] args) {

		int n = Integer.parseInt(new Scanner(System.in).nextLine());
		int resp, count, totCount;
		int[] d = new int[n + 1];

		for (int i = 1; i < d.length; i++) {
			if (i * i <= n) {
				d[i] = i * i;
			} else {
				i = d.length - 1;
			}
		} 
		totCount = 1000;
		for (int i = d.length - 1; i > 0 && i <= n; i--) {

			if (i > 0 && d[i] > 0) {

				resp = n;
				count = 0;

				for (int j = i; j > 0; j--) {

					while (resp > 0) {
						if (resp >= d[j]) {
							resp = resp - d[j];
							count++;
						} else {
							j--;
						}	
					}

				}

				if(totCount > count) {
					totCount = count;
				}

			}	

		}

		System.out.println(totCount);
	}

}