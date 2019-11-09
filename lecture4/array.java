package lecture4;

public class array {

    public static void main(String[] args) {
        int [] array = new int[5];
        int [] array1 = {1, 3, 5, 345, 345, -34};
        int [] salary = {1, 3, 5, 345, 345, -34};
        System.out.println("salary length " + salary.length);
        int elementTwo = salary[1];
        System.out.println("element two = " + elementTwo);
        salary[1] = 7;

        int elementTwoNew = salary[1];
        System.out.println("elementTwoNew: " + elementTwoNew);
        array[2] = 2;
        int elementThree = array[2];
        System.out.println(elementThree);





    }
}
