import java.util.*;

public class exec13 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String produto;
        int qtproduto;
        float preco,total,desc;
        System.out.println("Qual o nome do produto?");
        produto =in.next();
        System.out.println("Qual quantidade adquirida?");
        qtproduto =in.nextInt();
        System.out.println("Qual o preco unitário?");
        preco = in.nextFloat();

        total = qtproduto * preco;

        if(qtproduto<=5){
            desc = 0.98f;
        } else if(qtproduto<=10) {
            desc = 0.97f;
        } else {
            desc = 0.95f;
        } 
        
        System.out.println("O total a pagar é " + total * desc);
        
    }
}
    