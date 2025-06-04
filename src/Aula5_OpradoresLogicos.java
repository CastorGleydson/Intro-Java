//Neste Blocop oiremos trabalhar com os opradores lógicos em Java.
//Estes oprados, serão muito utilizados em sua carreira como programador.
//São muito importantes e até para isso, acoselho estudar batante sobre lógica de programação.
// Dito isso, seguiremos como s seguintes itens:
//Operador lógico "E" ou "AND": &&;
//Operador lógico "OU" ou "OR": ||;
//Operador lógico de Nagação, "NÃO" ou "NOT": !;

public class Aula5_OpradoresLogicos {
    public static void main(String[] args) {
        boolean condicao1 = true, condicao2 = false;
        System.out.println(condicao1 && condicao2);
        System.out.println(!condicao1);
        System.out.println(condicao1 || condicao2);
    }
}
