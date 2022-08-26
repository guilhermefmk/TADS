import java.util.*;

public class exec23 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        float atualestoque, maxestoque, minestoque, mediaestoque;
    
        
        System.out.println("Qual a quantidade atual?");
        atualestoque = in.nextFloat();
        System.out.println("Qual a quantidade maxima?");
        maxestoque = in.nextFloat();
        System.out.println("Qual a quantidade minima?");
        minestoque = in.nextFloat();
        
        mediaestoque = (maxestoque + minestoque)/2;
        
        if(atualestoque>=mediaestoque){
            System.out.println("Não é necessária a compra");
        }else {
            System.out.println("Efetuar compra");
        }
    }
}