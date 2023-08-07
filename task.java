public class task {
    static int a = 3;
    static int b = 3;
    public void addition(){    
        System.out.println(a+b);
    }
}

abstract class dev {
    int g = 7;
    int p = 22;
    public abstract void subtraction();
}

class hero extends dev {

    public void subtraction(){
        System.out.println(g-p);
    }

    public static void main(String[] main) {
        task s = new task();
        s.addition();
        hero m = new hero();
        m.subtraction();
    }
    
}