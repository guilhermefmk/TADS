import java.util.*;

import javax.swing.plaf.synth.SynthScrollBarUI;

public class exec16 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        float salario,emprestimo,maxParcela,parcelaEstimada;
        int prestacoes;
        System.out.println("Digite o seu salário");
        salario = in.nextFloat();
        System.out.println("Digite o valor do empréstimo");
        emprestimo = in.nextFloat();
        System.out.println("Digite em quantas prestações deseja pagar");
        prestacoes = in.nextInt();
        maxParcela = salario * 0.3f;
        parcelaEstimada = emprestimo / prestacoes;
        if (parcelaEstimada <= maxParcela){
            System.out.println("Empreśtimo aprovado suas parcelas terão o valor de " + parcelaEstimada + " divididas em " + prestacoes + " meses");
        } else {
            System.out.println("Empreśtimo não aprovado a parcela estimada para seu empréstimo ficou em " + parcelaEstimada + " o que excede o limite de 30% do seu slário que é " + maxParcela);
        }
    }
}
