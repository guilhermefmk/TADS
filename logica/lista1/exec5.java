import java.util.Scanner;

public class ftoc {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double f = in.nextFloat();
        double resultado = (f - 32)/1.8;
        System.out.println(resultado);
    }
}

