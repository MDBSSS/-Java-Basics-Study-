public class Multidimensional_Arrays {
    public static void main(String[] args) {
        int[][] matrice = {{2, 4, 2}, {5, 1, 9}, {9, 3, 7}};
        System.out.println(matrice[1][2] + "" + matrice[0][1]);

        for (int[] x : matrice) {
            for (int i : x) {
                System.out.print(i + " ");
            }
            System.out.println();
        }
    }
}
