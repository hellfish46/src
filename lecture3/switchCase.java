package lecture3;

public class switchCase {
    public static void main(String[] args) {
        int age = 30;

        switch (age){
            case 18:
                System.out.println("1");
            case 30:
                System.out.println("2");
                break;
            case 31:
                System.out.println("3");


        };
        String user = "John";
        switch (user){
            case "Sara":
                System.out.println("1");
            case "John":
                System.out.println("2");
                break;
            case "Bond":
                System.out.println("3");
            default:
                System.out.println("hello unknown");


        }



    }
}
