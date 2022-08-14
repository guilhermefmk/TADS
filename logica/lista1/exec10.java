import java.util.*;
public class exec10 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        float valor = in.nextFloat();
        int socios = in.nextInt();
        int criancas = in.nextInt();
        int pagantes = in.nextInt();
        double valordesc = valor * 0.7;
        int publico = socios + criancas + pagantes;
        double arrecadacao = (valordesc * socios) + (valor * pagantes);
        double naoarrecadado = ((valor - valordesc) * socios) + (valor * criancas);
        System.out.println("O público total foi de " + publico);
        System.out.println("A arrecadação total foi de " + arrecadacao);
        System.out.println("O total de receita perdida foi de " + naoarrecadado);
    }
}
