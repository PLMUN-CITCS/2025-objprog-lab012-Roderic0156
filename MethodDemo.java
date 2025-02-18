public class MethodDemo {

    // This method prints a greeting message
    public static void greet() {
        System.out.println("Hello from the greet method!");
    }

    // This method prints any message passed to it
    public static void printMessage(String message) {
        System.out.println(message);
    }

    // Main method to run the program
    public static void main(String[] args) {
        greet(); // Calling the greet method
        printMessage("This is my message!"); // Calling printMessage method
    }
}

