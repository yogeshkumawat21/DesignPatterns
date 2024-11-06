import java.util.*;

class A 
{
    private A(){};
    public static A a;
    
    public static A getInstance()
    {
        synchronized(A.class){
        if(a==null)
        {
            return a= new A();
        }
        else 
        {
            return a;
        }
        }
    }
}    

public class Main 
{
    public static void main (String[] args) {
        System.out.println(A.getInstance().hashCode());
        System.out.println(A.getInstance().hashCode());
    }
}
