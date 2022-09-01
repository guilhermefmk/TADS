import java.util.*;
import java.lang.Math;
public class exec3 {
    public static void main(String[] args) {
        int numero;
        String result = "";
        Scanner in = new Scanner(System.in);
        numero = in.nextInt();
        for(int i = 2; i<Math.abs(numero); i++){
            if(numero%i==0){
                result = "Não é primo!";
            }
        }
        if(result.isEmpty()){
            System.out.println("É primo!");
        } else {
            System.out.println(result);
        }
        

    }
}