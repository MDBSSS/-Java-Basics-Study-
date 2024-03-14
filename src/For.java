public class For {
    public static void main(String[] args){
        for(int i = 0;i<=10;i++ ) {
            System.out.println("First"+ " " + i); //i++ == i = i+1
        }

        for(int i= 10; i>=0;i = i-5 ){
            System.out.println("Second"+ " " + i);
        }
        System.out.println("End");
    }
}
