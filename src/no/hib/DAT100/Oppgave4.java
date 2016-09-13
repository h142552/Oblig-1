package no.hib.DAT100;

public class Oppgave4 {
	public static void start(){
		System.out.println("x i grader\tx i radianer\tsin(x)\t\tcos(x)");
		System.out.println("------------------------------------------------------");

		for(int x = 0; x <= 180; x += 15){
			System.out.print(x + "\t\t");
			System.out.format("%.3f\t\t", (Math.PI * x)/180);
			System.out.format("%.3f\t\t", Math.sin((Math.PI * x)/180));
			System.out.format("%.3f\n", Math.cos((Math.PI * x)/180));
		}
	}
}
