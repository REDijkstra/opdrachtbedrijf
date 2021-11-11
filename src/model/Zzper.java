package model;

/**
 * @author Rutger Dijkstra <r.e.dijkstra@st.hanze.nl>
 * Dit is wat het programma doet.
 */
public class Zzper extends Persoon{
    public static final double DEFAULT_UURTARIEF = 0.0;
    private double uurtarief;
    private int urenGewerkt;


    public Zzper(String naam, String woonplaats, Afdeling afdeling, double uurtarief) {
        super(naam, woonplaats, afdeling);
        this.uurtarief = uurtarief;
    }

    public Zzper() {
        this(DEFAULT_NAAM,DEFAULT_WOONPLAATS, new Afdeling(), DEFAULT_UURTARIEF);
    }

    public double huurln(int uren){
        return 0.0;
    }

    public double berekenJaarinkomen(){
        return 0.0;
    }

    @Override
    public String toString() {
        return String.format("%s woont in %s en werkt op afdeling %s te %s", naam, woonplaats);
    }
}
