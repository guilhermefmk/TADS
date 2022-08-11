import java.util.Scanner;

public class esfera {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double pi = 3.14159;
        double r = in.nextDouble();
        double volume = (4/3.0) * pi * Math.pow(r, 3);
        System.out.printf("VOLUME = %.3f\n", volume);
    }
}