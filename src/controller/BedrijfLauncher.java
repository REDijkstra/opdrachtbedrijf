package controller;

import model.Afdeling;
import model.Persoon;
import model.Werknemer;
import model.ZZPer;
import model.Vrijwilliger;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

/**
 * @author Rutger Dijkstra <r.e.dijkstra@st.hanze.nl>
 * Laat de personen binnen het bedrijf zien en bijbehordende gegevens.
 */
public class BedrijfLauncher {

    public static void main(String[] args) {
        /*Afdeling[] afdelingen = new Afdeling[4];
        afdelingen[0] = new Afdeling("Uitvoering", "Hilversum");
        afdelingen[1] = new Afdeling("Support", "Amsterdam");
        afdelingen[2] = new Afdeling("Management", "Almere");
        afdelingen[3] = new Afdeling("Documentatie", "Gouda");

        ArrayList<Persoon> personen = new ArrayList<>();
        personen.add(new Werknemer("Mark", "Den Haag", afdelingen[2], 10000));
        personen.add(new Werknemer("Angelique", "Rotterdam", afdelingen[2],
                5000));
        personen.add(new Werknemer("Caroline", "Delft", afdelingen[1], 4000));
        personen.add(new ZZPer("Klaas", "Diemen", afdelingen[3], 50.00));
        personen.add(new ZZPer("Ronald", "Zaandam", afdelingen[0], 80.00));
        personen.add(new ZZPer("Jannie", "Utrecht", afdelingen[0], 60.00));
        personen.add(new ZZPer("Anne", "Zwolle", afdelingen[0], 40.00));
        personen.add(new Vrijwilliger("Ambi", "Amsterdam", afdelingen[0]));
        personen.add(new Vrijwilliger("Naledi", "Gaborone", afdelingen[1]));
        personen.add(new Vrijwilliger("Ceren", "Istanboel", afdelingen[2]));
        personen.add(new Vrijwilliger("Haining", "Shaoxing", afdelingen[3]));

        for (Persoon persoon : personen) {
            if (persoon instanceof ZZPer) {
                ((ZZPer) persoon).huurIn(320);
            } else if (persoon instanceof Vrijwilliger) {
                ((Vrijwilliger) persoon).huurIn(160);
            }
        }

        Collections.sort(personen);
        for (Persoon persoon : personen) {
            System.out.println(persoon);
            toonJaarInkomen(persoon);
        }*/

        Scanner keyboard = new Scanner(System.in);

        System.out.print("Geef de naam: ");
        String naam = keyboard.nextLine();
        System.out.print("Geef de woonplaats: ");
        String woonplaats = keyboard.nextLine();
        System.out.print("Geef de naam van de afdeling: ");
        String afdelingsNaam = keyboard.nextLine();
        System.out.print("Geef de plaats van de afdeling: ");
        String afdelingsPlaats = keyboard.nextLine();


        //Werknemer werknemer1 = new Werknemer(naam, woonplaats, afdelingsNaam, afdelingsPlaats, maandsalaris);

        Boolean werknemerGemaakt = false;
        while (!werknemerGemaakt) {
            System.out.print("geef het maandsalaris: ");
            double maandsalaris = keyboard.nextDouble();

            try {
                Werknemer werknemer1 = new Werknemer(naam, woonplaats, new Afdeling(afdelingsNaam, afdelingsPlaats),
                        maandsalaris);
                werknemerGemaakt = true;
                System.out.println(werknemer1);
            } catch (IllegalArgumentException exception) {
                System.out.println(exception.getMessage());
            } finally {
                System.out.println("je invoer is op de juiste wijze afgehandeld");
            }
        }
    }



    public static void toonJaarInkomen(Persoon persoon) {
        System.out.printf("%s verdient %.2f per jaar\n", persoon.getNaam(), persoon.berekenJaarInkomen());
    }
}