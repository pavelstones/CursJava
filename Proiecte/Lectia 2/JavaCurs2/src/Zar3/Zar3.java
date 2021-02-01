package Zar3;

public class Zar3 {

    public static void main(String[] args) {
        int nrAruncari = 20;
        int[][] aruncari = new int[nrAruncari][2];

        genereazaAruncari(aruncari);
        faStatistici(aruncari);
    }

    private static void genereazaAruncari(int[][] aruncari) {
        for (int i = 0; i < aruncari.length; i++) {
            aruncari[i][0] = (int) (Math.random() * 6) + 1;
            aruncari[i][1] = (int) (Math.random() * 6) + 1;
        }
    }

    private static void faStatistici(int[][] aruncari) {
        double nrDuble = 0;
        double nrPorti = 0;
	
//	for(int[] a:aruncari){
//		int z1 = a[0];
//		int z2 = a[1];  
//		...
//	}      

	for (int i = 0; i < aruncari.length; i++) {
            int z1 = aruncari[i][0];
            int z2 = aruncari[i][1];
            if (eDubla(z1, z2)) {
                nrDuble++;
            }
            if (ePoarta(z1, z2)) {
                nrPorti++;
            }
        }
        System.out.println((int) nrDuble + " duble, " + nrDuble / aruncari.length * 100 + "%");
        System.out.println((int) nrPorti + " porti, " + nrPorti / aruncari.length * 100 + "%");
    }

    private static boolean eDubla(int z1, int z2) {
        return z1 == z2;
    }

    private static boolean ePoarta(int z1, int z2) {
        return z1 - z2 == 2 || z1 - z2 == -2;
    }

} 