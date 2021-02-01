/**class Parametri {

    public static void main(String[] args) {
        System.out.println("Salut" + args[0] + "!");
    }
}
*/

public class JavaApplication_test {
    static int nrApelari=0;
    public static void main (String[] args){
        System.out.println("1:5>4:" + (5>4));
        System.out.println("2:5<4:" + (5<4));
        System.out.println("3:5>4:" + (5>4 & f()));
        System.out.println("4:5>4:" + (5>4 && f()));
        System.out.println("5:5<4:" + (5<4 & f()));
        System.out.println("6:5<4:" + (5<4 && f()));
        
    }
        static boolean f(){
            System.out.println("Se executa f a" +(++nrApelari) + "-a oara");
            return true;
           
        }
}

