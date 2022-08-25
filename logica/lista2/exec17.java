import java.util.*;


public class exec17 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        float custoFabrica, imposto, distribuidor, custo;
    
        System.out.println("Digite o custo de fábrica");
        custoFabrica = in.nextFloat();
        distribuidor = custoFabrica * 0.28f;
        imposto = custoFabrica * 0.45f;
        custo = custoFabrica + distribuidor + imposto;
        System.out.println("O custo total é " + custo);
    }
}