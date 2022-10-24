public class inheritance {

  public static void main(String[] args) {

    Man labrador = new Man();

    labrador.name = "Erick";
    labrador.display();

    labrador.eat();
  }
}
 class Animal {
  String name;
  public void eat() {
    System.out.println("I can code java");
  }
}
class Man extends Animal {
  public void display() {
    System.out.println("My name is " + name);
  }
}
