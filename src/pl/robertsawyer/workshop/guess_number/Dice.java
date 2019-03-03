package src.pl.robertsawyer.workshop.guess_number;

import java.util.Random;
import java.util.Scanner;

public class Dice {

    public static void main(String[] args) {

        int ileRzutow;
        int rodzajKostki;
        int modyfikator = 0;

        Scanner scan = new Scanner(System.in);
        System.out.print("Ile razy rzucić kostką? ");
        ileRzutow = scan.nextInt();

        System.out.print("Wybierz rodzaj kostki. Do wyboru D3, D4, D6, D8, D10, D12, D20, D100. Wybieram D");
        rodzajKostki = scan.nextInt();

        System.out.print("Czy chcesz dodać, lub odjąć jakieś punkty? Wpisz 'tak' lub 'nie'. ");
        String choise = scan.next();
        if (choise.equals("tak")) {
            System.out.print("Wpisz ile chcesz odjąć lub dodać. ");
            modyfikator = scan.nextInt();
        }
        Random r = new Random();
        int kostka = 0;

        int wynik = 0;
        do {
            kostka = 1 + r.nextInt(rodzajKostki);
            wynik += kostka;
            ileRzutow--;
        } while (ileRzutow != 0);
            wynik += modyfikator;

        System.out.println(wynik);
    }
}
