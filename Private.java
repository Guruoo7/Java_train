private class Test7{  //here the error occurs because of the private
    private int a = 7;
    private int b = 8;
    private void display(){
        System.out.println(a+b);
    }
}

public class Private extends Test7{
    void show(){
        System.out.println(a+b);

    }
    public static void main(String[] args) {
        Private z = new Private();
        z.show();
        z.display();
    }
}
