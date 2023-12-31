import java.util.Scanner;

class Dex2Hex {

    public static void main(String args[]) {
        if (args.length == 0) {
            System.err.println("Error: No input argument provided. Please provide a decimal number.");
            System.exit(1); // Exit with an error code
        }

        int num = Integer.parseInt(args[0]);
        char ch[] = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};
        int rem;
        String hexadecimal = "";
        System.out.println("Converting the Decimal Value " + num + " to Hex...");

        while (num != 0) {
            rem = num % 16;
            hexadecimal = ch[rem] + hexadecimal;
            num = num / 16;
        }

        System.out.println("Hexadecimal representation is: " + hexadecimal);
    }
}
