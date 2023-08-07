public class Local {
    int z = 8;
    int y = 4;
    static int g = 7;
    static int p = 7;

    void addition(){
        int a = 3;
        int b = 4;
        int c = a + b;
        System.out.println(c);
    }
    void subtract(){
        System.out.println(z-y);
    }
    public static void main(String[] args){
        Local i = new Local();
        i.addition();
        i.subtract();
        System.out.println(g+p);
        
    }
}
