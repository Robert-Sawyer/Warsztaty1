package src.pl.robertsawyer.workshop.guess_number;

import java.util.Scanner;

public class GuessNumber2 {

    public static void main(String[] args) {

        System.out.println("Pomyśl liczbę od 0 do 1000, a ja ją zgadnę w maksymalnie 10 próbach");
        int min = 0;
        int max = 1000;

        int guess = 0;
        while (true) {
            guess = ((max - min) / 2) + min;
            System.out.println("Zgaduję: " + guess + ". Wybierz jedną z trzech opcji: 'za dużo', 'za mało', 'zgadłeś'.");
            Scanner scan = new Scanner(System.in);
            String check = scan.next();
            check = check.replaceAll(" ", "");

            if (check.equals("zadużo")) {
                max = guess;
            } else if (check.equals("zamało")) {
                min = guess;
            } else if (check.equals("zgadłeś")) {
                System.out.println("Wygrałem!");
                break;
            }
        }
    }
}
