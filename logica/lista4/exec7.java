
import java.util.*;

public class exec7 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int senha = 12345, digitada, i = 1;
        System.out.println("Digite a senha:");
        digitada = in.nextInt();
    
        while(digitada != senha){
            System.out.println("Senha Incorreta!\nDigite a senha:");
            digitada = in.nextInt();
            i++;
        }
        System.out.println("Senha aceita com " + i + " tentativas");
    }
}
