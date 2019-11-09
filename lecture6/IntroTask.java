package lecture6;
import java.util.Random;

public class IntroTask {
    public static void main(String[] args) {
       System.out.println(randomString("alphaNumeric", 100));
        //char [] alpablet = {'a','b','c','d'};
        //System.out.println(alpablet[0]);





    }

    public static char randomiser(String mode){
        char result;
        switch (mode) {
            case ("alpha"):
                char[] alpablet = {'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z'};
                Random randomChar = new Random();
                int indexChar = randomChar.nextInt(alpablet.length);
                result = alpablet[indexChar];
                break;

            case ("numeric"):
                char[] numbers = {'0','1','2','3','4','5','6','7','8','9'};
                Random randomNum = new Random();
                int indexNum = randomNum.nextInt(numbers.length);
                result = numbers[indexNum];
                break;

            case("alphaNumeric"):
                char[][] alpabletNumeric = {{'0','1','2','3','4','5','6','7','8','9'},{'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z'}};
                Random randomNumAlpha = new Random();
                int indexOfArr = randomNumAlpha.nextInt(2);
                int indexNumAlph = randomNumAlpha.nextInt(alpabletNumeric[indexOfArr].length);
                result = alpabletNumeric[indexOfArr][indexNumAlph];
                break;
            default: result = 'X';
        };
        return result;

    };

    public static String randomString(String mode, int length){
        String result = "";




        for (int i = 0; i < length; i++) {
            result = result + randomiser(mode);



        }
        return result;
        







    }

}
