package academy.devdojo.maratonajava.introducao;

public class Aula05EstruturasCondicionais01 {

    public static void main(String[] args) {

        int idade = 15;
        boolean isAutorizadoComprarBebida = idade >=18;

        if(isAutorizadoComprarBebida){
            System.out.println("autorizado a comprar bebida");
        }else{
            System.out.println("nao autorizado a comprar bebida");
        }


        if(!isAutorizadoComprarBebida){
            System.out.println("nao autorizado comprar bebida");
        }



    }
}
