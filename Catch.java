class Catch 
{
public static void main(String[] args) {
try 
{
int array[] = new int[50];
array[10] = 25 / 0;
} 
catch (ArithmeticException | ArrayIndexOutOfBoundsException e)
{
System.out.println(e.getMessage());
}
}
}