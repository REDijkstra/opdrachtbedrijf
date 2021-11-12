package model;

/**
 * @author Rutger Dijkstra <r.e.dijkstra@st.hanze.nl>
 * Dit is wat het programma doet.
 */
public class Vrijwilliger extends Persoon implements Oproepbaar {
    private static final int INKOMEN_VAN_VRIJWILLIGER = 0;
    private static final int DEFAULT_UREN_GEWERKT = 0;

    private int urenGewerkt;

    public Vrijwilliger(String naam, String woonplaats, Afdeling afdeling) {
        super(naam, woonplaats, afdeling);
        urenGewerkt = DEFAULT_UREN_GEWERKT;
    }

    @Override
    public void huurIn(int uren) {
        urenGewerkt += uren;
    }

    @Override
    public double berekenJaarInkomen() {
        return INKOMEN_VAN_VRIJWILLIGER;
    }

    @Override
    public String toString() {
        return String.format("%s en is een vrijwilliger", super.toString());
    }
}
