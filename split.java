public class split {
  public static void main(String[] args) {
    String text = "Java string split program";

    String[] result = text.split(" ");

    System.out.print("result = ");
    for (String str : result) {
      System.out.print(str + ", ");
    }
}

}
