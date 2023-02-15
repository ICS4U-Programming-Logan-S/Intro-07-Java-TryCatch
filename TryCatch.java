import java.util.Scanner;
/**
* Asks user for a radius of a sphere and calculates the volume.
*
* @author Logan S
* @version 1.0
* @since 2023-02-15
*/

public final class TryCatch {

    /**
    * This is a private constructor.
    *
    */
    private TryCatch() { }

    /**
    * This is the main method.
    *
    * @param args
    *
    */
    public static void main(String[] args) {
        // Welcomes the user
        System.out.print("Welcome to Logan S' Volume of a ");
        System.out.println("sphere Calculator!");
        System.out.println("Enter the radius of your sphere (cm): ");

        // Using Scanner for Getting Input from User
        final Scanner scanner = new Scanner(System.in);
        final String rad = scanner.nextLine();

        try {
            // Convert string to a double
            final double radDouble = Double.parseDouble(rad);

            // If the radius is a negative number, tell the user
            if (radDouble < 0) {
                System.out.print("The radius cannot be a negative number. ");
                System.out.println("Try again.");
            } else if (radDouble == 0) {
                System.out.println("That's just zero, you should know!");
            } else {
                // Create a variable for the power
                final double radCubed = Math.pow(radDouble, 3.0);
                // Calculate the volume
                final double volume = (4.0 / 3.0) * Math.PI * radCubed;

                // Display the Volume rounded to 2 decimals
                System.out.print("The volume of your sphere with a radius of ");
                System.out.println(radDouble + "cm is ");
                System.out.format("%.2f", volume);
                System.out.println("cm³.");
            }
        } catch (NumberFormatException error) {
            System.out.println("This is not a valid radius. Try again.");
            System.out.println(error.getMessage());
        }
        // Closing Scanner
        scanner.close();
    }
}
