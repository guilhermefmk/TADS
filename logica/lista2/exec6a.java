import java.util.*;

public class exec6a {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Calendar c = Calendar.getInstance();
        int ano_user,mes_user,dia_user,result,ano_atual,mes_atual,dia_atual,idade_ano = 0,idade_mes = 0,idade_dia = 0;
    
        System.out.println("Digite sua data de nascimento => %d %m %a");
        dia_user = in.nextInt();
        mes_user = in.nextInt();
        ano_user = in.nextInt();
        ano_atual = c.get(Calendar.YEAR);
        mes_atual = c.get(Calendar.MONTH)+1;
        dia_atual = c.get(Calendar.DAY_OF_MONTH);
        System.out.println(mes_atual);
        System.out.println(dia_atual);
        
        if(mes_atual > mes_user && dia_atual > dia_user){
            idade_ano = ano_atual - ano_user;
            idade_mes = (mes_atual - mes_user);
            idade_dia = dia_atual - dia_user;
        } else if (mes_atual > mes_user && dia_atual < dia_user){
            idade_ano = ano_atual - ano_user;
            idade_mes = (mes_atual - mes_user) - 1;
            idade_dia = ((dia_user - dia_atual) - 31) * (-1);
        } else {
            idade_ano = (ano_atual - ano_user) - 1;
            idade_mes = (mes_atual - mes_user) + 11;
            idade_dia = ((dia_user - dia_atual) - 31) * (-1);
        }
        if (idade_dia > 31){
            idade_mes += 1;
            idade_dia -= 31;
        }

		System.out.printf("Sua idade é: %d anos %d meses e %d dias\n", idade_ano, idade_mes, idade_dia);
		
    }
}
