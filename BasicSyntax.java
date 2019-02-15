package basic.syntax;
public class BasicSyntax {
    
    // 1. ClassName Must Match The Current Working Filename 
    // 2. Java is Case Sensitive ( Which Means hello and Hello are )  
    String Hello="Aatharva" ;
    String hello="vicky" ; 
  
    // 3. Method: It is Behaviour Or an action done When invoked  
    /*    Method Names :- All Method names should start with Lower Case Letters 
          (Except For user Defined Methods)
        toString();
    */                        
    
    /*        eg:- void sum(int a,int b )
                       {
                       Statement(1)... this method adds sum of integers when it invoked in main
                       Statement(n) 
                        }    // Where Sum is the User Defined Method it can be started 
                                with underscore or alpha numeric only 
    */
    
    // 4. Identifier :- should begin alphanumeric (or) $ (or) _ (but not by numericalpha)
    //              eg:- String Hello="Aatharva";  // Where Hello is Identifier 


    // 5. Keywords cannot be used as an identifier Such as int is a Keyword of data type integer 
                   // eg:- String int="vicky"; // int can't be used since it is a Keyword  
    // Practicle Example For Method Sum 
    
     public void sum(int a,int b )
                       {
                           int res = a+b;
                     System.out.println(res);
                       }
     
 
    public static void main(String[] args) {

        BasicSyntax bs =new BasicSyntax();
        System.out.println(bs.Hello);
        System.out.println(bs.hello);
        bs.sum(5,6);

        
    }
    
}
