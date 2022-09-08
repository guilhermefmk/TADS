
import java.util.*;

public class exec6 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num;
        System.out.println("Digite um número entre 1 e 10:");
        num = in.nextInt();
        while(num < 1 || num > 10){
            System.out.println("Digite um número entre 1 e 10:");
            num = in.nextInt();
        }
        System.out.println(num);
    }
}
