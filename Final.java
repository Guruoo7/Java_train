public class Final {
    void show(){ //if we use final here then the error will occur
        System.out.println("Guru");
    }
}

class Sample extends Final{
    void show(){
        System.out.println("prasanth");
    }
    public static void main(String[] args) {
        Sample s1 = new Sample();
        s1.show();
    }
}
