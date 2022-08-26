import java.util.*;

public class exec21 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        float comprimento,kmporlitro,primeiraparada,result;
        int voltas,reabastecimentos;
        
        System.out.println("Qual o comprimento da pista em metros?");
        comprimento = in.nextFloat();
        System.out.println("Quantas voltas precisam ser dadas?");
        voltas = in.nextInt();
        System.out.println("Quantos reabastecimentos deseja fazer?");
        reabastecimentos = in.nextInt();
        System.out.println("Quantos km/l o carro faz?");
        kmporlitro = in.nextFloat();

        
        primeiraparada = (comprimento*voltas)/reabastecimentos;
        result = primeiraparada/kmporlitro;
        System.out.println("Você precisará utilizar " + result + " litros de combustivel");
    }
}