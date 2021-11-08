package controller;

import model.Persoon;

/**
 * @author Rutger Dijkstra <r.e.dijkstra@st.hanze.nl>
 * Dit is wat het programma doet.
 */
public class BedrijfLauncher {

    public static void main(String[] args) {

        gitSystem.out.println(Persoon.aantalPersonen);

        Persoon baas = new Persoon("Mark", "Den Haag", 10000);
        System.out.println(Persoon.aantalPersonen);
        System.out.println(baas.getPersoneelsNummer());


        Persoon medewerker = new Persoon("Caroline", "Delft", 4000);
        System.out.println(Persoon.aantalPersonen);
        System.out.println(medewerker.getPersoneelsNummer());

        Persoon assistent = new Persoon("Klaas");

        Persoon manager = new Persoon();


        String stringBonusRechtBaas;
        if (baas.heeftRechtOpBonus()) {
            stringBonusRechtBaas = "wel";
        } else {
            stringBonusRechtBaas = "niet";
        }

        String stringBonusRechtMedewerker;
        if (medewerker.heeftRechtOpBonus()) {
            stringBonusRechtMedewerker = "wel";
        } else {
            stringBonusRechtMedewerker = "geen";
        }


        System.out.println(Persoon.aantalPersonen);
        System.out.printf("%s verdient %.2f en heeft %s recht op een bonus\n", baas.getNaam(),
                baas.getMaandSalaris(), stringBonusRechtBaas);

        System.out.printf("%s verdient %.2f en heeft %s recht op een bonus\n", medewerker.getNaam(),
                medewerker.getMaandSalaris(), stringBonusRechtMedewerker);

        System.out.printf("%s woont in %s\n", assistent.getNaam(),
                assistent.getWoonplaats());
    }
}
