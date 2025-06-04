//O objetivo dessa aula é retomada de conceitos básicos da linguagem de programação Java,
// onde partiremos de principios básicos porém muito importantes e necessários para desvolvimentos futuros.

// Aqui estamos partindo do principio de variavei primitivas.
// no caso, temos int para valores inteiros comporta 4 bytes.
// temos também double para valores decimais comporta até 8 bytes.
// As variaveis do tipo char, comportam 2 bytes, um único caractere Unicode.
// por fim temos a variavel boolean, para valores com 1 byte, para se trabalhar com valores binarios, sendo true or false.

public class Aula2_Sitaxe_Basica_Declarando_Variaveis {
    public static void main(String[] args){
        int idade = 36;
        double altura = 1.85;
        char inicial = 'G';
        boolean ativo = true;

        System.out.println("Idade: " + idade);
        System.out.println("Altura: " + altura);
        System.out.println("Inicial:" + inicial);
        System.out.println("Ativo: " + ativo);
    }
}
