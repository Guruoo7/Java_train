 class Gur implements Runnable {
    public void run() {
    for(int i=0;i<=3;i++){
        System.out.println("hook");
        }   
    }
}

public class RunInterface extends Gur {
    public static void main(String[] args) {
        Gur g1 = new Gur();
        Thread t1 = new Thread(g1);
        t1.start();
        for(int i=0; i<=10; i++){
            System.out.println("Main Thread");
        }
    }
}
