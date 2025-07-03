
// Program to demonstrate the use of .substring(index) method in Java
public class StringSubstringExample   
{
    public static void main(String[] args) 
    {
        String name="king Charles";
        System.out.println("Before substring: " + name);  // Show full string
        name=name.substring(5);
        System.out.println("After substring: "+name);
    }
}
