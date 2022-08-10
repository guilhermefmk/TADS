import java.util.*;

public class salario {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a,b;
        float c,salario;
        a = in.nextInt();
        b = in.nextInt();
        c = in.nextFloat();
        


        System.out.println("NUMBER = "+  a);
        System.out.printf("SALARY = U$ %.2f",  (b*c));

    }
}