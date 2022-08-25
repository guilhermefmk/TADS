import java.util.*;


public class exec20 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        float preco,kminicio,kmfinal,litros,receita,consumo,gasto,balanco;
        preco = 4.599f;
        System.out.println("Qual o km inicial?");
        kminicio = in.nextFloat();
        System.out.println("Qual o km final?");
        kmfinal = in.nextFloat();
        System.out.println("Quantos litros gastou?");
        litros = in.nextFloat();
        System.out.println("Qual sua receita final?");
        receita = in.nextFloat();
        consumo = (kmfinal - kminicio) / litros;
        gasto = preco * litros;

        balanco = receita - gasto;
        System.out.println("Você fez " + consumo + " km/l e obteve a receita de " + balanco);
    }
}