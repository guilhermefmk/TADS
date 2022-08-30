import java.util.*;

public class exec5 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        float valor1,valor2,valor3;
        valor1 = in.nextFloat();
        valor2 = in.nextFloat();
        valor3 = in.nextFloat();
        if (valor1+valor2 > valor3 && valor2 + valor3 > valor1 && valor1 + valor3 > valor2){
            System.out.println("forma triangulo");
        }

        
    }
}