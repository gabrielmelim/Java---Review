package academy.devdojo.maratonajava.introducao;

public class Aula06EstruturasDeRepeticao01 {
    public static void main(String[] args) {
        //while , do while , for

        //Laço de repetição while , enquanto.
        int count = 0;
        while (count < 10) {
            count ++;
            System.out.println(count);
        }

        //Laço de repetição do while, faça enquanto.
        count = 0;
        do {
            count ++;
            System.out.println("Dentro do do-while"+ count);

        }while (count < 10);

        // laço de repetição para
        for (int i=0; i<10 ; i++ ){
            System.out.println("For " + i);
        }

    }
}
