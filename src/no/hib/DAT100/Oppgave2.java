package no.hib.DAT100;
import easyIO.*;

public class Oppgave2 {

	public static void filInn()
	{
		In inn = new In("test.txt");
		int linjer = Integer.parseInt(inn.next());
		String[] tabell = new String[linjer];
		
		// Legg ord i tabell
		for(int i = 0; i < linjer; i++){
			//System.out.println(inn.next());
			tabell[i] = inn.next();
		}
		inn.close();

		// Print element i tabell
		for(String s : tabell){
			System.out.println(s);
		}
	}
}
