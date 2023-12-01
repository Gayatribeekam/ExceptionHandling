  
public class CustomException1  
{  
public static void main(String args[])  
{  
try  {  
throw new userException();  
}  
catch (userException M)  
{  
System.out.println("Caught the exception");  
System.out.println(M.getMessage());  
}
} 
}
 