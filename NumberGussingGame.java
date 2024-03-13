import java.util.*;

public class NumberGussingName {

    // Function PlayAgain, If you want to continue this game:

    public static void PlayAgain(int Number) {

        System.out.println("Do you want to continue...");
        Scanner sc = new Scanner(System.in);
        String str1 = sc.next();

        String str2 = "yes";

        if (str1.compareTo(str2) == 0) {
            GuessMyNum(Number = (int) (Math.random() * 100));
        } else {
            return;
        }

    }

    // Function to paly the game Guess my Number:

    public static void GuessMyNum(int Number) {

        int UserNumbr = 0;
        System.out.print("\nGuess My Number: ");

        do {

            Scanner sc = new Scanner(System.in);
            UserNumbr = sc.nextInt();

            if (Number == UserNumbr) {
                System.out.println("Excellent...! Your Number Is Correct..!");
                PlayAgain(Number);
                return;
            } else if (UserNumbr > Number) {
                System.out.println("Your Number is Large..!");
            } else {
                System.out.println("Your Number is Small..!");
            }
        } while (UserNumbr >= 0);

    }

    // Main Function
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int Number = (int) (Math.random() * 100);

        GuessMyNum(Number);

    }

}
