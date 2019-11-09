package lecture3;

public class IfEkseExmple2 {
    public static void main(String[] args) {
        String userName = "john";
        int age = 30;

        String userName2 = "Anna";
                int age2 = 18;
        if (age >= 18) {
            if (userName.equals("Mark")) {
                System.out.println("cool");
            } else if ( userName.equals("Victor")) {
                System.out.println("Hello, Victor !");
            } else if (userName2.equals("Sara")) {
                System.out.println("Hello Sara");
            } else if (userName2.equals("Anna")) {
                System.out.println("Hello Anna");
            } else if (userName.equals("John")) {
                System.out.println("cool");
            } else if (userName.equals("John")) {
                System.out.println("cool");
            } else {
                System.out.println("hello unknown");
            }
        } else {
            System.out.println("access denied");
        }
    }
}
