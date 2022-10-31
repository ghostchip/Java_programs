import java.util.Scanner;

public class leap {

    public static void main(String[] args) {
        
        System.out.println("Enter the year");
        
        Scanner input = new Scanner(System.in);
        int year = input.nextInt();


      do{System.out.println(  year + "is leap year");}

      while((year % 4 == 0)||(year % 100 == 0)||(year % 400 == 0)
      );
      
        
  }
}
