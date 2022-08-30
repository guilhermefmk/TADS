import java.util.*;

public class exec10 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        float altura,peso;
        int sexo;
        System.out.println("Digite o sexo: (1)-Mulher (2)-Homem");
        sexo =in.nextInt();
        System.out.println("Qual sua altura?");
        altura =in.nextFloat();


        if(sexo==1){
            peso = (72.7f * altura) -58;
        } else {
            peso = (62.1f * altura) -44.7f;
        }
        System.out.println("Seu peso ideal é " + peso);
        
    }
}
    