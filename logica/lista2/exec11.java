import java.util.*;

public class exec11 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num1, num2, result;
        System.out.println("Digite dois núemros:");
        num1 = in.nextInt();
        num2 = in.nextInt();
        result = num1 + num2;
        if(result > 20){
            result += 8;
        } else if(result <=20){
            result += 10;
        }
        System.out.println("A soma formatada é " + result);
    }
}
