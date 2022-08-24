import java.util.*;
public class exec2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        float base,altura,area,perimetro;
        base = in.nextFloat();
        altura = in.nextFloat();
        area = base * altura;
        perimetro = (2*base) + (2*altura);
        System.out.println("A Área do retangulo é " + area + " e seu perimetro é " + perimetro);
    }
}
