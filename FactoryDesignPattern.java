import java.util.*;
interface Employee
{
    Employee getObj(String type);
}

class PartTime implements Employee
{
    public Employee getObj(String type)
    {
        System.out.println("Part time Employee obj is created");
         Employee emp = new PartTime();
        return emp;
    }
    
}
class FullTime implements Employee
{
    public Employee getObj(String type)
    {
        System.out.println("Full Time Employee Object is Created ");
        Employee emp = new FullTime();
        return emp;
    }
}

class Factory
{
    Employee emp;
    
    Employee getObj(String type)
    {
        if(type.equalsIgnoreCase("FullTime"))
        {
           emp = new FullTime();
          
           return  emp.getObj("FullTime");
           
        }
        if(type.equalsIgnoreCase("PartTime"))
        {
             emp = new PartTime();
          
           return  emp.getObj("PartTime");
        }
        
        else return null;
    }
}
public class Main
{
	public static void main(String[] args) {
		Factory factory = new Factory();
		factory.getObj("PartTime");
	}
}
