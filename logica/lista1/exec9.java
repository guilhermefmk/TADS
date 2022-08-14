import java.util.*;;
public class exec9 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int homens = in.nextInt();
        int mulheres = in.nextInt();
        int criancas = in.nextInt();
        double qthomens =  (homens * 0.4) * 1.2;
        double qtmulheres = (mulheres * 0.32) * 1.2;
        double qtcriancas = (criancas * 0.32) * 1.2;
        double kgtotal = qthomens + qtmulheres + qtcriancas;
        System.out.println("A quantidade necessária de carne a ser comprada é de " + kgtotal + "kg");
    }
}
