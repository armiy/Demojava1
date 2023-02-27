package JavaWorks;

public class HWork {
    public static void sumOfNumbers() {
        int n = 5;
        int sum = 0;
        for (int i = 0; i <= n; i++) {
            sum += i;
            System.out.print(i + "+");
        }
        System.out.println("=" + sum);
    }

    public static void printNumbersTriangle() {
        //To print the numbers in a triangle.
        // 1. print them in one column 1 to 5 then print a space that starts from 5 to 1 decreasing then print the numbers
        int i,j,n=5;
        for ( i = 1; i <= n; i++) {
            System.out.println();
            for (j = n - i; j >= 1; j--) {
                System.out.print(" ");
            }
            for (j = 1; j <= i; j++) {
                System.out.print(j + " ");
            }
        }
    }

    public void printDecreasingAndIncreasingNumbersTriangle() {
        // printing mixed numbers in triangle 4 steps - print 1 to 5 in line, print the numbers in
        int i, j, n=5;
        for (i = 1; i <= n; i++) {
            System.out.println();
            for ( j = 5 - i; j > 0; j--) {
                System.out.print(" ");
            }
            for (j = 1; j <= i; j++) {
                System.out.print(j);
            }
            for (j = i - 1; j >= 1; j--) {
                System.out.print(j);
            }
        }
    }

    public void printNumbersInvertedTriangle() {
        // print numbers in inverted triangle
        int i, j , n = 5;
        for ( i = n; i >= 1; i--) {
            System.out.println();
            for (j = n; j >= i; j--) {
                System.out.print(" ");
            }
            for (j = i; j >= 1; j--) {
                System.out.print(j + " ");

            }

        }
    }

    public static void febnoacci(){
        int n = 10, firstTerm = 0, secondTerm = 1;
        System.out.println("Fibonacci Series till " + n + " terms:");

        for (int i = 1; i <= n; ++i) {
            System.out.print(firstTerm + ", ");

            // compute the next term
            int nextTerm = firstTerm + secondTerm;
            firstTerm = secondTerm;
            secondTerm = nextTerm;
        }

    }

    public static void main(String[] args) {
        sumOfNumbers();
        HWork obj1 = new HWork();
        obj1.printDecreasingAndIncreasingNumbersTriangle();
        System.out.println(); // printing space between functions/methods

        obj1.printNumbersInvertedTriangle();

        System.out.println();// printing space between functions/methods
        printNumbersTriangle();

        System.out.println();// printing space between functions/methods
        febnoacci();


    }


}
