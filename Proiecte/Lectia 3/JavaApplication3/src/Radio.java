
/**
 *
 * @author APAVEL
 */
public class Radio {

    private boolean pornit;
    private int Volum_Maxim;
    private int volum_curent;
    private int postCurent;
    private String[] posturi = {"Radio ZU", "Gherilla FM", "Pro FM", "Rock Fm", "Europa FM", "Kiss Fm", "Radio cultural", "Trinitas", "Dance FM",};

    public Radio(int volumMaxim) {
        Volum_Maxim = volumMaxim;
        pornit = false;
        volum_curent = 0;
        postCurent = 0;
    }

    public Radio() {
        this(10);
    }

    public void porneste() {
        if (pornit == true) {
            System.out.println("Radio este pornit");
            return;
        }
        pornit = true;
        volum_curent = 1;
        System.out.println("Radioul a fost pornit cu succes");
    }

    public void opreste() {
        if (pornit == false) {
            System.out.println("Radio este deja oprit");
            return;
        }
        pornit = false;
        volum_curent = 0;
        System.out.println("Radoi a fost oprit cu succes");
    }

    public void daMaiTare() {
        daMaiTare(1);
    }

    public void daMaiTare(int nrTrepte) {
        if (pornit == false) {
            System.out.println("Radio nu poate fi dat mai tare pentru ca nu e pornit");
            return;
        }
        if (volum_curent + nrTrepte > Volum_Maxim) {
            System.out.println("Radio nu poate fi dat mai tare cu " + nrTrepte + "trepte intrucat se depaseste volum maxim" + Volum_Maxim);
            return;
        }
        volum_curent += nrTrepte;
        System.out.println("radio a fost dat mai tare cu " + nrTrepte + "trepte => volum_curent = " + volum_curent);
    }

    public void daMaiIncet() {
        daMaiIncet(1);
    }

    public void daMaiIncet(int nrTrepte) {
        if (pornit == false) {
            System.out.println("Radio nu poate fi dat mai tare pentru ca nu e pornit");
            return;
        }
        if (volum_curent + nrTrepte <= 0) {
            System.out.println("Radio nu poate fi dat mai tare cu " + nrTrepte + "trepte intrucat se ajunge la volum invalid");
            return;
        }
        volum_curent -= nrTrepte;
        System.out.println("radio a fost dat mai incet " + nrTrepte + "trepte => volum_curent = " + volum_curent);

    }

    public void stare() {
        System.out.println(pornit == true ? "\radio pornit" : "\radio oprit");
        if (pornit) {
            System.out.println("\t\t volum curent" + volum_curent);
            System.out.println("\t\t post curent" + posturi[postCurent]);
        }
    }

    public void postUrmator() {
        if (pornit == false) {
            System.out.println("Radio nu poate fi dat pe postul urmator intrucat e pornit");
            return;
        }
        if (postCurent < posturi.length - 1) {
            postCurent++;

        } else {
            postCurent = 0;

        }
        System.out.println("radio a fost setat pe postul:" + posturi[postCurent]);
    }

    public void postPrecedent() {
        if (pornit == false) {
            System.out.println("Radio nu poate fi dat pe postul precedent intrucat nu este pornit");
            return;
        }
        if (postCurent == 0) {
            postCurent = posturi.length - 1;

        } else {
            postCurent--;

        }
        System.out.println("radio a fost setat pe postul:" + posturi[postCurent]);
    }
}
