package lecture4;

public class ArrayOfArray {

    public static void main(String[] args) {
        int[][] array = new int [3][3];
        int[][] arrayOne = {{1,2,3}, {45,67,89}};

        int[] a = array[1];
        int b = array[1][1];
        System.out.println(a[1]);
        System.out.println(b);


    }
}
