
import java.io.PrintStream;

/**
 *
 * @author APAVEL
 */
 public class Tema1 {
 
  public static void main(String[] args) {
  double d = Math.random();
  System.out.println("Valoarea d este:" + d);
 
  int rand = (int)(Math.random() * 101);
  System.out.println("Numar intreg:" + rand);
 
  int M = 20;
      System.out.println("M: " + M);
  int N = 200;
      System.out.println("N: " + N);
  int random_int = (int) (Math.random() * (N - M + 1) + M);
  System.out.println("Valoarea generata dintre M si N este:" + random_int);
 }
  } 
class NumereAleatoare {

    public static void main(String[] args) {
        double d = Math.random();
        System.out.println("Valoarea d este:" + d);

        double threeLength = 100;
        int rand = (int) (Math.random() * threeLength);
        System.out.println("Numar intreg:" + rand);

        int M = 0;
        int N = 100;
        int random_int = (int) (Math.random() * (N - M + 1) + M);

        System.out.println("Valoarea dintre M si N este:" + random_int);
    }
}
   class varsta {

        public static void main (String[] args) {
            
            int rand = (int) (Math.random() * 101);
            System.out.println("Varsta:" + rand);

            
            if (rand > 65) {
                System.out.println("Persoana a iesit la pensie. Are " + rand + " de ani!");
            } else {
                System.out.println("Persoana mai are de lucrat " + (65 - rand)+ " de ani!");
            }
        }
    
}

class NumereAleatorii {
    public static void main (String[] args){
        
  int N1 = (int) (Math.random() * 101);
       System.out.println("Numarul 1 este:" + N1);
  int N2 = (int) (Math.random() * 101);
        System.out.println("Numarul 2 este: " + N2);
   if (N1>N2){
       System.out.println("Numarul N1 " + N1 + " este mai mare decat numarul N2 " + N2);
   }else {
       System.out.println("Numarul N2 " + N2 + " este mai mare decat numarul N1 " + N1);
   }
    }
}
class Triunghi {
    public static void main (String[] args){
        
        int a =(int) (Math.random() * 101);
        System.out.println("Latura a este: " + a);
        
        int b =(int) (Math.random() * 101);
        System.out.println("Latura b este: " + b);
        
        //int c = Math.sqrt(a) + Math.sqrt(b);
        System.out.println("Ipotenuza este: " + (Math.sqrt(a) + Math.sqrt(b)) );
        
    }
}

class divizibil {
    public static void main (String[] args){
        
                int a =(int)(Math.random() * 101);
            if (a % 2 == 0){
                System.out.println(a + " este divizibil cu 2");
            }else{
                System.out.println(a + " nu este divizibil cu 2");
            }
            if (a % 3 == 0){
                System.out.println(a + " este divizibil cu 3");
            }else{
                System.out.println(a + " nu este divizibil cu 3");
            }
                if (a % 5 == 0){
                    System.out.println(a + " este divizibil cu 5");
            }else{
                System.out.println(a + " nu este divizibil cu 5!!!");
                }
    }
}
