package aula_04_repeticoes;

import java.util.Scanner;

public class Exe02 {

    public static void main(String[] args) {

        Scanner leia = new Scanner(System.in);
        
        int par = 0,impar = 0;
        
        for (int contador = 1; contador <= 10; contador++) {
            System.out.println("Digite 10 numeros: ");
            int numero = leia.nextInt();
            if(numero % 2==0) {
            	par++;
            } else if(!(numero % 2 == 0)) {
            	impar++;
            }
        }
        
        System.out.println("Total de números pares:" +par);
        System.out.println("Total de números impares:"+impar);
        leia.close();
    }
}