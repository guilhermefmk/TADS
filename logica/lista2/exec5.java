import java.util.*;

public class exec5 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        float numerador,denominador,result;
        numerador = in.nextFloat();
        denominador = in.nextFloat();
        if(denominador==0) {
            System.out.println("Denominador não pode ser zero");
        } else {
            result = numerador/denominador;
            System.out.println("O resultado da divisão é " + result );
        }
    }
}