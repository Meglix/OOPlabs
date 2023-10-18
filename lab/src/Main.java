import java.sql.SQLOutput;
import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {


    int varsta=21;//7biti
    int sex=1;//bit
    int inaltime=185;//8 biti

    short wrapp = (short) ((sex << 8) | (varsta<<9)| inaltime) ;

    System.out.println((wrapp>>8)&1);
    System.out.println((wrapp>>9)&0x7f);
    System.out.println(wrapp & 0xff);

    String s1 = "Ana are";
    String s2 = "mere";
    String s3=s1+s2;
    System.out.println(s3== "Ana are mere");
        //System.out.println(wrapp);
    }
}
