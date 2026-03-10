public class classesandobjects4 {
    public static void main(String[] args) {
         nokia n1 = new nokia();
        
         n1.display();
          n1.setvalue();
n1.display();
    }
}

class nokia {
    private int mic;
    private int sensor;

    void setvalue() {
        mic = 2;
        sensor = 4;
    }

    void display() {
        System.out.println(mic);
        System.out.println(sensor);
    }
}