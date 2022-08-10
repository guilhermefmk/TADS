import java.util.*;

public class media1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double a,b;
        double media;
        a = in.nextFloat();
        b = in.nextFloat();
        media = (((a*3.5)+(b*7.5))/11);
        System.out.printf("MEDIA = %.4f %n",  media);
    }
}
