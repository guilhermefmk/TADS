import java.util.*;

public class exec11e12 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        float medida;
        int lados;
        System.out.println("Quantos lados tem o poligono?");
        lados =in.nextInt();
        System.out.println("Qual a mediada do lado em cm");
        medida =in.nextFloat();


        if(lados<3){
            System.out.println("Não é um poligono!");
        } else if(lados==3) {
            System.out.println("Triangulo");
            System.out.println("Seu perimetro é " + 3*medida);
        } else if(lados==4){
            System.out.println("Quadrado");
            System.out.println("Sua área é " + 2*medida);
        } else if(lados==5){
            System.out.println("Pentágono");
        } else {
            System.out.println("Poligono não identificado");
        }
        
        
    }
}
    