package academy.devdojo.maratonajava.introducao;

public class Aula02TiposPrimitivos {
    public static void main(String[] args) {

        int idade = (int) 100000000000L; // casting de int para long.
        long numeroGrande = (long) 155.23; // casting de um numero decimal dentro de um long
        double salarioDouble = 2000.0D;
        float salarioFloat = (float) 2500.0D; // casting de float para double.
        byte idadeByte = 10;
        short idadeShort = 10;
        boolean verdadeiro = true;
        boolean falso = false;
        char caractere = 65;

        String nome = "gabriel";

        System.out.println("Valor da nossa idade: " + idade);
        System.out.println(falso);
        System.out.println("char: " + caractere);
        System.out.println(nome);


    }
}
