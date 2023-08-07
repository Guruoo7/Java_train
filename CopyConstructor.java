public class CopyConstructor {
    public int a;
    public int b;

    public CopyConstructor(int a, int b){
        this.a = a;
        this.b = b;
    }

    public CopyConstructor(CopyConstructor s1){
        this.a = s1.a;
        this.b = s1.b;
    }

    public void add(){
        System.out.println(this.a + this.b);
    }

    public static void main(String[] args) { 
        // Scanner s1 = new Scanner(System.in);
        // int i1 = s1.nextInt();
        // int i2 = s1.nextInt();
        CopyConstructor j1 = new CopyConstructor(7, 7);
        j1.add();
    }
}
