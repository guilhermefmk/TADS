import java.util.*;
public class exec5 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        float nota = 0,media,temp = 0;
        int i =0;
        while(i<5){
            System.out.println("Qual a nota da avaliação?");
            nota = in.nextFloat();
            temp +=nota;
            System.out.println(temp);
            i++;
        }
        media = temp/5;  
        System.out.println("Sua média é " + media);
    }
}
