public class Polymorphism{
    void method(int a, int b){
        int c = a + b;
        System.out.println(c);
    }
    void method(int a, int b, int c){
        int z = a - b - c;
        System.out.println(z);
    }
    void method(int a, int b, int c, int d){
        int s3 = a * b * c * d;
        System.out.println(s3);
    }
    public static void main(String[] args) {
        Polymorphism r1 = new Polymorphism();
        r1.method(7, 7);
        r1.method(7, 7, 17);
        r1.method(1, 2, 3, 4);
    }
}