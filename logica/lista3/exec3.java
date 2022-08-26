import java.util.*;

public class exec3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        float valor1, valor2, valor3,maior,smaior;
        valor1 = in.nextFloat();
        valor2 = in.nextFloat();
        valor3 = in.nextFloat();
        if (valor1>valor2){
            if (valor1>valor3){
                maior = valor1;
                if(valor3>valor2){
                    smaior = valor3;
                } else {
                    smaior = valor2;
                }
            } else {
                maior = valor3;
                smaior = valor1;
            }
        } else if(valor2>valor3){
            maior = valor2;
            if(valor3>valor1){
                smaior = valor3;
            } else {
                smaior = valor1;
            }
        } else {
            maior = valor3;
            smaior = valor2;
        }
        System.out.println("A soma de " + maior + " + " + smaior + " é " + (maior+smaior));
    }
}

