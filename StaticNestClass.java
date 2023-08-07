class Seven{
    private static void display(){
        System.out.println("Djdfgh");
    }
    static class GM{
        public static void show(){
            System.out.println("hello");
        }
    }
}


public class StaticNestClass {
    public static void main(String[] args) {
        Seven.GM.show();
    }
}
