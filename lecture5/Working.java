package lecture5;

public class Working {
    public static void main(String[] args) {
        System.out.println(evenOrOdd(33));
        int [] array = {1, 23, 44, -2, 90, -112, 11, 34};
        System.out.println(sumOfArr(array));

    }

    public static Boolean evenOrOdd (int number){
        boolean result;

        if(number%2 == 0) {
          result = false;
      } else {
            result = true;
        }
        return result;
    };

    public static int sumOfArr (int[] values){
        int result = 0;
        for(int i = 0; i < values.length; i++){
            result = result + values[i];
        }
        return result;
    };



}
