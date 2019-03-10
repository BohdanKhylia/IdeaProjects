package JavaCourses;

public class Factorial {
    public static void main(String[] args) {
        //factorial using while loop

        int n = 6;

        if (n == 0){
            System.out.println("n = 0");
        }
        else {
            int result = 1;
            while (n > 0){
                result = result * n;
                n--;
            }
            System.out.println("n = " + result);

            System.out.println("Calculating factorial using recursion " + fact(5));
        }
    }
    //recursion
    public static int fact(int i){
        if (i == 0){
            return 1;
        }
        return i*fact(i-1);
    }

}
