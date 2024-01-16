import com.sun.jdi.IntegerValue;

import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        /*int nrconsoane=0,nrvocale=0;
        String vocale="aeiou";
        String sir=in.nextLine();
        for(int i=0;i< sir.length();i++){
            if(sir.charAt(i) == 'a'){
                System.out.println(i);
                nrvocale++;
            }
        }
        //System.out.println(nrvocale);
         */
        //Loterie
        int[] nralese= new int[6];
        for(int i=0;i<nralese.length;i++){
            nralese[i]=in.nextInt();
        }
        Random random=new Random();
        int [] nrcastigatoare=new int[49];
        for(int i=0;i<nrcastigatoare.length;i++){
            nrcastigatoare[i]= random.nextInt(50);
            System.out.println(nrcastigatoare[i]);
        }

        for(int i=0;i<nrcastigatoare.length;i++){
            for(int j=0;j<nralese.length;j++){
                if(nralese[j]==nrcastigatoare[i]){
                    System.out.println("numar castigator: "+nralese[j]);
                }
            }
        }
    }
}