import java.util.*;

public class media2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double a,b,c;
        double media;
        a = in.nextFloat();
        b = in.nextFloat();
        c = in.nextFloat();
        media = (((a*2)+(b*3)+(c*5))/10);
        System.out.printf("MEDIA = %.1f\n",  media);
    }
}
