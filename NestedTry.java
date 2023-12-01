class NestedTry 
{
public static void main(String args[])
{
try 
{
int a[] = {30, 45, 60, 75, 90, 105, 120, 140, 160, 200};
System.out.println("Element at index 8 = "+a[8]);
try 
{
System.out.println("Division");
int res = 100/ 0;
}
catch (ArithmeticException ex2) 
{
System.out.println("Sorry! Division by zero isn't feasible!");
}
}
catch (ArrayIndexOutOfBoundsException ex1) 
{
System.out.println("ArrayIndexOutOfBoundsException");
}
}
}