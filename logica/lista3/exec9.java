import java.util.*;

public class exec9 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        float nota1,nota2,optativa,media;
        System.out.println("Qual a nota da primeira avaliação?");
        nota1 = in.nextFloat();
        System.out.println("Qual a nota da segunda avaliação?");
        nota2 = in.nextFloat();
        System.out.println("Qual a nota da optativa? Digite -1 se não fez");
        optativa = in.nextFloat();


        if (optativa == -1){
            media = (nota1+nota2)/2;
            System.out.printf("Seu rendimento foi (%.2f + %.2f)/2 = %.2f\n", nota1,nota2,media);
        } else {
            if(nota1>=nota2){
                media = (optativa+nota1)/2;
                System.out.printf("Seu rendimento foi (%.2f + %.2f)/2 = %.2f\n", optativa,nota1,media);
            } else {
                media = (optativa+nota2)/2;
                System.out.printf("Seu rendimento foi (%.2f + %.2f)/2 = %.2f\n", optativa,nota2,media);
            }
        }

        if(media>=6){
            System.out.println("Aprovado");
        } else if(media>=3){
            System.out.println("Exame");
        } else {
            System.out.println("Reprovado");
        }
    }
}
