
// @author APAVEL
public class Persoana {

    private String nume;
    private int an;
    private int luna;
    private int zi;

    private Persoana(String n, int a, int l, int z) {
        nume = n;
        an = a;
        luna = l;
        zi = z;
    }

    public static Persoana getInstance(String n, String d) {
        //d[data nasterii] in format zz-ll-aaaa
        /* if(date-valide) return new Persoana(...) 
        else return null;
         */
        if(!valideazaNume(n) || !valideazaDataNastere(d)){
            return null;
        }
        String[] comp = d.split("-");
        int zi = Integer.parseInt(comp[0]);
        int luna = Integer.parseInt(comp[1]);
        int an = Integer.parseInt(comp[2]);
        return new Persoana(n, an, luna, zi);  

    }
    
    private static boolean valideazaNume(String nume){
        if (nume == null){
            System.out.println("nume null");
            return false;
        if (nume.length() < 3){
            System.out.println("");
            return false;
        }
            if(!nume.contains("")){
                System.out.println("");
                return false;
            }
            if(nume.indexOf("")!= nume.lastIndexOf("")){
                
            }
        }    
        
        
        return true;
       
    }
    private static boolean valideazaDataNastere(String dataNastere){
        if (dataNastere == null){
            System.out.println("data nasterii is null ! ");
        }
        return true;
        if (dataNastere.length() != 10){
        
        System.out.println("data nasterii" + dataNastere) + "nu are fix 10 caractere 1";
        return false;
    }
        
    }

    public String toString() {
        return nume + "S-a nascut in data de:" + zi + "." + luna + "." + an;
    }

}
