public class example {

    static void fun1() {
        System.out.println("a");
    }

    static void fun2() {
        System.out.println("b");
    }

    public static void main(String[] args) {
        System.out.println("c");
        fun1();
        fun2();
    }
}

// things to remember
/*
 * you can make function static and directly come them with function name
 * if you dont write static in void fun1 and fun2
 * then
 * it lead to error =(error: non-static method fun2() cannot be referenced from
 * a static context fun2();)
 */
