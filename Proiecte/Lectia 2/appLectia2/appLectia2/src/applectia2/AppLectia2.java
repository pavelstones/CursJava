package applectia2;

import java.util.Arrays;

/* @author vasile */
public class AppLectia2 {

    public static void main(String[] args) {

        //genereazaSemafor();

        /*int nRand0_10 = genereazaNumarAleator(10);
        System.out.println("nRand0_10: " + nRand0_10);*/
        
        parcurgereArray();
        
    }

    public static void parcurgereArray(){

        int[] arr = {1,2,3,4,5};
        // lungime array = 5, adica arr.lengrh = 5
        // indecsii valizi in cadrul unui array sunt in plaja 0 .. arr.length-1
        
        System.out.println("lungimea arrayului este:" + arr.length);
        
        for(int index=0; index<arr.length; index++ ){
            System.out.println("elem de pe pozitia:" + index + " este " + arr[index]);
        }
        
        System.out.println("valoarea de pe pozitia/indexul 2 este " + arr[2]);
        
        int nIndex = 4;
        System.out.println("valoarea de pe pozitia " + nIndex + " este " + arr[nIndex]);
        
        System.out.println(" afisam elementele din array cu bucla for varianta noua[for-each]");
        for(int elem : arr){
            System.out.print(elem + " ");
            System.out.println("");
        }
        
        int[] arrDinamicallyAllocated;
        arrDinamicallyAllocated = new int[10];
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
        
        int dSumaElemente = 0;
        for(int elem : arrDinamicallyAllocated ){
            dSumaElemente += elem;
        }
        System.out.println("media elem din arrDinamicallyAllocated este: " + (double)dSumaElemente/arrDinamicallyAllocated.length );
        
    }

    
    public static void genereazaSemafor() {
        /*  Math.radnom() => double [0.00, 1) / [0.00, 0.9999]
            Math.random() * 3 => double [0.00, 2.9999]
            (int)(Math.random() * 3) => int [0, 2]
         */
        int nRand = (int) (Math.random() * 3);
        switch (nRand) {
            case 0:
                System.out.println("culoare rosu");
                break;
            case 1:
                System.out.println("culoare portocaliu");
                break;
            case 2:
                System.out.println("culoare verde");
                break;
            default:
                System.out.println("ai generat un numar aleator unexpected");
                break;
        }
    }
    

    public static int genereazaNumarAleator(int NMax) {
        int nRand = (int) (Math.random() * (NMax + 1));
        return nRand;
    }

}
