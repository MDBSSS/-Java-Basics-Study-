import java.util.Scanner;

public class Switch {
    public static void main(String []args){
        Scanner scanner= new Scanner(System.in);
        System.out.println("Void age");
        int age = scanner.nextInt();
        switch (age) {
            case 0 -> System.out.println("You're born");
            case 7 -> System.out.println("You went to school.");
            case 18 -> System.out.println("You finished school");
            default -> System.out.println("None of the conditions met");
        }
    }
}
