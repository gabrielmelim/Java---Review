package academy.devdojo.maratonajava.introducao;

/*
    Prática

    Crie variáveis para os campos descritos abaixo entre <> e imprima a seguinte mensagem:

    Eu <nome>, morando no endereço <endereço>
    confirmo que recebi o salário <salario>,na data <data>
 */

public class Aula03TiposPrimitivosExercicio {

    public static void main(String[] args) {

        String nome = "gabriel";
        String dataRecebimentoSalario = "04/08/2022";
        String endereco = "Rua tan tan";
        double salario = 2000;
        String relatorio = "Eu "+nome+",morando no endereco "+endereco+" confirmo que recebi o salario "+salario+"" +
                " na data "+dataRecebimentoSalario;

        System.out.println(relatorio);
        // System.out.println("Eu "+nome+",morando no endereco "+endereco+" confirmo que recebi o salario "+salario+" na data "+dataRecebimentoSalario);

    }

}
