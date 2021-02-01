package Zar2;

public class Zar2 {
    public static void main(String[] args) {
        int zar1 = (int)(Math.random()*6)+1;
        int zar2 = (int)(Math.random()*6)+1;
        afiseazaZar(zar1);
        afiseazaZar(zar2);
        evidentiazaCazuriSpeciale(zar1,zar2);
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
    
    private static void evidentiazaCazuriSpeciale(int z1, int z2){
        switch (z1-z2) {
            case 0:
                System.out.println("Dubla");
                break;
            case 2:
            case -2:
                System.out.println("Poarta");
                break;
        }
    }
} 