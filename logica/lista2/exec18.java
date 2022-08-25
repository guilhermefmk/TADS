import java.util.*;


public class exec18 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int carrosVendidos;
        float totalVendas,salarioFixo,valorPorCarro,salario;
    
        System.out.println("Quantos carros vendeu?");
        carrosVendidos = in.nextInt();
        System.out.println("Qual o total das vendas?");
        totalVendas = in.nextFloat();
        System.out.println("Qual seu salário fixo?");
        salarioFixo = in.nextFloat();
        System.out.println("Quanto ganha por carro?");
        valorPorCarro = in.nextFloat();
        
        salario = salarioFixo + (valorPorCarro * carrosVendidos) + (totalVendas * 0.05f);
        System.out.println("O seu salário é " + salario);
    }
}