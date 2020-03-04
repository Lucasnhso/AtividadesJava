package com.github.programacao3.atividadejava.ValorInteiro;

import java.util.Scanner;

public class ValorInteiro {
    public int num;
    public static void main(String[] args) {
        ValorInteiro vi = new ValorInteiro();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite um número:");
        vi.num = scanner.nextInt();

        System.out.println("O numero é: " + vi.numType(vi.num));

        System.out.println(vi.isStrange(vi.num));

        System.out.println("\nO fatorial de " + vi.num + " é: " + vi.isFactorial(vi.num));

        System.out.println("Tabuada do " + vi.num );
        System.out.println(vi.isTabuada(vi.num));
    }

    public boolean isPair(int number){

        return(number%2 == 0);
    }

    public String numType(int number){

        return ((this.isPair(number) == true) ? "Par" : "Ímpar");
    }

    public String isStrange(int number){
        if (this.isPair(number) ==  true) {
            if (number < 10) {
                return ("Não é estranho");
            }
            else if (number < 20) {
                return ("Estranho");
            }
            else {
                return ("Não é estranho");
            }
        }
                return ("Estranho");
    }

    public int isFactorial(int number){
        int fat = 1;
        for (int i = 2; i <= number ; i++){
              fat *= i;
        }
        return fat;
    }

    public String isTabuada(int number){
        String tab ="";
        for(int i = 10; i>0 ; i--){
            tab = number + " x " + i + " = " + num * i + "\n" + tab;
        }
        return tab;
    }
}
