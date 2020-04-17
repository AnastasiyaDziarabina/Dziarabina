package Homework2;

public class Task7 {

    static int var = 2;
    static int n = 2;

    public static void main(String[] args) {
        testNumber(n);
    }

    private static void testNumber(int n) {

        if (n != var) {
            if (n % var != 0) {
                var++;
                testNumber(n);
            } else if (n % var == 0) {
                System.out.printf("Is number <%d> simple - NO%n", n);
                counter(n);
            }
        } else {
            var = 2;
            System.out.printf("Is number <%d> simple - YES%n", n);
            counter(n);
        }
    }

    private static void counter(int n) {

        if (n < 10) {
            n++;
            testNumber(n);
        } else {
            System.out.printf("End of check%n");
        }
    }
}

    
    
    
    

    
    
    
    
    
    
    
    
    
   