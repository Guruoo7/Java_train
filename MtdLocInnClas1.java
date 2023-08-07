class Prasanth{
    public void dis(){
        System.out.println("Pras");
        class GuruM{
            public void shows(){
                System.out.println("Guru");
            }
        }
        GuruM v = new GuruM();
        v.shows();
    }
}



public class MtdLocInnClas1 {
    public static void main(String[] args) {
        Prasanth x = new Prasanth();
        x.dis();
    }
}
