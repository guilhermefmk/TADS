import java.util.Scanner;

public class areadocirculo {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        double r, area;
        r = in.nextDouble();
        area = 3.14159 * (r*r);
        System.out.print("A=");
        System.out.format("%.4f\n", area);
    }
}
