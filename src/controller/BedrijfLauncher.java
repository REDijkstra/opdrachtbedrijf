package controller;

import model.Afdeling;
import model.Persoon;

/**
 * @author Rutger Dijkstra <r.e.dijkstra@st.hanze.nl>
 * Laat de personen binnen het bedrijf zien en bijbehordende gegevens.
 */
public class BedrijfLauncher {

    public static void main(String[] args) {

        Afdeling[] afdeling = new Afdeling[4];

        afdeling[0] = new Afdeling("Uitvoering", "hilversum");
        afdeling[1] = new Afdeling("Support", "Amsterdam");
        afdeling[2] = new Afdeling("Management", "Almere");
        afdeling[3] = new Afdeling("Documentatie", "Gouda");

        Persoon Baas =  new Persoon("Mark", "Den Haag", 10000, afdeling[2]);
        Persoon Medewerker = new Persoon("Caroline", "Delft",4000, afdeling[1]);
        Persoon Assistent = new Persoon("Klaas");


        System.out.printf("Het aantal personen in het bedrijf is %d\n", Persoon.aantalPersonen);
        System.out.printf("%s werkt in %s en woont in %s\n", Baas.getNaam(),Baas.getAfdeling().getAfdelingsNaam(),Baas.getWoonplaats());
        System.out.printf("%s werkt op de afdeling %s en verdient %.2f\n",Medewerker.getNaam(),Medewerker.getAfdeling().getAfdelingsNaam(),Medewerker.getMaandSalaris());
        System.out.printf("%s werkt op de afdeling %s en woont in %s", Assistent.getNaam(),Assistent.getAfdeling().getAfdelingsNaam(),Assistent.getWoonplaats());

        System.out.print("test123");
    }

}
