import java.util.Scanner;

public class Gitdemo {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter your name: ");
        String name = scanner.nextLine();
        
        System.out.print("Enter your roll number: ");
        int rollNo = scanner.nextInt();
        
        System.out.println("Name: " + name);
        System.out.println("Roll Number: " + rollNo);
        
        scanner.close();
    }
}