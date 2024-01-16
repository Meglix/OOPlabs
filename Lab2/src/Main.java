import com.sun.jdi.IntegerValue;

import java.math.BigInteger;
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int maxInt = Integer.MAX_VALUE;
        int sumaLaMaxInt = maxInt + 1;
        System.out.println("Adunarea 1 la cel mai mare int: " + sumaLaMaxInt);

        int minInt = Integer.MIN_VALUE;
        int diferentaLaMinInt = minInt - 1;
        System.out.println("Scăderea 1 din cel mai mic int: " + diferentaLaMinInt);

        float maxFloat = Float.MAX_VALUE;
        double maxDouble = Double.MAX_VALUE;
        float produsFloat = maxFloat * 2.0f;
        double produsDouble = maxDouble * 2.0;
        System.out.println("Înmulțirea cu o valoare supraunitară în float: " + produsFloat);
        System.out.println("Înmulțirea cu o valoare supraunitară în double: " + produsDouble);

        float numarFloat = 123456789.123456789f;
        double numarDouble = 1234567890123456789.1234567890123456789;
        System.out.println("Număr float cu cifre zecimale mari: " + numarFloat);
        System.out.println("Număr double cu cifre zecimale mari: " + numarDouble);

        float rezultatAdunareFloat = numarFloat + 0.000000001f;
        double rezultatScadereDouble = numarDouble - 0.0000000001;
        System.out.println("Adunarea cantității în float: " + rezultatAdunareFloat);
        System.out.println("Scăderea cantității în double: " + rezultatScadereDouble);

           /* int numarCasete = 64; // Numărul total de căsuțe pe tabla de șah
            BigInteger totalBoabe = calculeazaTotalBoabe(numarCasete);

            System.out.println("Numărul total de boabe de grâu pe tabla de șah este: " + totalBoabe);
        }
        private static BigInteger calculeazaTotalBoabe(int numarCasete) {
            BigInteger doua = new BigInteger("2");
            BigInteger totalBoabe = BigInteger.ZERO;

            for (int i = 1; i <= numarCasete; i++) {
                // Numărul de boabe pentru căsuța i este 2^(i-1)
                BigInteger boabePeCasa = doua.pow(i - 1);
                totalBoabe = totalBoabe.add(boabePeCasa);
            }

            return totalBoabe;
            */
    }
}
