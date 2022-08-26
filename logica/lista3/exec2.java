import java.util.*;

public class exec2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        float valor1, valor2, valor3;
        valor1 = in.nextFloat();
        valor2 = in.nextFloat();
        valor3 = in.nextFloat();
        if (valor1>valor2){
            if (valor1>valor3){
                System.out.println(valor1);
            } else {
                System.out.println(valor3);
            }
        } else if(valor2>valor3){
            System.out.println(valor2);
        } else {
            System.out.println(valor3);
        }
    }
}

