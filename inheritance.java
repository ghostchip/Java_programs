public class inheritance {
   

  public static void main(String[] args) {

    // create an object of the subclass
    Man labrador = new Man();

    // access field of superclass
    labrador.name = "Erick";
    labrador.display();

    // call method of superclass
    // using object of subclass
    labrador.eat();

  }
}

 class Animal {

  // field and method of the parent class
  String name;
  public void eat() {
    System.out.println("I can code java");
  }
}

// inherit from Animal
class Man extends Animal {

  // new method in subclass
  public void display() {
    System.out.println("My name is " + name);
  }
}
