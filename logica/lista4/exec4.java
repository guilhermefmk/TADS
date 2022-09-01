import java.util.*;

public class exec4 {
    public static void main(String[] args) {
        float valor,saldo = 0.0f;
        boolean loop = true;
        String opcao;
        Scanner in = new Scanner(System.in);
        
        while(loop){
            
            System.out.printf("( a ) consulta saldo , ( b ) saque e ( c ) depósito e ( d ) sair\n",saldo);
            opcao = in.next();
            switch(opcao){
                case "a":
                    System.out.printf("Seu saldo é %.2f\n", saldo);
                    break;
                case "b":
                    System.out.printf("Informe o valor:\n");
                    valor = in.nextFloat();
                    if(valor > 0){
                        if(saldo<=0 || valor>saldo){
                            System.out.printf("Seu saldo é %.2f, não é possivel sacar!\n", saldo);
                        } else {
                            saldo -= valor;
                            System.out.printf("Seu novo saldo é %.2f\n", saldo);
                        }
                    } else {
                        System.out.println("Valor inválido.");
                    }
                    break;
                case "c":
                    System.out.printf("Informe o valor:\n");
                    valor = in.nextFloat();
                    if(valor > 0){
                        saldo += valor;
                        System.out.printf("Seu novo saldo é %.2f\n", saldo);
                    } else {
                        System.out.println("Valor inválido.");
                    }
                    
                    break;
                case "d":
                    System.out.println("FIM");
                    loop = false;
                    break;
            }
            opcao = "";
        }
        

    }
}