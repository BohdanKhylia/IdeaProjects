package oop;

public class Labs2 {
    public static void main(String[] args) {
        Students stud1 = new Students("Bohdan", "123456");
        stud1.enroll("Math");
        stud1.enroll("History");

        stud1.showCourses();
        stud1.checkBalance();
        stud1.pay(600);
        stud1.showCourses();

    }
}
class  Students {
    private String name;
    private String ssn;
    private String email;
    private static int ID = 1000;
    private String userID;
    private String course = "";
    private int balance = 0;
    private static final int costOfCourse = 800;

    public Students (String name, String ssn){
        ID++;
        this.name = name;
        this.ssn = ssn;
        genID();
        setEmail();
    }
    private void setEmail(){
        email = name.toLowerCase() + "@student.com";
        System.out.println("Your email is " + email);
    }

    private void genID (){
        int min = 1000;
        int max = 9000;
        int random = (int)(Math.random() * (max - min) + min);
        userID = ID + "" + random + ssn.substring(2);
        System.out.println(userID);
    }
    public void enroll(String course){
        this.course = this.course + "\n" + course;
        balance = balance + costOfCourse;
    }
    public void pay(int amount){
        balance = balance - amount;
    }
    public void checkBalance(){
        System.out.println("Balance: $" + balance);
    }
    public void showCourses(){
        System.out.println("Courses: " + course);
    }
    public String toString(){
        return null;
    }
}
