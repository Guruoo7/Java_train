public class Operators {

    int a = 7;
    int b = 7;

    void arithmetic(){
        System.out.println("Arithmetic Operators : ");
        System.out.println("Addition: "+ (a + b));
        System.out.println("Subtraction: "+ (a - b));
        System.out.println("Multiplication: "+ (a * b));
        System.out.println("Division: "+ (a / b));
    }

    void logical(){
        System.out.println("Logical Operators : ");
        System.out.println(a < 5 && b < 7);
        System.out.println(a < 5 || b < 7);
    }

    void bitwise() {
        System.out.println("Bitwise Operators : ");
        System.out.println("AND: " + (a&b));
        System.out.println("OR: " + (a|b));
    }

    void shift(){
        System.out.println("Shift Operators : ");
        System.out.println("ShiftRight : " + (a >> 5));
        System.out.println("ShiftLeft :" + (a << 5));
    }

    public static void main(String[] args){
        Operators i = new Operators();
        i.arithmetic();
        i.logical();
        i.bitwise();
        i.shift();
    }
}
