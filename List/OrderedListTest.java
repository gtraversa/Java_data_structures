package List;

import java.util.InputMismatchException;
import java.util.Scanner;

public class OrderedListTest {
    public void menu() {
        boolean flag = true;
        final IntegerOrderedList intList = new IntegerOrderedList();
        final StringOrderedList stringList = new StringOrderedList();
        while (flag) {
            System.out.print("\nWhat would you like to do?\n");
            System.out.print("\033[3mInput: new integer/string to add an integer/string to the respective list;\n" + // Italicized font
                    "print integer/string list to print the respective list,\n"
                    + "remove integer/string to remove an element of the respective list'\n"
                    + "exit to exit the program. \n\033[0m");
            final Scanner menuChoice = new Scanner(System.in);
            switch (menuChoice.nextLine().toUpperCase().strip()) {
            case "NEW INTEGER":
                System.out.print("Enter the integer:\n");
                final Scanner newInt = new Scanner(System.in);
                try {
                    final boolean intInsertion = intList.insert(newInt.nextInt());
                    if (intInsertion) {
                        System.out.print("The integer was inserted\n");
                    } else {
                        System.out.print("Integer not inserted\n");
                    }
                } catch (final InputMismatchException e) {
                    System.out.print("Input invalid\n");
                }
                break;
            case "PRINT INTEGER LIST":
                System.out.print(intList.toString() + "\n");
                break;
            case "NEW STRING":
                System.out.print("Enter the string:\n");
                final Scanner newString = new Scanner(System.in);
                try {
                    final boolean stringInsertion = stringList.insert(newString.next());
                    if (stringInsertion) {
                        System.out.print("The string was inserted\n");
                    } else {
                        System.out.print("String not inserted\n");
                    }
                } catch (final InputMismatchException e) {
                    System.out.print("Input invalid\n");
                }
                break;
            case "PRINT STRING LIST":
                System.out.print(stringList.toString() + "\n");
                break;
            case "REMOVE INTEGER":
                System.out.print("Enter integer to remove:\n");
                final Scanner intRemove = new Scanner(System.in);
                try {
                    final ListNode intRemoveCheck = intList.remove(intRemove.nextInt());
                    if (intRemoveCheck != null) {
                        System.out.print(intRemoveCheck.data + " removed successfully!\n");
                    } else {
                        System.out.print("Integer not removed/not found\n");
                    }
                } catch (final InputMismatchException e) {
                    System.out.print("Input invalid!\n");
                }
                break;
            case "REMOVE STRING":
                System.out.print("Enter string to remove:\n");
                final Scanner stringRemove = new Scanner(System.in);
                try {
                    final ListNode stringRemoveCheck = stringList.remove(stringRemove.next());
                    if (stringRemoveCheck != null) {
                        System.out.print(stringRemoveCheck.data + " removed successfully!\n");
                    } else {
                        System.out.print("String not removed/not found\n");
                    }
                } catch (final InputMismatchException e) {
                    System.out.print("Input invalid!\n");
                }
                break;
            case "EXIT":
                flag = false;
                break;
            default:
                System.out.println("Input invalid, please input again:\n");
                break;
            }
        }
    }

    public static void main(final String[] args) {
        final OrderedListTest test1 = new OrderedListTest();
        test1.menu();
    }
}
