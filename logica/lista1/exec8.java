import java.util.*;

public class exec8 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int total = in.nextInt();
        int validos = in.nextInt();
        int brancos = in.nextInt();
        int nulos = in.nextInt();
        float percentvalidos = (validos * 100)/ total;
        float percentbrancos = (brancos * 100)/ total;
        float percentnulos = (nulos * 100)/ total;
        float soma = percentbrancos + percentnulos + percentvalidos;
        System.out.println("O total de votos é :" + total);
        System.out.println("A porcentagem de votos validos é : " + percentvalidos + "%");
        System.out.println("A porcentagem de votos brancos é :" + percentbrancos + "%");
        System.out.println("A porcentagem de votos nulos é : " + percentnulos + "%");
    }
}
