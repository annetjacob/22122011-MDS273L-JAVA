package LAB1;


import java.util.Scanner;

public class LAB1 {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    System.out.print("Enter name: ");
    String name = input.nextLine();

    System.out.print("Enter age: ");
    int age = input.nextInt();

    System.out.print("Enter gender (m/f): ");
    char gender = input.next().charAt(0);

    System.out.print("Enter state: ");
    input.nextLine();
    String state = input.nextLine();

    System.out.print("Enter company name: ");
    String company = input.nextLine();

    System.out.println("\nEmployee Details:");
    System.out.println("Name: " + name);
    System.out.println("Age: " + age);
    System.out.println("Gender: " + (gender == 'm' ? "MALE" : "FEMALE"));
    System.out.println("State: " + state);
    System.out.println("Company: " + company);

    String region = "";
    switch (state) {
        case "Andhra Pradesh":
        case "Karnataka":
        case "Kerala":
        case "Tamil Nadu":
        region = "South";
        break;
        case "Delhi":
        case "Haryana":
        case "Punjab":
        case "Uttar Pradesh":
        case "Uttarakhand":
        region = "North";
        break;
        case "Chhattisgarh":
        case "Madhya Pradesh":
        case "Odisha":
        case "Jharkhand":
        region = "Central";
        break;
        case "Bihar":
        case "West Bengal":
        region = "East";
        break;
        case "Gujarat":
        case "Maharashtra":
        case "Rajasthan":
        case "Goa":
        region = "West";
        break;
    }

if (region.equals("South")) {
  System.out.println("\nThe Employee is from the " + region + "ern states of India");
  System.out.println("Preferable work location is in " + state);
}
        
        if (company.equalsIgnoreCase("Facebook") || company.equalsIgnoreCase("Google") ||
        company.equalsIgnoreCase("Microsoft") || company.equalsIgnoreCase("Samsung") ||
        company.equalsIgnoreCase("IBM") || company.equalsIgnoreCase("Apple")) {
            System.out.println("\n;The employee is working in Top MNC Companies");
        }
    }

}



