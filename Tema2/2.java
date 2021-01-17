
import java.util.Arrays;

/*
 * @author APAVEL
 */
public class Aplicatia2 {

    public static void main(String[] args) {

        //genereazaSemafor();
        /*int nRand0_10 = genereazaNumarAleator(10);
        System.out.println("nRand0_10:" + nRand0_10);
         */
        //parcurgereArray();
        //aplicatia_zilei_pct_1();
        //aplicatia_zilei_pct_2();
        aplicatia_zilei_pct_3(20);

    }

    public static void aplicatia_zilei_pct_3(int nIncercari) {

        int[][] aruncari = new int[nIncercari][2];
        for (int i = 0; i < aruncari.length; i++) {
            aruncari[i][0] = genereazaNumarAleator_m_n(1, 6);
            aruncari[i][1] = genereazaNumarAleator_m_n(1, 6);
        }
        System.out.println("aruncari " + Arrays.deepToString(aruncari));

        double dNrDuble = 0.0, dNrPoarta = 0.0;
        for (int i = 0; i < aruncari.length; i++) {
            if (isDubla(aruncari[i][0], aruncari[i][1])) {
                dNrDuble++;
            }
            if (isPoarta(aruncari[i][0], aruncari[i][1])) {
                dNrPoarta++;
            }

        }
        //aruncari.length ... 100%
        // dNrDuble .... x%
        System.out.println("nr Duble" + (int)dNrDuble +" procente duble :" + (dNrDuble *100) / aruncari.length + "%");
        System.out.println("nr Poarta in casa" + (int)dNrPoarta + " procente poarta in casa :" + (dNrPoarta * 100) / aruncari.length + "%");
       
    }

    public static void aplicatia_zilei_pct_2() {
        int zar_1 = genereazaNumarAleator_m_n(1, 6);
        afisareZar(zar_1);
        int zar_2 = genereazaNumarAleator_m_n(1, 6);
        afisareZar(zar_2);
        System.out.println(isDubla(zar_1, zar_2) ? "este dubla" : "nu este dubla");
        System.out.println(isPoarta(zar_1, zar_2) ? "este poarta" : "nu este poarta");

    }

    public static boolean isDubla(int zar_1, int zar_2) {
        return zar_1 == zar_2 ? true : false;
    }

    public static boolean isPoarta(int zar_1, int zar_2) {
        if (zar_1 - zar_2 == 2 || zar_2 - zar_1 == 2) {
            return true;
        }
        return false;
    }

    public static void aplicatia_zilei_pct_1() {
        int nRandom1_6 = genereazaNumarAleator_m_n(1, 6);
        afisareZar(nRandom1_6);

    }

    public static void afisareZar(int nZar) {
        switch (nZar) {
            case 1:
                System.out.println("Zar 1");
                break;
            case 2:
                System.out.println("Zar 2");
                break;
            case 3:
                System.out.println("Zar 3");
                break;
            case 4:
                System.out.println("Zar 4");
                break;
            case 5:
                System.out.println("Zar 5");
                break;
            case 6:
                System.out.println("Zar 6");
                break;
            default:
                System.out.println("Nu e generat bine intre 1 si 6");
                break;

        }

    }

    public static void parcurgereArray() {
        int[] arr = {1, 2, 3, 4, 5};
        for (int i = 0; i < arr.length; i++) {
            System.out.println("elem de pe pozitia:" + i + "este" + arr[i]);
        }
        System.out.println("afisam elementele din array cu bucla for varianta noua[for-each]");
        for (int elem : arr) {
            System.out.println(elem + " ");

        }
        int[] arrDinamicallyAllocated = new int[10];
        arrDinamicallyAllocated[0] = 11;
        arrDinamicallyAllocated[1] = 12;
        arrDinamicallyAllocated[2] = 13;
        arrDinamicallyAllocated[3] = 14;
        arrDinamicallyAllocated[4] = 15;
        arrDinamicallyAllocated[5] = 16;
        arrDinamicallyAllocated[6] = 17;
        arrDinamicallyAllocated[7] = 18;
        arrDinamicallyAllocated[8] = 19;
        arrDinamicallyAllocated[9] = 20;

        System.out.println("arrDinamicallyAllocated: " + Arrays.toString(arrDinamicallyAllocated));
        double dSumaElemente = 0.0;
        for (int elem : arrDinamicallyAllocated) {
            dSumaElemente += elem;

        }
        System.out.println("media elem din arrDinamicallyAllocated este: " + (dSumaElemente / arrDinamicallyAllocated.length));

    }

    public static void genereazaSemafor() {
        int nRand = (int) (Math.random() * 3);
        switch (nRand) {
            case 0:
                System.out.println("Culoarea rosu");
                break;
            case 1:
                System.out.println("Culoare galben");
                break;
            case 2:
                System.out.println("Culoare verde");
                break;
            default:
                System.out.println("Ai generat un nr aleator gresit");
        }
    }

    public static int genereazaNumarAleator(int NMax) {
        int nRand = (int) (Math.random() * (NMax + 1));
        return nRand;

    }

    //cum facem sa generam un zar intre 1 si 6 la modul gen intre m si n unde m<n
    //a genera un nr aleator intre 1 si 6 <> 1 + genereazaNumarAleator[0,5]
    // in cazul general a genera un nr aleator intre m si n , unde m<n <=> m + genereazaNumarAleator(n-m)
    public static int genereazaNumarAleator_m_n(int m, int n) {
        if (m > n) {
            int aux = m;
            m = n;
            n = aux;
        }
        // acum avem garantia ca m<n

        int nRand = m + genereazaNumarAleator(n - m);
        return nRand;

    }

}
