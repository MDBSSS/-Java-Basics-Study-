import org.w3c.dom.ls.LSOutput;

public class Variable {
    public static void main(String [] args) {
        int one = 557; // -2,147,483,648 до 2,147,483,647
        short two = 3266; // -32,768 до 32,767
        long four =26246246; // -9,223,372,036,854,775,808 - 9,223,372,036,854,775,807.
        int three = one + two;

        double myDouble= 235.35; // 1.7e-308 - 1.7e+308
        float myFloat= 2362.4f; // 3.4e-038 - 3.4e+038

        byte myByte = 100; // -128-127
        System.out.println(three);
    }
}
