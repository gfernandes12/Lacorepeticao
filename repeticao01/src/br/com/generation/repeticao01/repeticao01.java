package br.com.generation.repeticao01;

public class repeticao01 {
public static void main(String[] args) {
	
int numero = 1000;

for (int contador = 1000; contador < 2000; contador ++) {
	if(numero%11 == 5) {
		System.out.println(numero + " | ");
	}
	numero++;
}
}
}
