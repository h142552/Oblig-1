package no.hib.DAT100;
import easyIO.*;

public class Oppgave2 {
    public static void start(){
        In inn = new In();

        //System.out.print("Skriv inn mønster: ");
        //String search = inn.next();
        //filInn(search);

        printMidterste();
    }

    // Oppgave 2 b)
    public static void filInn(){
        In inn = new In("test.txt");
        int linjer = Integer.parseInt(inn.next());
        String[] tabell = new String[linjer];

        // Hent ord fra fil til tabell
        for(int i = 0; i < linjer; i++)
            tabell[i] = inn.next();
        inn.close();

        // Print element i tabell
        for(String s : tabell)
            System.out.println(s);
    }

    // Oppgave 2 c)
    public static void filInn(String search){
        In inn = new In("test.txt");
        int linjer = Integer.parseInt(inn.next());
        String[] tabell = new String[linjer];

        // Hent ord fra fil til tabell
        for(int i = 0; i < linjer; i++)
            tabell[i] = inn.next();
        inn.close();

        // Finn mønster i tabell, og tell antall
        int searchCount = 0;
        for(String s : tabell){
            if(s.contains(search))
                searchCount++;
        }
        System.out.println("Mønster funnet " + searchCount + " ganger.");
    }

    // Oppgave 2 d)
    public static void printMidterste(){
        In inn = new In("test.txt");
        int linjer = Integer.parseInt(inn.next());
        String[] tabell = new String[linjer];

        // Hent ord fra fil til tabell
        for(int i = 0; i < linjer; i++)
            tabell[i] = inn.next();
        inn.close();

        // Print midterste tegn
        for(String s : tabell){
            if(s.length() == 1){
                System.out.println(s);
            }
            else if(s.length() % 2 == 0){ // Partall
                System.out.println(s.substring((s.length() / 2) - 1, (s.length() / 2) + 1));
            }
            else{ // Oddetall
                System.out.println(s.substring((s.length() / 2) - 1, (s.length() / 2) + 2));
            }
        }
    }
}
