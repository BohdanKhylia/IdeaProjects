package JavaCourses;

public class Strings {
    public static void main(String[] args) {
        String bookTitle;
        String wordRing = "Ring";
        bookTitle = "The Lord of the Rings";

        if (bookTitle.contains(wordRing)){
            System.out.println("The book contains word " + wordRing);
        }

        String browser = "Chrome";
        if (browser.equalsIgnoreCase("chrome")){
            System.out.println("The sentence contains chrome");
        }

        String firstName = "Bohdan";
        String lastName = "Khylia";
        String NNC = "903845331";

        System.out.println(firstName.substring(0,2));
        System.out.println(lastName.substring(3));

        if (NNC.length() == 9){
            System.out.println("The NNC is correct");
        }
        else {
            System.out.println("Error, check the number of characters in the your NNC");
        }

    }
}
