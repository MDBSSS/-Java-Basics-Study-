public class Arrays_Of_Strings_And_ForEach {
    public static void main(String []args){
        String[]strings = new String[3];
        strings[0]="Hello";
        strings[1]="Good bye";
        strings[2]="Programmer";
        for(String string:strings){
            System.out.println(string);
        }
        int[]numbers1={3,2,3};
        int sum = 0;
        for(int x:numbers1){
            sum= sum+x;
        }
        System.out.println();
        System.out.println(sum);
    }
}
