import java.util.*;

public class exec15 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int horaInit,horaEnd,duracao;
        System.out.println("Hora de inicio: ");
        horaInit = in.nextInt();
        System.out.println("Hora de fim: ");
        horaEnd = in.nextInt();
        System.out.println(horaInit);
        System.out.println(horaEnd);
        System.out.println(horaInit > horaEnd);
        if(horaEnd > horaInit){
            duracao = horaEnd - horaInit;
        } else {
            duracao = (24+horaEnd) - horaInit;
        }

        System.out.println("A partida durou " + duracao + " horas");
    }
}
