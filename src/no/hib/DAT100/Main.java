package no.hib.DAT100;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Oppgave 1
        System.out.println("Oppgave 1:");
        Scanner sc = new Scanner(System.in);
        Oppgave1.brukerInn(sc, 10);

        // Oppgave 2
        System.out.println("\n\n\nOppgave 2:");
        Oppgave2.start();

        // Oppgave 3
        System.out.println("\n\n\nOppgave 3:");
        Oppgave3.start();

        // Oppgave 4
        System.out.println("\n\n\nOppgave 4:");
        Oppgave4.start();

        // Oppgave 5
        System.out.println("\n\n\nOppgave 5:");
        Oppgave5.start();
    }
}
