class   CustomException  
{  
public CheckVote (String eM)  
{  
super(eM);  
}  
}  
public class TestAge  
{  
static void verify (int age) throws checkVote
{    
if(age < 18)
{  
throw new checkVote("Age is less than 18, sorry can't vote.");    
}  
else 
{   
System.out.println("You're eligible to vote.");   
}   
}    
public static void main(String args[])  
{  
try  
{  
verify(15);  
}  
catch (checkVote M)  
{  
System.out.println("Caught the exception");  
System.out.println("An Exception occurred: " + M.getMessage());  
}      
}  
}