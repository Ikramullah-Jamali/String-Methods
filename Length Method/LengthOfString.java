// Program to demonstrate the .length() method of the String class
class LengthOfString  
{
    public static void main(String[] args) 
    {
        String name="king";
        int length=name.length();
        System.out.println("The length of the string \"" + name + "\" is: " + length);

        // Additional example
        String anotherName = "hello world";
        System.out.println("Length of \"" + anotherName + "\" is: " + anotherName.length());
    }
}
