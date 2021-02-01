package javacurs2;

import java.util.Arrays;
import java.util.List;

public class JavaCurs2 {
    public static void main(String[] args) {

        boolean bVal = javaLambdaException();
// simple double example
         double d0; 
        //double d0 = 1;
        System.out.println("do is: " + d0);

// switch example        
        //String sSTR;        
        //String sSTR = null;
        String sSTR = new String("some string");
        switch(sSTR)
        {
            case "one":
                System.out.println("one");
                break;
            default:
                System.out.println("default");
                break;
        }
        
// tablourile nu se pot copia prin simpla atribuire:        
        int[] s1={1,2}, s2=new int[]{1,2}, temp;
	// s1 si s2 sunt identice ca si elemente, insa sunt tablouri diferite
	System.out.println("s1 content is : "+ Arrays.toString(s1));
        System.out.println("s1 : "+s1);
	System.out.println("s2 content is : "+ Arrays.toString(s2));
        System.out.println("s2 : "+s2);
	temp=s2; //aici nu se face o copie a elementelor lui s2, ci o duplicare a
	// referintei s2 in temp; avem acum doua referinte catre acelasi tablou
	System.out.println("temp : "+temp);
	/* temp si s2 se refera acum la acelasi tablou; modificand un element al lui s2 se va
	modifica si elementul corespunzator al lui temp */
	s2[0]=5;
	System.out.println("s1[0] : "+s1[0]);
	System.out.println("s2[0] : "+s2[0]);
	System.out.println("temp[0] : "+temp[0]);

// create an array of strings
        String sArray[] = new String[]{"a","bc","de","fg"};
        List listOfSTR = Arrays.asList(sArray);
        System.out.println("The list is:" + listOfSTR);
    }
    
    static boolean javaLambdaException(){
        List<Integer> ints = Arrays.asList(0,1,2,3,4,5,6,7,8,9,10);
        ints.stream().forEach(i->{
            try{
                System.out.println(50/i);
            }
            catch(ArithmeticException e){
                System.err.println(" Arithmetic exception occured: " + e.getMessage());
            }
        });
        
        return true;
    }
    
}
