import java.util.*;

public class exec8 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int total,branco,nulo,valido;
        float percentBranco,percentNulo,percentValido;
        System.out.println("Digite o total de eleitores");
        total = in.nextInt();
        System.out.println("Digite o total de votos em branco");
        branco = in.nextInt();
        System.out.println("Digite o total de votos nulos");
        nulo = in.nextInt();
        System.out.println("Digite o total de votos validos");
        valido = in.nextInt();
        percentBranco = (100 * branco)/total;
        percentNulo = (100 * nulo)/total;
        percentValido = (100 * valido)/total;
        


        System.out.println("O total de votos foram " + total + "\n" + percentValido + "% de votos válidos\n" + percentBranco + "% de votos em Branco\n" + percentNulo + "% de votos Nulos");
    }
}
