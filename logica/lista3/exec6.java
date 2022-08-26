import java.util.*;

public class exec6 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int gol1,gol2;
        String nome1,nome2;
        System.out.println("Nome time1:");
        nome1 = in.next();
        System.out.println("Gols time 1:");
        gol1 = in.nextInt();
        System.out.println("Nome time2:");
        nome2 = in.next();
        System.out.println("Gols time 2:");
        gol2 = in.nextInt();
        if (gol1 == gol2){
            System.out.println("Houve um empate entre " + nome1 + " e " + nome2);
        } else if(gol1 > gol2){
            System.out.println(nome1 + " ganhou!");
        } else { 
            System.out.println(nome2 + " ganhou!");
        }

        
    }
}