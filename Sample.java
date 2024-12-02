import java.util.Scanner;

public class AlphabetOperations {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter an alphabet:");
        char alphabet = scanner.next().charAt(0);

        System.out.println("Enter a number:");
        int number = scanner.nextInt();

        System.out.println("Operations:");
        System.out.println("1. Addition");
        System.out.println("2. Subtraction");
        System.out.println("3. Multiplication");

        System.out.println("Enter your choice:");
        int choice = scanner.nextInt();

        switch (choice) {
            case 1:
                addAlphabet(alphabet, number);
                break;
            case 2:
                subtractAlphabet(alphabet, number);
                break;
            case 3:
                multiplyAlphabet(alphabet, number);
                break;
            default:
                System.out.println("Invalid choice");
        }
    }

    public static void addAlphabet(char alphabet, int number) {
        char result = (char) (alphabet + number);
        System.out.println(alphabet + " + " + number + " = " + result);
    }

    public static void subtractAlphabet(char alphabet, int number) {
        char result = (char) (alphabet - number);
        System.out.println(alphabet + " - " + number + " = " + result);
    }

    public static void multiplyAlphabet(char alphabet, int number) {
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < number; i++) {
            result.append(alphabet);
        }
        System.out.println(alphabet + " × " + number + " = " + result);
    }
}

