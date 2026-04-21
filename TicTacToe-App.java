import java.util.Scanner;

/**
 * TicTacToe
 * UC3 reads a slot number (1–9) entered by the user.
 */
public class TicTacToe {

    /**
     * Entry point of the program.
     * Reads slot input and prints it back.
     */
    public static void main(String[] args) {

        int slot = getUserSlot();
        System.out.println("Slot entered: " + slot);
    }

    /**
     * Reads an integer slot value from the user.
     * Input: Scanner object
     * Output: Slot number (1–9)
     */
    static int getUserSlot() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a slot number (1-9): ");
        int slot = sc.nextInt();

        return slot;
    }
}