package src.pl.robertsawyer.workshop.guess_number;

import java.util.Random;
import java.util.Scanner;

public class GuessNumberApp {

    public static void main(String[] args) {

        Random r = new Random();
        int liczba = r.nextInt(101);
        Scanner scan = new Scanner(System.in);
        System.out.print("Zgadnij liczbę od 0 do 100: ");

        while (!scan.hasNextInt()) {
            String userInput = scan.next();
            System.out.println(userInput + " to nie liczba. Zgadnij liczbę: ");
        }
            int wprowadzonaLiczba = scan.nextInt();

        while (true) {                                                          //pętla nieskończona while(dopóki jest prawdą)
            if (wprowadzonaLiczba < liczba) {
                System.out.println("To za mało. Spróbuj jeszcze raz.");
                wprowadzonaLiczba = scan.nextInt();
            } else if (wprowadzonaLiczba > liczba) {
                System.out.println("To za dużo. Zpróbuj jeszcze raz.");
                wprowadzonaLiczba = scan.nextInt();
            } else {
                System.out.println("Zgadłeś!");
                break;
            }
        }

    }
}
