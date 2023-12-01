import java.io.File;
import java.io.FileInputStream;
class CatchBlock 
{
public static void main(String[]args) 
{
 System.out.println("Hello");
 try {
File file = new File("my_file");
FileInputStream fis = new FileInputStream(file);
} 
catch(Exception e)
 {
 System.out.println("Given file path is not found");
}
}
}