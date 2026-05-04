package day6;
import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Student 1 details
        System.out.print("Enter name of Student 1: ");
        String name1 = sc.nextLine();
        System.out.print("Enter marks of Student 1: ");
        int marks1 = sc.nextInt();
        sc.nextLine(); // clear buffer

        // Student 2 details
        System.out.print("Enter name of Student 2: ");
        String name2 = sc.nextLine();
        System.out.print("Enter marks of Student 2: ");
        int marks2 = sc.nextInt();

        // Display details
        System.out.println("\nStudent Details:");

        System.out.println("\nStudent 1:");
        System.out.println("Name: " + name1);
        System.out.println("Marks: " + marks1);

        System.out.println("\nStudent 2:");
        System.out.println("Name: " + name2);
        System.out.println("Marks: " + marks2);

        sc.close();
    }
}