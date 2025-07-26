public class StringTrimLengthExample
{
    public static void main(String[] args) 
    {
        String name="   king   ";
        System.out.println("Length of trimed name: "+name.trim().length());
        int i=name.trim().length();
        if(i==0) 
        {
            System.out.println("name is empty");
        }
        
    }
}
