import java.util.*;
public class exec1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        float metros,cm;
        boolean loop = true;
        while (loop){
            System.out.printf("Digite uma quantia em metros para conversão ou digite 0 para sair: ");
            metros = in.nextFloat();
            if(metros==0){
                loop = false;
            } else {
                cm = metros * 100;
                System.out.println(metros + " em centimetros é " + cm + " cm");
            }
        }
    }
}