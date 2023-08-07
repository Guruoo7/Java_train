class Cls1{
    public void c1(){
        System.out.println("c1");
    }
}

class Cls2 extends Cls1{
    public void c2(){
        System.out.println("c2");
    }
}

class Cls3 extends Cls1{
    public void c3(){
        System.out.println("c3");
    }
}

class Cls4 extends Cls2{
    public void c4(){
        System.out.println("c4");
    }
}

class Cls5 extends Cls2{
    public void c5(){
        System.out.println("c5");
    }
}

class Cls6 extends Cls3{
    public void c6(){
        System.out.println("c6");
    }
}

class Cls7 extends Cls3{
    public void c7(){
        System.out.println("c7");
    }
}


public class Inheritance{
    public static void main(String[] args) {
        Cls4 s1 = new Cls4();
        s1.c1();
        s1.c2();
        s1.c4();
        Cls5 s2 = new Cls5();
        s2.c5();
        Cls6 s3 = new Cls6();
        s3.c3();
        s3.c6();
        Cls7 s4 = new Cls7();
        s4.c7();
    }
}