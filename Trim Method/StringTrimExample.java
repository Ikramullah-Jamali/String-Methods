
// Program to demonstrate the use of .trim() method in Java
public class StringTrimExample   
{
    public static void main(String[] args) 
    {
        String name="     king     ";
        System.out.println("Before trim: [" + name + "]");   // Showing spaces clearly
        name=name.trim();    // Removes leading and trailing spaces
        System.out.println("name: "+name);
    }
}
