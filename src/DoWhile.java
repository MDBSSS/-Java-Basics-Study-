import java.util.Scanner;

public class DoWhile {
    public static void main(String[] asrg){
        Scanner scanner = new Scanner(System.in);
        int value;
        do {
            System.out.println("Void 5");
            value=scanner.nextInt();
        }while(value!=5);
        System.out.println("You entered 5");
    }
}
