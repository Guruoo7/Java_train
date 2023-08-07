class Three{
    public void display(){
        int k = 23;
        System.out.println(k);
        class Four{
            public void show(){
                System.out.println("jsjsj");
            }
        }
        Four tw = new Four();
        tw.show();
    }
}


public class MtdLocInnClas2 {
    public static void main(String[] args) {
        Three n = new Three();
        n.display();
    }
}
