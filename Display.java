import java.util.Scanner; 

class Display {
  public static void main(String[] args) {
    Scanner myObj = new Scanner(System.in);
    String userName;
    String course;
    String reg_number;
    System.out.println("Enter username;"); 
    userName = myObj.nextLine();     
       System.out.println("Enter course;"); 
    course = myObj.nextLine();  
     System.out.println("Enter reg number;"); 
    reg_number = myObj.nextLine();   
    
     System.out.println("Username is:" + userName);
    userName= myObj.nextLine(); 
    System.out.println("course is: " + course); 
     course = myObj.nextLine(); 
     
      System.out.println("reg number is:" + reg_number);
  }
}