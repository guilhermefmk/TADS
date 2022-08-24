import java.util.*;

public class exec7 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        float salario_hora, imposto, salario_mes;
        int horas_mes;
        System.out.println("Quanto ganha por hora?");
        salario_hora = in.nextFloat();
        System.out.println("Quantas horas trabalha no mês?");
        horas_mes = in.nextInt();
        System.out.println("Qual a porcentagem de imposto cobrado sobre?");
        imposto = in.nextFloat();
        imposto = 1- (imposto/100);
        salario_mes = (salario_hora * horas_mes) * imposto;

        System.out.println("Você irá receber neste mês o valor de " + salario_mes);
    }
}
