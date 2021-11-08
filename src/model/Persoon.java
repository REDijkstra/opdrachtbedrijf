package model;
import model.Afdeling;
/**
 * @author Rutger Dijkstra <r.e.dijkstra@st.hanze.nl>
 * Dit is wat het programma doet.
 */
public class Persoon {

    // variabelen
    private static final String DEFAULT_NAAM = "onbekend";
    private static final String DEFAULT_WOONPLAATS = "onbekend";
    private static final double DEFAULT_MAANDSALARIS = 0;
    private static final double GRENSWAARDE_BONUS = 4500.00;

    public static int aantalPersonen;

    private int personeelsNummer;
    private String naam;
    private String woonplaats;
    private double maandSalaris;
    private Afdeling afdeling;


    // constructors



    public Persoon(String naam, String woonplaats, double maandSalaris,Afdeling afdeling) {
        this.naam = naam;
        this.woonplaats = woonplaats;
        setMaandSalaris(maandSalaris);
        this.afdeling = afdeling;
        this.personeelsNummer = ++aantalPersonen;
    }

    public Persoon(String naam) {
        this(naam, DEFAULT_WOONPLAATS, DEFAULT_MAANDSALARIS);
    }

    public Persoon() {
        this(DEFAULT_NAAM);
    }


    //methoden
    public boolean heeftRechtOpBonus() {
        return maandSalaris >= GRENSWAARDE_BONUS;
    }

    public void setMaandSalaris(double maandSalaris) {
        if (maandSalaris < 0) {
            maandSalaris = 0.0;
        }
        this.maandSalaris = maandSalaris;
    }

    public double berekenJaarInkomen() {
        return maandSalaris * 12;
    }


    // Getters en setters
    public static int getAantalPersonen() {
        return aantalPersonen;
    }

    public static void setAantalPersonen(int aantalPersonen) {
        Persoon.aantalPersonen = aantalPersonen;
    }

    public int getPersoneelsNummer() {
        return personeelsNummer;
    }

    public void setPersoneelsNummer(int personeelsNummer) {
        this.personeelsNummer = personeelsNummer;
    }

    public String getNaam() {
        return naam;
    }

    public void setNaam(String naam) {
        this.naam = naam;
    }

    public String getWoonplaats() {
        return woonplaats;
    }

    public void setWoonplaats(String woonplaats) {
        this.woonplaats = woonplaats;
    }

    public double getMaandSalaris() {
        return maandSalaris;
    }


}


