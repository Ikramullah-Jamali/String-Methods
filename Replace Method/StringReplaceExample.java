
// Program to demonstrate the use of .replace(char, char) and .replace(String, String) methods in Java
public class StringReplaceExample  
{   public static void main(String[] args) 
    {
        //  Method :1  Replace characters
        String name="Harry";
        System.out.println("Original name: " + name);
        name=name.replace('r','p');
        System.out.println("Replaced name: "+name);

         System.out.println();

        //  Method :2  Replace substring
        String country="Pakistan";
        System.out.println("Original country: " + country);
        country=country.replace("Pak","Afgan");
        System.out.println("Replaced country: "+country);
    }   
}
