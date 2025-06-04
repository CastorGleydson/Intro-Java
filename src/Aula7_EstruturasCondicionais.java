//Nessa aula, vamos trabalhar com a estrutura condicional em programação Java.
//COndicionais sçao muito imporantes para trabalharmos com projetos e códigos onde dependemos de alguma condição para que o bloco aconteça.
//Para isso vamos utilizar os seguintes métodos abaixo.
//Métod "SE" uo "IF";
//Metodo "SE NÃO SE" ou "ELSE IF";
//Metodo "SE NÃO" ou ELSE;

import java.util.Scanner;

public class Aula7_EstruturasCondicionais {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Digite sua idade: ");
            int idade = sc.nextInt();

            while (idade != 0) {

                if (idade > 40) {
                    System.out.println("Você está ficando muito Velho!");
                } else if (idade >= 30 && idade <= 40) {
                    System.out.println("Você ainda não é um idoso, mas já está quase chegando lá!");
                } else {
                    System.out.println("Cê é novinho pra carai, sô! Cê ta doido!");
                }
                System.out.print("Digite sua idade: ");
                idade = sc.nextInt();
            }
        }
    }
}
