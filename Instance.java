public class Instance {
    int a = 7;
    int b = 8;
    
    void addition() {
        int g = a + b;
        System.out.println(g);
    }
    void subtraction() {
        int p = b - a;
        System.out.println(p);
    }
    public static void main(String[] args){
        Instance i = new Instance();
        i.addition();
        i.subtraction();
    }
}
