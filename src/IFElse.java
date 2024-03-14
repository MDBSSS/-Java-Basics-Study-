public class IFElse {
    public static void main(String [] args){
        int myInt = 0;
        while(myInt<=2) {
            if (myInt < 1) {
                System.out.println("True");
            } else if (myInt < 2) {
                System.out.println("False");
            } else {
                System.out.println("Error");
            }
            myInt= myInt+1;
        }
    }
}
