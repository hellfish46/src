package lecture2;

public class Calculation {
    public static void main(String[] args) {
        int a = 5;
        int b = 10;
        float c = 10.5f;

        float result = a + b * c;
        float result2 = (a + b) * c;
        //int result3 = a/0;
        //System.out.println(result3);

        double result3 = 234324.45 * 34.5f;
        System.out.println(result3);
        System.out.println("Result: " + result2);
    }
}

