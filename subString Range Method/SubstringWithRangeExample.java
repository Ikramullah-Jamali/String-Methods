
// Program to demonstrate the use of .substring(startIndex, endIndex) 
public class SubstringWithRangeExample   
{
    public static void main(String [] args)
    {
        String fullname="king khan";
        System.out.println("Full name: " + fullname);  // Before substring
        String name=fullname.substring(0,5);
        System.out.println("Extracted name: "+name);

    }
}
