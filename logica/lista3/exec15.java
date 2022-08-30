import java.util.*;

public class exec15 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        int a,b,c;
        a = in.nextInt();
        b = in.nextInt();
        c = in.nextInt();

        if(a<b+c && b<a+c && c<a+b){
            if(a==b && b==c){
                System.out.println("Triangulo equilatero");
            } else {
                if(a==b || b==c || a==c){
                    System.out.println("Triangulo Isósceles");
                } else {
                    System.out.println("Triangulo Escaleno");
                }
            }
        } else {
            System.out.println("Não é possivel formar triangulo");
        }
    }
}