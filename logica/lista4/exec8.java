import java.util.*;

public class exec8 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int merc;
        float valor, valorTotal, media;

        merc = in.nextInt();
        valor = in.nextFloat();



        valorTotal = merc * valor;
        media = valorTotal/merc;
        System.out.println("Seu estoque tem " + valorTotal + " R$ de mercadoria, com a média de preço em " + media + " R$");
        
    }
}
