import java.util.*;

public class exec13 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        float nota1,nota2,media;
        nota1 = in.nextFloat();
        nota2 = in.nextFloat();
        media = (nota1 + nota2) / 2;
        if(media >= 6){
            System.out.printf("Você foi aprovado, com média %.2f\n", media);
        } else {
            System.out.printf("Você foi reprovado, com média %.2f\n", media);
        }
    }
}
