import java.util.*;

public class exec4 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        float valor1, valor2, valor3,maior,smaior,tmaior;
        valor1 = in.nextFloat();
        valor2 = in.nextFloat();
        valor3 = in.nextFloat();
        if (valor1>valor2){
            if (valor1>valor3){
                maior = valor1;
                if(valor3>valor2){
                    smaior = valor3;
                    tmaior = valor2;
                } else {
                    smaior = valor2;
                    tmaior = valor3;
                }
            } else {
                maior = valor3;
                smaior = valor1;
                tmaior = valor2;
            }
        } else if(valor2>valor3){
            maior = valor2;
            if(valor3>valor1){
                smaior = valor3;
                tmaior = valor1;
            } else {
                smaior = valor1;
                tmaior = valor3;
            }
        } else {
            maior = valor3;
            smaior = valor2;
            tmaior = valor1;
        }
        System.out.println( tmaior + ", " + smaior + " e " + maior);
    }
}