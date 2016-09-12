package no.hib.DAT100;


import java.util.Scanner;

public class Oppgave1 {

	
	public enum Karakter {
		A, B, C,
		D, E, F
	}
	
	// Oppgave a)
	public static void brukerInn(Scanner sc) {
		System.out.println("Skriv inn en poengsum for å sjekke karakter: ");
		int poengsum = sc.nextInt();
		
		if(sjekkPoengsum(poengsum) != null) {
			Karakter kar = sjekkPoengsum(poengsum);
			System.out.println(poengsum + " poeng gir \"" + kar.toString() + "\" som karakter. ");
		}
		else {
			System.out.println(poengsum + " er ikke en gyldig poengsum. ");
		}
	}

	// Oppgave b)
	public static void brukerInn(Scanner sc, int antallStudenter) {
		System.out.println("Velg antall studenter: (def. = 10) ");
		antallStudenter = sc.nextInt();
		System.out.println("Skriv inn " + antallStudenter + " poengsummer for å sjekke karakterer: ");
		
		for(int i = 0; i < antallStudenter; i++) {
			int poengsum = sc.nextInt();
			if(sjekkPoengsum(poengsum) != null) {
				Karakter kar = sjekkPoengsum(poengsum);
				System.out.println("Student" + (i + 1) + ": " + poengsum + " poeng gir \"" + kar.toString() + "\" som karakter. ");
			}
			else {
				System.out.println("Student" + (i + 1) + ": " + poengsum + " er ikke en gyldig poengsum. ");
			}
		}
	}

	public static Karakter sjekkPoengsum(int poengsum) {
		if(poengsum <= 100 && poengsum >= 90) {
			return Karakter.A;
		} 
		else if(poengsum <= 89 && poengsum >= 80) {
			return Karakter.B;
		}
		else if(poengsum <= 79 && poengsum >= 60) {
			return Karakter.C;
		}
		else if(poengsum <= 59 && poengsum >= 50) {
			return Karakter.D;
		}
		else if(poengsum <= 49 && poengsum >= 40) {
			return Karakter.E;
		}
		else if(poengsum <= 39 && poengsum >= 0) {
			return Karakter.F;
		}
		else {
			return null;
		}
	}
}
