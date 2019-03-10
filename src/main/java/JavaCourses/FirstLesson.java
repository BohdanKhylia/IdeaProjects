package JavaCourses;

public class FirstLesson {
    public static void main(String[] args) {
       //Weather calculator

        int temperature;
        String sunCondition = "Sunny";

        temperature = 65;

        if (temperature > 80) {
            System.out.println("Temperature higher then 80");
        }
        else if (temperature > 60 && sunCondition == "Sunny") {
            System.out.println("Temperature higher then 60, but less then 80");
            System.out.println("Wear a glases or hat to block sun");
        }
        else if ((temperature > 50) || (sunCondition == "Overcast")) {
            System.out.println("This is a cool cold day");
        }
        else {
            System.out.println("Temperature less then 60");
        }
    }
}
