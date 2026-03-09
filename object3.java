
// code of how to use non static functions 

class mahesh {

    int x;
    int y; // a simple variable holding space or memory

    void fun1() { // non static or instance member variable or object member variable (same name)
        System.out.println("function 1 ");
    }

    void fun2() {
        System.out.println("function 2 ");
    }
}

// file name is object3 as object is file name and we cant use it as it is
// predefined also 3 is file no in order of files
public class object3 {
    public static void main(String[] args) {
        // we can use non static function by creating objects of that function like
        mahesh m1 = new mahesh();
        m1.x = 5;
        System.out.println(m1.x);
        // another object
        mahesh m2 = new mahesh(); // so creating multiple objects doesnot depend on one another( hence they are
                                  // independent)
        m2.x = 51;
        // System.out.println("hello");
        System.out.println(m2.x);
        System.out.println(m2.y);
    }
}
