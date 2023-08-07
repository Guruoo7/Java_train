class One{
    class Two{
        public void show(){
            System.out.println(5);
        }
    }
}


public class InnerNestClass {
    public static void main(String[] args) {
        One.Two p = new One(). new Two();
        p.show();
    }
}
