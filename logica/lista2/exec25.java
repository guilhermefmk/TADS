import java.util.*;

public class exec25 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        float preco;
        int umreal,cinquenta,vintecinco,dez,cinco;
        float total;
        System.out.println("Qual o preco?");
        preco = in.nextFloat();
        System.out.println("Quantas de um real?");
        umreal = in.nextInt();
        System.out.println("Quantas de cinquenta?");
        cinquenta = in.nextInt();
        System.out.println("Quantas de vinte e cinco?");
        vintecinco = in.nextInt();
        System.out.println("Quantas de dez?");
        dez = in.nextInt();
        System.out.println("Quantas de cinco?");
        cinco = in.nextInt();
        
        total = umreal + (cinquenta * 0.5f) + (vintecinco * 0.25f) + (dez * 0.1f) + (cinco * 0.05f);
        
        
        if(total>=preco){
            System.out.println("Você tem a quantia necessária " + total + " reais");
        }else {
            System.out.println("Você não tem a quantia necessária " + total + " reais");
        }
    }
}