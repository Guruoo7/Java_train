public class This {
    Apple s1;
    This(Apple s1){
        this.s1=s1;
        s1.show();
    }
}

class Apple{
    int a = 17;
    Apple(){
        This p1 = new This(this);
    }
    public void show(){
        System.out.println(a);
    }
    public static void main(String[] args){
        new Apple();
    }
}