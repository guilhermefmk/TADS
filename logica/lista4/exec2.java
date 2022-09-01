import java.util.*;
import java.lang.Math;
public class exec2 {
    public static void main(String[] args) {
        int numero,soma=0;
        Scanner in = new Scanner(System.in);
        numero = in.nextInt();
        for(int i = 1; i<=Math.abs(numero); i++){
            if(i%2==0){
                soma += i;
            }
        }
        if(numero>0){
            System.out.println(soma);
        } else {
            System.out.println(soma*-1);
        }
        
        
    }
}