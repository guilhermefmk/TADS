import java.util.*;
public class exec7 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double distancia = in.nextDouble();
        double velocidade = in.nextDouble();
        double distanciametros = distancia * 1000;
        double velocidadeparams = velocidade / 3.6;
        double tempo = distanciametros / velocidadeparams;
        System.out.println(distanciametros);
        System.out.println(velocidadeparams);
        System.out.println(tempo/3600);
    }
}
