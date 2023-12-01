class ThrowException
{
 public static void divideByOne()
{
throw new ArithmeticException("Trying to divide by 1");
}
public static void main(String[] args) 
{
divideByOne();
}
}