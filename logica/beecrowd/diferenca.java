import java.util.*;

public class diferenca {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a,b,c,d,dif;
        a = in.nextInt();
        b = in.nextInt();
        c = in.nextInt();
        d = in.nextInt();
        dif = (a * b) - (c * d);
        System.out.println("DIFERENCA = "+  dif);
    }
}
