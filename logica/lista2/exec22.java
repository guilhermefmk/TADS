import java.util.*;

public class exec22 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        float saldo,debito,credito;
        int conta;
        
        System.out.println("Qual o número da conta?");
        conta = in.nextInt();
        System.out.println("Qual o saldo?");
        saldo = in.nextFloat();
        System.out.println("Quanto em débito?");
        debito = in.nextFloat();
        System.out.println("Quanto de crédito?");
        credito = in.nextFloat();

        saldo = saldo-debito+credito;
        if(saldo>0){
            System.out.println("Você tem um saldo de " + saldo + " positivos");
        }else {
            System.out.println("Você tem um saldo de " + saldo + " negativos");
        }
    }
}