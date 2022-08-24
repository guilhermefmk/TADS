import java.util.*;

public class exec4 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int v1,v2;
        v1 = in.nextInt();
        v2 = in.nextInt();
        if(v1>v2) {
            System.out.println("A variável v1 com valor " + v1 + ", é maior que a variável v2 com valor " + v2);
        } else {
            System.out.println("A variável v2 com valor " + v2 + ", é maior que a variável v1 com valor " + v1);
        }
    }
}