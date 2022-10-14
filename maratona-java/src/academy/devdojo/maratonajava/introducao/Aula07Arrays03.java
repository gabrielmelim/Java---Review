package academy.devdojo.maratonajava.introducao;

public class Aula07Arrays03 {
    public static void main(String[] args) {
        int [] numeros = new int [3]; // criar um array com 3 indices.
        int [] numeros2 = {1,2,3,4,5}; // setar valor direto no array
        int [] numeros3 = new int []{1,2,3,4,5};

        for (int i = 0; i < numeros3.length ; i++) {
            System.out.println(numeros2[i]);
        }

        System.out.println();
        for (int num:numeros3){
            System.out.println(num);
        }

    }
}
