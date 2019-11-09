package lecture4;

public class ForEach {
    public static void main(String[] args) {
        int[] numbers = {123, 34, 234, 3454, 2342, 12};


        for(int number: numbers) {
            if(number == 234) {
                System.out.println("number: " + number);
            }
        }
    }
}
