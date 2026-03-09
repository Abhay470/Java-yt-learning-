public class example02 {

    static void fun1() {
        System.out.println("a");
    }

    static void fun2() {
        System.out.println("b");
    }

    public static void main(String[] args) {
        System.out.println("c");
        example02.fun1();
        example02.fun2();
        area.f1();
        area.f2(); // you can directly call static function using class name
    }
}

// things to remember
/*
 * you can make function static and directly call them with class name
 * if you dont write static in void fun1 and fun2
 * then
 * it lead to error =(error: non-static method fun2() cannot be referenced from
 * a static context fun2();)
 */

// so lets make a another class file which containes static functtions
class area {
    static void f1() {
        System.out.println("area 1");
    }

    static void f2() {
        System.out.println("area 2 ");
    }
}