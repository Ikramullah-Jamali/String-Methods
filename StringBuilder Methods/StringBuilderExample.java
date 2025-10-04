
public class StringBuilderExample 
{
    public static void main(String[] args) 
    {
        StringBuilder sb = new StringBuilder("Boss");
        System.out.println("Original String: "+sb);

        // Method charAt()
        System.out.println("Character at index 0: "+sb.charAt(0));

        // Method setCharAt(index, letter)
        sb.setCharAt(0, 'L');
        System.out.println("After setCharAt(0, 'L'): "+sb);

        // Method insert(index, letter)
        sb.insert(4, 'y');
        System.out.println("After insert(4, 'y'): "+sb);

        // Method delete(start index, end index)
        sb.delete(3, 5);
        System.out.println("After delete(3, 5): "+sb);

        // Method append()
        sb.append('s');
        System.out.println("After append('s'): "+sb);

        // Method length()
        System.out.println("Length of string: "+sb.length());
    }
}

