package model;


/**
 * @author Rutger Dijkstra <r.e.dijkstra@st.hanze.nl>
 * Deze klasse beschrijft een persoon binnen het bedrijf
 */

public class Persoon {

    // variabelen
    protected static final String DEFAULT_NAAM = "onbekend";
    protected static final String DEFAULT_WOONPLAATS = "onbekend";

    public static int aantalPersonen;

    protected int personeelsNummer;
    protected String naam;
    protected String woonplaats;
    private final Afdeling afdeling;


    // constructors


    public Persoon(String naam, String woonplaats, Afdeling afdeling) {
        this.naam = naam;
        this.woonplaats = woonplaats;
        this.afdeling = afdeling;
        this.personeelsNummer = ++aantalPersonen;
    }

    public Persoon(String naam) {
        this(naam, DEFAULT_WOONPLAATS, new Afdeling());
    }

    public Persoon() {
        this(DEFAULT_NAAM);

    }

    //methoden


    @Override
    public String toString() {
        return "Persoon{" +
                "personeelsNummer=" + personeelsNummer +
                ", naam='" + naam + '\'' +
                ", woonplaats='" + woonplaats + '\'' +
                ", maandSalaris=" + maandSalaris +
                ", afdeling=" + afdeling +
                '}';
    }

    public double berekenJaarInkomen() {
        return MAANDEN_VAN_HET_JAAR * maandSalaris;
    }

    public boolean heeftRechtOpBonus(){
        return maandSalaris >= GRENSWAARDE_BONUS;
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

    public void setMaandSalaris(double maandSalaris) {
        if (maandSalaris < 0) {
            System.out.println("Het maandsalaris mag niet negatief zijn, het wordt nu op 0 gezet.");
            this.maandSalaris = 0;
        } else {
            this.maandSalaris = maandSalaris;
        }
    }

    public Afdeling getAfdeling() {
        return afdeling;
    }
}




