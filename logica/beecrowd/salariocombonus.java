import java.util.*;


public class salariocombonus {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String a;
        float b,c;
        double bonus, result;
        a = in.next();
        b = in.nextFloat();
        c = in.nextFloat();
        bonus = c * 0.15;
        result = b + bonus;


        System.out.printf("TOTAL = %.2f",  result);

    }
}