import java.util.*;

public class exec24 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        int h1,h2,m1,m2,soma,produto,hnovo,hvelho,mnova,mvelha;
        
        System.out.println("Qual a idade do homem 1?");
        h1 = in.nextInt();
        System.out.println("Qual a idade do homem 2?");;
        h2 = in.nextInt();
        System.out.println("Qual a idade da mulher 1?");
        m1 = in.nextInt();
        System.out.println("Qual a idade da mulher 2?");
        m2 = in.nextInt();
        
        
        if(h1>=h2) {
            hnovo = h2;
            hvelho = h1;
            if(m1>=m2) {
                mnova = m2;
                mvelha = m1;
                soma = h1+m2;
                produto = h2*m1;
            } else {
                mnova = m1;
                mvelha = m2;
                soma = h1+m1;
                produto = h2*m2;
            }
        } else {
            hnovo = h1;
            hvelho = h2;
            if(m1>=m2) {
                mnova = m2;
                mvelha = m1;
                soma = h2+m2;
                produto = h1*m1;
            } else {
                mnova = m1;
                mvelha = m2;
                soma = h2+m1;
                produto = h1*m2;
            }
        }
        System.out.println("O homem mais novo tem " + hnovo + " anos");
        System.out.println("O homem mais velho tem " + hvelho + " anos");
        System.out.println("A mulher mais nova tem " + mnova + " anos");
        System.out.println("A mulher mais velha tem " + mvelha + " anos");
        System.out.println("A soma do homem mais velho com a mulher mais nova é " + soma);
        System.out.println("O produto do homem mais novo com a mulher mais velha é " + produto);
    }
}