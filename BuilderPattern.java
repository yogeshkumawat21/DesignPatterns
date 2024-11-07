class A {
    private int no;

    public void setNo(int no) {
        this.no = no;
    }

    @Override
    public String toString() {
        return "no: " + no;
    }
}

class B {
    private A a;

   
    public B() {
        a = new A();
    }

    // Method to set no in A
    public B setNo(int no) {
        a.setNo(no);
        return this; 
    }

    public A build() {
        return a;
    }
}

public class Main {
    public static void main(String[] args) {
       
        A a = new B().setNo(4).build(); 
        System.out.println(a); 
    }
}
