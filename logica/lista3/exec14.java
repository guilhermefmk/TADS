import java.util.*;

public class exec14 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        float nota1,nota2,nota3,media;
        System.out.println("Qual a nota 1?");
        nota1 =in.nextFloat();
        System.out.println("Qual a nota 2?");
        nota2 =in.nextFloat();
        System.out.println("Qual a nota 3?");
        nota3 =in.nextFloat();

        media = (nota1+nota2+nota3) / 3;

        if(media>=9){
            System.out.println("A");
        } else if(media>=7.5) {
            System.out.println("B");
        } else if(media>=6)  {
            System.out.println("C");
        } else {
            System.out.println("D");
        }
        
        
    }
}