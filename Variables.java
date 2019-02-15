
package variables;

public class Variables {

    /* Basic Syntax For Any Variable 
       <Access Modifier> <Primitive Data Type> <Variable Name User Defined> ; //declaration
       eg;-  local variable :=> int i;
             instance variable :=> public int s;
             Static/class Variable :=> public static int sf;    
       
       <Access Modifier> <Primitive Data Type> <Variable Name User Defined>=value; //initialization
       eg;-  local variable :=> int i=10;
             instance variable :=> public int s=10;
             Static/class Variable :=> public static int sf=10; 
    
    // where access modifier is <public (or) private (or) Protected> 
    */ 
   static int a; // class variable  
    int b; // instance variable  (heap Level) 
    
     public void v(){
         int a; // local variable , (Stack Level)  
    }
    
    public static void main(String[] args) {


    }
    
}
