class NumberFormat
{
public static void main(String[]args)
{
try
{
int num = Integer . parseInt("java");
System.out.println(num);
}
catch(NumberFormatException e)
{
System.out.print("Number format exeception");
}
}
}