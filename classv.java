public class classv {

    public static String nameString;

    public static void main(String[] args) {
    String name = "Erick";
    String reversed = reverse(name);
    System.out.println("The reversed name is: " + reversed);
  }


  public static String reverse(String name) {
    if (name.isEmpty())
      return name;

    return reverse(name.substring(1)) + name.charAt(0);
  }
    
}
