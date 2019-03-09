package JavaCourses;

public class Lab1 {
    public static void main(String[] args) {
        // make function that sum numbers from 1 to n
        System.out.println("Sum result " + progressionSum(3));
        int[] testArray = {5, -34, 76, 9, 8, 2, 4, -4, 67, 9};
        System.out.println("Minimum is " + minimum(testArray));
        System.out.println("Maximum from is " + maximun(testArray));
        System.out.println("Average is " + average(testArray));
    }
    public static int progressionSum(int n){
        int sum = 0;
        for (; n > 0;n--){
            sum = sum + n;
        }
        return sum;
    }
    public static int minimum (int[] arr){
        int min = arr[0];
        for (int i = 0; i < arr.length; i++){
            if (min > arr[i]){
                min = arr[i];
            }
        }
        return min;
    }
    public static int maximun (int[] arr){
        int max = arr[0];
        for (int i = 0; i < arr.length; i++){
            if (max < arr[i]){
                max = arr[i];
            }
        }
        return max;
    }
    public static int average (int[] arr){
        int sum = 0;
        for (int a = 0; a < arr.length; a++){
            sum = sum + arr[a];
        }
        return sum/arr.length;
    }
}
