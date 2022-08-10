import java.util.*;


public class calculosimples {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int i = 0;
        float soma = 0;
        while(i < 2){
            int a = scan.nextInt();
            int b = scan.nextInt();
            float c = scan.nextFloat(); 
            soma += (b*c);
            i++;
        }
        
        System.out.printf("VALOR A PAGAR: R$ %.2f\n", soma);

    }
}