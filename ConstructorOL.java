public class ConstructorOL {
    double sslc;
    double twelve;
    double first;
    double second;
    double third;

    public ConstructorOL(double x, double y){
        this.sslc = x;
        this.twelve = y;
        System.out.println("sslc: "+ sslc+ "twelth: " + twelve);
    }
    public ConstructorOL(double k, double g, double m){
        this.sslc = k;
        this.twelve = g;
        this.first = m;
        System.out.println("sslc: "+ sslc+ "twelth: " + twelve+ "First : "+ first);
    }
    public ConstructorOL(double a, double b, double c, double d){
        this.sslc = a;
        this.twelve = b;
        this.first = c;
        this.second = d;
        System.out.println("sslc: "+ sslc+ "twelth: " + twelve+ "First : "+ first+ "Second: " +second);
    }
    public ConstructorOL(double n, double o, double p, double q, double r){
        this.sslc = n;
        this.twelve = o;
        this.first = p;
        this.second = q;
        this.third = r;
        System.out.println("sslc: "+ sslc+ "twelth: " + twelve+ "First : "+ first+ "Second: " +second+ "third: "+ third);
    }
    public static void main(String[] args) {
        ConstructorOL s1 = new ConstructorOL(450, 530);
        ConstructorOL s2 = new ConstructorOL(450, 530, 7.99);
        ConstructorOL s3 = new ConstructorOL(450, 530, 7.99, 8.22);
        ConstructorOL s4 = new ConstructorOL(450, 530, 7.99, 8.22, 8.16);
    }
}
