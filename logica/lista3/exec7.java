import java.util.*;

public class exec7 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        float alcool = 3.90f,gasolina = 4.30f,litros,pagar;
        String tipo;
        System.out.println("O que quer comprar: (A)-Alcool (G)-Gasolina");
        tipo = in.next();
        System.out.println("Quantos litros?");
        litros = in.nextFloat();
        
        

        if (tipo.equals("G")){
            if(litros<=20){
                pagar = (litros*gasolina) * 0.97f;
            } else {
                pagar = (litros*gasolina) * 0.95f;
            }  
        } else { 
            if(litros<=20){
                pagar = (litros*alcool) * 0.96f;
            } else {
                pagar = (litros*alcool) * 0.94f;
            }  
        }

        System.out.printf("O valor total deu %.2f\n", pagar);
    }
}