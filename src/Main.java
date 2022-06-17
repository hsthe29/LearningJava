
class Ex3 {
    int x = 10;                       // variable
    public void show( ) {    // method
        System.out.println(x);
    }
    public static void main(String args[ ]) {
        Ex3 t = new Ex3( );             // tao doi tuong t
        t.show( );                                 // method call
        Ex3 t1 = new Ex3( );         // tao doi tuong t1
        t1.x = 20;
        t1.show( );
    }
}

public class Main {

    // wrapper class
    // array

    static int getItself(int itself, int dummy)
    {
        return itself;
    }

    public static void main(String[] args) {
        Integer a = 9;
        System.out.println(a instanceof  Integer);
    }
}

/*
* zip vao tuple
* a, b = b, a
*
* */
