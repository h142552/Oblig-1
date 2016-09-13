package no.hib.DAT100;
import easyIO.*;

public class Oppgave5 {
    public static void start(){
        In inn = new In();
        double temperatur = 0.0;
        double topp = 0.0;
        double gjSnitt = 0.0;
        double sum = 0.0;

        System.out.println("Analyse av temperaturer");
        System.out.println("***********************");
        System.out.println("Skriv inn temperaturene: ");

        for(int i = 1; i < 8; i++){
            System.out.print(i + ". dag: ");
            temperatur = Double.parseDouble(inn.next());
            sum += temperatur;

            if(topp < temperatur)
                topp = temperatur;
        }
        gjSnitt = sum / 7;

        System.out.format("Gjennomsnittstemperaturen var %.2f\n", gjSnitt);
        System.out.format("Maksimum for denne uken var %.2f grader", topp);
    }
}
