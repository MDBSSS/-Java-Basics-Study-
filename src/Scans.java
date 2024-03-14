import java.util.Scanner;

public class Scans {
    public static void main(String[]args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Void your name");
        String name= scanner.nextLine();

        System.out.println("Select your sex");
        String sex = scanner.nextLine();

        System.out.println("Void your age");
        int age = scanner.nextInt();

        System.out.println("Person info:");
        System.out.println("Name: " + name);
        System.out.println("Sex: " + sex);
        System.out.println("Age: " + age);

    }
}
