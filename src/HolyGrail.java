import java.util.Scanner;
/**
 * Asks the user 3 questions and then says it back
 * @author Kitagawa
 * @version 22_09_22
 */
public class HolyGrail {
    /**
     * Main method of class HolyGrail
     * @param args cli args, if needed
     */
    public static void main(String[] args) {
        //initialize the three string variables
        String name, quest, color;
        //initialize in object
        Scanner in = new Scanner(System.in);
        System.out.println("*A chat with the bridge keeper *");
        System.out.println("Who would cross the Bridge of Death must answer me these\n" +
                "questions three, ere the other side he see.");
        //getting user input
        System.out.print("Question 1: What is your name? ");
        name = in.nextLine();
        System.out.print("Question 2: What is your quest? ");
        quest = in.nextLine();
        System.out.print("Question 3: What is your favorite color? ");
        color = in.nextLine();
        //back to the user
        System.out.println("King Arthur says, \"You have to know these things when you're a king, you know.\"");
        System.out.println("Your name is: " + name);
        System.out.println("Your quest is: " + quest);
        System.out.println("Your favorite color is: " + color);
        System.out.println("*end of program*");
    }
}
