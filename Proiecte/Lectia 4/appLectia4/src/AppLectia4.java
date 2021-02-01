
// @author Andrei PAVEL

public class AppLectia4 {
    
    
    public static void main(String[] args) {
// ce nu ne dorim: sa cream obiecte prin instantiere cu operatorul new, adica Persoana p = new Persoana(nume, dataNastere);
        /*Persoana p = new Persoana("ion vasile ", -2020, -10, -10);
        System.out.println(p.toString());*/
        
        Persoana p = Persoana.getInstance("ion vasile ", "12-01-2020");
        
        
    }
    
}
