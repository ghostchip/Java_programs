import java.util.Scanner;

public class switchcase {
    public static void main(String[] args) {
  
        System.out.println("Enter your marks ");
        Scanner input = new Scanner(System.in);
        int number = input.nextInt();
      switch (number) {
        case 100:
          System.out.println("You have scored an A ");
          break;
        case 90:
          System.out.println("You have scored a B ");
          break;
        case 80:
          System.out.println("You have scored a C ");
          break;
        case 70:
         System.out.println("You have scored a D ");
          break;
        default:
        System.out.println("Input your score ");
          break;
      }
    }
  }