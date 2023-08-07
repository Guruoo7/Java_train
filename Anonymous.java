class Ben{
    void show(){
        System.out.println("Ben 10");
    }
}


public class Anonymous {
    static Ben mg = new Ben() {
        void show(){
        super.show();
        System.out.println("Alien X");
    }
};
    
    public static void main(String[] args) {
        mg.show();
    }    
}
