package academy.devdojo.maratonajava.introducao;

public class Aula06EstruturasDeRepeticao05 {
    public static void main(String[] args) {

        //Dado o valor de um carro , descubra em quantas vezes , ele pode ser parcelado.
        //Condicao  valor da parcela tem que ser maior ou igual a 1,000.

        double valorTotal = 30000;

        for (int parcela = (int) valorTotal; parcela >= 1; parcela--) {

            double valorParcela = valorTotal / parcela;

            if (valorParcela < 1000) {
                continue;
            }

            System.out.println("Parcela " + parcela + " R$" + valorParcela);
        }

    }
}
