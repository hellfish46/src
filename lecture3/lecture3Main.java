package lecture3;

public class lecture3Main {
    public static void main(String[] args) {
        int age = 30;
        int minAge = 18;

        if(age > minAge){
            System.out.println("user loged in");
        } else if (age == minAge){
            System.out.println("access denied");
        }
    }
}
