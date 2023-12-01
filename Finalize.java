class Finalize 
{
public static void main(String[] args)
{
Hi j = new Hi();
j.finalize();
j = null;
System.gc();
System.out.println("Main Completes");
}
public void finalize()
{
System.out.println("finalize method overridden");
System.out.println(10 / 0);
}
}