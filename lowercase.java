import java.util.Scanner; 

public class lowercase {
    public static void main(String[] args) {

    Scanner input = new Scanner(System.in);
    
    System.out.print("Enter name ");

    String word = input.nextLine();

    
    System.out.println(word.toLowerCase());
    
}
}

