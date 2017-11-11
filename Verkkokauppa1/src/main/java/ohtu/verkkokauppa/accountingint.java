package ohtu.verkkokauppa;

import java.util.ArrayList;

/**
 *
 * @author amoroz
 */
public interface accountingint {

    ArrayList<String> getTapahtumat();

    void lisaaTapahtuma(String tapahtuma);

}
