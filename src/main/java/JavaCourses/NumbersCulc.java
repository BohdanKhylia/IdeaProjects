package JavaCourses;

public class NumbersCulc {
    public static void main(String[] args) {
        System.out.println("Program is starting");
        printName();
        int numA = 10;
        int numB = 20;
        addNumbers(numA, numB);
        System.out.println(multiplynumbers(numA, numB));
    }
    static void printName(){
        System.out.println("My name is Bohdan");
    }
    static void addNumbers(int firstNubmer, int secondNubmer){
        int sum = firstNubmer + secondNubmer;
        System.out.println("The sum of: " + firstNubmer + " and " + secondNubmer + " is " + sum);
    }
    static int multiplynumbers(int firsrValue, int secondValue){
        int product = firsrValue * secondValue;
        addNumbers(product + 50, product);
        return product;
    }
}
