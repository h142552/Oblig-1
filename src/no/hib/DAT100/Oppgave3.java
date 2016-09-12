package no.hib.DAT100;

import easyIO.*;

public class Oppgave3 {
	public static void start(){
		System.out.println("Skriv inn grunntal (reelt tall) og eksponent (heltall) separert med et mellomrom.");
		In inn = new In();
		
		Integer x = Integer.parseInt(inn.next());
		Integer n = Integer.parseInt(inn.next());
		
		System.out.println("Potenser med egen metode:  x^n = " + pow1(x, n));
		System.out.println("Potenser med javas innebygde metode:  x^n = " + pow2(x, n));

		if (pow1(x, n) == pow2(x, n))
			System.out.println("Metodene returnerer samme svar. ");
		
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
