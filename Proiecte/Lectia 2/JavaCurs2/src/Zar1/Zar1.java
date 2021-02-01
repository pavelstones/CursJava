
package Zar1;

public class Zar1 {
    public static void main(String[] args) {
     	int zar = genereazaZar();   
        afiseazaZar(zar);
    }
    
    public static int genereazaZar(){
	return (int)(Math.random()*6)+1;
    }
    
    public static void afiseazaZar(int z){
        switch (z) {
            case 1:
                System.out.println("Unu");
                System.out.println("   ");
                System.out.println(" * ");
                System.out.println("   ");
                break;
            case 2:
                System.out.println("Doi");
                System.out.println("*  ");
                System.out.println("   ");
                System.out.println("  *");
                break;
            case 3:
                System.out.println("Trei");
                System.out.println("*  ");
                System.out.println(" * ");
                System.out.println("  *");
                break;
            case 4:
                System.out.println("Patru");
                System.out.println("* *");
                System.out.println("   ");
                System.out.println("* *");
                break;
            case 5:
                System.out.println("Cinci");
                System.out.println("* *");
                System.out.println(" * ");
                System.out.println("* *");
                break;
            case 6:
                System.out.println("Sase");
                System.out.println("* *");
                System.out.println("* *");
                System.out.println("* *");
                break;
        }
    }
    
    public static void afiseazaZarCuArray(int z){
        System.out.println(new String[]{"Unu","Doi","Trei","Patru","Cinci","Sase"}[z-1]);
    }
} 