package applectia1;

/**
 * Shift + F11 => clean + compilare proiect Shift + F6 => ruleaza clasa
 * principala din fisierul curent
 *
 * @author APAVEL
 */
public class AppLectia1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // sout + TAB
        System.out.println("Bine ai venit in limbajul de programare Java");

        // declaratie variabile: tipDedata numeVariabila = Valoare;
        int nValue = 24;
        // String + ceva => String
        // ceva + String => String

        System.out.println("Valoarea lui nValue este:" + nValue);

        String myString = "stringul meu la inceput de java";
        System.out.println("myString:" + myString);

        //byte + byte = b0 + b1;
        byte b0 = 12;
        byte b1 = 22;
        int result = b0 + b1;
        System.out.println("result is" + result);

        float fVal = 20.2f;
        System.out.println("fVal:" + fVal);

        double dVal = 22.3;
        System.out.println("dVal:" + dVal);

        int iVal = (int) dVal;
        System.out.println("iVal:" + iVal);

        operatoriIncDec_formaPrePostFixata();
        operatoriiLogici();
        operatorulTernar();
        
    }
    
    public static void operatorulTernar(){
         boolean bEsteVara = false;
         boolean bEsteSoare = true;
         
         String ceFaceAlinutza = ""; 
         if(bEsteVara && bEsteSoare){
             ceFaceAlinutza = "Alinuta merge la mare";
         }else{
             ceFaceAlinutza = "Alinutza sta acasa si mediteaza la cum ar fi fost sa mearga la mare";
         }
         
         //var = conditie ? "Valoare in caz de conditie true" : "valoare in caz de conditie false"
         
         
         String ceFaceAlinutzaReloaded = (bEsteVara && bEsteSoare) ? "Alinuta merge la mare" : "Alinutza sta acasa si mediteaza la cum ar fi fost sa mearga la mare";
         
    
    
}
    public static void operatoriiLogici(){
        boolean bEsteVara = false;
        boolean bEsteSoare = true;
        
// exemplu si cu scurtcircuit
        if (bEsteVara && bEsteSoare){
            System.out.println("Alina merge la mare"); 
        }
    int i = 0;    
    if (bEsteVara && ++i>0){
            System.out.println("Alina merge la mare [ A doua oara]"); 
        }
        System.out.println("now i is: " + i);
        
        
 // exemplu si simplu (fara scurtcircuitare) 
        int j = 0;    
    if (bEsteVara & ++j>0){
            System.out.println("Alina merge la mare [ A doua oara]"); 
        } else{
        System.out.println("Alinuta ramane acasa sa invete pentru BAC");
    }
        System.out.println("now i is: " + j);
        
// in mod similar cu operatorul sau cu scurtcircuitare si simplu [ fara scurtcircuitare]
    // sau cu scurtcircuitare[ a si b sunt variabile de tip boolean] if (a || b) {...}  => daca a este true atunci nu se mai evalueaza b
    //sau fara scurtcircuitare[ a si b sunt variabile de tip boolean] if (a || b) {...}  => se evaloueaza a apoi se evalueaza b si apoi
    
    
    
    
    
    
    
    
}
    static void operatoriIncDec_formaPrePostFixata() {

        int x = 1;                                      // ce afiseaza | valoare lui x in memorie
        System.out.println("x : " + x);                 // x: 1           | 1
        System.out.println("++x : " + ++x);             // ++x: 2         | 2
        System.out.println("x++ : " + x++);             // x++: 2         | 3
        System.out.println("--x : " + --x);             // --x : 2        | 2
        System.out.println("x-- : " + x--);             // x--: 2         | 1
        System.out.println(" x : " + x);                // x : 1

        
        
        
    }

}
