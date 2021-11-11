package model;

/**
 * @author Rutger Dijkstra <r.e.dijkstra@st.hanze.nl>
 * Deze klasse beschrijft de afdelingen
 */
public class Afdeling {
    private static final String DEFAULT_AFDELINGS_NAAM = "Onbekend";
    private static final String DEFAULT_AFDELINGS_PLAATS = "Onbekend";

    private String afdelingsNaam;
    private String afdelingsPlaats;

    public Afdeling(String afdelingsNaam, String afdelingsPlaats) {
        this.afdelingsNaam = afdelingsNaam;
        this.afdelingsPlaats = afdelingsPlaats;
    }

    public Afdeling() {
        this(DEFAULT_AFDELINGS_NAAM, DEFAULT_AFDELINGS_PLAATS);
    }

    @Override
    public String toString() {
        return String.format("afdeling %s te %s", this.afdelingsNaam, this.afdelingsPlaats);
    }

    public String getAfdelingsNaam() {
        return afdelingsNaam;
    }

    public String getAfdelingsPlaats() {
        return afdelingsPlaats;
    }
}
