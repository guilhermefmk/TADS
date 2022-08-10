import java.util.*;

public class ExemploVar {
    public static void main(String[] args) {
       Scanner in = new Scanner(System.in);

       float av1 = in.nextFloat();
       float av2 = in.nextFloat();
       float av3 = in.nextFloat();
       float trab = in.nextFloat();

       float media = (av1 + av2 + av3 + trab)/4;
       System.out.printf("Sua média foi %.2f\n",media);
        
    }
    
}
