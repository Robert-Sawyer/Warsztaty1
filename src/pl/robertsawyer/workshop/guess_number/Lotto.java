package src.pl.robertsawyer.workshop.guess_number;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Lotto {

    public static void main(String[] args) {

        int[] wylosowane = new int[6];
        int[] typowane = new int[6];

        Scanner scan = new Scanner(System.in);
        System.out.println("Podaj 6 liczb z zakresu od 1 do 49 rozdzielając je enterem: ");

        while (!scan.hasNextInt()) {
            String userInput = scan.next();
            System.out.println(userInput + " to nie liczba. Podaj liczbę");
        }

        for (int i = 0; i < 6; ) {
            int liczba = scan.nextInt();
            if (liczba < 1 && liczba > 49) {
                System.out.println("Podałeś liczbę za dużą lub za małą. Podaj liczbę z zakresu od 1 do 49: ");
            } else {
                typowane[i] = liczba;
                i++;
            }
        }
        Arrays.sort(typowane);
        System.out.println(Arrays.toString(typowane));

//        Random r = new Random();
//        wylosowane[0] = 1 + r.nextInt(49);
//
//        for (int i = 1; i < 6; ) {
//            wylosowane[i] = 1 + r.nextInt(49);
//            boolean unique = true;
//            for (int j = 0; j < i; j++) {
//                if (wylosowane[i] == wylosowane[j]) {
//                    unique = false;
//                    break;
//                }
//            }
//            if (unique) {
//                i++;
//            }
//        }
//
//            System.out.println(Arrays.toString(wylosowane));
/*
        int[] liczby = new int[49];
        int nextVal = 1;
        for (int i = 0; i <liczby.length; i++) {
            liczby[i] = nextVal++;
        }

        int zakres = liczby.length;
        int[] wylosowane = new int[6];
        for (int i = 0; i <liczby.length; i++) {
            int uzytyIndex = 0 + new Random().nextInt(zakres);
            wylosowane[i] = liczby[uzytyIndex];

            int temp = liczby[uzytyIndex];
            liczby[uzytyIndex] = liczby[zakres - 1];
            liczby[zakres - 1] = temp;
            zakres--;

        }
        */
    }
}
