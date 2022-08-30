import java.util.*;

public class exec8 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String user,passwd;
        String loop="2";
        

        while(true){
            System.out.println("Digite o usuário: ");
            user = in.next();
            if (user.equals("1234")){
                System.out.println("Qual a senha:");
                passwd = in.next();
                if(passwd.equals("9999")){
                    System.out.println("Acesso permitido!");
                    break;
                } else {
                    System.out.println("Senha incorreta!");
                    System.out.println("Tentar novamente? (1)-SIM (2)-NAO");
                    loop = in.next();
                }
            } else { 
                System.out.println("Usuário incorreto");
                System.out.println("Tentar novamente? (1)-SIM (2)-NAO");
                loop = in.next();
            }
            if(loop.equals("2")){
                break;
            }
        }
    }
}
    