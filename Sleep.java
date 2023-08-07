class MyThread extends Thread{
    public void run(){
        for(int i=0; i<=10; i++){
            System.out.println("hook thread");
        }
    }
}

public class Sleep {
    public static void main(String[] args) {
        Runtime r = Runtime.getRuntime();
        MyThread s = new MyThread();
        for(int i=0;i<=7;i++){
            System.out.println("Main Thread");
        try{
            Thread.sleep(5000);
        }
        catch (InterruptedException e){
            e.printStackTrace();
        }
        if(i==5){
            System.exit(0);
        }
        }
    }
}
