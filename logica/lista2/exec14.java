import java.util.*;

public class exec14 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int anoPessoa,anoAtual;
        Calendar c = Calendar.getInstance();
        anoAtual = c.get(Calendar.YEAR);
        System.out.println("Seu ano de nascimento: ");
        anoPessoa = in.nextInt();
        if((anoAtual-anoPessoa) >= 18){
            System.out.println("Você pode votar esse ano");
        } else {
            System.out.println("Você não pode votar esse ano");
        }

        
    }
}
