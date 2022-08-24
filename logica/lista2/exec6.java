import java.util.*;

public class exec6 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int ano,mes,dia,result;
        System.out.println("Digite sua idade no seguinte formato => %a %m %d");
        ano = in.nextInt();
        mes = in.nextInt();
        dia = in.nextInt();
        ano = ano*365;
        mes = mes*30;
        result = ano + mes + dia;

        System.out.println("Você já viveu " + result + " dias");
    }
}
