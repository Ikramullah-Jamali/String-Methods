
public class StringIsEmptyExample 
{

    public static void main(String[] args) 
    {
        String name = "Shoaib"; // Try: name = null;

        if (name != null && !name.isEmpty()) 
        {
            System.out.println("Name is valid");
        } 
        else 
        {
            System.out.println("Name is empty or null");
        }
    }
}
