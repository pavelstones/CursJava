package applectia1;

/* @author vasile */
// comentariu pe o linie
/*
 comentariu pe mai multe linii
 */
// Shift + F11 => cleand + compilare proiect
// Shift + F6 => ruleaza clasa principala din fisierul curent
public class AppLectia1 {

    public static void main(String[] args) {
        // sout + TAB
        System.out.println("bine ai venit in limbajul de programare java");

        // declaratie variabila: tipDeData numeVariabila = valoare;
        int nValue = 24 + 5;
        // String + ceva => String
        // ceva + String => String
        System.out.println("valoarea lui nValue este: " + nValue);

        String myString = "stringul meu la inceput de java";
        System.out.println("myString : " + myString);

        // byte + byte => int
        byte b0 = 12;
        byte b1 = 22;
        int result = b0 + b1;
        System.out.println("result is: " + result);

        float fVal = 20.2f;
        System.out.println("fVal: " + fVal);

        double dVal = 22.3;
        System.out.println("dVal: " + dVal);

        int iVal = (int) dVal;
        System.out.println("iVal: " + iVal);

        operatoriIncDec_formaPrePostFixata();
        operatoriiLogici();
        operatorulTernar();

    }
    
    public static void operatorulTernar(){
        boolean bEsteVara = true;
        boolean bEsteSoare = true;
        
        String ceFaceAlinutza = "";     
        if(bEsteVara && bEsteSoare){
            ceFaceAlinutza = "Alinutza merge la mare";
        }else{
            ceFaceAlinutza = "Alinutza sta acasa si mediteaza la cum ar fi fost sa mearga la mare ...";
        }
        System.out.println("ceFaceAlinutza : " + ceFaceAlinutza);
        
    // var = conditie ? "valoare in caz de conditie true" : "valoare in caz de conditie false" 
        String ceFaceAlinutzaReloaded = (bEsteVara && bEsteSoare) ?  "Alinutza merge la mare" : "Alinutza sta acasa si mediteaza la cum ar fi fost sa mearga la mare ...";   
        System.out.println("ceFaceAlinutzaReloaded: " + ceFaceAlinutzaReloaded);    
    }
    
    public static void operatoriiLogici(){
        boolean bEsteVara = false;
        boolean bEsteSoare = true;

    // exemplu si cu scurtcircuit
        if (bEsteVara && bEsteSoare){
            System.out.println("Alinutza merge la mare, sa faca plaja");
        }
        
        int i = 0;
        if (bEsteVara && ++i>0){
            System.out.println("Alinutza merge la mare, sa faca plaja [a doua oara]");
        }
        System.out.println("now i is: " + i);

    // exemplu si simplu [fara scurtcircuitare]
        int j = 0;
        if (bEsteVara & ++j>0){
            System.out.println("Alinutza merge la mare, sa faca plaja [a doua oara]");
        }else{
            System.out.println("Alinutza ramane acasa sa invete pentru bac ... ");
        }
        System.out.println("now j is: " + j);
        

    // in mod similar cu operatorul sau cu scurtcircuitare si simplu [fara scurtcircuitare]
       // sau cu scurtcircuitare[a si b sunt variabile de tip boolean]:  if ( a || b) { ...}  => daca a este true atunci nu se mai evalueaza b    
       // sau fara scurtcircuitare[a si b sunt variabile de tip boolean]:  if ( a | b) { ...}  => se evalueaza a apoi se evaluraza b si apoi se face sau intre ele
    }
    
    
    static void operatoriIncDec_formaPrePostFixata() {
        int x = 1;                                  // ce afiseaza          | valoarea lui x in memorie  
        System.out.println("x : " + x);             // x: 1                 | 1    
        System.out.println("++x : " + ++x);         // ++x : 2              | 2 
        System.out.println("x++ : " + x++);         // x++ : 2              | 3
        System.out.println("--x : " + --x);         // --x : 2              | 2
        System.out.println("x-- : " + x--);         // x-- : 2              | 1
        System.out.println(" x : " + x);            // x : 1  
    }
}
