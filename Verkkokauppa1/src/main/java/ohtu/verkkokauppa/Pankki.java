package ohtu.verkkokauppa;

public class Pankki implements bankint {

    private accountingint kirjanpito;

    public Pankki(accountingint kirjanpitoRajapinta) {
        kirjanpito = kirjanpitoRajapinta;
    }

    @Override
    public boolean tilisiirto(String nimi, int viitenumero, String tililta, String tilille, int summa) {
        kirjanpito.lisaaTapahtuma("tilisiirto: tililtä " + tilille + " tilille " + tilille
                + " viite " + viitenumero + " summa " + summa + "e");

        // täällä olisi koodi joka ottaa yhteyden pankin verkkorajapintaan
        return true;
    }
}
