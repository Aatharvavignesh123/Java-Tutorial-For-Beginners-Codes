
package datatypes;


public class DataTypes {
 
    
    int b=10; // b is a variable of type integer
 
    public DataTypes(){  // Default Constructor for all java object will be included without this method itself
    
    }
    
    
    public  DataTypes(int v){ // Parameterized Constructor 
        
        b=v;
    }
    
    
    public static void main(String[] args) {
    // 8 Primitive Data Types in Java
    byte b=10;
    System.out.println(b); // range (-2^7 to ((2^7)-1)) 1 Byte of Memory
    int i=10;
    System.out.println(i); // range (-2^31 to ((2^31)-1)) 4 Bytes of Memory (default Value = 0)
    char c='A';
    System.out.println(c); // range ( \u0000 to \uFFFF ) 2 Bytes of Memory -> 16 bit Unicode Char  
    float f=1.0f;
    System.out.println(f); // range (-2^31 to ((2^31)-1)) 4 Byte of memory (default value=0.0f)
    double d=1.0; 
    System.out.println(d); // range (-2^63 to ((2^63)-1)) 8 Bytes of memory (default value=0.0d)
    boolean bo=true; 
    System.out.println(bo);// // 1 Bytes of memory (default value=false) 
    short s=10;
    System.out.println(s);// range (-2^15 to ((2^15)-1)) 2 Bytes of memory (Default value = 0)
    long l=10L;
    System.out.println(l);// range (-2^63 to ((2^63)-1))
    
    
    // reference (or) Object Data type 
    
    DataTypes dt =new DataTypes(200);
    System.out.println(dt.b);
    
     }
    
}
