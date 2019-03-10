package JavaCourses;

public class Cities {
    public static void main(String[] args) {
        String[] cities = {"New York", "San Francisco", "Miami", "Chicago"};
        System.out.println(cities[0]);

        //Declare & define the array(only size)
        String[] states = new String[5];
        states[0] = "California";
        states[1] = "Ohio";
        System.out.println(states[0]);

        //Declare the array
        String[] countries;
        //Define the array
        countries = new String[4];
        countries[0] = "USA";
        countries[1] = "Ukraine";
        countries[2] = "Canada";
        countries[3] = "UK";

        int i = 0;

        //do loop execution
        do {
            System.out.println(countries[i]);
            i = i + 1;
        } while (i < 4);

        System.out.println("************************");
        i = 0;

        //while loop execution
        boolean stateCount = false;
        while (!stateCount){
            String state = countries[i];
            System.out.println(state);
            if (state == "Canada"){
                System.out.println("Your state is Texas");
                stateCount = true;
            }
            i++;
        }

        System.out.println("\nFor loop started iterating");
        //for loop: best iterating loop
        for (int p = 0; p <= 3; p++) {
            System.out.println(countries[p]);
        }
    }
}
