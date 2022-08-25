import java.util.*;

public class exec12 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        float preco,result;
        int numCompra;
        numCompra = in.nextInt();
        if(numCompra < 12){
            preco = 1.50f;
        } else {
            preco = 1.30f;
        }
        result = preco * numCompra;
        System.out.println("A conta deu " + result);
    }
}
