package no.hib.DAT100;

import easyIO.*;

public class Oppgave3 {
	public static void start(){
		System.out.println("Skriv inn grunntal (reelt tall) og eksponent (heltall) separert med et mellomrom.");
		In inn = new In();
		
		try {
			Integer x = Integer.parseInt(inn.next());
			Integer n = Integer.parseInt(inn.next());
			
			System.out.println("Produkt med egen metode:  x^n = " + pow1(x, n));
			System.out.println("Produkt med javas innebygde metode:  x^n = " + pow2(x, n));

			if (pow1(x, n) == pow2(x, n))
				System.out.println("Metodene returnerer samme svar. ");
		}
		catch(Exception e){
			System.out.println("Tall har feil format.");
			System.out.println(e.getMessage());
		}
	}
	
	public static double pow1(double x, int n){
		double sum = 1.0;
		for(int i = 0; i < n; i++)
			sum *= x;

		return sum;
	}
	
	public static double pow2(double x, int n){
		return (double)Math.pow(x, n);
	}

}
