interface A{
    public void add();
    public void subtract();
}

interface B extends A{
    public void multiply();
    public void divide();
}

interface C extends A{
    public void power();
    public void expo();
}

class alpha implements B{
    public void add(){
        System.out.println("addition");
    }
    public void subtract(){
        System.out.println("subtraction");
    }
    public void multiply(){
        System.out.println("multiplication");
    }
    public void divide(){
        System.out.println("divide");
    }
}

class Interfaces extends alpha implements C {
    public void add(){
        System.out.println("addition");
    }
    public void subtract(){
        System.out.println("subtraction");
    }
    public void power(){
        System.out.println("power");
    }
    public void expo(){
        System.out.println("expo");
    }
    public static void main(String[] args) {
        Interfaces a = new Interfaces();
        a.add();
        a.subtract();
        a.multiply();
        a.divide();
        a.power();
        a.expo();

    }
}