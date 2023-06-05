package week1;

public class june5thstatic {
    public static void main(String[] args){
        System.out.println(Example.salary);
}
    class Example {
        static int salary;

        static void incentives(int c) {
            salary = c;
        }

        static {
            incentives(50000);
            System.out.println("This is my salary");

        }
    }
}
