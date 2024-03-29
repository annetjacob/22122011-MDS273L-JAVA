
import java.util.Scanner;

public class lab2 {
  static Scanner sc = new Scanner(System.in);
  static String[] names = new String[1024];
  static int count = 0;

  public static void main(String[] args) {
    int option;
    do {
      printMenu();
        option = sc.nextInt();
      switch (option) {
        case 1:
          addName();
          break;
        case 2:
          searchName();
          break;
        case 3:
          removeName();
          break;
        case 4:
          System.out.println("Thankyou!");
          break;
        default:
          System.out.println("Invalid option, please try again.");
          break;
      }
    } while (option != 4);
  }

  static void printMenu() {
    System.out.println("\nMenu:");
    System.out.print("1. Enter a name  ");
    System.out.print("2. Search for a name  ");
    System.out.print("3. Remove a name  ");
    System.out.print("4. Exit");
    System.out.print("\nEnter option: ");
  }

  static void addName() {
    System.out.print("Enter a name: ");
    String name = sc.next();
    if (isNameExists(name)) {
      System.out.println("Name already exists, please enter a unique name.");
    } else {
      names[count++] = name;
      System.out.println("Name added successfully!");
    }
  }

  static void searchName() {
    System.out.print("Enter a name to search: ");
    String name = sc.next();
    boolean isFound = false;
    for (int i = 0; i < count; i++) {
      if (names[i].equals(name)) {
        System.out.println("Name found at position: " + (i + 1));
        isFound = true;
        break;
      }
    }
    if (!isFound) {
      System.out.println("Name not found.");
    }
  }

  static void removeName() {
    System.out.print("Enter a name to remove: ");
    String name = sc.next();
    boolean isFound = false;
    for (int i = 0; i < count; i++) {
      if (names[i].equals(name)) {
        for (int j = i; j < count - 1; j++) {
          names[j] = names[j + 1];
        }
        count--;
        System.out.println("Name removed successfully!");
        isFound = true;
        break;
      }
    }
    if (!isFound) {
      System.out.println("Name not found.");
    }
  }

  static boolean isNameExists(String name) {
    for (int i = 0; i < count; i++) {
      if (names[i].equals(name)) {
        return true;
      }
    }
    return false;
  }
    
}