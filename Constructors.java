public class Constructors {
    public double pi;
    public double radius;

    public Constructors(double y){
        this.pi = 3.14;
        this.radius = y;
    }

    public void area(){
        double res = pi * radius*radius;
        System.out.println(res);
    }

    public static void main(String[] args) {
        Constructors n = new Constructors(6.0);
        n.area();
    }
}
