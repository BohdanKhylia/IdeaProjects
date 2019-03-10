package JavaCourses;

public class Days {
    public static void main(String[] args) {
        //Execute a different block of code depends of variable condition

        char dayOfWeek = 'T';

        switch (dayOfWeek) {
            case 'M' :
                System.out.println("Today is Monday");
                break;
            case 'T' :
                System.out.println("Today is Tuesday");
                break;
            case 'W' :
                System.out.println("Today is Wednesday");
                break;
            case 'H' :
                System.out.println("Today is Thursday");
                break;
            case 'F' :
                System.out.println("Today is Friday");
                break;
        }
    }
}
