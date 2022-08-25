import java.util.*;


public class exec19 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int carrosVendidos;
        float comprimento, altura,largura,area1,areaTotal,Qtcaixas;
    
        System.out.println("Comprimento?");
        comprimento = in.nextFloat();
        System.out.println("Altura");
        altura = in.nextFloat();
        System.out.println("Largura");
        largura = in.nextFloat();
        areaTotal = ((largura * 2) * altura) + ((comprimento * 2) * altura);
        Qtcaixas = areaTotal / 1.5f;
        System.out.println("Precisará de " + Qtcaixas + " caixas");
    }
}