package handsss;

import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.Scanner;

public class handsss {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        while (true) {
            // Corrected regex pattern for Student Number
            Pattern p = Pattern.compile("\\d{4}-\\d{2}-\\d{3}");
            System.out.print("Enter your Student Number (format: XXXX-XX-XXX): ");
            String num = input.nextLine();

            Matcher m = p.matcher(num);

            if (m.matches()) {
                System.out.println("You have successfully logged in!");
                break; // Exit the loop on successful login
            } else {
                System.out.println("Error: Invalid Student Number format! Please try again.");
            }
        }

        input.close(); // Close the Scanner to avoid resource leaks
    }
}
