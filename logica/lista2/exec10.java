import java.util.*;

public class exec10 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int idade;
        System.out.println("Digite sua idade:");
        idade = in.nextInt();
        if(idade>=18){
            System.out.println("Adulto");
        } else if(idade >= 14 && idade < 18){
            System.out.println("Juvenil");
        } else if(idade >= 9 && idade < 14) {
            System.out.println("Infantil");
        } else {
            System.out.println("Mirim");
        }
        
    }
}
