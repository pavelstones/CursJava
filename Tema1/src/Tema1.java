
import java.util.Arrays;
import java.util.List;
import java.util.Random;

/**
 *
 * @author Andrei PAVEL
 */
public class Tema1 {

    public static void main(String[] args) {
        numereAleatoare();
        genereazaNumar();
        varsta();
        numereAleatoare_N1_N2();
        triunghi();
        divizivil();
        semafor();
        CNP();
        numereIdenticeAdiacente();

    }

    static int numereAleatoare() {
        double d = Math.random();
        System.out.println("Numar aleator: " + d);
        System.out.println("Numere intre 0 si 100: " + (int) (Math.random() * 101));
        int rand_2cifre = numereAleatoare_2cifre();
        return rand_2cifre;
    }

    static int numereAleatoare_2cifre() {
        int m = (int) (Math.random() * 100);
        int n = (int) (Math.random() * 100);
        int nRand = m + (n - m);
        System.out.println("Valorile intre M si N sunt:" + nRand);
        return nRand;
    }

    public static void genereazaNumar() {
        int min = (int) (Math.random() * 100);
        int max = (int) (Math.random() * 100);
        if (min > max) {
            int aux = max;
            max = min;
            min = aux;
        }
        int nRand = max + (min - max);
        System.out.println("Diferenta dintre min si max este: " + nRand);

    }

    public static void varsta() {

        int varsta = (int) (Math.random() * 101);
        System.out.println("Varsta:" + varsta);

        if (varsta > 65) {
            System.out.println("Persoana a iesit la pensie. Are " + varsta + " de ani!");
        } else {
            System.out.println("Persoana mai are de lucrat " + (65 - varsta) + " de ani!");
        }
    }

    public static void numereAleatoare_N1_N2() {

        int N1 = (int) (Math.random() * 101);
        System.out.println("Numarul 1 este:" + N1);
        int N2 = (int) (Math.random() * 101);
        System.out.println("Numarul 2 este: " + N2);
        if (N1 > N2) {
            System.out.println("Numarul N1 - " + N1 + " este mai mare decat numarul N2 - " + N2);
        } else {
            System.out.println("Numarul N2 - " + N2 + " este mai mare decat numarul N1 - " + N1);
        }
    }

    public static void triunghi() {

        int a = (int) (Math.random() * 101);
        System.out.println("Latura a este: " + a);

        int b = (int) (Math.random() * 101);
        System.out.println("Latura b este: " + b);

        //int c = Math.sqrt(a) + Math.sqrt(b);
        System.out.println("Ipotenuza este: " + (Math.sqrt(a) + Math.sqrt(b)));

    }

    public static void divizivil() {

        int a = (int) (Math.random() * 101);
        if (a % 2 == 0) {
            System.out.println(a + " este divizibil cu 2");
        } else {
            System.out.println(a + " nu este divizibil cu 2");
        }
        if (a % 3 == 0) {
            System.out.println(a + " este divizibil cu 3");
        } else {
            System.out.println(a + " nu este divizibil cu 3");
        }
        if (a % 5 == 0) {
            System.out.println(a + " este divizibil cu 5");
        } else {
            System.out.println(a + " nu este divizibil cu 5!!!");
        }
    }

    public static void semafor() {

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
    static Random rand = new java.util.Random();

    static String intToStr(int numar) {
        String str = String.valueOf(numar);
        if (numar < 10) {
            str = "0" + str;
        }
        return str;
    }

    static int randomInt(int minim, int maxim) {
        return rand.nextInt(maxim - minim) + minim;
    }

    static int numereIdenticeAdiacente() {

        int nRand = randomInt(10, 100);
        System.out.println("Numar" + nRand);

        int primaCifra = nRand / 10;
        int aDouaCifra = nRand % 10;
        if (primaCifra - aDouaCifra == 1 || aDouaCifra - primaCifra == 1) {
            System.out.println("Sunt ADIACENTE");
        } else if (primaCifra == aDouaCifra || aDouaCifra == primaCifra) {
            System.out.println("Sunt IDENTICE");
        }

        return rand.nextInt() * 100;
    }

    static void CNP() {
        //1 22 11 26 481256
        List<Integer> givenList = Arrays.asList(1, 2, 5, 6);
        Random CNP = new Random();
        int Sex = givenList.get(CNP.nextInt(givenList.size()));

        int result_An = randomInt(10, 100);

        int result_luna = randomInt(1, 13);
        String luna_str = intToStr(result_luna);

        int result_zi = randomInt(1, 29);
        String zi_str = intToStr(result_zi);

        int result_unic = randomInt(100000, 999999);

        System.out.println("CNP aleator este: " + Sex + result_An + luna_str + zi_str + result_unic);

        if (Sex == 1 || Sex == 5) {
            System.out.println("Este barbat");
        }
        if (Sex == 2 || Sex == 6) {
            System.out.println("Este femeie");

        }
        if (result_An % 4 == 0) {
            System.out.println("Este nascut in an bisec! ");
        }
        switch (luna_str) {
            case "12":
            case "01":
            case "02":
                System.out.println("Este nascut Iarna ");
                break;
            case "03":
            case "04":
            case "05":
                System.out.println("Este nascut Primavara");
                break;
            case "06":
            case "07":
            case "08":
                System.out.println("Este nascut Vara");
                break;
            case "09":
            case "10":
            case "11":
                System.out.println("Este nascut Toamna");
                break;
            default:
                break;
        }

    }
}
