import java.util.*;

public class exec1{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        float valor;
        valor = in.nextFloat();
        if (valor>0){
            System.out.println("Positivo");
        } else if (valor < 0 ) {
            System.out.println("Negativo");
        } else {
            System.out.println("Zero!");
        }
    }
}