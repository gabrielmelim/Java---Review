package academy.devdojo.maratonajava.introducao;

public class Aula04Operadores {
    public static void main(String[] args) {

        //Operadores Básicos
        float valor1 = 66;
        float valor2 = 30;

        float soma;
        float subtracao;
        float divisao;
        float multiplicacao;

        soma = valor1 + valor2;
        subtracao = valor1 - valor2;
        divisao = valor1 / valor2;
        multiplicacao = valor1 * valor2;

        System.out.println(soma);
        System.out.println(subtracao);
        System.out.println(divisao);
        System.out.println(multiplicacao);

        //Operador Resto
        int restoPar = 20 % 2;
        int restoImpar = 20 % 3;
        System.out.println(restoPar);
        System.out.println(restoImpar);

        // Operadores Relacionais
        boolean isDezMaiorQue20 = 10 > 20;
        boolean isDezMenorQue20 = 10 < 20;
        boolean isDezMaiorIgualQue20 = 10 >= 20;
        boolean isDezMenorIgualQue20 = 10 <= 20;
        boolean isDezIgual20 = 10 == 20;
        boolean isDezDiferente20 = 10 != 20;


        System.out.println("10 e maior que 20?: " + isDezMaiorQue20);
        System.out.println("10 e menor que 20?: " + isDezMenorQue20);
        System.out.println("10 e maior ou igual a 20?: " + isDezMaiorIgualQue20);
        System.out.println("10 e menor ou igual a 20?: " + isDezMenorIgualQue20);
        System.out.println("10 e igual a 20?: " + isDezIgual20);
        System.out.println("10 e diferente de 20?: " + isDezDiferente20);

        // Operadores Logicos &&
        int idade = 35;
        float salario = 3500F;
        boolean isDentroDaLei = idade > 30 && salario > 4600;

        System.out.println(isDentroDaLei);

        //// Operadores Logicos OR
        double valorTotalContaCorrente = 200;
        double valorTotalContaPoupanca = 10000;
        float valorPlaystation = 5000f;

        boolean isPlaystationCincoCompravel = valorTotalContaCorrente > valorPlaystation || 		valorTotalContaPoupanca > valorPlaystation;

        System.out.println("Compra aprovada: "+isPlaystationCincoCompravel);

        // Operador Atribuição
        double bonus = 1800;
        bonus += 1000;

        System.out.println(bonus);
    }
}
