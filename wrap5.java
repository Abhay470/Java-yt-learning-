// topic name = wrapper class 
public class wrap5 {
    public static void main(String[] args) {
        int x= Integer.parseInt("123");
         System.out.println(x);
         Integer x1 = Integer.valueOf("123");
      int y =   x1.intValue();
         System.out.println(y);
         // in case of double 
         Double x2 = Double.valueOf("23");
         double z =  x2.doubleValue();
         System.out.println(z);

// let play with binary numbers (like binary to int )

 Integer x3 = Integer.valueOf("11011",2);
      int a =   x3.intValue();
         System.out.println(a);





    }
   
}
