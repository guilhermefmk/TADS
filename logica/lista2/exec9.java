import java.util.*;
import java.lang.Math;
public class exec9 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double raio,diametro,comprimento,area;
        System.out.println("Qual o raio da circunferência?");
        raio = in.nextFloat();
        diametro = 2*raio;
        comprimento = 2 * 3.141692f * raio;
        area = 3.141692f * Math.pow(raio,2);
        System.out.printf("%.2f => diametro\n%.2f => comprimento\n%.2f => area\n", diametro,comprimento,area);
    }
}
