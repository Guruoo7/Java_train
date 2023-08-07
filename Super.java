class Animal{
    Animal(){
        System.out.println("prasatn");
    }
}

class Dog extends Animal{
    Dog(){
        super();
        System.out.println("guru");
    }
}
public class Super{
    public static void main(String[] args) {
        Dog s23 = new Dog();
    }
}

