package model;

/**
 * @author Rutger Dijkstra <r.e.dijkstra@st.hanze.nl>
 * Deze klasse beschrijft de afdelingen
 */
public class Afdeling {

    public static final String DEFAULT_AFDELINGSNAAM = "onbekend";
    public static final String DEFAULT_AFDELINGSPLAATS = "onbekend";
    // variabelen
    private String afdelingsNaam = "onbekend";
    private String afdelingsPlaats = "onbekend";


    //constructor
    public Afdeling() {
        this(DEFAULT_AFDELINGSNAAM, DEFAULT_AFDELINGSPLAATS);
    }

    public Afdeling(String afdelingsNaam, String afdelingsPlaats) {
        this.afdelingsNaam = afdelingsNaam;
        this.afdelingsPlaats = afdelingsPlaats;
    }

    //getters & setters

    public String getAfdelingsNaam() {
        return afdelingsNaam;
    }

    public void setAfdelingsNaam(String afdelingsNaam) {
        this.afdelingsNaam = afdelingsNaam;
    }

    public String getAfdelingsPlaats() {
        return afdelingsPlaats;
    }

    public void setAfdelingsPlaats(String afdelingsPlaats) {
        this.afdelingsPlaats = afdelingsPlaats;
    }
}
