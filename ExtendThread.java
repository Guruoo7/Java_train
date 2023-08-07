class Pras extends Thread{
    public void run(){
        for(int i=0; i<=1; i++){
            System.out.println("Guru");
        }
    }
} 

public class ExtendThread  extends Pras{
    public static void main(String[] args) {
        Pras s1 = new Pras();
        s1.run();
        for(int i=0; i<=7; i++){
            System.out.println("Prasanth");
        }
    }
}
